package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.RandomLiteralFactory;
import fr.inria.diversify.util.VarFinder;
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
    CtStatement src;
    CtBlock b;
    CtStatement save;
    CtTry tryInv;

    public AddMethodInvocation(CtStatement tp, CtStatement invocation) {
        System.out.println("tp: " + tp);
        System.out.println("inv: " + invocation);
        this.tp = tp;
        type = "add";
        name = "addMethodInvocation";
        Factory factory = tp.getFactory();
        save = factory.Core().clone(tp);

        this.invocation = invocation;
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

    protected CtInvocation actualInvocation() {
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
        CtInvocation aInv = actualInvocation();
        if(aInv.getType().getActualClass() != void.class) {
            CtClass cl = tp.getParent(CtClass.class);
            CtMethod m = tp.getParent(CtMethod.class);

            CtField field;
            if(m.getModifiers().contains(ModifierKind.STATIC)) {
                field = tp.getFactory().Code().createCtField(RandomLiteralFactory.createString(), aInv.getType(), RandomLiteralFactory.randomValue(aInv.getType()).toString(), ModifierKind.PUBLIC, ModifierKind.STATIC);
            } else {
                field = tp.getFactory().Code().createCtField(RandomLiteralFactory.createString(), aInv.getType(), RandomLiteralFactory.randomValue(aInv.getType()).toString(), ModifierKind.PUBLIC);
            }
            cl.addField(field);
            CtInvocation bInv = tp.getFactory().Core().clone(aInv);
            //CtAssignment assignment = tp.getFactory().Code().createVariableAssignment(VarFinder.createRef(field), false, bInv);
            CtStatement assignment = tp.getFactory().Code().createCodeSnippetStatement(field.getSimpleName() + " = " + bInv);
            aInv.replace((CtStatement) assignment);
            System.out.println("assignement: " + assignment);
        }

    }

    @Override
    public void apply(String srcDir) throws Exception {
        Factory f = tp.getFactory();
        src = f.Core().clone(tp);
        System.out.println("old stmt: " + tp.toString());
        CtCodeSnippetStatement empty = f.Code().createCodeSnippetStatement("");
        CtBlock eBlock = f.Code().createCtBlock(empty);
        tryInv = f.Core().createTry();
        CtBlock b = f.Code().createCtBlock(invocation);
        tryInv.setBody(b);
        b.setParent(tryInv);
        CtCatch catchInv = f.Code().createCtCatch(RandomLiteralFactory.createString(),Exception.class,eBlock);
        List<CtCatch> catchers = new LinkedList<CtCatch>();
        catchers.add(catchInv);
        tryInv.setCatchers(catchers);
        createWell();
        tp.insertBefore(tryInv);
        //((CtBlockImpl) tp).insertBegin(invocation);

        System.out.println("newt stmt: " + tryInv.toString());
        printJavaFile(srcDir);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            //b.replace(save);
            //invocation.delete();
            tryInv.delete();
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }


    @Override
    public JSONObject toJSONObject() throws JSONException {

        JSONObject object = super.toJSONObject();
        object.put("insert", tryInv.toString());
        JSONObject tpJSON = new JSONObject();
        tpJSON.put("position", tp.getParent(CtType.class).getQualifiedName() + ":" + tp.getPosition().getLine());
        tpJSON.put("type", tp.getClass().getName());
        tpJSON.put("sourcecode", tp.toString());
        object.put("transplantationPoint",tpJSON);
        return object;
    }
}
