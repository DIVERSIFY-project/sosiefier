package fr.inria.diversify;

import fr.inria.diversify.statistic.RunResults;
import org.json.JSONException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Collect all transformation incremental series from a the directory.
 * <p/>
 * Created by marodrig on 15/08/2014.
 */
public class CollectSeries {

    public static void main(String[] args) throws IOException, JSONException {
        /*
        Properties p = new Properties();

        p.load(new FileInputStream(args[0]));

        String path = p.getProperty("series.path");

        File series = new File(path);
        */
        File series = new File("C:\\MarcelStuff\\projects\\DIVERSE\\diversified-programs\\easymock\\multisosies-runs");


        //The result of the multi-sosie search are a set of run results.
        //A run result contains the set of single-sosies of the multi as well
        //as other information related to the multi. For instance, the incremental
        //series number, which indicates which sosie is parent of which.

        //Maximal number of elements found so far
        int maxSeriesSize = Integer.MIN_VALUE;

        //We will store the transformations ordered by their series
        HashMap<Integer, ArrayList<RunResults>> results = new HashMap<>();
        for (File f : series.listFiles()) {
            if (f.getName().endsWith(".json")) {
                RunResults r = new RunResults();
                r.loadFromFile(f);
                ArrayList<RunResults> list;
                if (results.containsKey(r.getIncrementalSeries())) {
                    list = results.get(r.getIncrementalSeries());
                } else {
                    list = new ArrayList<>();
                    results.put(r.getIncrementalSeries(), list);
                }
                list.add(r);
                if (maxSeriesSize < list.size()) maxSeriesSize = list.size();
            }
        }

        //Filter out the incomplete series
        HashMap<Integer, ArrayList<RunResults>> filtered = new HashMap<>();
        for (Map.Entry<Integer, ArrayList<RunResults>> e : results.entrySet()) {
            //If a series does have all the elements it means is not complete
            if (e.getValue().size() == maxSeriesSize) {
                filtered.put(e.getKey(), e.getValue());
            }
        }

    }
}
