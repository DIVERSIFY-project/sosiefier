package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.cvl.*;
import fr.inria.diversify.util.DiversifyEnvironment;
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
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: Simon
 * Date: 5/28/13
 * Time: 11:38 AM
 */
public class  TransformationParser {
    private int countError = 0;
    private int count = 0;
//    Map<String, Integer> duplication = new HashMap<String, Integer>();
    Collection<Transformation> transformations;
    private HashMap<Integer, String> failureDictionary;

    public TransformationParser(boolean toSet) {
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
//                for(Transformation t : parseFile(f)) {
//                    if(transformations.contains(t)) {
//                        String key = t.getType()+":"+t.getName();
//                        if(!duplication.containsKey(key))
//                            duplication.put(key,1);
//                        else
//                            duplication.put(key, 1 + duplication.get(key));
//                    }
                    transformations.addAll(parseFile(f));
//                }
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

        parseFailureDictionay(array);
        List<Transformation> list = IntStream.range(0, array.length()).parallel()
                .mapToObj(i -> parseTransformation(getObject(array, i)))
                .filter(object -> object != null )
                .collect(Collectors.toList());

        return list;
    }

    protected JSONObject getObject(JSONArray array, int index) {
        try {
            return array.getJSONObject(index);
        } catch (JSONException e) {
            return null;
        }
    }



    protected Transformation parseTransformation(JSONObject jsonObject)  {
        try {

        String type = jsonObject.getString("type");
        Transformation trans = null;

        if(type.equals("mutation") )
            trans = parseMutation(jsonObject);
        if(type.equals("adrStmt"))
            trans = parseStmt(jsonObject);
        if(type.equals("adrBytecode"))
            trans = parseBytecode(jsonObject);
        if(type.equals("cvl"))
            trans = parseCvl(jsonObject);

        trans.setFailures(getFailures(jsonObject));
        trans.setStatus(jsonObject.getInt("status"));

        if(jsonObject.has("parent"))
            trans.setParent(parseTransformation(jsonObject.getJSONObject("parent")));

        return trans;
        }catch (Exception e) {
            countError++;
//            Log.warn("error during the parsing of "+jsonObject,e);
            return null;
        }
    }

    protected Transformation parseCvl(JSONObject jsonObject) throws Exception {
        String name = jsonObject.getString("name");
        CVLTransformation trans = null;

        if(name.equals("linkExistence"))
            trans = parseLinkExistence(jsonObject);
        if(name.equals("linkSubstitution"))
            trans = parseLinkSubstitution(jsonObject);
        if(name.equals("objectExistence"))
            trans = parseObjectExistence(jsonObject);
        if(name.equals("objectSubstitution"))
            trans = parseObjectSubstitution(jsonObject);


        trans.setTransformationPoint(getObject(jsonObject.getString("transformationPoint"), jsonObject.getString("nodeType")));
        return trans;
    }

    protected CtElement getObject(String positionObject, String objectType) throws Exception {
        CtElement o = null;

        for (CtElement object : DiversifyEnvironment.getAllElement(CtElement.class)) {
            try {
                String position = object.getParent(CtPackage.class).getQualifiedName()
                        + "." + object.getPosition().getCompilationUnit().getMainType().getSimpleName() + ":" + object.getPosition().getLine();
                if (position.equals(positionObject) && object.getClass().getSimpleName().equals(objectType)){
                    o = object;
                    break;
                }
            } catch (Exception e) {}
        }
        if (o == null) {
            throw new Exception();
        }
        return  o;
    }

    protected CVLTransformation parseObjectExistence(JSONObject jsonObject) {
        ObjectExistence oe = new ObjectExistence();
        return oe;
    }

    protected CVLTransformation parseObjectSubstitution(JSONObject jsonObject) throws Exception {
        ObjectSubstitution os = new ObjectSubstitution();
        os.setTransplant(getObject(jsonObject.getString("transplant"), jsonObject.getString("nodeType")));
        return os;
    }

    protected CVLTransformation parseLinkSubstitution(JSONObject jsonObject) throws Exception {
        LinkSubstitution ls = new LinkSubstitution();

        String nodeType = jsonObject.getString("nodeType");
        if(nodeType.equals("CtClassImpl")) {
            String clName = jsonObject.getString("classOrInterfaceExistence");
            CtClass cl = (CtClass) getObject(jsonObject.getString("transformationPoint"), jsonObject.getString("nodeType"));
            List<CtTypeReference> set = new ArrayList<CtTypeReference>();

            if(cl.getSuperclass() != null)
                set.add(cl.getSuperclass());
            set.addAll(cl.getSuperInterfaces());

            for(CtTypeReference ref :set) {
                if(clName.equals(ref.getPackage() + "." + ref.getSimpleName()))
                    ls.setClassOrInterfaceSubstitution(ref);
                break;
            }
        }

        ls.setTransplant(getObject(jsonObject.getString("transplant"), nodeType));
        return  ls;
    }

    protected CVLTransformation parseLinkExistence(JSONObject jsonObject) throws Exception {
        LinkExistence le = new LinkExistence();

        String nodeType = jsonObject.getString("nodeType");
        if(nodeType.equals("CtClassImpl")) {
            String clName = jsonObject.getString("classOrInterfaceExistence");
            CtClass cl = (CtClass) getObject(jsonObject.getString("transformationPoint"), jsonObject.getString("nodeType"));
            List<CtTypeReference> set = new ArrayList<CtTypeReference>();

            if(cl.getSuperclass() != null)
                set.add(cl.getSuperclass());
            set.addAll(cl.getSuperInterfaces());

            for(CtTypeReference ref :set) {
                if(clName.equals(ref.getPackage()+"."+ref.getSimpleName()))
                    le.setClassOrInterfaceExistance(ref);
                break;
            }
        }
        return le;
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

        if(name.startsWith("replace"))
            trans = parseASTReplace(jsonObject);
        if(name.startsWith("add"))
            trans = parseASTAdd(jsonObject);
        if(name.equals("delete"))
            trans = parseASTDelete(jsonObject);

        trans.setName(jsonObject.getString("name"));
        String p = jsonObject.getJSONObject("transplantationPoint").getString("position");
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
        for (CtElement ret : DiversifyEnvironment.getAllElement(CtBinaryOperator.class)) {
            try {
                String position = ret.getParent(CtPackage.class).getQualifiedName()
                        + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine();
                if (position.equals(jsonObject.get("position"))  ){
                    p = (CtBinaryOperator)ret;
                    break;
                }
            } catch (Exception e) {}
        }
        if (p == null) {
            throw new Exception();
        }
        trans.setTransformationPoint(p);
        return trans;
    }

    protected Transformation parseReturnValueMutation(JSONObject jsonObject) throws Exception {
        ReturnValueMutation trans = new ReturnValueMutation();

        CtReturn p = null;
        for (CtReturn<?> ret : DiversifyEnvironment.getReturns()) {
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
        trans.setTransformationPoint(p);

        return trans;
    }

    protected Transformation parseInlineConstantMutation(JSONObject jsonObject) throws Exception {
        InlineConstantMutation trans = new InlineConstantMutation();

        CtLocalVariable p = null;
        for (CtLocalVariable<?> ret : DiversifyEnvironment.getInlineConstant()) {
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
        trans.setTransformationPoint(p);

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
        String position = jsonObject.getString("position");
        for (CodeFragment codeFragment : DiversifyEnvironment.getCodeFragments()) {
            try {

                if (codeFragment.positionString().equals(position)  ){
                    cf = codeFragment;
                    break;
                }
            } catch (Exception e) {}
        }
        if (cf  == null) {
            int count = 0;
            for (CodeFragment codeFragment : DiversifyEnvironment.getCodeFragments()) {
                try {
                    position = position.split(":")[0];
                    if(codeFragment.positionString().startsWith(position)) {
                        count++;
                        String sourceCode = jsonObject.getString("sourceCode");
                        String cfSourceCode = codeFragment.equalString();
                        if(sourceCode.equals(cfSourceCode)) {
                        cf = codeFragment;
                        break;
                    }
                    }
                } catch (Exception e) {}
            }
        }
        if(cf  == null) {
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
            if(failureDictionary == null)
                list.add(array.getString(i));
            else
                list.add(failureDictionary.get(array.getInt(i)));
        }
        return list;
    }

    protected void parseFailureDictionay(JSONArray array) throws JSONException {
        for(int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            if(object.has("failureDictionary")) {
                failureDictionary = new HashMap<Integer, String>();
                JSONObject dico = object.getJSONObject("failureDictionary");
                Iterator it = dico.keys();
                while (it.hasNext()) {
                    String key = it.next().toString();
                    failureDictionary.put(dico.getInt(key), key);
                }
            }
        }
    }
}
