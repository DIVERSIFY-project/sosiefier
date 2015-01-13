package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.SectionInput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONObject;

import java.util.Collection;

/**
 * Created by marodrig on 12/01/2015.
 */
public abstract class JsonSectionInput extends SectionInput {



    /**
     * JSon to read transformations from
     */
    private JSONObject jsonObject;

    /**
     * Input program where the code fragments of the transformations are
     */
    private InputProgram inputProgram;

    /**
     * Finds a code fragment
     * @param position Code fragment's position
     * @param source Code fragment's source
     * @return  the code fragment
     */
    protected CodeFragment getCodeFragment(String position, String source) {
        CodeFragment c = getInputProgram().getCodeFragment(position, source);
        if ( c == null ) throw new PersistenceException("Unable to find fragment");
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

    /**
     * Input program where the code fragments of the transformations are
     */
    public InputProgram getInputProgram() {
        return inputProgram;
    }

    public void setInputProgram(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }
}
