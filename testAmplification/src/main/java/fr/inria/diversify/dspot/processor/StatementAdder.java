package fr.inria.diversify.dspot.processor;

import fr.inria.diversify.codeFragment.*;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.ImportScanner;
import spoon.reflect.visitor.ImportScannerImpl;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 02/12/15
 * Time: 14:55
 */
public class StatementAdder extends AbstractAmp {
    protected List<CodeFragment> codeFragments;

    public StatementAdder(InputProgram inputProgram, CtClass testClass) {

        inputProgram.processCodeFragments();
        HashMap<String, CodeFragmentList> codeFragmentsByClass = inputProgram.getCodeFragmentsByClass();

        Set<CtType> codeFragmentsProvide = computeClassProvider(testClass);
//        getLiterals(codeFragmentsProvide);
        Set<Integer> ids = new HashSet<>();
        codeFragments = codeFragmentsProvide.stream()
                .map(cl -> cl.getQualifiedName())
                .filter(cl -> codeFragmentsByClass.containsKey(cl))
                .flatMap(cl -> codeFragmentsByClass.get(cl).stream()
                    .filter(cf -> isValidCodeFragment(cf)))
                .filter(cf -> ids.add(cf.id()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CtMethod> apply(CtMethod method) {
       List<CtMethod> newMethods = new ArrayList<>();

        List<InputContext> inputContexts = getInputContexts(method);
        Set<String> varsInMth = inputContexts.stream()
                .flatMap(inputContext -> inputContext.getAllVarName().stream())
                .collect(Collectors.toSet());

        for(int i = 0; i < inputContexts.size(); i++) {
            InputContext inputContext = inputContexts.get(i);
            CodeFragment candidate = getRandomCandidateFor(inputContext, varsInMth);
            if(candidate != null) {
                try {
                    CtMethod cloned_method = cloneMethodTest(method, "_cf", 1000);
                    CtStatement stmt = getAssertStatement(cloned_method)
                            .get(i);
                    Map<String, String> varMapping = candidate.randomVariableMapping(inputContext, true);

                    CodeFragment candidateClone = candidate.clone();
                    candidateClone.replaceVar(new Statement(stmt), varMapping);
                    stmt.insertBefore((CtStatement) candidateClone.getCtCodeFragment());
                    newMethods.add(cloned_method);
                } catch (Exception e) {}
            }
        }
        return filterAmpTest(newMethods, method);
    }

    @Override
    public CtMethod applyRandom(CtMethod method) {
        return null;
    }

    protected List<InputContext> getInputContexts(CtMethod method) {
        List<InputContext> inputContexts = new ArrayList<>();

        List<CtStatement> statements = getAssertStatement(method);
        for(CtStatement stmt : statements) {
            Set<CtVariableReference> varRefs = new HashSet<>();
            for(CtLocalVariable var : getLocalVarInScope(stmt)) {
                varRefs.add(method.getFactory().Code().createLocalVariableReference(var));
            }

            inputContexts.add(new InputContext(varRefs));
        }

        return inputContexts;
    }

    protected CodeFragment getRandomCandidateFor(InputContext inputContext, Set<String> varsInMth) {
        List<CodeFragment> candidates = getAllCandidateFor(inputContext, varsInMth);
        if(!candidates.isEmpty()) {
            Random r = new Random();
            return candidates.get(r.nextInt(candidates.size()));
        } else {
            return null;
        }
    }

    protected List<CodeFragment> getAllCandidateFor(InputContext inputContext, Set<String> varsInMth) {
        return codeFragments.stream()
                .filter(cf -> inputContext.containsAll(cf.getInputContext(), true))
                .filter(cf -> {
                    if(cf.getCtCodeFragment() instanceof CtLocalVariable) {
                        return !varsInMth.contains(((CtLocalVariable) cf.getCtCodeFragment()).getSimpleName());
                    } else {
                        return true;
                    }
                })
                .collect(Collectors.toList());
    }

    protected  List<CtStatement> getAssertStatement(CtMethod method) {
        List<CtStatement> statements = Query.getElements(method, new TypeFilter(CtStatement.class));
        return statements.stream()
                .filter(stmt -> stmt.getParent() instanceof CtBlock)
                .filter(stmt -> isAssert(stmt))
                .collect(Collectors.toList());
    }

    protected List<CtLocalVariable> getLocalVarInScope(CtStatement stmt) {
        List<CtLocalVariable> vars = new ArrayList<>();
        CtBlock parentBlock = stmt.getParent(CtBlock.class);
        if(parentBlock != null) {
            boolean beforeCurrentStmt = true;
            int i = 0;
            List<CtStatement> stmts = parentBlock.getStatements();

            while(beforeCurrentStmt && i < stmts.size()) {
                CtStatement currentStatement = stmts.get(i);
                i++;
                beforeCurrentStmt = beforeCurrentStmt && currentStatement != stmt;
                if(currentStatement instanceof CtLocalVariable) {
                    vars.add((CtLocalVariable) currentStatement);
                }
            }
            vars.addAll(getLocalVarInScope(parentBlock));

        }
        return vars;
    }

    protected boolean isValidCodeFragment(CodeFragment cf) {
        CtCodeElement codeElement = cf.getCtCodeFragment();

        if(CtReturn.class.isInstance(codeElement)
                || CtThrow.class.isInstance(codeElement)) {
//                || cf.getSourceFile().toString().contains("test")) {
            return false;
        }

        if(CtLocalVariable.class.isInstance(codeElement) ) {
            Object defaultExpression = ((CtLocalVariable) codeElement).getDefaultExpression();
            return defaultExpression != null && !(defaultExpression instanceof CtLiteral);
        }

        String equalString = cf.equalString();
        if(equalString.equals("break")
                || equalString.contains("continue")
                || equalString.contains("fr.inria")) {
            return false;
        }

        return true;
    }
}
