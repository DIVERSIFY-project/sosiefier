package fr.inria.diversify.logger;

import org.json.JSONObject;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 20:22
 */
public interface Diff {

    void filter(Diff filter);
    JSONObject toJSON();
    int size();
    void parse(JSONObject jsonObject);
    void merge(Diff other);
}
