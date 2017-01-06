package fr.inria.diversify.util;

import spoon.reflect.code.*;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by nharrand on 21/11/16.
 */
public class VarFinder {

    public static String createVarName(List<CtVariable> vars) {
        boolean found = false;
        String varName = "";
        while(!found) {
            varName = RandomLiteralFactory.createString();
            found = true;
            for(CtVariable var: vars) {
                if(var.getSimpleName().equals(varName)) found = false;
            }
        }
        return varName;
    }

    public static List<CtVariable> getAccessibleVars(CtElement el) {
        return getAccessibleVars(el, false);
    }
    //Pre: El is an instruction inside an executable.
    public static List<CtVariable> getAccessibleVars(CtElement el, boolean staticContext) {
        Set<CtVariable> res = new HashSet<>();

        CtExecutable elExecutable = el.getParent(CtExecutable.class);
        res.addAll(elExecutable.getParameters());

        CtClass elClass = el.getParent(CtClass.class);
        Collection<CtField> fields = elClass.getFields();
        for(CtField f: fields) {
            if(!staticContext || f.getModifiers().contains(ModifierKind.STATIC))
                res.add(f);
        }

        res.addAll(getAccessibleVarsFromBlock(el));
        List<CtVariable> lres = new ArrayList<>(res);
        Collections.shuffle(lres);
        return lres;
    }

    public static Set<CtVariable> getAccessibleVarsFromBlock(CtElement el) {
        Set<CtVariable> res = new HashSet<>();
        if (el == null) return res;
                CtBlock elBlock = el.getParent(CtBlock.class);
        if(elBlock != null) {
            res.addAll(getAccessibleVarsFromBlock(elBlock));
            for(CtStatement statement : elBlock.getStatements()) {
                if(el.getPosition() != null && (statement.getPosition().getSourceEnd() > el.getPosition().getSourceStart())) {
                    return res;
                }
                if(statement instanceof CtLocalVariable) {
                    res.add(((CtLocalVariable) statement));
                }
            }
        }
        return res;
    }

    public static Set<CtClass> getAccessibleClasses(CtElement el) {
        Set<CtClass> res = new HashSet<>();
        CtClass elClass = el.getParent(CtClass.class);
        res.add(elClass);

        for(CtType t : elClass.getFactory().Class().getAll()) {
            if(t instanceof CtClass) res.add((CtClass) t);
        }
        return res;
    }

    public static Set<CtMethod> getAccessibleMethods(CtElement el) {
        return getAccessibleMethods(el, false, true);
    }

    public static Set<CtMethod> getAccessibleMethods(CtElement el, boolean acceptStatic, boolean acceptNonStatic) {
        Set<CtMethod> res = new HashSet<>();
        CtClass elClass = el.getParent(CtClass.class);
        CtPackage elPackage = elClass.getPackage();
        for(CtClass c : getAccessibleClasses(el)) {
            Set<CtMethod> methods = c.getAllMethods();
            res.addAll(
                    methods.stream()
                    .filter(
                            m -> (
                                    m.getModifiers().contains(ModifierKind.PUBLIC)
                                    || (c.getPackage().equals(elPackage) && m.getModifiers().contains(ModifierKind.PROTECTED))
                                    || c.equals(elClass)
                            )
                    )
                    .filter(
                            m -> (acceptStatic || !m.getModifiers().contains(ModifierKind.STATIC))
                    )
                    .filter(
                            m -> (acceptNonStatic || m.getModifiers().contains(ModifierKind.STATIC))
                    )
                    .collect(Collectors.toSet())
            );
        }
        //WARNING
        res.remove(el.getParent(CtMethod.class));
        return res;
    }

    public static Set<CtMethod> getInternalMethods(CtElement el, boolean acceptStatic, boolean acceptNonStatic) {
        Set<CtMethod> res = new HashSet<>();
        CtClass elClass = el.getParent(CtClass.class);
        Set<CtMethod> methods = elClass.getAllMethods();
        res.addAll(methods.stream()
                .filter(
                        m -> (acceptStatic || !m.getModifiers().contains(ModifierKind.STATIC))
                )
                .filter(
                        m -> (acceptNonStatic || m.getModifiers().contains(ModifierKind.STATIC))
                )
                .collect(Collectors.toSet()));
        return res;
    }

    public static boolean notPrimitiveNotAnArray(CtVariable v) { return !v.getType().isPrimitive() && !v.toString().contains("[]");}

    public static Set<CtMethod> getTargetableMethods(CtElement el) {
        Set<CtMethod> res = new HashSet<>();
        List<CtVariable> vars = getAccessibleVars(el);
        for(CtVariable v: vars) {
            if(VarFinder.notPrimitiveNotAnArray(v)) {
                try {
                    CtClass target = (CtClass) v.getType().getDeclaration();
                    res.addAll(target.getAllMethods());
                } catch (Exception e) {}
            }
        }
        return res;
    }

    public static CtVariable getTypedVar(CtType t, List<CtVariable> vars) {
        Collections.shuffle(vars);

        for(CtVariable var : vars) {
            if (var.getType().getActualClass() == t.getActualClass()) return var;
        }
        return null;
    }

    public static CtVariable getTypedVar(CtTypeReference t, List<CtVariable> vars) {
        Collections.shuffle(vars);
        for(CtVariable var : vars) {
            //if (var.getType().getActualClass() == t.getActualClass()) return var;
            if (var.getType().equals(t))
                return var;
        }
        return null;
    }

    public static CtVariableReference createRef(CtVariable v) {
        Factory f = v.getFactory();
        CtVariableReference ref;
        if(v instanceof CtLocalVariable) {
            CtLocalVariableReference l = f.Code().createLocalVariableReference((CtLocalVariable)v);
            ref = l;
        } else if(v instanceof CtField) {
            CtFieldReference field = f.Field().createReference((CtField) v);
            ref = field;
        } else if(v instanceof CtParameter) {
            CtParameterReference p = f.Executable().createParameterReference((CtParameter) v);
            ref = p;
        } else {
            System.out.println("Ref creator failed");
            ref = null;
        }
        return ref;
    }
    public static boolean fillParameter(List<CtExpression> paramFillList, CtExecutable exe, List<CtVariable> vars) {
        return fillParameter(paramFillList, exe, vars, false);
    }

    public static boolean fillParameter(List<CtExpression> paramFillList, CtExecutable exe, List<CtVariable> vars, boolean staticCall) {
        return fillParameter(paramFillList, exe, vars, false, 100);
    }
    public static boolean fillParameter(List<CtExpression> paramFillList, CtExecutable exe, List<CtVariable> vars, boolean staticCall, int maxdepth) {
        if(maxdepth < 0) {
            return false;
        }
        Factory f = exe.getFactory();
        List<CtParameter> ps = exe.getParameters();
        for (CtParameter param : ps) {
            CtVariableReference varRef;
            CtVariable var = getTypedVar(param.getReference().getType(), vars);
            if (var != null) {//Search among local var, fields, and parameters
                if (staticCall) {
                    paramFillList.add(f.Code().createCodeSnippetExpression(var.getSimpleName()));
                } else {
                    varRef = createRef(var);
                    paramFillList.add(f.Code().createVariableRead(varRef, false));
                }
            } else {
                if (param.getType().isPrimitive()) { //Primitive literal building
                    CtExpression expression;
                    if ((param.getType().getActualClass() == byte.class)
                            || (param.getType().getActualClass() == short.class)) {
                        expression = f.Code().createCodeSnippetExpression("(" + param.getType().getActualClass().toString() + ")" + RandomLiteralFactory.randomValue(param.getType()));
                    } else {
                        expression = RandomLiteralFactory.randomValue(param.getType());
                    }

                    paramFillList.add(expression);
                } else { // Enum, array and object
                /*if(param.getType().getDeclaration() instanceof CtEnum) {
                    CtExpression expression;
                    List<CtEnumValue> vals = ((CtEnum) param.getType().getDeclaration()).getEnumValues();
                    Collections.shuffle(vals);
                    expression = f.Core().clone(vals.get(0).getAssignment());
                    paramFillList.add(expression);
                } else */
                    if (param.getType().getDeclaration() instanceof CtClass) {
                        CtClass cla = (CtClass) param.getType().getDeclaration();
                        //Collection<CtConstructor> constructors = cla.getConstructors();
                        List<CtConstructor> constructors = new LinkedList<>(cla.getConstructors());
                        Collections.shuffle(constructors);
                        List<CtExpression> constParamFillList;
                        boolean constructable = false;
                        for (CtConstructor c : constructors) {
                            constParamFillList = new LinkedList<CtExpression>();
                            boolean selfref = false;
                            Collection<CtParameter> consParams = c.getParameters();
                            for(CtParameter t : consParams) {
                                if(t.getType().getQualifiedName().equalsIgnoreCase(param.getType().getQualifiedName())) {
                                    selfref = true;
                                    break;
                                }
                            }
                            if(selfref) continue;
                            if(fillParameter(constParamFillList, c, vars, staticCall, maxdepth--)) {
                            //if (fillParameter(constParamFillList, c, vars)) {
                                CtExpression[] array = constParamFillList.toArray(new CtExpression[constParamFillList.size()]);
                                CtConstructorCall call = f.Code().createConstructorCall(param.getType(), array);
                                paramFillList.add(call);
                                constructable = true;
                                break;
                            }
                        }
                        if (!constructable) return false;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
