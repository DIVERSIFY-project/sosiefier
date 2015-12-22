package fr.inria.diversify.dspot.processor;

import fr.inria.diversify.codeFragment.*;
import fr.inria.diversify.logger.branch.Coverage;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.*;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtVariableReadImpl;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 02/12/15
 * Time: 14:55
 */
public class StatementAdder extends AbstractAmp {
    protected List<CodeFragment> localVars;
    protected List<CodeFragment> codeFragments;

    @Override
    public List<CtMethod> apply(CtMethod method) {
       List<CtMethod> newMethods = new ArrayList<>();

        List<InputContext> inputContexts = getInputContexts(method);
        for(int i = 0; i < inputContexts.size(); i++) {
            InputContext inputContext = inputContexts.get(i);
            List<CodeFragment> statements = getRandomCandidateFor(inputContext);
                try {
                    newMethods.add(apply(method, statements, i));
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.debug("");
                }
        }
        return filterAmpTest(newMethods, method);
    }

    public CtMethod applyRandom(CtMethod method) {
        List<InputContext> inputContexts = getInputContexts(method);

        while(!inputContexts.isEmpty()) {
            try {
                int index = getRandom().nextInt(inputContexts.size());
                List<CodeFragment> statements = getRandomCandidateFor(inputContexts.get(index));
                return apply(method, statements, index);
            } catch (Exception e) {}
        }
        return null;
    }

    protected CtMethod apply(CtMethod method,  List<CodeFragment> statements, int index) {
        CtMethod cloned_method = cloneMethodTest(method, "_cf", 1000);
        CtStatement stmt = getAssertStatement(cloned_method)
                .get(index);
//        cloned_method.setParent(method.getParent());
        statements.stream()
                .forEach(c ->
                {
                    stmt.insertBefore((CtStatement) c.getCtCodeFragment());
                    c.getCtCodeFragment().setParent(stmt.getParent());
                });

        return cloned_method;
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

    protected List<CodeFragment> getRandomCandidateFor(InputContext inputContext) {
        List<CodeFragment> list = new ArrayList<>();

        CodeFragment codeFragment = codeFragments.get(getRandom().nextInt(codeFragments.size()));Factory factory = codeFragment.getCtCodeFragment().getFactory();

        CodeFragment clone = factory.Core().clone(codeFragment);

        for(CtVariableReference var : codeFragment.getInputContext().getVar()) {
            List<CtVariableReference> candidates = inputContext.allCandidate(var.getType(), true);
            CtVariableReference candidate;
            if(candidates.isEmpty()) {
                CodeFragment cfLocalVar = getLocalVar(var.getType(), inputContext);
                if(cfLocalVar == null) {
                    candidate = factory.Code().createLocalVariableReference(var.getType(), "null");
                }  else {
                    list.add(cfLocalVar);
                    CtLocalVariable localVariable = (CtLocalVariable) cfLocalVar.getCtCodeFragment();
                    candidate = factory.Code().createLocalVariableReference(localVariable);
                }
            } else {
                candidate = candidates.get(getRandom().nextInt(candidates.size()));
            }
            CtVariableReference variable = clone.getInputContext().getVariableOrFieldNamed(var.getSimpleName());
            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            clone.getCtCodeFragment().accept(visitor);
        }
        list.add(clone);
         return list;
    }

    protected CodeFragment getLocalVar(CtTypeReference type, InputContext inputContext) {
        List<CodeFragment> list = localVars.stream()
                .filter(var -> var.getCtCodeFragment() != null)
                .filter(var -> type.equals(((CtLocalVariable) var.getCtCodeFragment()).getType()))
                .collect(Collectors.toList());

        if(list.isEmpty()) {
            return null;
        } else {
            Factory factory = type.getFactory();
            boolean localVarFind;
            while(!list.isEmpty()) {
                CodeFragment localVar = factory.Core().clone(list.remove(getRandom().nextInt(list.size())));
                localVarFind = true;
                for (CtVariableReference var : localVar.getInputContext().getVar()) {
                    CtVariableReference<?> candidate = inputContext.candidate(var.getType(), true);
                    if (candidate == null) {
                        localVarFind = false;
                        break;
                    }
                    CtVariableReference variable = localVar.getInputContext().getVariableOrFieldNamed(var.getSimpleName());
                    ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(var, variable);
                    localVar.getCtCodeFragment().accept(visitor);
                }
                if(localVarFind) {
                    return localVar;
                }
            }
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
        try {
            CtBlock parentBlock = stmt.getParent(CtBlock.class);
            if (parentBlock != null) {
                boolean beforeCurrentStmt = true;
                int i = 0;
                List<CtStatement> stmts = parentBlock.getStatements();

                while (beforeCurrentStmt && i < stmts.size()) {
                    CtStatement currentStatement = stmts.get(i);
                    i++;
                    beforeCurrentStmt = beforeCurrentStmt && currentStatement != stmt;
                    if (currentStatement instanceof CtLocalVariable) {
                        vars.add((CtLocalVariable) currentStatement);
                    }
                }
                vars.addAll(getLocalVarInScope(parentBlock));

            }
        } catch (Exception e) {}
        return vars;
    }

    protected boolean isValidCodeFragment(CodeFragment cf) {
        CtCodeElement codeElement = cf.getCtCodeFragment();

        if(CtLocalVariable.class.isInstance(codeElement) ) {
            Object defaultExpression = ((CtLocalVariable) codeElement).getDefaultExpression();
            return defaultExpression != null;
        }
        return false;
    }

    protected List<CodeFragment> buildCodeFragmentFor(CtType cl, Coverage coverage) {
        Factory factory = cl.getFactory();
        List<CodeFragment> codeFragments = new ArrayList<>();

        for(CtMethod<?> mth : (Set<CtMethod>)cl.getAllMethods()) {
            if(! mth.getModifiers().contains(ModifierKind.ABSTRACT)
                    && !mth.getModifiers().contains(ModifierKind.PRIVATE)
                    && getCoverageForMethod(coverage, cl, mth) != 1.0) {

                CtExecutableReference<?> executableRef = factory.Executable().createReference(mth);
                CtInvocation invocation;
                if (mth.getModifiers().contains(ModifierKind.STATIC)) {
                    executableRef.setStatic(true);
                    invocation = factory.Code().createInvocation(null, executableRef);
                } else {
                    executableRef.setStatic(false);
                    invocation = factory.Code().createInvocation(null, executableRef);

                    invocation.setTarget(buildVarRef(cl.getQualifiedName(), "var_" + cl.getSimpleName(), factory));
                }
                invocation.setArguments(mth.getParameters().stream()
                        .map(param -> buildVarRef(param.getType().getQualifiedName(), "var_" + param.getType().getSimpleName(), factory))
                        .collect(Collectors.toList()));
                invocation.setType(mth.getType());
                Statement stmt = new Statement(invocation);
                codeFragments.add(stmt);
            }

        }
        return codeFragments;

    }

    protected CtVariableRead buildVarRef(String typeName, String varName, Factory factory) {
        CtTypeReference<Object> typeRef = factory.Core().createTypeReference();
        typeRef.setSimpleName(typeName);

        CtLocalVariable<Object> localVar = factory.Core().createLocalVariable();
        localVar.setType(typeRef);
        localVar.setSimpleName(varName);

        CtVariableReadImpl varRead = new CtVariableReadImpl();
        varRead.setVariable(factory.Code().createLocalVariableReference(localVar));
        return varRead;
    }

    protected CtType findClassUnderTest(CtClass testClass) {
        return computeClassProvider(testClass).stream()
                .filter(cl -> testClass.getQualifiedName().contains(cl.getQualifiedName()) && cl != testClass)
                .findFirst()
                .get();
    }

    protected double getCoverageForMethod(Coverage coverage, CtType cl, CtMethod mth) {
        if(coverage == null) {
            return 0d;
        }

        String key = mth.getDeclaringType().getQualifiedName() + "_"
                +  mth.getType().getQualifiedName()  + "_"
                + mth.getSimpleName() + "("
                + mth.getParameters().stream()
                    .map(param -> ((CtParameter)param).getType().getQualifiedName())
                    .collect(Collectors.joining(","))
                + ")";

        if(coverage.getMethodCoverage(key) != null) {
            return  coverage.getMethodCoverage(key).coverage();
        } else {
            key = cl.getQualifiedName() + "_"
                    +  mth.getType().getQualifiedName()  + "_"
                    + mth.getSimpleName() + "("
                    + mth.getParameters().stream()
                    .map(param -> ((CtParameter)param).getType().getQualifiedName())
                    .collect(Collectors.joining(","))
                    + ")";
            if(coverage.getMethodCoverage(key) != null) {
                return coverage.getMethodCoverage(key).coverage();
            } else {
                return 0d;
            }
        }
    }

    public void reset(InputProgram inputProgram, Coverage coverage, CtClass testClass) {
        super.reset(inputProgram, coverage, testClass);

        inputProgram.processCodeFragments();
        HashMap<String, CodeFragmentList> codeFragmentsByClass = inputProgram.getCodeFragmentsByClass();
        codeFragments = buildCodeFragmentFor(findClassUnderTest(testClass), coverage);
        Set<CtType> codeFragmentsProvide = computeClassProvider(testClass);
        Set<Integer> ids = new HashSet<>();
        localVars = codeFragmentsProvide.stream()
                .map(cl -> cl.getQualifiedName())
                .filter(cl -> codeFragmentsByClass.containsKey(cl))
                .flatMap(cl -> codeFragmentsByClass.get(cl).stream()
                        .filter(cf -> isValidCodeFragment(cf)))
                .filter(cf -> ids.add(cf.id()))
                .collect(Collectors.toList());
    }
}
