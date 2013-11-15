package fr.inria.diversify.transformation;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
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
    private int countError = 0;
    private int count = 0;

    public TransformationParser(CodeFragmentList list) {
        codeFragments = list;
    }

    public List<ITransformation> parseDir(String dir) throws IOException, JSONException {
        List<ITransformation> list = new ArrayList<ITransformation>();
        File file = new File(dir);
        int countFile = 0;
        Log.debug("transformation directory: {})"+file.getAbsolutePath());
        for (File f : file.listFiles())
            if(f.getName().endsWith(".json")) {
                countFile++;
                Log.debug("parse tranformation file: "+f.getName());
                list.addAll(parseFile(f));
            }
        Log.debug("number of transformation file: {}",countFile);
        Log.debug("number of transformation : {}",count);
        Log.debug("number of parse error : {}",countError);
        return list;
    }

    public ASTTransformation parseUniqueTransformation(File file) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        if (sb.length() == 0)
            return null;
        JSONObject jsonObject = new JSONObject(sb.toString());
        return parseTransformation(jsonObject);
    }

    public List<ASTTransformation> parseFile(File file) throws IOException, JSONException {
        List<ASTTransformation> list = new ArrayList<ASTTransformation>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        if (sb.length() == 0)
            return new ArrayList<ASTTransformation>();
        JSONArray array = new JSONArray(sb.toString());
        for(int i = 0; i < array.length(); i++)  {
            count++;
            try {
                list.add(parseTransformation(array.getJSONObject(i)));
            }  catch (Exception e) {
                countError++;
//                Log.warn("error during the parsing of "+array.getJSONObject(i),e);
            }
        }

        return list;
    }

    protected ASTTransformation parseTransformation(JSONObject jsonObject) throws Exception {
        String type = jsonObject.getString("type");
        ASTTransformation trans = null;

        if(type.endsWith("eplace"))  //replace, stupidReplace, veryStupidReplace
            trans = parseReplace(jsonObject);
        if(type.endsWith("dd"))
            trans = parseAdd(jsonObject);
        if(type.endsWith("elete"))
            trans = parseDelete(jsonObject);

        if(jsonObject.has("parent")) {
            JSONArray array = jsonObject.getJSONArray("parents");
            for(int i = 0; i <array.length(); i++) {
                trans.addParent(parseTransformation(array.getJSONObject(i)));
            }
        }
        return trans;
    }

    protected ASTTransformation parseDelete(JSONObject jsonObject) throws Exception {
        ASTDelete trans = new ASTDelete();

        JSONArray array = jsonObject.getJSONArray("transformation");
        for(int i = 0; i <array.length(); i++) { //normalement array.length == 1
            JSONObject t = array.getJSONObject(i);
            CodeFragment d = findCodeFragment(t.getJSONObject("CodeFragmentDelete"));
            trans.setPosition(d);
        }

        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected ASTTransformation parseAdd(JSONObject jsonObject) throws Exception {
        ASTAdd trans = new ASTAdd();
        trans.setType(jsonObject.getString("type"));
        JSONArray array = jsonObject.getJSONArray("transformation");
        for(int i = 0; i <array.length(); i++) {  //normalement array.length == 1
            JSONObject t = array.getJSONObject(i);
            CodeFragment position = findCodeFragment(t.getJSONObject("CodeFragmentPosition"));
            trans.setPosition(position);
            trans.setCodeFragmentToAdd(findCodeFragment(t.getJSONObject("CodeFragmentAdd")));
            try {
                trans.setVarMapping(parseVariableMapping(t.getJSONObject("VariableMapping")));
            } catch (Exception e) {}

        }
        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected ASTTransformation parseReplace(JSONObject jsonObject) throws Exception {
        ASTReplace trans = new ASTReplace();
        trans.setType(jsonObject.getString("type"));
        JSONArray array = jsonObject.getJSONArray("transformation");
        for(int i = 0; i <array.length(); i++) {    //normalement array.length == 1
            JSONObject t = array.getJSONObject(i);
            CodeFragment position = findCodeFragment(t.getJSONObject("CodeFragmentPosition"));
            trans.setPosition(position);
            trans.setCodeFragmentToReplace(findCodeFragment(t.getJSONObject("CodeFragmentReplace")));
            trans.setVarMapping(parseVariableMapping(t.getJSONObject("VariableMapping")));

        }
        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected ASTReplace buildOldTransformation(JSONObject jsonObject) throws Exception {
        ASTReplace trans = new ASTReplace();
        CodeFragment position = findCodeFragment((JSONObject) jsonObject.get("StatementToReplace"));
        trans.setPosition(position);
        trans.setCodeFragmentToReplace(findCodeFragment((JSONObject) jsonObject.get("StatementReplacedBy")));
        trans.setVarMapping(parseVariableMapping((JSONObject) jsonObject.get("VariableMapping")));
        if(jsonObject.getBoolean("allTestRun"))
            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected CodeFragment findCodeFragment(JSONObject jsonObject) throws Exception {
        CodeFragment cf = null;
        for (CodeFragment codeFragment : codeFragments) {
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
