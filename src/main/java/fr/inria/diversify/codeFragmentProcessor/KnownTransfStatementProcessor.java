package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtStatement;

import java.util.HashSet;
import java.util.Set;

public class KnownTransfStatementProcessor extends StatementProcessor {

    private Set<String> positions;
    private Set<String> classNames;
    private Set<String> source;

    /**
     * Process only the statements in the positions of the transplantation points and transplantations
     *
     * @param array
     */
    public KnownTransfStatementProcessor(JSONArray array) throws JSONException {
        positions = new HashSet<>();
        source = new HashSet<>();
        classNames = new HashSet<>();

        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            if (obj.has("transplant")) {
                String s = obj.getJSONObject("transplant").getString("position");
                if (!positions.contains(s)) {
                    positions.add(s);
                }
                String klass = s.split(":")[0];
                if (!classNames.contains(klass)) {
                    classNames.add(klass);
                }
                s = obj.getJSONObject("transplant").getString("sourceCode");
                if (!source.contains(s)) {
                    source.add(s);
                }
            }
            if (obj.has("transplantationPoint")) {
                String s = obj.getJSONObject("transplantationPoint").getString("position");
                if (!positions.contains(s)) {
                    positions.add(s);
                }
                String klass = s.split(":")[0];
                if (!classNames.contains(klass)) {
                    classNames.add(klass);
                }
                s = obj.getJSONObject("transplantationPoint").getString("sourceCode");
                if (!source.contains(s)) {
                    source.add(s);
                }
            }
        }
    }

    public void process(CtStatement element) {
        try {
            Statement stmt = new Statement(element);
            addCf(stmt);
        } catch (Exception e) {
            try {
                Log.debug("error in StatementProcessor.process with the statement: " + element, e);
            } catch (Exception ee) {
                Log.debug("error in StatementProcessor.process with the statement: ", e);
            }
        }
    }


    int count = 0;

    @Override
    public boolean isToBeProcessed(CtStatement e) {

        //String sourcePackage = e.getPosition().getCompilationUnit().getMainType().getPackage().getQualifiedName();
        String klass = e.getPosition().getCompilationUnit().getMainType().getQualifiedName();
        //klass = sourcePackage + "." + klass;
        String pos = klass + ":" + e.getPosition().getLine();

        if (positions.contains(pos)) {
            return true;
        } else if (classNames.contains(klass)) {
            try {
                count++;
                CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(e.getFactory().getEnvironment());
                e.accept(pp);
                if (source.contains(pp.toString().trim())) {
                    return true;
                }
            } catch (RuntimeException ex) {
                //Log.warn("Unable to process because " + ex.getMessage() + " " + count + " " + pos);
                return false;
            }
        }
        return false;
    }

}

