package fr.inria.diversify.dspot.processor;

import fr.inria.diversify.codeFragment.*;
import fr.inria.diversify.runner.InputProgram;
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
public class StatementAdder2 extends AbstractAmp {
    protected List<CodeFragment> localVars;
    protected List<CodeFragment> codeFragments;

    public StatementAdder2(InputProgram inputProgram, CtClass testClass) {

        inputProgram.processCodeFragments();
        HashMap<String, CodeFragmentList> codeFragmentsByClass = inputProgram.getCodeFragmentsByClass();
        codeFragments = buildCodeFragmentFor(findClassUnderTest(testClass));
        Set<CtType> codeFragmentsProvide = computeClassProvider(testClass);
//        getLiterals(codeFragmentsProvide);
        Set<Integer> ids = new HashSet<>();
        localVars = codeFragmentsProvide.stream()
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
            List<CodeFragment> candidate = getRandomCandidateFor(inputContext, varsInMth);
                try {
                    CtMethod cloned_method = cloneMethodTest(method, "_cf", 1000);
                    CtStatement stmt = getAssertStatement(cloned_method)
                            .get(i);

                    candidate.stream()
                            .forEach(c ->
                            {
                                stmt.insertBefore((CtStatement) c.getCtCodeFragment());
                                ((CtStatement) c.getCtCodeFragment()).setParent(stmt.getParent());
                            });
                    newMethods.add(cloned_method);
                } catch (Exception e) {}
        }
        return filterAmpTest(newMethods, method);
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

    protected List<CodeFragment> getRandomCandidateFor(InputContext inputContext, Set<String> varsInMth) {
        List<CodeFragment> list = new ArrayList<>();
        Random r = new Random();
        CodeFragment codeFragment = codeFragments.get(r.nextInt(codeFragments.size()));
        Factory factory = codeFragment.getCtCodeFragment().getFactory();

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
                candidate = candidates.get(r.nextInt(candidates.size()));
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
            Random r = new Random();
            Factory factory = type.getFactory();
            boolean localVarFind;
            while(!list.isEmpty()) {
                CodeFragment localVar = factory.Core().clone(list.remove(r.nextInt(list.size())));
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

//        if(CtReturn.class.isInstance(codeElement)
//                || CtThrow.class.isInstance(codeElement)) {
////                || cf.getSourceFile().toString().contains("test")) {
//            return false;
//        }

        if(CtLocalVariable.class.isInstance(codeElement) ) {
            Object defaultExpression = ((CtLocalVariable) codeElement).getDefaultExpression();
            return defaultExpression != null;// && !(defaultExpression instanceof CtLiteral);
        }
        return false;
//
//        String equalString = cf.equalString();
//        if(equalString.equals("break")
//                || equalString.contains("continue")
//                || equalString.contains("fr.inria")) {
//            return false;
//        }
//        return true;
    }

    protected List<CodeFragment> buildCodeFragmentFor(CtType cl) {
        Factory factory = cl.getFactory();
        List<CodeFragment> codeFragments = new ArrayList<>();

        for(CtMethod<?> mth : (Set<CtMethod>)cl.getAllMethods()) {
            if(! mth.getModifiers().contains(ModifierKind.ABSTRACT)
                    && !mth.getModifiers().contains(ModifierKind.PRIVATE)) {

                CtExecutableReference<?> executableRef = factory.Executable().createReference(mth);
                CtInvocation invocation;
                if (mth.getModifiers().contains(ModifierKind.STATIC)) {
                    executableRef.setStatic(true);
                    invocation = factory.Code().createInvocation(null, executableRef);
                } else {
                    executableRef.setStatic(false);
                    invocation = factory.Code().createInvocation(null, executableRef);

                    invocation.setTarget(buildVarRef(cl.getQualifiedName(), "var" + cl.getSimpleName(), factory));
                }
                invocation.setArguments(mth.getParameters().stream()
                        .map(param -> buildVarRef(param.getType().getQualifiedName(), "var" + param.getType().getSimpleName(), factory))
                        .collect(Collectors.toList()));

                codeFragments.add(new Statement(invocation));
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




}
