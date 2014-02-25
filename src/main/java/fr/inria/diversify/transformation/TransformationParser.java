package fr.inria.diversify.transformation;

import fr.inria.diversify.DiversifyEnvironment;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.bytecode.BytecodeAdd;
import fr.inria.diversify.transformation.bytecode.BytecodeDelete;
import fr.inria.diversify.transformation.bytecode.BytecodeReplace;
import fr.inria.diversify.transformation.bytecode.BytecodeTransformation;
import fr.inria.diversify.transformation.mutation.*;
import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtPackage;
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
    private int countError = 0;
    private int count = 0;
    Collection<Transformation> transformations;

    public TransformationParser(boolean toSet) {
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

        if(type.equals("mutation") )
            trans = parseMutation(jsonObject);
        if(type.equals("adrStmt"))
            trans = parseStmt(jsonObject);
        if(type.equals("adrBytecode"))
            trans = parseBytecode(jsonObject);

        trans.setFailures(getFailures(jsonObject));
        trans.setStatus(jsonObject.getInt("status"));

        if(jsonObject.has("parent"))
            trans.setParent(parseTransformation(jsonObject.getJSONObject("parent")));

        return trans;
    }

    protected Transformation parseMutation(JSONObject jsonObject) throws Exception {
        String name = jsonObject.getString("name");
        Transformation trans = null;

        if(name.equals("inlineConstant"))
            trans = parseInlineConstantMutation(jsonObject);
        else if(name.equals("returnValue"))
            trans = parseReturnValueMutation(jsonObject);
        else
            trans = parseBinaryOperatorMutation(jsonObject);

        return trans;
    }

    protected Transformation parseStmt(JSONObject jsonObject) throws Exception {
        String name = jsonObject.getString("name");
        ASTTransformation trans = null;

        if(name.equals("replace"))
            trans = parseASTReplace(jsonObject);
        if(name.equals("add"))
            trans = parseASTAdd(jsonObject);
        if(name.equals("delete"))
            trans = parseASTDelete(jsonObject);

        trans.setTransplantationPoint(findCodeFragment(jsonObject.getJSONObject("transplantationPoint")));
        return trans;
    }

    protected Transformation parseBytecode(JSONObject jsonObject) throws Exception {
        String name = jsonObject.getString("name");
        BytecodeTransformation trans = null;

        if(name.equals("replace"))
            trans = parseBytecodeReplace(jsonObject);
        if(name.equals("add"))
            trans = parseBytecodeAdd(jsonObject);
        if(name.equals("delete"))
            trans = parseBytecodeDelete(jsonObject);


        trans.setOpcodeIndex(jsonObject.getInt("opcodeIndex"));
        trans.setMethodLocation(getMethod(jsonObject.getString("methodLocation")));
        return trans;
    }

    protected Transformation parseBinaryOperatorMutation(JSONObject jsonObject) throws Exception {
        String name = jsonObject.getString("name");
        BinaryOperatorMutation trans = null;
        if(name.equals("conditionalBoundary"))
            trans = new ConditionalBoundaryMutation();
        if(name.equals("math"))
            trans = new MathMutation();
        if(name.equals("negateConditional"))
            trans = new NegateConditionalMutation();
        if(name.equals("removeConditional"))
            trans = new RemoveConditionalMutation();

        CtBinaryOperator<?> p = null;
        for (CtBinaryOperator<?> ret : DiversifyEnvironment.getBinaryOperators()) {
            try {
                String position = ret.getParent(CtPackage.class).getQualifiedName()
                        + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine();
                if (position.equals(jsonObject.get("position"))  ){
                    p = ret;
                    break;
                }
            } catch (Exception e) {}
        }
        if (p == null) {
            throw new Exception();
        }
        trans.setOperator(p);
        return trans;
    }

    protected Transformation parseReturnValueMutation(JSONObject jsonObject) throws Exception {
        ReturnValueMutation trans = new ReturnValueMutation();

        CtReturn p = null;
        for (CtReturn ret : DiversifyEnvironment.getReturns()) {
            try {
                String position = ret.getParent(CtPackage.class).getQualifiedName()
                        + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine();
                if (position.equals(jsonObject.get("position"))  ){
                    p = ret;
                    break;
                }
            } catch (Exception e) {}
        }
        if (p == null) {
            throw new Exception();
        }
        trans.setReturn(p);

        return trans;
    }

    protected Transformation parseInlineConstantMutation(JSONObject jsonObject) throws Exception {
        InlineConstantMutation trans = new InlineConstantMutation();

        CtLocalVariable p = null;
        for (CtLocalVariable ret : DiversifyEnvironment.getInlineConstant()) {
            try {
                String position = ret.getParent(CtPackage.class).getQualifiedName()
                        + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine();
                if (position.equals(jsonObject.get("position"))  ){
                    p = ret;
                    break;
                }
            } catch (Exception e) {}
        }
        if (p == null) {
            throw new Exception();
        }
        trans.setInlineConstant(p);

        return trans;
    }


    protected BytecodeTransformation parseBytecodeDelete(JSONObject jsonObject) throws Exception {
        return new BytecodeDelete();
    }

    protected BytecodeTransformation parseBytecodeAdd(JSONObject jsonObject) throws Exception {
        BytecodeAdd trans = new BytecodeAdd();
        trans.setByteCodeToAdd(parseByteCode(jsonObject.getString("byteCodeToAdd")));
        return trans;
    }

    protected BytecodeTransformation parseBytecodeReplace(JSONObject jsonObject) throws Exception {
        BytecodeReplace trans = new BytecodeReplace();
        trans.setByteCodeToReplace(parseByteCode(jsonObject.getString("byteCodeToReplace")));
        return trans;
    }

    protected ASTTransformation parseASTDelete(JSONObject jsonObject) throws Exception {
        return new ASTDelete();
    }

    protected ASTTransformation parseASTAdd(JSONObject jsonObject) throws Exception {
        ASTAdd trans = new ASTAdd();

        trans.setCodeFragmentToAdd(findCodeFragment(jsonObject.getJSONObject("transplant")));
        trans.setVarMapping(parseVariableMapping(jsonObject.getJSONObject("variableMapping")));

        return trans;
    }

    protected ASTTransformation parseASTReplace(JSONObject jsonObject) throws Exception {
        ASTReplace trans = new ASTReplace();

        trans.setCodeFragmentToReplace(findCodeFragment(jsonObject.getJSONObject("transplant")));
        trans.setVarMapping(parseVariableMapping(jsonObject.getJSONObject("variableMapping")));

        return trans;
    }

    protected CodeFragment findCodeFragment(JSONObject jsonObject) throws Exception {
        CodeFragment cf = null;
        for (CodeFragment codeFragment : DiversifyEnvironment.getCodeFragments()) {
            try {
                if (codeFragment.positionString().equals(jsonObject.get("position"))  ){
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

    protected byte[] parseByteCode(String bytecodes) {
        String[] bytecode = bytecodes.substring(1, bytecodes.length() - 1).split(", ");
        byte[] tab = new byte[bytecode.length];
        for(int i = 0; i < tab.length; i++)
            tab[i] =  Byte.parseByte(bytecode[i]);

        return tab;
    }

    protected CtMethod getMethod(String name) throws Exception {
        for(CtMethod mth : DiversifyEnvironment.getJavassistMethods()) {
            if(mth.getLongName().equals(name))
                return mth;
        }
        throw new Exception("error in getMethod for "+name);
    }



    protected List<String> getFailures(JSONObject jsonObject) throws JSONException {
        List<String> list = new ArrayList<String>();

        JSONArray array = jsonObject.getJSONArray("failures");
        for(int i = 0; i < array.length(); i++) {
            list.add(array.getString(i));
        }
        return list;
    }
}
