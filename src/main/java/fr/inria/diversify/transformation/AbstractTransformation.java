package fr.inria.diversify.transformation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 10:44
 */
public abstract class AbstractTransformation implements Transformation {
    protected Integer status = -3;
    protected List<String> failures;
    protected static Map<String,Integer> failuresDico = new HashMap<String, Integer>();
    protected String name;
    protected String type;
    protected Transformation parent;

    public void setStatus(Integer result) {
        status = result;
    }

    public int getStatus() {
        return status;
    }

    public void setFailures(List<String> f) {
        failures = f;
    }
    public List<String> getFailures() {
        return failures;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", type);
        object.put("name", name);
        object.put("failures", failuresToJSON());
        object.put("status", status);

        if(parent != null)
            object.put("parent",parent.toJSONObject());

        return object;
    }

    private static int id = 0;
    protected JSONArray failuresToJSON() {

        JSONArray array = new JSONArray();
        if(failures == null) {
            return array;
        }
        for(String failure : failures) {
            if(!failuresDico.containsKey(failure)) {
                failuresDico.put(failure,id);
                id++;
            }
            array.put(failuresDico.get(failure));
        }
        return array;
    }

    public  int hashCode() {
        return name.hashCode() * type.hashCode() + status.hashCode() + failures.hashCode();
    }

    public void setParent(Transformation parent) {
        this.parent = parent;
    }
    public Transformation getParent() {
        return parent;
    }

    public void apply(String srcDir) throws Exception {
        addSourceCode();

        printJavaFile(srcDir);
        removeSourceCode();
    }

    public void restore(String srcDir) throws Exception {
        if(parent != null) {
            parent.removeSourceCode();
            parent.printJavaFile(srcDir);
        }
        removeSourceCode();
        printJavaFile(srcDir);
    }

    public void applyWithParent(String srcDir) throws Exception {
        addSourceCode();
        printJavaFile(srcDir);

        if(parent != null) {
            parent.addSourceCode();
            parent.printJavaFile(srcDir);
            parent.removeSourceCode();
        }
        removeSourceCode();
    }

    protected boolean equalParent(Transformation otherParent) {
        if(parent != null)
            return parent.equals(otherParent);
        if(otherParent != null)
            return otherParent.equals(parent);

        return true;
    }


    protected String getTransformationString(CtElement transplantPoint) throws Exception {
        CtElement parentMethod = getParentMethod(transplantPoint);
        SourcePosition sp = parentMethod.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        Environment env = compileUnit.getFactory().getEnvironment();
        addSourceCode();

        FragmentDrivenJavaPrettyPrinter printer = new FragmentDrivenJavaPrettyPrinter(env);
        printer.calculate(compileUnit,null);
        String[] code = printer.getResult().split("\n");
        removeSourceCode();

        int begin = sp.getLine() - 1;
        int end = getLineEnd(parentMethod) + code.length - printer.getResult().split("\n").length;

        return Arrays.stream(code, begin, end)
                .collect(Collectors.joining("\n"));
    }

    protected CtElement getParentMethod(CtElement son) {
        CtElement parent = son.getParent();

        while(parent != null && !(parent instanceof CtExecutable) ) {
            parent = parent.getParent();
        }
        if(parent == null)
            return son.getParent();
        else
            return parent;
    }

    protected int getLineEnd(CtElement exe) {
        if(exe instanceof CtExecutable && ((CtExecutable)exe).getBody() != null) {
            CtBlock body = ((CtExecutable) exe).getBody();
            int bodyEnd = body.getPosition().getEndLine();
            int stmtEnd = body.getLastStatement().getPosition().getEndLine();
            if(bodyEnd < stmtEnd)
                return stmtEnd+1;
            else
                return bodyEnd;
        }
        else
            return exe.getPosition().getEndLine()+1;
    }
}
