package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.DiversifyEnvironment;
import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
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
public class TransformationOldParser {
    private int countError = 0;
    private int count = 0;

    InputProgram inputProgram;

    Collection<Transformation> transformations;

    public TransformationOldParser(boolean toSet, InputProgram inputProgram) {
        this.inputProgram = inputProgram;

        if(toSet)
            transformations = new HashSet<Transformation>();
        else
            transformations = new ArrayList<Transformation>();
    }

    public Collection<Transformation> parseDir(String dir) throws IOException, JSONException {

        File file = new File(dir);
        int countFile = 0;
        Log.debug("transformation directory: {}",file.getAbsolutePath());
        for (File f : file.listFiles())
            if(f.getName().endsWith(".json")) {
                countFile++;
                Log.debug("Current number of transformation {}",transformations.size());
                Log.debug("parse tranformation file: "+f.getName());
                transformations.addAll(parseFile(f));
            }
        Log.debug("number of transformation file: {}",countFile);
        Log.debug("number of transformation : {}",transformations.size());
        Log.debug("number of parse error : {}",countError);

        return transformations;
    }

    public Transformation parseUniqueTransformation(File file) throws Exception {

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
            return new ArrayList<Transformation>();
        JSONArray array = new JSONArray(sb.toString());
        for(int i = 0; i < array.length(); i++)  {
            count++;
            try {
                list.add(parseTransformation(array.getJSONObject(i)));
            }  catch (Exception e) {
                countError++;
//                Log.warn("error during the parsing of "+array.getJSONObject(i),e);
                Log.debug("{} {} ",count, countError);
            }
        }

        return list;
    }

    protected Transformation parseTransformation(JSONObject jsonObject) throws Exception {
        String type = jsonObject.getString("type");
        ASTTransformation trans = null;

        if(type.endsWith("eplace"))
            trans = parseASTReplace(jsonObject);
        if(type.endsWith("dd"))
            trans = parseASTAdd(jsonObject);
        if(type.equals("delete"))
            trans = parseASTDelete(jsonObject);

        trans.setFailures(new ArrayList<String>());

        if(type.equals("notContextAdd"))
            trans.setName("addRandom");
        if(type.equals("notContextReplace"))
            trans.setName("replaceRandom");

        if(type.equals("notMappingVariableAdd"))
            trans.setName("addReaction");
        if(type.equals("notMappingVariableReplace"))
            trans.setName("replaceReaction");

        if(type.equals("notContextMappingVariableNameAdd"))
            trans.setName("addittgenstein");
        if(type.equals("notContextMappingVariableNameReplace"))
            trans.setName("replaceWittgenstein");

        if(type.equals("add"))
            trans.setName("addSteroid");
        if(type.equals("replace"))
            trans.setName("replaceSteroid");
        if(type.equals("delete"))
            trans.setName("delete");


        boolean compile = jsonObject.getBoolean("setCompile");
        int failure = jsonObject.getInt("Failures");
        if(!compile)
            trans.setStatus(-2);
        else if(failure > 0)
            trans.setStatus(-1);
        else
            trans.setStatus(failure);

        return trans;
    }


    protected ASTTransformation parseASTDelete(JSONObject jsonObject) throws Exception {
        ASTDelete trans = new ASTDelete();
        trans.setTransplantationPoint(findCodeFragment(jsonObject.getJSONObject("CodeFragmentDelete")));
        return trans;
    }

    protected ASTTransformation parseASTAdd(JSONObject jsonObject) throws Exception {
        ASTAdd trans = new ASTAdd();

        trans.setCodeFragmentToAdd(findCodeFragment(jsonObject.getJSONObject("CodeFragmentAdd")));
        trans.setTransplantationPoint(findCodeFragment(jsonObject.getJSONObject("CodeFragmentPosition")));
        trans.setVarMapping(parseVariableMapping(jsonObject.getJSONObject("VariableMapping")));

        return trans;
    }

    protected ASTTransformation parseASTReplace(JSONObject jsonObject) throws Exception {
        ASTReplace trans = new ASTReplace();

        trans.setCodeFragmentToReplace(findCodeFragment(jsonObject.getJSONObject("CodeFragmentReplace")));
        trans.setTransplantationPoint(findCodeFragment(jsonObject.getJSONObject("CodeFragmentPosition")));
        trans.setVarMapping(parseVariableMapping(jsonObject.getJSONObject("VariableMapping")));

        return trans;
    }

    protected CodeFragment findCodeFragment(JSONObject jsonObject) throws Exception {
        CodeFragment cf = null;
        for (CodeFragment codeFragment : inputProgram.getCodeFragments()) {
            try {
                if (codeFragment.positionString().equals(jsonObject.get("Position"))  ){
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

}
