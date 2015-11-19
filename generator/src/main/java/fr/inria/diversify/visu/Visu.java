package fr.inria.diversify.visu;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by Simon on 13/03/14.
 */
public class Visu {
    int id = 0;
    String prefix;
    private InputProgram inputProgram;

    public Visu(String prefix, InputProgram inputProgram) {
        this.inputProgram = inputProgram;
        this.prefix = prefix;
        File file = new File(prefix);
        file.mkdirs();
    }

    protected Map<String, Set<SingleTransformation>> mapByPackage(Collection<SingleTransformation> transformations) {
        Map<String, Set<SingleTransformation>> map = new HashMap<>();

        for(SingleTransformation trans : transformations) {
            String className = trans.packageLocationName();
            if(!map.containsKey(className))
                map.put(className, new HashSet<>());
            map.get(className).add(trans);
        }
        return map;
    }

    protected Map<String, Set<SingleTransformation>> mapByPClass(Collection<SingleTransformation> transformations) {
        Map<String, Set<SingleTransformation>> map = new HashMap<>();

        for(SingleTransformation trans : transformations) {
            String className = trans.classLocationName().split("\\$")[0];
            if(!map.containsKey(className))
                map.put(className, new HashSet<>());
            map.get(className).add(trans);
        }
        return map;
    }

    public void writeJSON(Collection<SingleTransformation> transformations) throws Exception {
        JSONArray array = new JSONArray();

        Map<String, Set<SingleTransformation>> packages = mapByPackage(transformations);
        for(String p : packages.keySet()) {
            array.put(JSONPackage(p, packages.get(p)));
        }

        BufferedWriter out = new BufferedWriter(new FileWriter(prefix+".json"));
        out.write(array.toString());
        out.close();
    }

    JSONObject JSONPackage(String packageName, Set<SingleTransformation> transformations) throws Exception {
        JSONObject object = new JSONObject();
        object.put("name", packageName);

        Map<String, Set<SingleTransformation>> cl =  mapByPClass(transformations);
        JSONArray array = new JSONArray();
        for(String clName : cl.keySet()) {
            array.put(JSONClass(packageName, clName, cl.get(clName)));
        }
        object.put("classes", array);

        return object;
    }


    JSONObject JSONClass(String packageName, String className, Set<SingleTransformation> transformations) throws Exception {
        JSONObject object = new JSONObject();
        CtType cl = getClass(packageName, className);
        object.put("name", cl.getSimpleName());

        JSONArray array = new JSONArray();
        initCurrentFile(cl);
        List<SingleTransformation> trans = new ArrayList<>();
        int currentLine = -1;
        for(SingleTransformation transformation : sortTransformation(transformations)) {
            if(transformation.line() == currentLine)
                trans.add(transformation);
            else {
                if(!trans.isEmpty())
                    array.put(JSONLine(trans,currentLine));
                currentLine = transformation.line();
                trans = new ArrayList<>();
                trans.add(transformation);
            }
        }
        int size = getSize(cl);
        object.put("size", size - emptyLineBefore(size));
        object.put("transformation", array);

        return object;
    }



    protected List<SingleTransformation> sortTransformation(Set<SingleTransformation> transformations) {
        ArrayList l = new ArrayList(transformations);
        Collections.sort(l, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) ((SingleTransformation) o1).line()).compareTo(((SingleTransformation) o2).line());
            }
        });
        return l;
    }

    protected CtType getClass(String packageName, String className) {
        List<CtType> types = inputProgram.getAllElement(CtType.class);
        for(CtType cl : types) {
            try {
            if(cl.getPackage().getQualifiedName().endsWith(packageName) && cl.getQualifiedName().equals(className))
                return cl;
            }catch (Exception e ) {}
        }
        return null;
    }

    protected int getSize(CtType cl) throws IOException {
        BufferedReader out = new BufferedReader(new FileReader(cl.getPosition().getFile()));
        int count = 0;
        while (out.readLine() != null) {
            count++;
        }
        return count;
    }

    int currentPositionInFile;
    int currentEmptyLine;
    BufferedReader currentFile;
    Pattern singleLineComment = Pattern.compile("\\s*//.*");
    Pattern commentStart = Pattern.compile("\\s*/\\*.*");
    protected void initCurrentFile(CtType cl) throws FileNotFoundException {
        currentFile = new BufferedReader(new FileReader(cl.getPosition().getFile()));
        currentPositionInFile = 0;
        currentEmptyLine = 0;
    }

    protected int emptyLineBefore(int position) throws IOException {
        boolean comment = false;
        String line ;
        while (currentPositionInFile < position && (line = currentFile.readLine()) != null) {
            currentPositionInFile++;
            if(commentStart.matcher(line).matches())
                comment = true;
            if(line.contains("*/"))
                comment = false;
            if(line.isEmpty() || comment || singleLineComment.matcher(line).matches())
                currentEmptyLine++;
        }
        return currentEmptyLine;
    }

    protected JSONObject JSONLine(List<SingleTransformation> transformations, int position) throws Exception {
        Map<String, List<SingleTransformation>> map = new HashMap<>();

        JSONObject line = new JSONObject();
        line.put("position", position - emptyLineBefore(position) - 5);
        for(SingleTransformation trans : transformations) {
            String key = trans.getType()+":"+trans.getName();
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(trans);
        }
        JSONArray array = new JSONArray();
        line.put("trans", array);
        for(List<SingleTransformation> list : map.values()) {
            array.put(JSONTrans(list));
        }

        line.put("id",id);
        writeTransformationDetail(transformations,id,position);
        id++;
        return line;
    }

    protected void writeTransformationDetail(List<SingleTransformation> transformations, int id, int position) throws Exception {
        JSONObject detail = new JSONObject();
        detail.put("class",transformations.get(0).classLocationName());
        detail.put("package",transformations.get(0).packageLocationName());
        detail.put("id",id);
        detail.put("position",position);

        int notCompile = 0;
        int failTest = 0;
        int sosie = 0;
        JSONArray array = new JSONArray();
        detail.put("transformation", array);
        for (SingleTransformation trans : transformations) {
            array.put(transformationDetail(trans));
            if(trans.getStatus() == -2)
                notCompile++;
            else if(trans.getStatus() == -1)
                failTest++;
            else
                sosie++;
        }
        detail.put("notCompile", notCompile);
        detail.put("failTest",failTest);
        detail.put("sosie",sosie);

        BufferedWriter out = new BufferedWriter(new FileWriter(prefix+"_"+id+".json"));
        out.write(detail.toString());
        out.close();
    }

    protected JSONObject transformationDetail(SingleTransformation transformation) throws Exception {
        JSONObject detail = new JSONObject();
        detail.put("name",transformation.getName());
        detail.put("type",transformation.getType());
        detail.put("status", transformation.getStatus());

        try {
            detail.put("string",transformation.getTransformationString());
            } catch (Exception e) {
                Log.debug("");
        }

        return detail;
    }

    protected JSONObject JSONTrans(List<SingleTransformation> list) throws JSONException {
        JSONObject line = new JSONObject();
        line.put("name",list.get(0).getName());
        line.put("type",list.get(0).getType());
        int notCompile = 0;
        int failTest = 0;
        int sosie = 0;
        for (SingleTransformation trans : list) {
            if(trans.getStatus() == -2)
                notCompile++;
            else if(trans.getStatus() == -1)
                failTest++;
            else
                sosie++;
        }
        line.put("notCompile", notCompile);
        line.put("failTest",failTest);
        line.put("sosie",sosie);
        return line;
    }
}
