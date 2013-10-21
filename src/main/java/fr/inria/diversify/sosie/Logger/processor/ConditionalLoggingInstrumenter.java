package fr.inria.diversify.sosie.logger.processor;


import fr.inria.diversify.util.Log;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.visitor.CtAbstractVisitor;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Adds basic logging before each conditionals (if, loops).
 * Use basic scope inference (the real one is hard due to the complex semantics of "static" and "final"
 * (w.r.t. init, anonymous classes, etc.)
 */
public class ConditionalLoggingInstrumenter extends AbstractProcessor<CtStatement> {
    private static int count = 0;


    @Override
    public boolean isToBeProcessed(CtStatement candidate) {
        return
                CtIf.class.isAssignableFrom(candidate.getClass())
                        || CtLoop.class.isAssignableFrom(candidate.getClass())
                        || CtThrow.class.isAssignableFrom(candidate.getClass())
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
        count++;
        if (CtThrow.class.isAssignableFrom(statement.getClass())) {
            instruThrow((CtThrow) statement);
        } else {
            instruLoopOrIf(statement);
        }
    }

    private void instruLoopOrIf(CtStatement statement) {
        boolean inStaticCode =
                hasStaticParent(statement);
        String snippet = "fr.inria.diversify.sosie.logger.LogWriter.writeLog(" + count + ",Thread.currentThread(),\""
                + getClass(statement).getQualifiedName() + "\",\"" + getMethod(statement).getSignature() + "\"";

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

                snippet += ",\"" + var.getSimpleName() + "\"," + var.getSimpleName();
            }
        }
        snippet += ");\n";
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
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
//		statement.insertBefore(getFactory().Code().createCodeSnippetStatement(	snippet));
        }
    }

    private void instruThrow(CtThrow throwStmt) {
        String snippet = "{\nfr.inria.diversify.sosie.logger.LogWriter.writeException(" + count + ",Thread.currentThread(),\"" +
                getClass(throwStmt).getQualifiedName() + "\",\"" + getMethod(throwStmt).getSignature() + "\"," +
                throwStmt.getThrownExpression() + ");\n";
        SourcePosition sp = throwStmt.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));

        snippet = "\n}\n";

        index = compileUnit.nextLineIndex(sp.getSourceEnd());
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
    }


    private void instruCatch(CtTry tryStmt) {
        List<CtCatch> catchList = tryStmt.getCatchers();
        for (CtCatch catchStmt : catchList) {
            if(getMethod(tryStmt) != null) {
                String snippet = "fr.inria.diversify.sosie.logger.LogWriter.writeError(" + count + ",Thread.currentThread(),\"" +
                        getClass(tryStmt).getQualifiedName() + "\",\"" + getMethod(tryStmt).getSignature() + "\"," +
                        catchStmt.getParameter().getSimpleName() + ".getStackTrace());\n";

                CtBlock<?> catchBlock = catchStmt.getBody();
                if(!catchBlock.getStatements().isEmpty()) {
                    CtStatement statement = catchBlock.getStatements().get(0);
                    SourcePosition sp = statement.getPosition();
                    CompilationUnit compileUnit = sp.getCompilationUnit();
                    int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
                    compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
                }
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

            ;

            // for a class we add the fields
            @Override
            public <T> void visitCtClass(CtClass<T> ctClass) {
                for (CtField<?> field : ctClass.getFields()) {
                    variables.add(field);
                }
            }

        };

        visitor.scan(el);

        return variables;
    }

    private CtSimpleType<?> getClass(CtStatement stmt) {
        return stmt.getParent(CtSimpleType.class);
    }

    private CtExecutable<?> getMethod(CtStatement stmt) {
        CtExecutable<?> ret = stmt.getParent(CtMethod.class);
        if (ret == null)
            ret = stmt.getParent(CtConstructor.class);
        return ret;
    }
}