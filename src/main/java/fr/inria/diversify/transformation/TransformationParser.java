package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.util.Log;
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
            if(f.getName().endsWith(".json")) {
                Log.debug("parse tranformation file: "+f.getName());
                list.addAll(parseFile(f));
            }

        return list;
    }
    public List<Transformation> parseFile(File file) throws IOException, JSONException {
        List<Transformation> list = new ArrayList<Transformation>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
       if (sb.length() == 0)
           return list;
        JSONArray array = new JSONArray(sb.toString());
        for(int i = 0; i < array.length(); i++)  {
            try {
                list.add(parseTransformation(array.getJSONObject(i)));
            }  catch (Exception e) {
                Log.warn("error during the parsing of "+array.getJSONObject(i),e);
            }
        }
        return list;
    }

    protected Transformation parseTransformation(JSONObject jsonObject) throws Exception {
        String type = jsonObject.getString("type");
        Transformation trans = null;

        if(type.equals("replace"))
            trans = parseReplace(jsonObject);
        if(type.equals("add"))
            trans = parseAdd(jsonObject);
        if(type.equals("delete"))
            trans = parseDelete(jsonObject);

        if(jsonObject.has("parent")) {
            JSONArray array = jsonObject.getJSONArray("parents");
            for(int i = 0; i <array.length(); i++) {
                trans.addParent(parseTransformation(array.getJSONObject(i)));
            }
        }
        return trans;
    }

    protected Transformation parseDelete(JSONObject jsonObject) throws Exception {
        Delete trans = new Delete();

        JSONArray array = jsonObject.getJSONArray("transformation");
        for(int i = 0; i <array.length(); i++) {
            JSONObject t = array.getJSONObject(i);
            CodeFragment d = findCodeFragment(t.getJSONObject("CodeFragmentDelete"));
            trans.addCodeFragmentToTransform(d);
        }

        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected Transformation parseAdd(JSONObject jsonObject) throws Exception {
        Add trans = new Add();
        JSONArray array = jsonObject.getJSONArray("transformation");
        for(int i = 0; i <array.length(); i++) {
            JSONObject t = array.getJSONObject(i);
            CodeFragment position = findCodeFragment(t.getJSONObject("CodeFragmentPosition"));
            trans.addCodeFragmentToAdd(position, findCodeFragment(t.getJSONObject("CodeFragmentAdd")));
        }
        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected Transformation parseReplace(JSONObject jsonObject) throws Exception {
        Replace trans = new Replace();
        JSONArray array = jsonObject.getJSONArray("transformation");
        for(int i = 0; i <array.length(); i++) {
            JSONObject t = array.getJSONObject(i);
            CodeFragment position = findCodeFragment(t.getJSONObject("CodeFragmentPosition"));
            trans.addCodeFragmentToReplace(position, findCodeFragment(t.getJSONObject("CodeFragmentReplace")));
            trans.addVarMapping(position, parseVariableMapping(t.getJSONObject("VariableMapping")));
        }
        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected Replace buildOldTransformation(JSONObject jsonObject) throws Exception {
        Replace trans = new Replace();
        CodeFragment position = findCodeFragment((JSONObject) jsonObject.get("StatementToReplace"));
        trans.addCodeFragmentToReplace(position, findCodeFragment((JSONObject) jsonObject.get("StatementReplacedBy")));
        trans.addVarMapping(position, parseVariableMapping((JSONObject) jsonObject.get("VariableMapping")));
        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected CodeFragment findCodeFragment(JSONObject jsonObject) throws Exception {
        CodeFragment cf = null;
        for (CodeFragment codeFragment : codeFragments.getCodeFragments()) {
             try {
            if (codeFragment.getCodeFragmentType().getSimpleName().equals(jsonObject.get("Type"))
                    && codeFragment.positionString().equals(jsonObject.get("Position"))  ){
                cf = codeFragment;
                break;
            }
             } catch (Exception e) {}
        }
        if (cf  == null) {
            //TODO exception
//            System.out.println(jsonObject.get("Position"));
//            System.out.println(jsonObject.get("SourceCode"));
            throw new Exception();
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

//    protected List<String> parseFailures(JSONArray array) throws JSONException {
//        List<String> list = new ArrayList<String>();
//        for(int i = 0; i < array.length(); i++)
//            list.add(array.getString(i));
//        return list;
//    }
}
