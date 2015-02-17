package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by marodrig on 05/08/2014.
 */
public class TransplantationPointCallCountInstrumenter extends AbstractLoggingInstrumenter<CtStatement> {

    protected Set<String> alreadyVisited;

    protected HashMap<String, LogPoint> elementsMap;

    private class LogPoint {
        //Code element in the log point
        CtCodeElement element;

        //A given index to identify the log point
        int index;

        //Transformations over the log point
        List<Transformation> transformations;

        LogPoint(CtCodeElement element, int index) {
            this.element = element;
            this.index = index;
            transformations = new ArrayList<>();
        }
    }

    public TransplantationPointCallCountInstrumenter(List<Transformation> transformations) {
        super(transformations);

        elementsMap = new HashMap<>();

        alreadyVisited = new HashSet<>();
        int k = 0;
        for (Transformation t : transformations) {
            if (t instanceof ASTTransformation) {
                ASTTransformation ast = (ASTTransformation) t;
                CtCodeElement element = ast.getTransplantationPoint().getCtCodeFragment();
                String s = element.getPosition().toString();
                if (!elementsMap.containsKey(s)) {
                    elementsMap.put(s, new LogPoint(element, k));
                    k++;
                }
                elementsMap.get(s).transformations.add(t);
            }
        }
    }

    @Override
    public boolean isToBeProcessed(CtStatement statement) {
        String s = statement.getPosition().toString();
        return elementsMap.containsKey(s) && !alreadyVisited.contains(s);
    }

    @Override
    public void process(CtStatement statement) {

        alreadyVisited.add(statement.getPosition().toString());

        CtElement e = statement;

        //Search for the parent block first
        //TODO: Hacer esto con un visitor

        boolean stop = false;
        while (stop == false) {

            try {
                CompilationUnit cu = e.getPosition().getCompilationUnit();
                String posId = elementsMap.get(e.getPosition().toString()).transformations.get(0).getIndex().toString();
                posId = idFor(posId, "POT");
                String probeStr = getLogName() + ".writeSourcePositionCall(\"" + posId + "\")";
                stop = true;
                if (e != null) {
                    if (e.getParent() instanceof CtClass) {
                        stop = true;
                    } else if (e instanceof CtBreak) {
                        cu.addSourceCodeFragment(new SourceCodeFragment(e.getPosition().getSourceStart(), probeStr + ";", 0));
                    } else if (e instanceof CtBlock) {
                        e = e.getParent();
                        stop = false;
                    } else if (e.getParent() instanceof CtBlock) {
                        int b = cu.beginOfLineIndex(e.getPosition().getSourceStart());
                        cu.addSourceCodeFragment(new SourceCodeFragment(b, probeStr + ";", 0));
                    } else if (e instanceof CtIf) {
                        CtExpression c = ((CtIf)e).getCondition();
                        cu.addSourceCodeFragment(new SourceCodeFragment(c.getPosition().getSourceStart(),
                                "(" + probeStr + "||", 0));
                        cu.addSourceCodeFragment(new SourceCodeFragment(c.getPosition().getSourceEnd() + 1, ")", 0));
                        //System.out.println("Parent if");
                    } else {
                        e = e.getParent();
                        stop = false;
                    }
                }
            } catch (NullPointerException np) {
                //I believe I should not do this. If we have no parent then parent is null...
                stop = true;
                Log.warn("Unable to process " + statement.toString());
            }
        }
    }


    public void writeIdMapToFile(String path) throws IOException {
        File file = new File(path);
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        JSONArray array = new JSONArray();

        for (Map.Entry<String, LogPoint> s : elementsMap.entrySet()) {
            JSONObject o = new JSONObject();
            try {
                o.put("index", s.getValue().index);
                o.put("code", s.getValue().element.toString());
                o.put("source_position", s.getKey());
                JSONArray transf = new JSONArray();
                for ( Transformation f : s.getValue().transformations ) {
                    JSONObject t = f.toJSONObject();
                    if ( t.has("transplantationPoint") ) {
                        t.remove("transplantationPoint");
                    }
                    transf.put(t);
                }
                o.put("transformations", transf);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
            array.put(o);
        }
        fw.write(array.toString());
        fw.close();
    }
}
