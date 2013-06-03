package fr.inria.diversify.codeFragment;

import fr.inria.diversify.replace.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 5/28/13
 * Time: 11:38 AM
 */
public class TransformationParser {
    CodeFragmentList codeFragments;

    public TransformationParser(CodeFragmentList list) {
        codeFragments = list;
    }

    public List<Transformation> parseDir(String dir) throws IOException, JSONException {
        List<Transformation> list = new ArrayList<Transformation>();
        File file = new File(dir);
        for (File f : file.listFiles())
            if(f.getName().endsWith(".json"))
                list.addAll(parseFile(f));

        return list;
    }

    public List<Transformation> parseFile(File file) throws IOException, JSONException {
        List<Transformation> list = new ArrayList<Transformation>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuffer sb = new StringBuffer();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
       if (sb.length() == 0)
           return list;
        JSONArray array = new JSONArray(sb.toString());
        for(int i = 0; i < array.length(); i++)
            list.add(buildTransformation(array.getJSONObject(i)));
        return list;
    }

    protected Transformation buildTransformation(JSONObject jsonObject) throws JSONException {
        Transformation trans = new Transformation();
        trans.setStatementToReplace(findCodeFragment((JSONObject) jsonObject.get("StatementToReplace")));
        trans.setStatementReplacedBy(findCodeFragment((JSONObject) jsonObject.get("StatementReplacedBy")));
        trans.setVariableMapping(parseVariableMapping((JSONObject) jsonObject.get("VariableMapping")));
        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected CodeFragment findCodeFragment(JSONObject jsonObject) throws JSONException {
        CodeFragment cf = null;
        for(CodeFragment codeFragment : codeFragments.getCodeFragments())  {
            try {
                if(codeFragment.getCodeFragmentType().getSimpleName().equals(jsonObject.get("Type"))
                        && codeFragment.positionString().equals(jsonObject.get("Position"))
                        && codeFragment.equalString().equals(jsonObject.get("SourceCode"))) {

                    cf = codeFragment;
                    break;
                }
            }
            catch (Exception e) {}

        }
        return cf;
    }

    protected Map<String, String> parseVariableMapping(JSONObject jsonObject) throws JSONException {
        Map<String, String> map = new HashMap<String, String>();
        Iterator it = jsonObject.keys();
        while (it.hasNext()) {
            String key = it.next().toString();
            map.put(key,jsonObject.get(key).toString());
        }
        return map;
    }

    protected List<String> parseFailures(JSONArray array) throws JSONException {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < array.length(); i++)
            list.add(array.getString(i));
        return list;
    }
}
