package fr.inria.diversify.transformation;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.bytecode.BytecodeAdd;
import fr.inria.diversify.transformation.bytecode.BytecodeDelete;
import fr.inria.diversify.transformation.bytecode.BytecodeReplace;
import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.declaration.CtSimpleType;

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
    List<CtMethod> ctMethods;
    private int countError = 0;
    private int count = 0;
    Collection<Transformation> transformations;

    public TransformationParser(CodeFragmentList list, boolean toSet) {
        codeFragments = list;
        if(toSet)
            transformations = new HashSet<Transformation>();
        else
            transformations = new ArrayList<Transformation>();
    }

    public Collection<Transformation> parseDir(String dir) throws IOException, JSONException {

        File file = new File(dir);
        int countFile = 0;
        Log.debug("transformation directory: {})"+file.getAbsolutePath());
        for (File f : file.listFiles())
            if(f.getName().endsWith(".json")) {
                countFile++;
                Log.debug("parse tranformation file: "+f.getName());
                transformations.addAll(parseFile(f));
            }
        Log.debug("number of transformation file: {}",countFile);
        Log.debug("number of transformation : {}",count);
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
                Log.warn("error during the parsing of "+array.getJSONObject(i),e);
            }
        }

        return list;
    }

    protected Transformation parseTransformation(JSONObject jsonObject) throws Exception {
        String type = jsonObject.getString("type");
        Transformation trans = null;

        if(jsonObject.has("level") && jsonObject.getString("level").equals("bytecode")) {
            if(type.endsWith("replace"))
                trans = parseBytecodeReplace(jsonObject);
            if(type.endsWith("add"))
                trans = parseBytecodeAdd(jsonObject);
            if(type.endsWith("delete"))
                trans = parseBytecodeDelete(jsonObject);
        }
        else {
            if(type.endsWith("eplace"))  //replace, stupidReplace, veryStupidReplace
                trans = parseASTReplace(jsonObject);
            if(type.endsWith("dd"))
                trans = parseASTAdd(jsonObject);
            if(type.endsWith("elete"))
                trans = parseASTDelete(jsonObject);
            if(type.equals("multi"))
                trans = parseASTMulti(jsonObject);
        }

        try {
            trans.setStatus(jsonObject.getInt("Failures"));
        } catch (Exception e) {
            Log.debug("e",e);
        }
        trans.setStatus(jsonObject.getInt("status"));
        return trans;
    }

    protected Transformation parseASTMulti(JSONObject jsonObject) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    protected Transformation parseBytecodeDelete(JSONObject jsonObject) throws Exception {
        BytecodeDelete trans = new BytecodeDelete();
        JSONObject t = getTransformation(jsonObject);
        trans.setOpcodeIndex(t.getInt("opcodeIndex"));
        trans.setMethodLocation(getMethod(t.getString("methodLocation")));
        return trans;
    }

    protected Transformation parseBytecodeAdd(JSONObject jsonObject) throws Exception {
        BytecodeAdd trans = new BytecodeAdd();
        JSONObject t = getTransformation(jsonObject);
        trans.setOpcodeIndex(t.getInt("opcodeIndex"));
        trans.setMethodLocation(getMethod(t.getString("methodLocation")));
        trans.setByteCodeToAdd(parseByteCode(t.getString("byteCodeToAdd")));
        return trans;
    }

    protected Transformation parseBytecodeReplace(JSONObject jsonObject) throws Exception {
        BytecodeReplace trans = new BytecodeReplace();
        JSONObject t = getTransformation(jsonObject);
        trans.setOpcodeIndex(t.getInt("opcodeIndex"));
        trans.setMethodLocation(getMethod(t.getString("methodLocation")));
        trans.setByteCodeToReplace(parseByteCode(t.getString("byteCodeToReplace")));
        return trans;
    }


    protected ASTTransformation parseASTDelete(JSONObject jsonObject) throws Exception {
        ASTDelete trans = new ASTDelete();

        JSONObject t = getTransformation(jsonObject);
            CodeFragment d = findCodeFragment(t.getJSONObject("CodeFragmentDelete"));
            trans.setPosition(d);

//        if(jsonObject.getBoolean("allTestRun"))
//            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected ASTTransformation parseASTAdd(JSONObject jsonObject) throws Exception {
        ASTAdd trans = new ASTAdd();
        trans.setName(jsonObject.getString("name"));

        JSONObject t = getTransformation(jsonObject);
            CodeFragment position = findCodeFragment(t.getJSONObject("CodeFragmentPosition"));
            trans.setPosition(position);
            trans.setCodeFragmentToAdd(findCodeFragment(t.getJSONObject("CodeFragmentAdd")));
            try {
                trans.setVarMapping(parseVariableMapping(t.getJSONObject("VariableMapping")));
            } catch (Exception e) {}

//        }
//        if(jsonObject.getBoolean("allTestRun"))
//            trans.setJUnitResult(jsonObject.getInt("Failures"));

        return trans;
    }

    protected ASTTransformation parseASTReplace(JSONObject jsonObject) throws Exception {
        ASTReplace trans = new ASTReplace();
        trans.setType(jsonObject.getString("type"));

          JSONObject t = getTransformation(jsonObject);
            CodeFragment position = findCodeFragment(t.getJSONObject("CodeFragmentPosition"));
            trans.setPosition(position);
            trans.setCodeFragmentToReplace(findCodeFragment(t.getJSONObject("CodeFragmentReplace")));
            trans.setVarMapping(parseVariableMapping(t.getJSONObject("VariableMapping")));

        return trans;
    }

    protected JSONObject getTransformation(JSONObject jsonObject) throws JSONException {
        if(jsonObject.has("transformation")) //old json format
            return jsonObject.getJSONArray("transformation").getJSONObject(0);
        return jsonObject; //new format
    }

//    protected ASTReplace buildOldTransformation(JSONObject jsonObject) throws Exception {
//        ASTReplace trans = new ASTReplace();
//        CodeFragment position = findCodeFragment((JSONObject) jsonObject.get("StatementToReplace"));
//        trans.setPosition(position);
//        trans.setCodeFragmentToReplace(findCodeFragment((JSONObject) jsonObject.get("StatementReplacedBy")));
//        trans.setVarMapping(parseVariableMapping((JSONObject) jsonObject.get("VariableMapping")));
//        if(jsonObject.getBoolean("allTestRun"))
//            trans.setJUnitResult(jsonObject.getInt("Failures"));
//
//        return trans;
//    }

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

    protected byte[] parseByteCode(String bytecodes) {
        String[] bytecode = bytecodes.substring(1, bytecodes.length() - 1).split(", ");
        byte[] tab = new byte[bytecode.length];
        for(int i = 0; i < tab.length; i++)
            tab[i] =  Byte.parseByte(bytecode[i]);

        return tab;
    }

    protected CtMethod getMethod(String name) throws Exception {
        for(CtMethod mth : allCtMethod()) {
            if(mth.getLongName().equals(name))
                return mth;
        }
        throw new Exception("error in getMethod for "+name);
    }

    protected List<CtMethod> allCtMethod() throws NotFoundException {
        if(ctMethods != null)
            return ctMethods;

        ctMethods = new ArrayList<CtMethod>();
        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes"));
        for (CtSimpleType cl: codeFragments.getAllClasses()) {
            try {
                CtClass cc = pool.get(cl.getQualifiedName());
                for(CtMethod method : cc.getDeclaredMethods())
                    if(!method.isEmpty()) {
                        ctMethods.add(method);
                    }
            }  catch (Exception e) {
                Log.error("error in allCtMethod",e);
            }

        }
        return ctMethods;
    }
}
