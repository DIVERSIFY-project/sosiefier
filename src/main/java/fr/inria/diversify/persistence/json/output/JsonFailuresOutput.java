package fr.inria.diversify.persistence.json.output;

import java.util.HashMap;

/**
 * Created by marodrig on 15/01/2015.
 */
public class JsonFailuresOutput extends JsonSectionOutput{

    private HashMap<String, Integer> failuresDict;

    public HashMap<String, Integer> getFailuresDict() {
        return failuresDict;
    }
}
