package fr.inria.diversify.sosie.logger.processor;


import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.visitor.CtAbstractVisitor;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;


import java.util.*;

/**
 * Adds basic logging before each conditionals (if, loops).
 * Use basic scope inference (the real one is hard due to the complex semantics of "static" and "final"
 * (w.r.t. init, anonymous classes, etc.)
 */
public class VariableLoggingInstrumenter extends AbstractLogginInstrumenter<CtStatement> {
    protected int tmpVarCount = 0;

    @Override
    public boolean isToBeProcessed(CtStatement candidate) {
        if (candidate.getParent(CtCase.class) != null)
            return false;

        return
                (CtIf.class.isAssignableFrom(candidate.getClass())
                        || CtLoop.class.isAssignableFrom(candidate.getClass()))
                        && !hasLabelAndGoto(candidate)
                ;
    }

    public boolean hasStaticParent(CtElement el) {
        if (el instanceof CtModifiable) {
            if (((CtModifiable) el).getModifiers().contains(ModifierKind.STATIC)) {
                return true;
            }
        }

        if (el.getParent() != null) {
            return hasStaticParent(el.getParent());
        }

        return false;
    }

    public void process(CtStatement statement) {
        try {
            //Now instrument.
            instruLoopOrIf(statement);
        } catch (Exception e) {
        }
    }
    /**
     * Instruments the loop of If
     *
     * @param statement Statement to instrument
     */
    private void instruLoopOrIf(CtStatement statement) {

        boolean inStaticCode = hasStaticParent(statement);
        String id = idFor(getClass(statement).getQualifiedName() + "." + getMethod(statement).getSignature());
//        String snippet = "\tfr.inria.diversify.sosie.logger.LogWriter.writeVar(" + getCount(statement) + ",Thread.currentThread(),\""
//                + id + "\",{";

        String tmpVar = "tmpVarWrite" + tmpVarCount++;
        String snippet = "Object[] " + tmpVar + " = {";

        int nVisibleVariables = 0;
        for (CtVariable<?> var : getVariablesInScope(statement)) {
            boolean isStaticVar = var.getModifiers().contains(ModifierKind.STATIC);

            // we only add if the code is non static
            // or if code is static and the variable as well
            if (!inStaticCode || (inStaticCode && isStaticVar)) {
                // if the local var is not initialized, it might be a compilation problem
                // because of "not initialized"
                if (var instanceof CtLocalVariable) {
                    CtLocalVariable lvar = (CtLocalVariable) var;
                    if (lvar.getDefaultExpression() == null) {
                        continue;
                    }
                }
                nVisibleVariables++;
                // we remove the "final" for solving "may have not been in initialized" in constructor code
                // this does not work for case statements
                // var.getModifiers().remove(ModifierKind.FINAL);
                snippet += "\"" + idFor(var.getSimpleName()) + "\"," + var.getSimpleName() + ",";
            }
        }
        snippet = snippet.substring(0, snippet.length() - 1);
        snippet += "};\n\t" + getLogName() + ".writeVar(" + getCount(statement) + ",Thread.currentThread(),\""
                + id + "\"," + tmpVar + ");\n";
        if (
                nVisibleVariables > 0 // do not add the monitoring if nothing to ignore
                        &&

                        // too many variables and too many ifs
                        // may cause the following:
                        // The code of method populateFromBibtex(BibtexEntry) is exceeding the 65535 bytes limit
                        nVisibleVariables < 50
                ) {
            CompilationUnit compileUnit = statement.getPosition().getCompilationUnit();
            SourcePosition sp = statement.getPosition();

            int index = sp.getSourceStart();

            //Check for else if ( ... ) statements to wrap them inside brackets. This is an special case
            boolean isElseIfSpecialCase = statement instanceof CtIfImpl && statement.getParent() instanceof CtIfImpl &&
                    ((CtIfImpl) statement.getParent()).getElseStatement().equals(statement);
            if (isElseIfSpecialCase) {
                //Open the bracket at the "else"
                compileUnit.addSourceCodeFragment(new SourceCodeFragment(index - 1, "{", 0));
            }

            //Insert the snippet
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));

            if (isElseIfSpecialCase) {
                //Close the previously inserted "else" bracket
                int endIndex = sp.getSourceEnd();
                compileUnit.addSourceCodeFragment(new SourceCodeFragment(endIndex, "}", 0));
            }
        }
    }


    private Collection<CtVariable<?>> getVariablesInScope(final CtElement el) {
        return _getVariablesInScope(el, new TreeSet());
    }

    /**
     * Returns all variables in this scope
     * if el does not define a scope, returns an empty set
     */
    private Collection<CtVariable<?>> _getVariablesInScope(final CtElement el, final Set<CtElement> children) {


        final Set<CtVariable<?>> variables = new TreeSet<CtVariable<?>>();

        // we add all variables in the scope of el
        variables.addAll(getVariablesInLocalScope(el, children));

        // recursion: we collect all variables in this scope
        // and in the scope of its parent
        if (
            // if we have parent
                el.getParent() != null

                        // but a package does not define a scope
                        && !CtPackage.class.isAssignableFrom(el.getParent().getClass())

                        // there are complex compilation rules with final fields
                        // and anonymous classes, skip parents of anonymous classes
                        && !(el instanceof CtNewClass)

                        // constructor and "final" errors
                        && !(el instanceof CtConstructor)

                        // static blocks and "may not have been initialized", skip
                        && !(el instanceof CtAnonymousExecutable)

                        //  Cannot refer to a non-final variable initial inside an inner class defined in a different method
                        && !(el instanceof CtSimpleType && el.getParent() instanceof CtBlock)

                ) {
            // here is the recursion
            children.add(el);
            variables.addAll(_getVariablesInScope(el.getParent(), children));
        }

        return variables;
    }

    private Collection<CtVariable<?>> getVariablesInLocalScope(final CtElement el, final Set<CtElement> stoppers) {

        final Set<CtVariable<?>> variables = new TreeSet();

        // we will visit some elements children of "el" to add the variables
        CtAbstractVisitor visitor = new CtAbstractVisitor() {

            // for a block we add the local variables
            @Override
            public <R> void visitCtBlock(CtBlock<R> block) {
                for (CtStatement stmt : block.getStatements()) {
                    // we can not add variables that are declared after the stoppers
                    if (stoppers.contains(stmt)) {
                        return;
                    }

                    // we only add the new local variables
                    if (stmt instanceof CtLocalVariable) {
                        variables.add((CtVariable<?>) stmt);
                    }
                }
            }

            // for a method we add the parameters
            @Override
            public <T> void visitCtMethod(CtMethod<T> m) {
                for (CtParameter<?> param : m.getParameters()) {
                    variables.add(param);
                }
            }

            // for a class we add the fields
            @Override
            public <T> void visitCtClass(CtClass<T> ctClass) {
                for (CtField<?> field : ctClass.getFields()) {
                    variables.add(field);
                }
            }

            @Override
            public <T> void visitCtThisAccess(CtThisAccess<T> tCtThisAccess) {
            }
        };

        visitor.scan(el);

        return variables;
    }

    public boolean hasLabelAndGoto(CtStatement stmt) {
        CtExecutable parent = stmt.getParent(CtExecutable.class);

        if (parent == null)
            return false;

        QueryVisitor query = new QueryVisitor(new TypeFilter(CtContinue.class));
        parent.accept(query);
        return query.getResult().stream()
                .anyMatch(cnt -> ((CtContinue) cnt).getTargetLabel() != null);
    }


}