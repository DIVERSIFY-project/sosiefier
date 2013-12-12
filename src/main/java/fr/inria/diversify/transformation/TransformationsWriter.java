package fr.inria.diversify.transformation;

import fr.inria.diversify.util.Log;
import org.json.JSONArray;

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

    public TransformationsWriter(List<Transformation> transformations, String prefix) {
        this.transformations = transformations;
        fileNamePrefix = prefix;
    }

    public String writeGoodTransformation(String type) throws IOException {
        List<Transformation> goodTransformation = new LinkedList<Transformation>();
        for (Transformation transformation : transformations) {
            if (transformation.numberOfFailure() == 0 && (type == null || transformation.getType().equals(type))) {
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

    public String writeBadTransformation(String type) throws IOException {
        List<Transformation> badTransformation = new LinkedList<Transformation>();
        for (Transformation transformation : transformations) {
            if (transformation.numberOfFailure() != 0 && (type == null || transformation.getType().equals(type))) {
                badTransformation.add(transformation);
            }
        }
        String fileName;
        if(type == null)
            fileName = fileNamePrefix+"_bad.json";
        else
            fileName = fileNamePrefix+ "_" + type + "_bad.json";

        return  writeTransformation(fileName,badTransformation);
    }

    public String writeAllTransformation(String type) throws IOException {
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


    protected String writeTransformation(String fileName, Collection<Transformation> trans) throws IOException {
        Log.debug("write {} transformation in file {}",trans.size(), fileName);
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        JSONArray obj = new JSONArray();
        for (Transformation transformation : trans) {
            try {
                obj.put(transformation.toJSONObject());
            } catch (Exception e) {
            }
        }
        out.write(obj.toString());
        out.newLine();
        out.close();
        return  fileName;
    }

}
