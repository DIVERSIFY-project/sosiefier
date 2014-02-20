package fr.inria.diversify.transformation;

import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 9/12/13
 * Time: 2:03 PM
 */
public class TransformationsWriter {

    protected String fileNamePrefix;
    protected Collection<Transformation> transformations;

    public TransformationsWriter() {}

    public TransformationsWriter(Collection<Transformation> transformations, String prefix) {
        this.transformations = transformations;
        fileNamePrefix = prefix;
    }

    public String writeGoodTransformation(String type) throws IOException, JSONException {
        List<Transformation> goodTransformation = new LinkedList<Transformation>();
        for (Transformation transformation : transformations) {
            if (transformation.getStatus() == 0 && (type == null || transformation.getType().equals(type))) {
                goodTransformation.add(transformation);
            }
        }
        String fileName;
        if(type == null)
            fileName = fileNamePrefix+"_good.json";
        else
            fileName = fileNamePrefix+ "_" + type + "_good.json";



        return writeTransformation(fileName,goodTransformation);
    }

    public String writeAllTransformation(String type) throws IOException, JSONException {
        List<Transformation> transformation = new LinkedList<Transformation>();
        for (Transformation t : transformations) {
            if (type == null || t.getType().equals(type)) {
                transformation.add(t);
            }
        }

        String fileName;
        if(type == null)
            fileName = fileNamePrefix+"_all.json";
        else
            fileName = fileNamePrefix+ "_" + type + "_all.json";

        return  writeTransformation(fileName,transformation);
    }

    public String writeTransformation(String fileName, Collection<Transformation> trans) throws IOException, JSONException {
        Log.debug("write {} transformation in file {}",trans.size(), fileName);
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        JSONArray obj = new JSONArray();
        for (Transformation transformation : trans) {
            try {
                obj.put(transformation.toJSONObject());
            } catch (Exception e) {
            }
        }
        obj.write(out);
//        out.write(obj.toString());
        out.newLine();
        out.close();
        return  fileName;
    }

}
