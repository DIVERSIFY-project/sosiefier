package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.SingleTransformation;
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
    protected List<SingleTransformation> transformations;

    public Sampling(Collection<SingleTransformation> allTransformations, int sampleSize) {
        Random r = new Random();

        transformations = new LinkedList<SingleTransformation>(allTransformations);
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
        ArrayList<SingleTransformation> list = new ArrayList<SingleTransformation>(end - begin);
        for (int i = begin; i < end; i++) {
            list.add(transformations.get(i));
        }
        TransformationsWriter writer = new TransformationsWriter();
        writer.writeTransformation(fileName, list);

    }
}
