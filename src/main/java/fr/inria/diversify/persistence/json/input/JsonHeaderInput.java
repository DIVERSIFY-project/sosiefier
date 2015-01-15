package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.persistence.SectionInput;
import fr.inria.diversify.transformation.Transformation;

import java.util.HashMap;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonHeaderInput extends JsonSectionInput {
    @Override
    public void read(HashMap<Integer, Transformation> transformations) {

    }

    @Override
    public boolean canHandleSection(String s) {
        return false;
    }
}
