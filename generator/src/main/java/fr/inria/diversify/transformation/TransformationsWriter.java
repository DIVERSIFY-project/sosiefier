package fr.inria.diversify.transformation;

import fr.inria.diversify.statistic.SystemInformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 9/12/13
 * Time: 2:03 PM
 */
public class TransformationsWriter {

    protected String directoryName;
    protected Collection<SingleTransformation> transformations;

    public TransformationsWriter() {}

    public TransformationsWriter(Collection<SingleTransformation> transformations, String directoryName) {
        this.transformations = transformations;
        this.directoryName = directoryName;
        File directory = new File(directoryName);

        if(!directory.exists()) {
            directory.mkdirs();
        }
    }

    public String writeGoodTransformation(String type) throws IOException, JSONException {
        Collection<SingleTransformation> goodTransformation = transformations.stream().
                filter(t -> t.getStatus() == 0 && (type == null || t.getType().equals(type)))
                .collect(Collectors.toList());

        String fileName;
        if(type == null)
            fileName = directoryName + "/good.json";
        else
            fileName = directoryName+ "/" + type + "_good.json";



        return writeTransformation(fileName,goodTransformation);
    }

    public String writeAllTransformation(String type) throws IOException, JSONException {
        Collection<SingleTransformation> transformation = transformations.stream().
                filter(t -> type == null || t.getType().equals(type))
                .collect(Collectors.toList());

        String fileName;
        if(type == null)
            fileName = directoryName + "all.json";
        else
            fileName = directoryName+ "/" + type + "_all.json";

        return  writeTransformation(fileName,transformation);
    }

    public String writeTransformation(String fileName, Collection<SingleTransformation> trans) throws IOException, JSONException {
        Log.debug("write {} transformation in file {}",trans.size(), fileName);

        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        JSONArray obj = new JSONArray();

        for (SingleTransformation transformation : trans) {
            try {
                obj.put(transformation.toJSONObject());
            } catch (Exception e) {
            }
        }
        JSONObject dico = new JSONObject();
        dico.put("failureDictionary",AbstractTransformation.failuresDico);
        obj.put(dico);
        obj.put(new SystemInformation().toJson());
        obj.write(out);
        out.newLine();
        out.close();
        return  fileName;
    }



}
