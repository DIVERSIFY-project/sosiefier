package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.VarFinder;
import spoon.reflect.code.*;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.*;
import java.util.stream.Collectors;

import static fr.inria.diversify.util.VarFinder.getTypedVar;

/**
 * Created by nharrand on 22/11/16.
 */
public class AddMethodInvocationQuery extends TransformationQuery {
    private List<CtStatement> candidateList;
    private Iterator<CtStatement> candidateIt;
    private CtStatement curCandidate = null;
    private List<CtMethod> curMethods = new LinkedList<>();
    private List<CtMethod> toRemove = new LinkedList<>();

    private boolean internalMethods = true;
    private boolean externalMethods = false;
    private boolean staticMethods = false;
    private boolean nonstaticMethods = true;
    private boolean dumpMethodsAfterSuccess = false;
    private boolean shuffleCandidate = false;
    private boolean shuffleMethods = true;
    private int maxMethodsPerStmt = 100;


    public AddMethodInvocationQuery(InputProgram inputProgram, boolean internalMethods, boolean externalMethods,
                                    boolean staticMethods, boolean nonstaticMethods, boolean dumpMethodsAfterSuccess,
                                    boolean shuffleCandidate, boolean shuffleMethods, int maxMethodsPerStmt) {
        super(inputProgram);


        this.internalMethods = internalMethods;
        this.externalMethods = externalMethods;
        this.staticMethods = staticMethods;
        this.nonstaticMethods = nonstaticMethods;
        this.dumpMethodsAfterSuccess = dumpMethodsAfterSuccess;
        this.shuffleCandidate = shuffleCandidate;
        this.shuffleMethods = shuffleMethods;
        this.maxMethodsPerStmt = maxMethodsPerStmt;

        findCandidates();
    }


    public AddMethodInvocationQuery(InputProgram inputProgram) {
        super(inputProgram);
        findCandidates();
    }

    private boolean isInsertable(CtStatement el) {
        if((el instanceof CtCase) ||
                ((el.getParent() instanceof CtFor) && (((CtFor) el.getParent()).getForInit().contains(el)
                    || ((CtFor) el.getParent()).getForUpdate().contains(el)))
                ) return false;
        try {
            CtStatement stmt = el.getFactory().Code().createCodeSnippetStatement("");
            el.insertBefore(stmt);
            stmt.delete();
            if(el.getParent() instanceof CtStatementList)
                return true;
            else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

    private void findCandidates() {
        candidateList = new ArrayList<>();
        System.out.println(" --- Search for for Candidates --- ");
        /*candidateAndMethods.putAll(getInputProgram().getAllElement(CtStatement.class).stream()
                .filter(ce -> ce.getParent(CtMethod.class) != null)
                .map(ce -> (CtStatement) ce)
                //.collect(Collectors.toList())
                .collect(Collectors.toMap(ce -> ce, ce -> VarFinder.getAccessibleMethods(ce)))
        );*/
        //Collection<CtStatement> stmts = getInputProgram().getAllElement(CtStatement.class);
        Collection<CtStatement> stmts = getInputProgram()
                .getFactory()
                .getModel()
                .getElements(new TypeFilter<>(CtStatement.class));

        Collection<CtStatement> stmtsFiltered = new ArrayList<>();
        for(CtStatement statement: stmts) {
            try {
                if(getInputProgram().getCoverageReport().positionCoverage(statement.getPosition()) != 0) {
                    stmtsFiltered.add(statement);
                } else {
                    System.out.println("Pos: " + statement.getPosition() + " not covered");
                }
            } catch (Exception e) {
                System.out.println("problem");
            }
        }

        System.out.println(" --- found (" + stmts.size() + ") --- ");
        int i = 0;
        for(CtStatement ce : stmtsFiltered) {
            if(ce.getParent(CtMethod.class) != null) {
                if(isInsertable(ce)) candidateList.add(ce);
            }
        }
        System.out.println(" --- Done (" + candidateList.size() + ") --- ");
        if(shuffleCandidate) Collections.shuffle(candidateList);
        candidateIt = candidateList.iterator();
    }


    //Static methods
    private CtStatement createInvocation(CtVariable target, CtMethod method, List<CtVariable> vars) {
        return createInvocation(target, method, vars, false);
    }

    private CtStatement createInvocation(CtVariable target, CtMethod method, List<CtVariable> vars, boolean staticParam) {
        Factory f = method.getFactory();
        CtStatement res = null;
        List<CtExpression> params = new LinkedList<>();
        if (VarFinder.fillParameter(params, method, vars, staticParam)) {
            CtExpression ttarget = null;
            if(target != null) {
                ttarget = f.Code().createVariableRead(VarFinder.createRef(target), target.getModifiers().contains(ModifierKind.STATIC));
            }
            CtExecutableReference exeRef = method.getReference();
            CtExpression[] array = params.toArray(new CtExpression[params.size()]);
            res = f.Code().createInvocation(ttarget, exeRef, array);
            toRemove.add(method);
        }
        return res;
    }

    //Static methods
    private CtStatement createInvocation(CtMethod method, List<CtVariable> vars) {
        return createInvocation(method, vars, false);
    }

    private CtStatement createInvocation(CtMethod method, List<CtVariable> vars, boolean staticParam) {
        Factory f = method.getFactory();
        CtStatement res = null;
        List<CtExpression> params = new LinkedList<>();
        if (VarFinder.fillParameter(params, method, vars, staticParam)) {
            CtExecutableReference exeRef = method.getReference();
            CtExpression[] array = params.toArray(new CtExpression[params.size()]);
            CtExpression ttarget = f.Code().createTypeAccess(method.getDeclaringType().getReference());
            res = f.Code().createInvocation(ttarget, exeRef, array);
            toRemove.add(method);
        }
        return res;
    }

    // TP > target > Methods > Parameters
    private CtStatement buildInvocation(CtStatement tp, List<CtMethod> methods) {
        Factory f = tp.getFactory();
        CtStatement res = null;
        CtMethod curMethod = tp.getParent(CtMethod.class);
        boolean staticCtx = curMethod.getModifiers().contains(ModifierKind.STATIC);
        List<CtVariable> vars = VarFinder.getAccessibleVars(tp, staticCtx);
        if(externalMethods && nonstaticMethods) {
            for(CtVariable v : vars) {
                if(VarFinder.notPrimitiveNotAnArray(v)) {
                    for(CtMethod m : methods) {
                        toRemove.add(m);
                        if(!curMethod.equals(m) && !m.getModifiers().contains(ModifierKind.STATIC)
                                && !m.getModifiers().contains(ModifierKind.PRIVATE)) {
                            CtClass cl = m.getParent(CtClass.class);
                            if(cl != null) {
                                try {
                                    //CtTypeReference t = f.Code().createCtTypeReference(cl.getActualClass());
                                    CtTypeReference t = cl.getReference();
                                    if (v.getType().isSubtypeOf(t)) {
                                        res = createInvocation(v, m, vars, staticCtx);
                                        if (res != null) {
                                            return res;
                                        }
                                    }
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
        }
        //This
        if(!staticCtx) {
            for (CtMethod m : methods) {
                toRemove.add(m);
                if (nonstaticMethods && !curMethod.equals(m) && !m.getModifiers().contains(ModifierKind.STATIC)) {
                    try {
                        CtClass cl = m.getParent(CtClass.class);
                        CtClass cltp = tp.getParent(CtClass.class);
                        if ((cl != null) && (cltp != null)) {
                            //CtTypeReference t = f.Code().createCtTypeReference(cl.getActualClass());
                            //CtTypeReference ttp = f.Code().createCtTypeReference(cltp.getActualClass());
                            //if (ttp.isSubtypeOf(t)) {
                            if(cltp.isSubtypeOf(cl.getReference())) {
                                res = createInvocation(null, m, vars, staticCtx);
                                if (res != null) {
                                    return res;
                                }
                            }
                        }
                    } catch (Exception e) {
                    }
                } else if (staticMethods && !curMethod.equals(m) && m.getModifiers().contains(ModifierKind.STATIC)) {
                    res = createInvocation(m, vars, staticCtx);
                    if (res != null) {
                        return res;
                    }
                }
            }
        }
        toRemove.addAll(methods);
        System.out.println("Failed to find a suitable target and/or method.");
        return null;
    }

    //Tp > Methods > Parameters > Target
    private CtStatement buildSuitableInvocation(CtStatement tp, List<CtMethod> methods) {
        Factory f = tp.getFactory();
        CtStatement res = null;
        List<CtVariable> vars = VarFinder.getAccessibleVars(tp);
        List<CtExpression> params;
        for(CtMethod m : methods) {
            //methods.remove(m);
            toRemove.add(m);
            params = new LinkedList<>();
            CtMethod curMethod = tp.getParent(CtMethod.class);
            if(!curMethod.equals(m)) {
                if(VarFinder.fillParameter(params, m, vars)) {
                    if(m.getModifiers().contains(ModifierKind.STATIC)) {
                        CtExpression target = f.Code().createTypeAccess(m.getDeclaringType().getReference());
                        System.out.println("class: " + m.getDeclaringType().getReference() + " target -> " + target);
                        CtExecutableReference exeRef = m.getReference();
                        CtExpression[] array = params.toArray(new CtExpression[params.size()]);
                        res = f.Code().createInvocation(target, exeRef, array);
                        return res;
                    } else {
                        final CtMethod me = m;
                        CtVariable var = getTypedVar(m.getParent(CtClass.class), vars);
                        if(var != null) {
                            CtExpression target = f.Code().createVariableRead(VarFinder.createRef(var), var.getModifiers().contains(ModifierKind.STATIC));
                            System.out.println("var: " + var + " target -> " + target);
                            CtExecutableReference exeRef = m.getReference();
                            CtExpression[] array = params.toArray(new CtExpression[params.size()]);
                            res = f.Code().createInvocation(target, exeRef, array);
                            return res;
                        } else {
                            CtClass targetClass = m.getParent(CtClass.class);
                            //CtTypeReference classRef = f.Code().createCtTypeReference(targetClass.getActualClass());
                            CtTypeReference classRef = targetClass.getReference();
                            List<CtConstructor> constructors = new LinkedList<>(targetClass.getConstructors());
                            List<CtExpression> paramsConst;
                            //boolean constFound = false;
                            Collections.shuffle(constructors);
                            for(CtConstructor constructor: constructors) {
                                paramsConst = new LinkedList<>();
                                if(VarFinder.fillParameter(paramsConst, constructor, vars)) {
                                    CtExpression[] arrayC = paramsConst.toArray(new CtExpression[paramsConst.size()]);
                                    CtExpression init =  f.Code().createConstructorCall(classRef,arrayC);
                                    CtLocalVariable fillMe = f.Code().createLocalVariable(classRef, VarFinder.createVarName(vars), init);
                                    CtBlock b = f.Code().createCtBlock(fillMe);
                                    CtExpression target = f.Code().createVariableRead(VarFinder.createRef(fillMe), fillMe.getModifiers().contains(ModifierKind.STATIC));
                                    System.out.println("fillMe: " + fillMe + " target -> " + target);
                                    CtExecutableReference exeRef = m.getReference();
                                    CtExpression[] array = params.toArray(new CtExpression[params.size()]);
                                    b.insertEnd(f.Code().createInvocation(target, exeRef, array));
                                    res = b;
                                    return res;
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }


    int cur = 0;

    public Transformation buildTransformation() throws QueryException {
        Transformation res = null;
        while (res == null && hasNextTransformation()) {
            if((dumpMethodsAfterSuccess && (cur >= maxMethodsPerStmt)) || (((curCandidate == null) || curMethods.isEmpty()))) {
                if(!candidateIt.hasNext()) throw new QueryException("No valid candidate");
                cur = 0;
                curCandidate = candidateIt.next();
                if(externalMethods && nonstaticMethods && !internalMethods && !staticMethods)
                    curMethods = new ArrayList<>(VarFinder.getTargetableMethods(curCandidate));
                else if (!externalMethods && internalMethods)
                    curMethods = new ArrayList<>(VarFinder.getInternalMethods(curCandidate, staticMethods, nonstaticMethods));
                else
                    curMethods = new ArrayList<>(VarFinder.getAccessibleMethods(curCandidate, staticMethods, nonstaticMethods));
            }


            if(shuffleMethods) Collections.shuffle(curMethods);
            CtStatement invocation = buildInvocation(curCandidate, curMethods);
            curMethods.removeAll(toRemove);
            toRemove.clear();
            if(invocation != null) {
                cur++;
                res = new AddMethodInvocation(curCandidate, invocation);
            }
        }
        return res;
    }

    @Override
    public Transformation query() throws QueryException {
        //curCandidate = candidateIt.next();
        //curMethods = new ArrayList<>(VarFinder.getAccessibleMethods(curCandidate, staticMethods, nonstaticMethods));

        //curMethods = new ArrayList<>(VarFinder.getInternalMethods(curCandidate, staticMethods, nonstaticMethods));

        /*if((dumpMethodsAfterSuccess && (cur >= maxMethodsPerStmt)) || (((curCandidate == null) || curMethods.isEmpty()))) {
            if(!candidateIt.hasNext()) throw new QueryException("No valid candidate");
            cur = 0;
            curCandidate = candidateIt.next();
            if(externalMethods && nonstaticMethods && !internalMethods && !staticMethods)
                curMethods = new ArrayList<>(VarFinder.getTargetableMethods(curCandidate));
            else if (!externalMethods && internalMethods)
                curMethods = new ArrayList<>(VarFinder.getInternalMethods(curCandidate, staticMethods, nonstaticMethods));
            else
                curMethods = new ArrayList<>(VarFinder.getAccessibleMethods(curCandidate, staticMethods, nonstaticMethods));
        }

        //System.out.println("Methods: " + curMethods.size());

        if(shuffleMethods) Collections.shuffle(curMethods);
        CtStatement invocation = buildInvocation(curCandidate, curMethods);
        curMethods.removeAll(toRemove);
        toRemove.clear();
        if(invocation != null) {
            cur++;
            return new AddMethodInvocation(curCandidate, invocation);
        } else if (hasNextTransformation()) {
            return query();
        } else {
            throw new QueryException("No valid candidate");
        }*/
        Transformation t = buildTransformation();
        if(t == null) {
            new QueryException("No valid candidate");
        }
        return t;
    }
    //

    @Override
    public boolean hasNextTransformation() {
        return (!curMethods.isEmpty() || candidateIt.hasNext());
    }
}
