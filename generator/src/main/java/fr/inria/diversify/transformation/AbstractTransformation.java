package fr.inria.diversify.transformation;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;

import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 10:44
 */
public abstract class AbstractTransformation implements Transformation {

    //A global ID for the transformations. For our purposes is enough a simple global increment.
    private static int globalID = 0;


    private static int id = 0;

    //status of the transformation when transformation raises an exception
    public static int EXCEPTION = -4;

    //status of the transformation when the transformation has not been tested
    public static int NOT_TESTED = -3;

    //status of the transformation when the transformation fails to compile
    public static int COMPILED_FAIL = -2;

    //status of the transformation when the transformation's  test fails
    public static int TEST_FAIL = -1;

    //sosie status for a transformation
    public static int SOSIE = 0;

    /**
     * An index to identify the transformation in the storage
     */
    private int index = -1;

    /**
     * The series number is an ID for a given serie containing this transformation.
     *
     * Remember that a series is a set of multi-sosies, each one being child of another in the set.
     */
    private int series;

    //Current status of the transformation
    protected Integer status = NOT_TESTED;

    //List of test failures  as result of transforming the source code using the current transformation
    protected List<String> failures;

    @Deprecated
    protected static Map<String,Integer> failuresDico = new HashMap<>();

    //Name of the current transformation. More like a subtype
    protected String name;

    // type of the current transformation.
    protected String type;

    //Parent of the current transformation.
    protected Transformation parent;

    //input programs over which transformations are going to be perform
    private InputProgram inputProgram;

    @Override
    @Deprecated
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", type);
        object.put("name", name);
        object.put("failures", failuresToJSON());
        object.put("status", status);
        if ( index == -1 ) {
            globalID++;
            index = globalID;
        }
        object.put("tindex", index);
        object.put("series", getSeries());

        if(parent != null)
            object.put("parent",parent.toJSONObject());

        return object;
    }

    @Deprecated
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

    /**
     *  indicate if the other transformation shares the same parent
     * @param otherParent transformation  to which we want to check
     * @return
     */
    protected boolean equalParent(Transformation otherParent) {
        if(parent != null)
            return parent.equals(otherParent);
        if(otherParent != null)
            return otherParent.equals(parent);

        return true;
    }


    /**
     * gets the parent method of an element
     * @param son
     * @return
     */
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

    /**
     * Gets the line's end  of the source position of an element
     * @param exe element for which  we want to know the line's and
     * @return
     */
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


    @Override
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * The series number is an ID for a given serie containing this transformation.
     *
     * Remember that a series is a set of multi-sosies, each one being child of another in the set.
     */
    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setInputProgram(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    /**
     * Global input configuration
     */
    public InputProgram getInputProgram() {
        return inputProgram;
    }

    public void setStatus(Integer result) {
        status = result;
    }

    /**
     * Current status of the transformation
     */

    public int getStatus() {
        return status;
    }

    /**
     *  indicate if this transformation is a Sosie
     * @return
     */
    public boolean isSosie() { return status == SOSIE; }


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

}
