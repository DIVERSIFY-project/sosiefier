package fr.inria.diversify.persistence.json.input;

import com.fasterxml.uuid.Generators;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public abstract class JsonTransformationInput extends JsonSectionInput {

    private Map<Integer, String> failures;

    public JsonTransformationInput(InputProgram inputProgram) {
        super(inputProgram, null);
    }

    public JsonTransformationInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    protected abstract Transformation build();

    /**
     * Prepend the error message with the transformation index
     *
     * @param transf Transformation
     * @param s      Error message
     * @return
     */
    protected String getTransformationErrorString(Transformation transf, String s) {
        if (transf != null) return "Transformation " + transf.getIndex() + " " + s;
        return s;
    }

    /**
     * Log the status of the JSON loading of a Code fragment for a transformation
     *
     * @param ast
     * @param cf
     * @param src
     * @param pos
     */
    protected void logCfStatus(Transformation ast, CodeFragment cf, String pos, String src) {
        StringBuilder sb = new StringBuilder("");
        if (ast != null) sb.append("Transf ").append(ast.getIndex()).append(". ");

        if (cf == null) {
            sb.append("Unable to find code fragment \"").append(src).append("\" at \"").append(pos).append("\"");
            String s = sb.toString();
            throwError(s, null, true);
        } else {
            if (!cf.positionString().equals(pos)) {
                sb.append("Position mismatch -> Storage: \"").append(pos).append("\"; Found: \"").
                        append(cf.positionString()).append("\".");
                throwWarning(sb.toString(), null, false);
            }
            if (!cf.equalString().equals(src)) {
                sb = new StringBuilder("");
                if (ast != null) sb.append("Transf ").append(ast.getIndex()).append(". ");
                sb.append("Source mismatch -> Storage: \"").append(src).
                        append("\"; Found: \"").append(cf.equalString()).append("\".");
                throwWarning(sb.toString(), null, false);
            }
        }
    }

    /**
     * Takes a string and returns a valid UUI from the string if such string is a valid
     * UUI. Otherwise, generates a new UUI
     *
     * @param uuid
     * @return
     */
    private UUID getValidUUI(String uuid) {
        if (uuid == null) return Generators.timeBasedGenerator().generate();
        try {
            UUID fromStringUUID = UUID.fromString(uuid);
            String toStringUUID = fromStringUUID.toString();
            if (toStringUUID.equals(uuid)) return fromStringUUID;
        } catch (IllegalArgumentException e) {
            return Generators.timeBasedGenerator().generate();
        }
        return Generators.timeBasedGenerator().generate();
    }

    /**
     * gets data from the JSON  object into the transformation object
     */
    protected Transformation get(Map<UUID, Transformation> t) throws JSONException {

//        HashMap<Integer, String> failures = getFailures();
        UUID index = getValidUUI(getJsonObject().getString(TINDEX));
        Transformation astt;
        if (t.containsKey(index)) astt = t.get(index);
        else {
            astt = build();
            astt.setIndex(index);
            astt.setStatus(getJsonObject().getInt(STATUS));
        }
        return astt;
    }

    /**
     * Adds the transformation to the transformation's dictionary
     *
     * @param t    Transformation's dictionary
     * @param astt AST Transformation
     */
    protected void addTransformation(Map<UUID, Transformation> t, Transformation astt) {
        t.put(astt.getIndex(), astt);
    }

    /**
     * Put the transformation after the reading is properly done
     *
     * @param transformation
     */
    protected void putTransformation(Transformation transformation) {

    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {
        try {
            get(transformations);
        } catch (JSONException e) {
            throw new PersistenceException("Unable to map JSON into transformation", e);
        }
    }

    protected Map<String, String> getVarMap(JSONObject jsonObject) throws JSONException {
        Map<String, String> varMap = new HashMap<>();
        Iterator<String> nameItr = jsonObject.keys();
        while (nameItr.hasNext()) {
            String name = nameItr.next();
            varMap.put(name, jsonObject.getString(name));
        }
        return varMap;
    }

    /**
     * Indicate if can handle a section within the file
     *
     * @param s Section name
     * @return True if can handle
     */
    public abstract boolean canRead(String s);

    /**
     * Failures dictionary
     *
     * @return The failures dictionary
     */
    public Map<Integer, String> getFailures() {
        return failures;
    }

    public void setFailures(Map<Integer, String> failures) {
        this.failures = failures;
    }
}
