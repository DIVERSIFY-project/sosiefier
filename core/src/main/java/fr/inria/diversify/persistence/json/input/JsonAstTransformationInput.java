package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public abstract class JsonAstTransformationInput extends JsonSectionInput {

    private HashMap<Integer, String> failures;

    public JsonAstTransformationInput(InputProgram inputProgram) {
        super(inputProgram, null);
    }

    public JsonAstTransformationInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    protected abstract ASTTransformation build();

    /**
     * Prepend the error message with the transformation index
     * @param transf Transformation
     * @param s Error message
     * @return
     */
    protected String getTransformationErrorString(ASTTransformation transf, String s) {
        if (transf != null) return  "Transformation " + transf.getIndex() + " " + s;
        return s;
    }

    /**
     * Log the status of the JSON loading of a Code fragment for a transformation
     * @param ast
     * @param cf
     * @param src
     * @param pos
     */
    protected void logCfStatus(ASTTransformation ast, CodeFragment cf, String src, String pos) {
        StringBuilder sb = new StringBuilder("");

        if ( cf == null ) {
            if ( ast != null ) sb.append("Transf " + ast.getIndex());
            sb.append(". Unable to find code fragment " + src + " at " + pos);
            String s = sb.toString();
            if ( !s.equals("") ) throwError(s, null);
        }
        else {
            if ( ast != null ) sb.append("Transf " + ast.getIndex());
            if ( !cf.positionString().equals(pos) )  {
                sb.append(". Storage position:" + pos + " found: " + cf.positionString());
            }
            if ( !cf.equalString().equals(src) ) {
                sb.append(". Storage source:" + src + " found: " + cf.equalString());
            }
            String s = sb.toString();
            if ( !s.equals("") ) throwWarning(s, null, false);
        }

    }

    /**
     * gets data from the JSON  object into the transformation object
     */
    protected ASTTransformation get(HashMap<Integer, Transformation> t) throws JSONException {

        HashMap<Integer, String> failures = getFailures();

        int index = getJsonObject().getInt(TINDEX);
        ASTTransformation astt;
        if (t.containsKey(index)) astt = (ASTTransformation) t.get(index);
        else {
            astt = build();
            t.put(index, astt);
            astt.setIndex(index);
            astt.setStatus(getJsonObject().getInt(STATUS));
        }
        return astt;
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations) {
        try {
            get(transformations);
        } catch (JSONException e) {
            throw new PersistenceException("Unable to map JSON into transformation", e);
        }
    }

    protected Map<String, String> getVarMap(JSONObject jsonObject) throws JSONException {
        Map<String, String> varMap = new HashMap<>();
        Iterator<String> nameItr = jsonObject.keys();
        while(nameItr.hasNext()) {
            String name = nameItr.next();
            varMap.put(name, jsonObject.getString(name));
        }
        return varMap;
    }

    /**
     * Indicate if can handle a section within the file
     * @param s Section name
     * @return True if can handle
     */
    public abstract boolean canRead(String s);

    /**
     * Failures dictionary
     * @return The failures dictionary
     */
    public HashMap<Integer,String> getFailures() {
        return failures;
    }

    public void setFailures(HashMap<Integer, String> failures) {
        this.failures = failures;
    }
}
