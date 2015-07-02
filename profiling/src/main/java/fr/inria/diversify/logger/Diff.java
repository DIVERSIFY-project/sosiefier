package fr.inria.diversify.logger;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 20:22
 */
public interface Diff {

    void filter(Diff filter);
    JSONObject toJSON() throws JSONException;
    int size();
    void parse(JSONObject jsonObject) throws JSONException;
    void merge(Diff other);
}
