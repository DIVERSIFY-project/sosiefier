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
        if(original.getClassName() !=  sosie.getClassName()) {
            object.put("className", original.getClassName());
            object.put("sosieClassName", sosie.getClassName());
        } else {
            object.put("className", original.getClassName());

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
        String className = jsonObject.getString("className");

        if(jsonObject.has("sosieClassName")) {
            original = new Assert(assertId, className, new String[0], new String[0]);
            sosie = new Assert(assertId, jsonObject.getString("sosieClassName"), new String[0], new String[0]);
        } else {

            JSONArray diff = jsonObject.getJSONArray("methodDiffs");
            int length = diff.length();
            String[] mth = new String[length];
            Object[] valueO = new Object[length];
            Object[] valueS = new Object[length];

            for (int i = 0; i < length; i++) {
                JSONObject d = diff.getJSONObject(i);
                mth[i] = d.getString("method");
                valueO[i] = parseValue(d.getString("original"));
                valueS[i] = parseValue(d.getString("sosie"));
            }

            original = new Assert(assertId, className, mth, valueO);
            sosie = new Assert(assertId, className, mth, valueS);
        }
    }

    public void filter(Set<String> filter) {
        for(String f : filter) {
            String[] mths = f.split(";");
            if (mths.length == 1 && mths[0].startsWith("[") && mths[0].endsWith("]")) {
                String[] classNames = mths[0].substring(1, mths[0].length() - 1).split(",");
                String classSosieName = classNames[1];

                excludeThisDiff = excludeThisDiff || sosie.getClassName() == classSosieName;
            }
            for (String mth : mths) {
                methodFilter.add(mth);
            }
        }
    }

    public String buildFilter() {
        String filter = getAssertId() + "";

        if(original.getClassName() !=  sosie.getClassName()) {
            filter += ";[" + original.getClassName() + "," + sosie.getClassName() + "]";
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

    protected Object parseValue(String value) {
        //value is a Map
        if(value.startsWith("{") && value.endsWith("}")) {

            Set<Object> set = new HashSet<>();
            for(String s : value.substring(1,value.length()-1).split(",\\s?")) {
                set.add(parseValue(s));
            }
            return Pool.getCanonicalVersion(set);
        }
        //value is a array or a list or set
        if(value.startsWith("[") && value.endsWith("]")) {
            Set<Object> list = new HashSet<>();
            for(String s : value.substring(1,value.length()-1).split(",\\s?")) {
                list.add(parseValue(s));
            }
            return Pool.getCanonicalVersion(list);
        }
        //toString() is not define
        if(value.split("@").length > 1) {
            return parseValue(value.split("@")[0]);
        }
        //toString() is not define
        if( value.split("\\$").length > 1) {
            return parseValue(value.split("\\$")[0]);
        }
        return Pool.getCanonicalVersion(value);
    }

}
