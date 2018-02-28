package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.RandomLiteralFactory;
import fr.inria.diversify.util.VarFinder;
import org.codehaus.plexus.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.support.reflect.code.CtBlockImpl;

import java.util.*;

/**
 * Created by nharrand on 21/11/16.
 */
public class AddMethodInvocation extends SingleTransformation {

    CtStatement invocation;
    CtStatement tp;
    CtStatement tryInv;
    CtField well;
    CtClass parentClass;
    CtMethod parentMethod;
    CtInvocation aInv;

    boolean jStatic;
    String jPos, jType, jSC, jPath;

    public CtStatement getTryInv() {
        return tryInv;
    }

    public CtStatement getTp() {
        return tp;
    }

    public CtField getWell() {
        return well;
    }

    public CtClass getParentClass() {
        return parentClass;
    }

    public CtMethod getParentMethod() {
        return parentMethod;
    }

    public CtInvocation getaInv() {
        return aInv;
    }

    public boolean isjStatic() {
        return jStatic;
    }

    public String getjPos() {
        return jPos;
    }

    public String getjType() {
        return jType;
    }

    public String getjSC() {
        return jSC;
    }

    public boolean isInsertIsStatic() {
        return insertIsStatic;
    }

    public CtStatement getInvocation() {

        return invocation;
    }

    public AddMethodInvocation(CtStatement tp, CtStatement invocation) {
        System.out.println("tp: " + tp);
        System.out.println("inv: " + invocation);
        this.setTp(tp);
        this.invocation = invocation;
        setup();
        Factory f = tp.getFactory();
        CtCodeSnippetStatement empty = f.Code().createCodeSnippetStatement("");
        CtBlock eBlock = f.Code().createCtBlock(empty);
        tryInv = f.Core().createTry();
        CtBlock b = f.Code().createCtBlock(invocation);
        ((CtTry) tryInv).setBody(b);
        b.setParent(tryInv);
        CtCatch catchInv = f.Code().createCtCatch(RandomLiteralFactory.createString(),Exception.class,eBlock);
        List<CtCatch> catchers = new LinkedList<CtCatch>();
        catchers.add(catchInv);
        ((CtTry) tryInv).setCatchers(catchers);
        createWell();
    }

    public void setup() {
        this.type = "add";
        this.name = "addMethodInvocation";
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
        return "unknown";
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

    public CtInvocation actualInvocation() {
        CtInvocation actual = null;
        if(invocation instanceof CtInvocation) {
            actual = (CtInvocation) invocation;
        } else if (invocation instanceof CtBlock) {
            for(CtStatement stmt : ((CtBlock) invocation).getStatements()) {
                if(stmt instanceof  CtInvocation) {
                    actual = (CtInvocation) stmt;
                    break;
                }
            }
        }
        return actual;
    }

    protected void createWell() {
        aInv = actualInvocation();
        insertIsStatic = aInv.getExecutable().isStatic();
        if(aInv.getType().getQualifiedName() != "void") {
        //if(aInv.getType().getActualClass() != void.class) {

            if(parentMethod.getModifiers().contains(ModifierKind.STATIC)) {
                well = tp.getFactory().Code().createCtField(RandomLiteralFactory.createString(), aInv.getType(), RandomLiteralFactory.randomValue(aInv.getType()).toString(), ModifierKind.PUBLIC, ModifierKind.STATIC);
            } else {
                well = tp.getFactory().Code().createCtField(RandomLiteralFactory.createString(), aInv.getType(), RandomLiteralFactory.randomValue(aInv.getType()).toString(), ModifierKind.PUBLIC);
            }
            CtInvocation bInv = tp.getFactory().Core().clone(aInv);
            //CtAssignment assignment = tp.getFactory().Code().createVariableAssignment(VarFinder.createRef(field), false, bInv);
            CtStatement assignment = tp.getFactory().Code().createCodeSnippetStatement(well.getSimpleName() + " = " + bInv);
            aInv.replace((CtStatement) assignment);
        }

    }

    public void setTp(CtStatement tp) {
        this.tp = tp;
        this.parentClass = tp.getParent(CtClass.class);
        this.parentMethod = tp.getParent(CtMethod.class);
        jPos = tp.getParent(CtType.class).getQualifiedName() + ":" + tp.getPosition().getLine();
        jPath = tp.getPath().toString();
        jType =  tp.getClass().getName();
        jSC = tp.toString();
        jStatic = parentMethod.getModifiers().contains(ModifierKind.STATIC);
    }

    public void setWell(CtField well) {
        this.well = well;
    }

    public void setTryInv(CtStatement tryInv) {
        this.tryInv = tryInv;
    }

    boolean insertIsStatic = false;
    public void setInsertIsStatic(boolean isStatic) {
        insertIsStatic = isStatic;
    }

    public AddMethodInvocation() {
        setup();
    }

    public String invSignature = null;
    public void fillInvocationSignature() {
        //FIXME: Try to find something better than this horror

        if(tryInv instanceof CtCodeSnippetStatement) {
            CtCodeSnippetStatement s = (CtCodeSnippetStatement) tryInv;
            String assi = s.getValue().split("\n")[1];
            String mi, fullMethodName, methodName, className, tmp;
            if(assi.split("=").length > 1)
                mi = assi.split("=")[1];
            else
                mi = assi;

            fullMethodName = mi.split("\\(")[0];
            methodName = fullMethodName.substring(fullMethodName.lastIndexOf('.')+1, fullMethodName.length());
            tmp = fullMethodName.substring(0,fullMethodName.lastIndexOf('.'));
            className = tmp.replace(" ","");
            int paramNumber = StringUtils.countMatches(mi.split("\\(")[1], ".");
            //FIXME:
            CtMethod method = tp.getFactory().Class().get(className).getMethodsByName(methodName).stream().filter(
                    m -> (m.getParameters().size() == paramNumber)
            ).findAny().orElse(null); //Will not necessarly be the good one... Let's hope that it doesn't change the methods purity

            if(method != null)
                invSignature = method.getSignature();

        }

    }

    @Override
    public void apply(String srcDir) throws Exception {
        tp.insertBefore(tryInv);
        if(well != null) {
            parentClass.addField(well);
        }

        System.out.println("old stmt: " + tp.toString());
        System.out.println("well: " + well);
        System.out.println("newt stmt: " + tryInv.toString());
        printJavaFile(srcDir);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            //b.replace(save);
            //invocation.delete();
            tryInv.delete();
            if(well != null) {
                parentClass.removeField(well);
            }
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }


    @Override
    public JSONObject toJSONObject() throws JSONException {

        JSONObject object = super.toJSONObject();

        JSONObject insertJSON = new JSONObject();
            insertJSON.put("stmt", tryInv.toString());
            insertJSON.put("static", insertIsStatic);
            if(well != null) {
                insertJSON.put("createdWell", "true");
                insertJSON.put("well", well.toString());
            } else {
                insertJSON.put("createdWell", "false");
            }
            if(invSignature != null)
                insertJSON.put("invSignature", invSignature);
        object.put("insert", insertJSON);

        JSONObject tpJSON = new JSONObject();
            tpJSON.put("position",jPos);
            tpJSON.put("path",jPath);
            tpJSON.put("type", jType);
            tpJSON.put("sourcecode", jSC);
            tpJSON.put("static", jStatic);
        object.put("transplantationPoint",tpJSON);

        return object;
    }
}
