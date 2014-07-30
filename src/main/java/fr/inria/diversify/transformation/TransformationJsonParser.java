package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.bytecode.BytecodeAdd;
import fr.inria.diversify.transformation.bytecode.BytecodeDelete;
import fr.inria.diversify.transformation.bytecode.BytecodeReplace;
import fr.inria.diversify.transformation.bytecode.BytecodeTransformation;
import fr.inria.diversify.transformation.cvl.*;
import fr.inria.diversify.transformation.mutation.*;
import fr.inria.diversify.transformation.other.ShuffleStmtTransformation;
import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;

import java.io.*;
import java.util.*;

/**
 * The TransformationJSONParser is a great tool to load Transformations from a JSON file and link them to the existing
 * input program.
 * <p/>
 * This JSON - Transformation parser is a refactoring of the TransformationParser. It has a slightly improved exception
 * management
 * <p/>
 * Created by Simmon
 * Modified by Marcelino
 */
public class TransformationJsonParser {

    private Properties filterProperties;

    /**
     * Number of json tuples that we where unable to parse
     */
    private int countError = 0;

    /**
     * Transformations that we where able to parse
     */
    Collection<Transformation> transformations;

    /**
     * Input program to link the pase to
     */
    InputProgram inputProgram;

    private HashMap<Integer, String> failureDictionary;

    public TransformationJsonParser(boolean toSet, InputProgram inputProgram) {

        this.inputProgram = inputProgram;

        if (toSet)
            transformations = new HashSet<>();
        else
            transformations = new ArrayList<>();
    }

    public Collection<Transformation> parseDir(String dir) throws TransformationParserException {

        File file = new File(dir);
        int countFile = 0;
        Log.debug("transformation directory: {}", file.getAbsolutePath());



        for (File f : file.listFiles())
            if (f.getName().endsWith(".json")) {
                countFile++;
                Log.debug("Current number of transformation {}", transformations.size());
                Log.debug("parse tranformation file: " + f.getName());
                transformations.addAll(parseFile(f));
            }
        Log.debug("number of transformation file: {}", countFile);
        Log.debug("number of parse error : {}", countError);

        return transformations;
    }


    public Transformation parseUniqueTransformation(File file) throws TransformationParserException {
        try {
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
        } catch (IOException | JSONException e) {
            throw new TransformationParserException(e);
        }
    }

    public List<Transformation> parseFile(File file) throws TransformationParserException {

        try {
            BufferedReader br = null;
            StringBuilder sb = null;
            try {
                br = new BufferedReader(new FileReader(file));
                sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line);
                    line = br.readLine();
                }
                if (sb.length() == 0)
                    return new ArrayList<>();
            } finally {
                if (br != null) br.close();
            }

            JSONArray array = null;
            try {
                array = new JSONArray(sb.toString());
            } catch (JSONException e) {
                if (e.toString().contains("A JSONArray text must start with '['")) {
                    array = new JSONObject(sb.toString()).getJSONArray("transformations");
                }
            }

            parseFailureDictionay(array);

            ArrayList<Transformation> list = new ArrayList<Transformation>();

            for (int i = 0; i < array.length(); i++) {
                try {
                    JSONObject jsonObject = array.getJSONObject(i);
                    if (filter(jsonObject)) {
                        Transformation t = parseTransformation(jsonObject);
                        list.add(t);
                    }
                } catch (TransformationParserException e) {
                    Log.warn("Unable to parse transformation " + i);
                    e.printStackTrace();
                }
            }

            return list;
        } catch (IOException | JSONException e) {
            throw new TransformationParserException(e);
        }

    }

    /**
     * Filter by the given properties to avoid reading every transformation, wich can be potentially slow
     *
     * @param o Object to be filtered
     * @return
     */
    protected boolean filter(JSONObject o) {
        try {
            if (o.has("failureDictionary")) return false;
            if (getFilterProperties() == null) return true;

            for (Object k : getFilterProperties().keySet()) {
                String p = (String) k;
                if (!o.has(p) || !(getFilterProperties().getProperty(p).contains(o.get(p).toString()))) {
                    return false;
                }
            }
            return true;
        } catch (JSONException e) {
            return false;
        }
    }

    protected JSONObject getObject(JSONArray array, int index) {
        try {
            return array.getJSONObject(index);
        } catch (JSONException e) {
            return null;
        }
    }


    /**
     * Tries to get the type of a transformation
     *
     * @param jsonObject JSONOBject Containing the transformation
     * @return A string with the type of the transformation
     * @throws JSONException
     */
    /*
    private String tryToGetType(JSONObject jsonObject) throws JSONException {
        String type = "";
        try {
            type = jsonObject.getString("type");
        } catch (JSONException e) {

            if  ( e.getMessage().contains("[\"type\"] not found") ) {

                if ( jsonObject.has("name") ) {
                    String name = jsonObject.getString("name");
                    if ( name.contains("replace") ||  name.contains("delete") ||  name.contains("add") ) {
                        return "adrStmt";
                    }
                    //OTHER TYPES BY NAMES GOES HERE!!!!
                } else { throw e; }

            } else { throw e; }
        }
        return type;
    } */
    public Transformation parseTransformation(JSONObject jsonObject) throws TransformationParserException {
        try {
            String type = jsonObject.getString("type");

            Transformation trans = null;

            if (type.equals("mutation"))
                trans = parseMutation(jsonObject);
            if (type.equals("adrStmt"))
                trans = parseStmt(jsonObject);
            if (type.equals("adrBytecode"))
                trans = parseBytecode(jsonObject);
            if (type.equals("cvl"))
                trans = parseCvl(jsonObject);
            if (type.equals("foo"))
                trans = parseOther(jsonObject);

            if (trans == null)
                throw new TransformationParserException("Unknown transformation type for " + jsonObject.toString());

            trans.setFailures(getFailures(jsonObject));
            trans.setStatus(jsonObject.getInt("status"));

            if (jsonObject.has("parent"))
                trans.setParent(parseTransformation(jsonObject.getJSONObject("parent")));

            return trans;
        } catch (JSONException e) {
            throw new TransformationParserException(e);
        }
    }

    protected Transformation parseOther(JSONObject jsonObject) throws JSONException, TransformationParserException {
        ShuffleStmtTransformation shuffle = new ShuffleStmtTransformation();
        shuffle.setTransformationPoint(getBlock(jsonObject.getString("transformationPoint")));

        int[] array = parseIntArray(jsonObject.getString("newStmtOrder"));
        boolean ordre = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                ordre = false;
                break;
            }
        }
        if (ordre)
            throw new TransformationParserException("");

        shuffle.buildNewOrder(array);

        return shuffle;
    }

    protected int[] parseIntArray(String newStmtOrder) throws JSONException {

        String[] tmp = newStmtOrder.substring(1, newStmtOrder.length() - 1).split(", ");
        int[] array = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++)
            array[i] = Integer.parseInt(tmp[i]);

        return array;
    }

    protected CtBlock getBlock(String positionObject) throws TransformationParserException {
        CtBlock o = null;

        for (CtElement object : inputProgram.getAllElement(CtBlock.class)) {
            String position = object.getParent(CtPackage.class).getQualifiedName()
                    + "." + object.getPosition().getCompilationUnit().getMainType().getSimpleName() + ":" + object.getPosition().getLine();
            if (position.equals(positionObject)) {
                o = (CtBlock) object;
                break;
            }
        }
        if (o == null) {
            throw new TransformationParserException("Cannot find block at position: " + positionObject);
        }
        return o;
    }

    protected Transformation parseCvl(JSONObject jsonObject) throws JSONException {
        String name = jsonObject.getString("name");
        CVLTransformation trans = null;

        if (name.equals("linkExistence"))
            trans = parseLinkExistence(jsonObject);
        if (name.equals("linkSubstitution"))
            trans = parseLinkSubstitution(jsonObject);
        if (name.equals("objectExistence"))
            trans = parseObjectExistence(jsonObject);
        if (name.equals("objectSubstitution"))
            trans = parseObjectSubstitution(jsonObject);


        trans.setTransformationPoint(getObject(jsonObject.getString("transformationPoint"), jsonObject.getString("nodeType")));
        return trans;
    }

    protected CtElement getObject(String positionObject, String objectType)
            throws JSONException {

        CtElement o = null;

        for (CtElement object : inputProgram.getAllElement(CtElement.class)) {

            String position = object.getParent(CtPackage.class).getQualifiedName()
                    + "." + object.getPosition().getCompilationUnit().getMainType().getSimpleName() + ":" + object.getPosition().getLine();
            if (position.equals(positionObject) && object.getClass().getSimpleName().equals(objectType)) {
                o = object;
                break;
            }
        }
        if (o == null) {
            throw new JSONException("");
        }
        return o;
    }

    protected CVLTransformation parseObjectExistence(JSONObject jsonObject) {
        ObjectExistence oe = new ObjectExistence();
        return oe;
    }

    protected CVLTransformation parseObjectSubstitution(JSONObject jsonObject) throws JSONException {
        ObjectSubstitution os = new ObjectSubstitution();
        os.setTransplant(getObject(jsonObject.getString("transplant"), jsonObject.getString("nodeType")));
        return os;
    }

    protected CVLTransformation parseLinkSubstitution(JSONObject jsonObject) throws JSONException {
        LinkSubstitution ls = new LinkSubstitution();

        String nodeType = jsonObject.getString("nodeType");
        if (nodeType.equals("CtClassImpl")) {
            String clName = jsonObject.getString("classOrInterfaceExistence");
            CtClass cl = (CtClass) getObject(jsonObject.getString("transformationPoint"), jsonObject.getString("nodeType"));
            List<CtTypeReference> set = new ArrayList<>();

            if (cl.getSuperclass() != null)
                set.add(cl.getSuperclass());
            set.addAll(cl.getSuperInterfaces());

            for (CtTypeReference ref : set) {
                if (clName.equals(ref.getPackage() + "." + ref.getSimpleName()))
                    ls.setClassOrInterfaceSubstitution(ref);
                break;
            }
        }

        ls.setTransplant(getObject(jsonObject.getString("transplant"), nodeType));
        return ls;
    }

    protected CVLTransformation parseLinkExistence(JSONObject jsonObject) throws JSONException {
        LinkExistence le = new LinkExistence();

        String nodeType = jsonObject.getString("nodeType");
        if (nodeType.equals("CtClassImpl")) {
            String clName = jsonObject.getString("classOrInterfaceExistence");
            CtClass cl = (CtClass) getObject(jsonObject.getString("transformationPoint"), jsonObject.getString("nodeType"));
            List<CtTypeReference> set = new ArrayList<>();

            if (cl.getSuperclass() != null)
                set.add(cl.getSuperclass());
            set.addAll(cl.getSuperInterfaces());

            for (CtTypeReference ref : set) {
                if (clName.equals(ref.getPackage() + "." + ref.getSimpleName()))
                    le.setClassOrInterfaceExistance(ref);
                break;
            }
        }
        return le;
    }

    protected Transformation parseMutation(JSONObject jsonObject) throws TransformationParserException {

        Transformation trans;

        try {
            String name = jsonObject.getString("name");

            if (name.equals("inlineConstant"))
                trans = parseInlineConstantMutation(jsonObject);
            else if (name.equals("returnValue"))
                trans = parseReturnValueMutation(jsonObject);
            else
                trans = parseBinaryOperatorMutation(jsonObject);
        } catch (JSONException e) {
            throw new TransformationParserException("Cannot parse mutation", e);
        }
        return trans;
    }

    protected Transformation parseStmt(JSONObject jsonObject) throws TransformationParserException {
        ASTTransformation trans = null;
        try {
            String name = jsonObject.getString("name");

            if (name.startsWith("replace"))
                trans = parseASTReplace(jsonObject);
            if (name.startsWith("add"))
                trans = parseASTAdd(jsonObject);
            if (name.equals("delete"))
                trans = parseASTDelete(jsonObject);

            trans.setName(jsonObject.getString("name"));
            String p = jsonObject.getJSONObject("transplantationPoint").getString("position");
            trans.setTransplantationPoint(findCodeFragment(jsonObject.getJSONObject("transplantationPoint")));
        } catch (JSONException e) {
            throw new TransformationParserException(e);
        }
        return trans;
    }

    protected Transformation parseBytecode(JSONObject jsonObject) throws TransformationParserException {

        String name;
        BytecodeTransformation trans = null;
        try {
            name = jsonObject.getString("name");

            if (name.equals("replace"))
                trans = parseBytecodeReplace(jsonObject);
            if (name.equals("add"))
                trans = parseBytecodeAdd(jsonObject);
            if (name.equals("delete"))
                trans = parseBytecodeDelete(jsonObject);


            trans.setOpcodeIndex(jsonObject.getInt("opcodeIndex"));
            trans.setMethodLocation(getMethod(jsonObject.getString("methodLocation")));
        } catch (JSONException e) {
            throw new TransformationParserException("Cannot find JSON data", e);
        }
        return trans;
    }

    protected Transformation parseBinaryOperatorMutation(JSONObject jsonObject) throws JSONException,
            TransformationParserException {

        String name = jsonObject.getString("name");
        BinaryOperatorMutation trans = null;
        if (name.equals("conditionalBoundary"))
            trans = new ConditionalBoundaryMutation();
        if (name.equals("math"))
            trans = new MathMutation();
        if (name.equals("negateConditional"))
            trans = new NegateConditionalMutation();
        if (name.equals("removeConditional"))
            trans = new RemoveConditionalMutation();

        CtBinaryOperator<?> p = null;
        Object jsonPosition = jsonObject.get("position");
        for (CtElement ret : inputProgram.getAllElement(CtBinaryOperator.class)) {
            String position = ret.getParent(CtPackage.class).getQualifiedName()
                    + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine();
            if (position.equals(jsonPosition)) {
                p = (CtBinaryOperator) ret;
                break;
            }
        }
        if (p == null) {
            throw new TransformationParserException("Cannot find binary operation mutation at " + jsonPosition);
        }
        trans.setTransformationPoint(p);
        return trans;
    }

    protected Transformation parseReturnValueMutation(JSONObject jsonObject) throws JSONException,
            TransformationParserException {
        ReturnValueMutation trans = new ReturnValueMutation();

        Object jsonPosition = jsonObject.get("position");
        CtReturn p = null;

        for (CtReturn<?> ret : inputProgram.getReturns()) {
            String position = ret.getParent(CtPackage.class).getQualifiedName()
                    + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine();
            if (position.equals(jsonPosition)) {
                p = ret;
                break;
            }
        }
        if (p == null) {
            throw new TransformationParserException("Cannot find return statement that matches position " + jsonPosition);
        }
        trans.setTransformationPoint(p);

        return trans;
    }

    protected Transformation parseInlineConstantMutation(JSONObject jsonObject) throws TransformationParserException {
        InlineConstantMutation trans = new InlineConstantMutation();

        Object jsonPos;
        try {
            jsonPos = jsonObject.get("position");
        } catch (JSONException e) {
            throw new TransformationParserException("Cannot find position data", e);
        }

        CtLocalVariable p = null;
        for (CtLocalVariable<?> ret : inputProgram.getInlineConstant()) {
            String position = ret.getParent(CtPackage.class).getQualifiedName()
                    + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine();
            if (position.equals(jsonPos)) {
                p = ret;
                break;
            }
        }

        if (p == null) {
            throw new TransformationParserException("Cannot find inline constant");
        }
        trans.setTransformationPoint(p);

        return trans;
    }


    protected BytecodeTransformation parseBytecodeDelete(JSONObject jsonObject) {
        return new BytecodeDelete();
    }

    protected BytecodeTransformation parseBytecodeAdd(JSONObject jsonObject) throws JSONException {
        BytecodeAdd trans = new BytecodeAdd();
        trans.setByteCodeToAdd(parseByteCode(jsonObject.getString("byteCodeToAdd")));
        return trans;
    }

    protected BytecodeTransformation parseBytecodeReplace(JSONObject jsonObject) throws JSONException {
        BytecodeReplace trans = new BytecodeReplace();
        try {
            trans.setByteCodeToReplace(parseByteCode(jsonObject.getString("byteCodeToReplace")));
        } catch (JSONException e) {

        }

        return trans;
    }

    protected ASTTransformation parseASTDelete(JSONObject jsonObject) {
        return new ASTDelete();
    }

    protected ASTTransformation parseASTAdd(JSONObject jsonObject) throws JSONException, TransformationParserException {
        ASTAdd trans = new ASTAdd();

        trans.setCodeFragmentToAdd(findCodeFragment(jsonObject.getJSONObject("transplant")));
        trans.setVarMapping(parseVariableMapping(jsonObject.getJSONObject("variableMapping")));

        return trans;
    }

    protected ASTTransformation parseASTReplace(JSONObject jsonObject) throws JSONException,
            TransformationParserException {
        ASTReplace trans = new ASTReplace();

        trans.setCodeFragmentToReplace(findCodeFragment(jsonObject.getJSONObject("transplant")));
        trans.setVarMapping(parseVariableMapping(jsonObject.getJSONObject("variableMapping")));

        return trans;
    }

    protected CodeFragment findCodeFragment(JSONObject jsonObject) throws TransformationParserException {

        CodeFragment cf = null;
        String position;

        try {
            position = jsonObject.getString("position");

            for (CodeFragment codeFragment : inputProgram.getCodeFragments()) {
                if (codeFragment.positionString().equals(position)) {
                    cf = codeFragment;
                    break;
                }
            }

            if (cf == null) {
                //Try a different aproach
                for (CodeFragment codeFragment : inputProgram.getCodeFragments()) {
                    position = position.split(":")[0];
                    if (codeFragment.positionString().startsWith(position)) {
                        String sourceCode = jsonObject.getString("sourceCode");
                        String cfSourceCode = codeFragment.equalString();
                        if (sourceCode.equals(cfSourceCode)) {
                            cf = codeFragment;
                            break;
                        }
                    }
                }
            }
        } catch (JSONException e) {
            throw new TransformationParserException(
                    "Unnable to obtain at least one field from JSON object " + jsonObject.toString(), e);
        }


        if (cf == null) {
            throw new TransformationParserException(
                    "Cannot find a code fragment that matches the current JSON object " + jsonObject.toString());
        }

        return cf;
    }

    protected Map<String, String> parseVariableMapping(JSONObject jsonObject) throws JSONException {
        Map<String, String> map = new HashMap<>();
        Iterator it = jsonObject.keys();
        while (it.hasNext()) {
            String key = it.next().toString();
            map.put(key, jsonObject.get(key).toString());
        }
        return map;
    }

    protected byte[] parseByteCode(String bytecodes) {
        String[] bytecode = bytecodes.substring(1, bytecodes.length() - 1).split(", ");
        byte[] tab = new byte[bytecode.length];
        for (int i = 0; i < tab.length; i++)
            tab[i] = Byte.parseByte(bytecode[i]);

        return tab;
    }

    /**
     * Obtains a javassist method of the given name
     *
     * @param name Name of the method
     * @return
     * @throws TransformationParserException
     */
    protected CtMethod getMethod(String name) throws TransformationParserException {
        for (CtMethod mth : inputProgram.getJavassistMethods()) {
            if (mth.getLongName().equals(name))
                return mth;
        }
        throw new TransformationParserException("Could not find javassist method " + name);
    }


    protected List<String> getFailures(JSONObject jsonObject) throws JSONException {
        List<String> list = new ArrayList<>();

        JSONArray array = jsonObject.getJSONArray("failures");
        for (int i = 0; i < array.length(); i++) {
            if (failureDictionary == null)
                list.add(array.getString(i));
            else
                list.add(failureDictionary.get(array.getInt(i)));
        }
        return list;
    }

    protected void parseFailureDictionay(JSONArray array) throws JSONException {
        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            if (object.has("failureDictionary")) {
                failureDictionary = new HashMap<>();
                JSONObject dico = object.getJSONObject("failureDictionary");
                Iterator it = dico.keys();
                while (it.hasNext()) {
                    String key = it.next().toString();
                    failureDictionary.put(dico.getInt(key), key);
                }
            }
        }
    }


    /**
     * Used to filter what properties in the JSON we want, making the processing faster.
     */
    public Properties getFilterProperties() {
        return filterProperties;
    }

    public void setFilterProperties(Properties filterProperties) {
        this.filterProperties = filterProperties;
    }

    public static void saveToFile(List<Transformation> transf, String fileName) throws JSONException, IOException {

        JSONArray a = new JSONArray();
        for ( Transformation t : transf ) {
            a.put(t.toJSONObject());
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
            a.write(fw);
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }
}
