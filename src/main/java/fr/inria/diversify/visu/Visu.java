package fr.inria.diversify.visu;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.DiversifyEnvironment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by Simon on 13/03/14.
 */
public class Visu {

    Map<String, Set<Transformation>> mapByPackage(Collection<Transformation> transformations) {
        Map<String, Set<Transformation>> map = new HashMap<String, Set<Transformation>>();

        for(Transformation trans : transformations) {
            String className = trans.packageLocationName();
            if(!map.containsKey(className))
                map.put(className, new HashSet<Transformation>());
            map.get(className).add(trans);
        }
        return map;
    }
    Map<String, Set<Transformation>> mapByPClass(Collection<Transformation> transformations) {
        Map<String, Set<Transformation>> map = new HashMap<String, Set<Transformation>>();

        for(Transformation trans : transformations) {
            String className = trans.classLocationName();
            if(!map.containsKey(className))
                map.put(className, new HashSet<Transformation>());
            map.get(className).add(trans);
        }
        return map;
    }

    public void writeJSON(String fileName, Collection<Transformation> transformations) throws JSONException, IOException {
        JSONArray array = new JSONArray();

        Map<String, Set<Transformation>> packages = mapByPackage(transformations);
        for(String p : packages.keySet()) {
            array.put(JSONPackage(p, packages.get(p)));
        }

        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.write(array.toString());
        out.close();
    }

    JSONObject JSONPackage(String packageName, Set<Transformation> transformations) throws JSONException, IOException {
        JSONObject object = new JSONObject();
        object.put("name", packageName);

        Map<String, Set<Transformation>> cl =  mapByPClass(transformations);
        JSONArray array = new JSONArray();
        for(String clName : cl.keySet()) {
            array.put(JSONClass(packageName, clName, cl.get(clName)));
        }
        object.put("classes", array);

        return object;
    }


    JSONObject JSONClass(String packageName, String className, Set<Transformation> transformations) throws JSONException, IOException {
        JSONObject object = new JSONObject();
        CtSimpleType cl = getClass(packageName, className);
        object.put("name", cl.getSimpleName());


        JSONArray array = new JSONArray();
        Set<String> set = new HashSet<String>();
        initCurrentFile(cl);
        for(Transformation transformation : sortTransformation(transformations)) {
            JSONObject t = new JSONObject();
            int position = transformation.line();
            t.put("position",position - emptyLineBefore(position));
            t.put("status",transformation.getStatus());
            t.put("name",transformation.getName());
            t.put("type",transformation.getType());
            if(!set.contains(t.toString())) {
                set.add(t.toString());
                array.put(t);
            }
        }
        int size = getSize(cl);
        object.put("size", size - emptyLineBefore(size));
        object.put("transformation", array);

        return object;
    }

    protected List<Transformation> sortTransformation(Set<Transformation> transformations) {
        ArrayList l = new ArrayList(transformations);
        Collections.sort(l, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer)((Transformation)o1).line()).compareTo(((Transformation)o2).line());
            }
        });
        return l;
    }

    protected CtSimpleType getClass(String packageName, String className) {
        for(CtElement elem : DiversifyEnvironment.getAllElement(CtSimpleType.class)) {
            CtSimpleType cl = (CtSimpleType) elem;
            try {
            if(cl.getPackage().getQualifiedName().endsWith(packageName) && cl.getQualifiedName().equals(className))
                return cl;
            }catch (Exception e ) {}
        }
        return null;
    }

    protected int getSize(CtSimpleType cl) throws IOException {
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
    protected void initCurrentFile(CtSimpleType cl) throws FileNotFoundException {
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

}
