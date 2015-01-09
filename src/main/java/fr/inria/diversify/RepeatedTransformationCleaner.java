package fr.inria.diversify;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by marodrig on 10/11/2014.
 */
public class RepeatedTransformationCleaner {

    private boolean different(JSONObject a, JSONObject b) throws JSONException {
        boolean result = a.get("position").equals(b.get("position")) && a.get("type").equals(b.get("type"));

        if (a.has("sourceCode")) {
            result = result && a.get("sourceCode").equals(b.get("sourceCode"));
        }
        return !result;
    }

    JSONArray clean(JSONArray array) throws JSONException {
        JSONArray nonRepeated = new JSONArray();
        int index = 0;
        for (int i = 0; i < array.length(); i++) {
            boolean insert = true;

            JSONObject a = array.getJSONObject(i);
            JSONObject pa = a.getJSONObject("transplantationPoint");
            JSONObject ta = a.has("transplant") ? a.getJSONObject("transplant") : null;

            //Test that the Transplantation Point and the Transplantation are different
            if (ta == null || different(pa, ta)) {
                for (int j = 0; j < nonRepeated.length() && insert; j++) {
                    JSONObject b = nonRepeated.getJSONObject(j);
                    insert = !b.get("name").equals(a.get("name"));
                    insert = insert || different(
                            a.getJSONObject("transplantationPoint"),
                            b.getJSONObject("transplantationPoint"));

                    insert = insert || (a.has("transplant") != b.has("transplant"));

                    if (!insert && a.has("transplant")) {
                        insert = different(
                                a.getJSONObject("transplant"),
                                b.getJSONObject("transplant"));
                    }
                }


            }

            if (insert) {
                JSONObject obj = array.getJSONObject(i);
                index++;
                obj.put("tindex", index);
                nonRepeated.put(array.get(i));
            }
        }

        return nonRepeated;
    }
}