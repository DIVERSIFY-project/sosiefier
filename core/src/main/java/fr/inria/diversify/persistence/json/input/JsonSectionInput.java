package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by marodrig on 12/01/2015.
 */
public abstract class JsonSectionInput {

    /**
     * Max number of errors allowed
     */
    public static final int MAX_ERRORS = 4000;

    /**
     * JSon to read transformations from
     */
    private JSONObject jsonObject;

    /**
     * Input program where the code fragments of the transformations are
     */
    private InputProgram inputProgram;

    /**
     * Errors during the load process
     */
    private List<String> loadMessages;

    protected int errorCount;

    public JsonSectionInput(InputProgram inputProgram, JSONObject jsonObject) {
        this.jsonObject = jsonObject;
        this.inputProgram = inputProgram;
    }

    /**
     * Finds a code fragment
     * @param position Code fragment's position
     * @param source Code fragment's source
     * @return  the code fragment
     */
    protected CodeFragment getCodeFragment(String position, String source) {
        CodeFragment c = getInputProgram().getCodeFragment(position, source);
        //if ( c == null ) throw new PersistenceException("Unable to find fragment");
        return c;
    }

    /**
     * JSon to read transformations from
     */
    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public abstract void read(HashMap<Integer, Transformation> transformations);

    /**
     * Input program where the code fragments of the transformations are
     */
    public InputProgram getInputProgram() {
        return inputProgram;
    }

    public void setInputProgram(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public void setLoadMessages(List<String> msgs) {
        this.loadMessages = msgs;
    }

    public List<String> getLoadMessages() {
        if ( loadMessages == null ) loadMessages = new ArrayList<>();
        return loadMessages;
    }

    protected void throwWarning(String s, JSONException e, boolean raise) {
        String msg = e == null ? "" : e.getMessage();
        getLoadMessages().add(JsonSosiesInput.WARNING + " " + s + " " + msg);
        if ( raise ) throw new PersistenceException(s, e);
    }

    protected void throwError(String s, Exception e, boolean raise) {
        errorCount++;

        //Ensure errors are represented as a single line
        s = s.replaceAll("\n", "\\\\n");
        s = s.replaceAll("\r", "\\r");

        String msg = e == null ? "" : e.getMessage();
        getLoadMessages().add(JsonSosiesInput.ERROR + " " + s + ". " + msg);
        if ( raise ) throw new PersistenceException(s, e);
    }

    /**
     * Halts the loading process if to many errors are registered
     */
    public void checkToManyErrors() {
        //if ( errorCount > MAX_ERRORS ) throwError("To many errors", null, true);
    }
}
