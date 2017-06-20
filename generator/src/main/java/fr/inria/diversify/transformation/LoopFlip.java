package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtVariableReference;
import spoon.support.reflect.code.*;

/**
 * Created by nicolas on 11.10.16.
 */
public class LoopFlip extends SingleTransformation {

    private CtFor tp;
    private CtFor src;
    private CtFor save;

    public LoopFlip(CtFor f) {

        tp = f;
        type = "special";
        name = "loopflip";
        Factory factory = tp.getFactory();
        save = factory.Core().clone(tp);
        position = tp.getParent(CtType.class).getQualifiedName()
                + ":" + tp.getPosition().getLine();
    }

    public LoopFlip() {
        type = "special";
        name = "loopflip";}

    public void setTp(CtFor f) {
        tp = f;
        Factory factory = tp.getFactory();
        save = factory.Core().clone(tp);
        position = tp.getParent(CtType.class).getQualifiedName()
                + ":" + tp.getPosition().getLine();

    }

    public void setPosition(String str) {
        position = str;
    }

    @Override
    public String classLocationName() {
        return getPosition().getCompilationUnit().getMainType().getQualifiedName();
    }

    @Override
    public String packageLocationName() {
        CtPackage p = tp.getParent(CtPackage.class);
        return p.getQualifiedName();
    }

    @Override
    public String methodLocationName() {
        return tp.getParent(CtMethod.class).getSimpleName();
    }

    @Override
    public SourcePosition getPosition() {
        return tp.getPosition();
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public int line() {
        return getPosition().getLine();
    }


    private CtVariableReference initVar;
    private CtExpression init;
    private CtLocalVariableImpl initSt;
    private void readInit() {
        CtVariableReference var;
        CtStatement st = src.getForInit().get(0);
        if(st instanceof CtLocalVariableImpl) {
            initSt = (CtLocalVariableImpl) st;
            init = initSt.getAssignment();
            initVar = initSt.getReference();
            //System.out.println("var: " + initVar.toString() + " init: " + init.toString());
        }
    }

    private void modifyInit() {
        Factory factory = src.getFactory();
        CtExpression finInit = factory.Core().clone(endExp);
        if(applyStep) {
            CtExpression step;
            if(isUn) {

                CtLiteral one = factory.Core().createLiteral();
                one.setValue(1);

                if((unUpOp.getKind() == UnaryOperatorKind.POSTINC)
                        || (unUpOp.getKind() == UnaryOperatorKind.PREINC)) {
                    CtBinaryOperator uStep = factory.Code().createBinaryOperator(factory.Core().clone(finInit), factory.Core().clone(one), BinaryOperatorKind.PLUS);
                    step = uStep;
                } else {
                    CtBinaryOperator uStep = factory.Code().createBinaryOperator(factory.Core().clone(finInit), factory.Core().clone(one), BinaryOperatorKind.MINUS);
                    step = uStep;
                }
            } else {
                BinaryOperatorKind op;
                if(oa.getKind() == BinaryOperatorKind.MINUS) op = BinaryOperatorKind.MINUS;
                else op = BinaryOperatorKind.PLUS;
                CtBinaryOperator cal, bma, bmamp, test;
                bma = factory.Code().createBinaryOperator(factory.Core().clone(finInit), factory.Core().clone(init), BinaryOperatorKind.MINUS);
                bmamp = factory.Code().createBinaryOperator(bma, factory.Core().clone(stepValue), BinaryOperatorKind.MOD);


                CtLiteral zero = factory.Code().createLiteral(0);
                test = factory.Code().createBinaryOperator(factory.Core().clone(bmamp), zero, BinaryOperatorKind.EQ);

                CtConditional cond = factory.Core().createConditional();
                cond.setCondition(test);
                cond.setThenExpression(factory.Core().clone(stepValue));
                cond.setElseExpression(factory.Core().clone(bmamp));
                cal = factory.Code().createBinaryOperator(factory.Core().clone(finInit), cond, op);
                step = cal;
            }
            initSt.getAssignment().replace(step);
            //System.out.println("new var: " + initVar.toString() + " new init: " + initSt.getAssignment().toString());
        } else {
            initSt.getAssignment().replace(finInit);
            //System.out.println("new var: " + initVar.toString() + " new init: " + initSt.getAssignment().toString());
        }
    }

    private CtUnaryOperator unUpOp;
    private CtBinaryOperator binUpOp;
    private CtExpression stepValue;
    private CtOperatorAssignment oa;

    private boolean isUn;
    private boolean upBinLeft;
    private void readUpdate() {
        CtStatement st = src.getForUpdate().get(0);
        if (st instanceof CtOperatorAssignment) {
            Factory factory = src.getFactory();
            oa = (CtOperatorAssignment) st;
            upBinLeft = true;
            CtExpression lhs, rhs;
            lhs = factory.Core().clone(oa.getAssigned());
            rhs = factory.Core().clone(oa.getAssignment());
            stepValue = rhs;
            binUpOp = factory.Code().createBinaryOperator(lhs, rhs, oa.getKind());
        } else if(st instanceof CtAssignmentImpl) {
            binUpOp = (CtBinaryOperator)((CtAssignmentImpl) st).getAssigned();
            isUn = false;
            if (binUpOp.getLeftHandOperand() instanceof CtVariableReference) {
                upBinLeft = true;
            } else if (binUpOp.getRightHandOperand() instanceof CtVariableReference) {
                upBinLeft = false;
            }
            //System.out.println("update: " + binUpOp.toString());
        } else if (st instanceof CtUnaryOperator) {
            unUpOp = (CtUnaryOperator) st;
            isUn = true;
            //System.out.println("update: " + unUpOp.toString());
        }
    }

    private void modifyUpdate() {
        if(stepValue != null) {
            switch (oa.getKind()) {
                case PLUS:
                    oa.setKind(BinaryOperatorKind.MINUS);
                    break;
                case MINUS:
                    oa.setKind(BinaryOperatorKind.PLUS);
                    break;
                case MUL:
                    oa.setKind(BinaryOperatorKind.DIV);
                    break;
                case DIV:
                    oa.setKind(BinaryOperatorKind.MUL);
                    break;
            }
        } else if(isUn) {
            switch (unUpOp.getKind()) {
                case PREINC:
                    unUpOp.setKind(UnaryOperatorKind.PREDEC);
                    break;
                case PREDEC:
                    unUpOp.setKind(UnaryOperatorKind.PREINC);
                    break;
                case POSTINC:
                    unUpOp.setKind(UnaryOperatorKind.POSTDEC);
                    break;
                case POSTDEC:
                    unUpOp.setKind(UnaryOperatorKind.POSTINC);
                    break;
            }
            //System.out.println("new update: " + unUpOp.toString());
        } else {
            switch (binUpOp.getKind()) {
                case PLUS:
                    binUpOp.setKind(BinaryOperatorKind.MINUS);
                    break;
                case MINUS:
                    binUpOp.setKind(BinaryOperatorKind.PLUS);
                    break;
                case MUL:
                    binUpOp.setKind(BinaryOperatorKind.DIV);
                    break;
                case DIV:
                    binUpOp.setKind(BinaryOperatorKind.MUL);
                    break;
            }
            //System.out.println("new update: " + binUpOp.toString());
        }
    }

    private CtBinaryOperator endOp;
    private CtExpression endExp;
    private boolean isLeft;
    private boolean applyStep = false;
    private void readExpression() {
        CtExpression endCond = src.getExpression();
        if(endCond instanceof CtBinaryOperator) {
            endOp = (CtBinaryOperator) endCond;
            if (endOp.getLeftHandOperand() instanceof CtVariableReadImpl) {
                endExp = endOp.getRightHandOperand();
                isLeft = true;
            } else if (endOp.getRightHandOperand() instanceof CtVariableReadImpl) {
                endExp = endOp.getLeftHandOperand();
                isLeft = false;
            }
            //System.out.println("exp: " + endExp.toString());
        }
    }

    private void modifyExpression() {
        switch (endOp.getKind()) {
            case LT:
                endOp.setKind(BinaryOperatorKind.GE);
                applyStep = true;
                break;
            case GT:
                endOp.setKind(BinaryOperatorKind.LE);
                applyStep = true;
                break;
            case LE:
                endOp.setKind(BinaryOperatorKind.GE);
                break;
            case GE:
                endOp.setKind(BinaryOperatorKind.LE);
                break;
        }
        Factory factory = src.getFactory();
        CtExpression finExp = factory.Core().clone(init);
        if(isLeft) {
            endOp.getRightHandOperand().replace(finExp);
            //System.out.println("new exp: " + endOp.getRightHandOperand().toString());
        } else {
            endOp.getLeftHandOperand().replace(finExp);
            //System.out.println("new exp: " + endOp.getLeftHandOperand().toString());
        }
    }

    boolean preApplied = false;

    public void preApply() {
        preApplied = true;
        Factory factory = tp.getFactory();
        src = factory.Core().clone(tp);

        readInit();
        readExpression();
        readUpdate();

        modifyUpdate();
        modifyExpression();
        modifyInit();
    }

    @Override
    public void apply(String srcDir) throws Exception {
        System.out.println("replace: " + tp.toString());
        preApply();
        tp.replace(src);

        System.out.println("with: " + src.toString());

        printJavaFile(srcDir);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            src.replace(save);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }

    static public boolean isApplyPossible(CtFor tp) {
        if(tp.getForInit().size() != 1) return false;
        if(tp.getForUpdate().size() != 1) return false;
        if(!(tp.getForInit().get(0) instanceof CtLocalVariableImpl)) return false;
        if(tp.getForUpdate().get(0) instanceof CtUnaryOperator) {
            CtUnaryOperator un = (CtUnaryOperator) tp.getForUpdate().get(0);
            if((un.getKind() != UnaryOperatorKind.POSTDEC) &&
                    (un.getKind() != UnaryOperatorKind.POSTINC) &&
                    (un.getKind() != UnaryOperatorKind.PREDEC) &&
                    (un.getKind() != UnaryOperatorKind.PREINC)) {
                return false;
            }
        } else if(tp.getForUpdate().get(0) instanceof CtOperatorAssignmentImpl) {
        } else if(tp.getForUpdate().get(0) instanceof CtAssignmentImpl) {
            CtAssignmentImpl ass = (CtAssignmentImpl) tp.getForUpdate().get(0);
            if(!(ass.getAssigned() instanceof CtBinaryOperator)) {
                return false;
            } else {
                CtBinaryOperator bin = (CtBinaryOperator) ass.getAssigned();
                if(!(bin.getLeftHandOperand() instanceof CtVariableReference) &&
                        !(bin.getRightHandOperand() instanceof CtVariableReference)) {
                    return false;
                }
            }
        } else return false;
        if(!(tp.getExpression() instanceof CtBinaryOperator)) return false;
        if(tp.getExpression() instanceof CtBinaryOperator) {
            CtBinaryOperator exp = (CtBinaryOperator) tp.getExpression();
            if(!(exp.getRightHandOperand() instanceof CtVariableReadImpl) && !(exp.getLeftHandOperand() instanceof CtVariableReadImpl)) return false;
        }
        //System.out.println(" --- Found candidate --- ");
        return true;
    }

    String position = null;


    @Override
    public JSONObject toJSONObject() throws JSONException {
        if(!preApplied) preApply();;
        JSONObject object = super.toJSONObject();
        object.put("newFor", src.toString());
        if(position != null ) object.put("position", position);
        else {
            object.put("position",
                    src.getParent(CtType.class).getQualifiedName()
                            + ":" + src.getPosition().getLine());
        }
        JSONObject conditionJSON = new JSONObject();
        conditionJSON.put("oldFor", save.toString());
        object.put("save",conditionJSON);
        return object;
    }
}
