package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationsWriter;
import org.json.JSONException;

import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 08/01/14
 * Time: 13:23
 */
public class Sampling {
    protected List<Transformation> transformations;

    public Sampling(Collection<Transformation> allTransformations, int sampleSize) {
        Random r = new Random();

        transformations = new LinkedList<Transformation>(allTransformations);
        while(transformations.size() > sampleSize) {
            transformations.remove(transformations.get(r.nextInt(transformations.size())));
        }
    }

    public void splitAndWrite(int splitSize,String fileName) throws IOException, JSONException {
        int borne = transformations.size()/splitSize;

        for(int i = 0; i < borne; i++) {
           writeSubList(i*splitSize, (i+1)*splitSize, fileName+i+".json");
        }
    }

    protected void writeSubList(int begin, int end, String fileName) throws IOException, JSONException {
        ArrayList<Transformation> list = new ArrayList<Transformation>(end - begin);
        for (int i = begin; i < end; i++) {
            list.add(transformations.get(i));
        }
        TransformationsWriter writer = new TransformationsWriter();
        writer.writeTransformation(fileName, list);

    }
}
