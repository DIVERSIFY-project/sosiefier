package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
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

        for (File f : file.listFiles())  {
            System.out.println(f);
            if(f.getName().endsWith(".json"))

                list.addAll(parseFile(f));
            }

        return list;
    }
    static int  count ;
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
        for(int i = 0; i < array.length(); i++)  {
            count++;
            try {
            if(parseTransformation(array.getJSONObject(i)).numberOfFailure() > 800)
                System.out.println("erreur ");
            else
                list.add(parseTransformation(array.getJSONObject(i)));
            }  catch (Exception e) {System.out.println("error in buildTransformation: "+array.getJSONObject(i));
            e.printStackTrace();}

        }
        System.out.println("count "+count);
        return list;
    }

    protected Transformation parseTransformation(JSONObject jsonObject) throws Exception {
        String type = jsonObject.getString("type");
        if(type.equals("replace"))
            return parseReplace(jsonObject);
        if(type.equals("add"))
            return parseAdd(jsonObject);
        if(type.equals("delete"))
            return parseDelete(jsonObject);

        return null;
    }

    protected Transformation parseDelete(JSONObject jsonObject) throws Exception {
        Delete trans = new Delete();

        JSONArray array = jsonObject.getJSONArray("transformation");
        for(int i = 0; i <array.length(); i++) {
            CodeFragment d = findCodeFragment(array.getJSONObject(i));
            trans.addSourceCode(d);
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
//        trans.setStatementToReplace(findCodeFragment((JSONObject) jsonObject.get("StatementToReplace")));
//        trans.setStatementReplacedBy(findCodeFragment((JSONObject) jsonObject.get("StatementReplacedBy")));
//        trans.setVariableMapping(parseVariableMapping((JSONObject) jsonObject.get("VariableMapping")));
        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected CodeFragment findCodeFragment(JSONObject jsonObject) throws Exception {
        CodeFragment cf = null;
        for (CodeFragment codeFragment : codeFragments.getCodeFragments()) {
             try {
            if (codeFragment.getCodeFragmentType().getSimpleName().equals(jsonObject.get("Type"))
                    && codeFragment.positionString().equals(jsonObject.get("Position"))
                    && codeFragment.equalString().equals(jsonObject.get("SourceCode"))) {
                cf = codeFragment;
                break;
            }
             } catch (Exception e) {}
        }
        if (cf  == null) {
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

    protected List<String> parseFailures(JSONArray array) throws JSONException {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < array.length(); i++)
            list.add(array.getString(i));
        return list;
    }
}
