package fr.inria.diversify.testamplification.compare.diff;

import fr.inria.diversify.testamplification.compare.Assert;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Simon on 19/01/15.
 */
public class AssertDiff {
    Assert original;
    Assert sosie;
    Set<String> methodFilter;
    boolean excludeThisDiff;

    public AssertDiff(Assert original, Assert sosie) {
        this.original = original;
        this.sosie = sosie;
        methodFilter = new HashSet<>();
    }

    public AssertDiff(JSONObject jsonObject) throws JSONException {
        buildFrom(jsonObject);
        methodFilter = new HashSet<>();
    }


    @Override
    public String toString() {
        return "original: " + original.toString() + "\nsosie: " + sosie;
    }


    public JSONObject toJson() throws JSONException {
        JSONObject object = new JSONObject();


        object.put("assertId", original.getAssertId());
        if(original.getClassId() !=  sosie.getClassId()) {
            object.put("classId", original.getClassId());
            object.put("sosieClassId", sosie.getClassId());
        } else {
            object.put("classId", original.getClassId());

            JSONArray diffs = new JSONArray();
            object.put("methodDiffs", diffs);
            for (int i = 0; i < original.getValues().length; i++) {
                try {
                    Object oValue = original.getValues()[i];
                    Object sValue = sosie.getValues()[i];


                    if (!oValue.equals(sValue) && !methodFilter.contains(original.getMethods()[i])) {
                        JSONObject diff = new JSONObject();
                        diffs.put(diff);
                        diff.put("method", original.getMethods()[i]);
                        diff.put("original", oValue);
                        diff.put("sosie", sValue);
                    }
                } catch (Exception e) {
                    Log.debug("");
                }
            }
        }
        return object;
    }

    protected void buildFrom(JSONObject jsonObject) throws JSONException {
        int assertId = jsonObject.getInt("assertId");
        int classId = jsonObject.getInt("classId");

        if(jsonObject.has("sosieClassId")) {
            original = new Assert(assertId, classId, new String[0], new String[0]);
            sosie = new Assert(assertId, jsonObject.getInt("sosieClassId"), new String[0], new String[0]);
        } else {

            JSONArray diff = jsonObject.getJSONArray("methodDiffs");
            int length = diff.length();
            String[] mth = new String[length];
            String[] valueO = new String[length];
            String[] valueS = new String[length];

            for (int i = 0; i < length; i++) {
                JSONObject d = diff.getJSONObject(i);
                mth[i] = d.getString("method");
                valueO[i] = d.getString("original");
                valueS[i] = d.getString("sosie");
            }

            original = new Assert(assertId, classId, mth, valueO);
            sosie = new Assert(assertId, classId, mth, valueS);
        }
    }

    public void filter(Set<String> filter) {
        for(String f : filter) {
            String[] mths = f.split(";");
            if (mths.length == 1 && mths[0].startsWith("[") && mths[0].endsWith("]")) {
                String[] classIds = mths[0].substring(1, mths[0].length() - 1).split(",");
                int classSosieId = Integer.parseInt(classIds[1]);

                excludeThisDiff = excludeThisDiff || sosie.getClassId() == classSosieId;
            }
            for (String mth : mths) {
                methodFilter.add(mth);
            }
        }
    }

    public String buildFilter() {
        String filter = getAssertId() + "";

        if(original.getClassId() !=  sosie.getClassId()) {
            filter += ";[" + original.getClassId() + "," + sosie.getClassId() + "]";
        } else {
            for (int i = 0; i < original.getValues().length; i++) {
                Object oValue = original.getValues()[i];
                Object sValue = sosie.getValues()[i];

                if (!oValue.equals(sValue)) {
                    filter += ";" + original.getMethods()[i];
                }
            }
        }
        return filter;
    }

    public int getAssertId(){
        return original.getAssertId();
    }

    public int nbOfDiff() {
        if(excludeThisDiff) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < original.getValues().length; i++) {
            try {
                Object oValue = original.getValues()[i];
                Object sValue = sosie.getValues()[i];

                if (!oValue.equals(sValue) && !methodFilter.contains(original.getMethods()[i])) {
                    count++;
                }
            }catch (Exception e ) {
               return 1;
            }
        }
        return count;
    }


}
