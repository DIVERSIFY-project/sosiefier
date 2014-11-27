package fr.inria.diversify;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.transformation.ast.ASTReplace;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtCodeElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * The JSON file generator takes two Spoon.CtCodeFragment as input and turn them into a JSON format that can be
 * understood by the TestEye plugin
 * <p/>
 * Created by marodrig on 27/11/2014.
 */
public class TestEyeFileGenerator {

    private ArrayList<CtCodeElement> replaced;

    private ArrayList<CtCodeElement> replacement;

    public TestEyeFileGenerator() {
        replaced = new ArrayList<>();
        replacement = new ArrayList<>();
    }

    /**
     * Sets a list of replaced and replacement fragments. Element the i-th element of the replaced list will be replaced
     * with the i-th of the replacement list.
     * <p/>
     * Both list must be the same size, otherwise a IllegalArgumentException will be thrown
     */
    public void addAllPairs(Collection<CtCodeElement> replaced, Collection<CtCodeElement> replacement) {
        if (replaced.size() != replacement.size()) throw new IllegalArgumentException("List sizes mistmatch");
        this.replaced.addAll(replaced);
        this.replacement.addAll(replacement);
    }

    /**
     * Add a pair of elements
     * @param replaced Element to be replaced
     * @param replacement Replacement
     */
    public void addPairs(CtCodeElement replaced, CtCodeElement replacement) {
        this.replaced.add(replaced);
        this.replacement.add(replacement);
    }

    /**
     * Persist a element in our format
     * @param element element to persist
     * @return A JSON object
     */
    private JSONObject elementToJSON(CtCodeElement element) throws JSONException {
        String pos = element.getPosition().getCompilationUnit().getMainType().getQualifiedName() + ":" + element.getPosition().getLine();
        CodeFragmentEqualPrinter p = new CodeFragmentEqualPrinter(element.getPosition().getCompilationUnit().getFactory().getEnvironment());
        element.accept(p);
        String source = p.toString();
        JSONObject tp = new JSONObject();
        tp.put("position", pos);
        tp.put("type", element.getClass().getSimpleName());
        tp.put("sourceCode", source);
        return tp;
    }

    /**
     * Turns the list of replaces and replacements into the TestEye format JSONArray
     *
     * @return
     */
    public JSONArray toJSON() throws JSONException {
        int i = 0;
        JSONArray result = new JSONArray();
        Iterator<CtCodeElement> replacedIt = replaced.iterator();
        Iterator<CtCodeElement> replacementIt = replacement .iterator();
        while (replacedIt.hasNext()) {
            JSONObject tp = elementToJSON(replacedIt.next());
            JSONObject t = elementToJSON(replacementIt.next());
            i++;
            JSONObject object = new JSONObject();
            object.put("type", "adrStmt");//This field is "sosie specific"
            object.put("name", "replace");//This field is "sosie specific"
            object.put("tindex", i);//ID of the transformation.
            object.put("transplantationPoint", tp);//replaced code
            object.put("transplant", t);//replacement.
            result.put(object);
        }
        return result;
    }

    /**
     * Save the JSON Array into a file
     * @param fileName path where the file is going to be saved.
     */
    public void saveToFile(String fileName) throws IOException, JSONException {
        FileWriter file = new FileWriter(fileName);
        toJSON().write(file);
        file.flush();
        file.close();
    }
}
