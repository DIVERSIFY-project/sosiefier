package fr.inria.diversify.persistence.json.input.special;

import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.CheckReturnTransformation;
import fr.inria.diversify.transformation.Transformation;

/**
 * User: Simon
 * Date: 06/06/16
 * Time: 11:07
 */
public class JsonCheckReturnInput extends JsonAstReplaceInput {

    public JsonCheckReturnInput(InputProgram inputProgram) {
        super(inputProgram);
    }


    @Override
    protected Transformation build() {
        return new CheckReturnTransformation();
    }

    /**
     * Indicate if can handle a section within the file
     *
     * @param s Section name
     * @return True if can handle
     */
    @Override
    public boolean canRead(String s) {
        String[] r = s.split("\\.");
        if ( r.length != 2 ) return false;
        return  (r[0].equals("insertion") || r[0].equals("special"))
        && r[1].contains("checkReturn");
    }
}
