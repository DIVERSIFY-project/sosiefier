package fr.inria.diversify;

import fr.inria.diversify.statistic.RunResults;
import org.codehaus.plexus.util.FileUtils;
import org.json.JSONException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

        Properties p = new Properties();
        p.load(new FileInputStream(args[0]));

        String path = p.getProperty("series.path");
        File series = new File(path);

        String outputPath = p.getProperty("output.path");

        //File series = new File("C:\\MarcelStuff\\projects\\DIVERSE\\diversified-programs\\easymock\\multisosies-runs");
        //String outputPath = "C:\\MarcelStuff\\projects\\DIVERSE\\diversified-programs\\easymock\\complete-series";

        //The result of the multi-sosie search are a set of run results.
        //A run result contains the set of single-sosies of the multi as well
        //as other information related to the multi. For instance, the incremental
        //series number, which indicates which sosie is parent of which.

        //Maximal number of elements found so far
        int maxSeriesSize = Integer.MIN_VALUE;

        //We will store the transformations ordered by their series
        HashMap<Integer, ArrayList<File>> results = new HashMap<>();
        for (File f : series.listFiles()) {
            if (f.getName().endsWith(".json")) {
                RunResults r = new RunResults();
                r.loadFromFile(f);
                if (r.getStatus() == 0) {
                    ArrayList<File> list;
                    if (results.containsKey(r.getIncrementalSeries())) {
                        list = results.get(r.getIncrementalSeries());
                    } else {
                        list = new ArrayList<>();
                        results.put(r.getIncrementalSeries(), list);
                    }
                    list.add(f);
                    if (maxSeriesSize < list.size()) maxSeriesSize = list.size();
                }
            }
        }

        //Filter out the incomplete series
        int i = 0;
        for (ArrayList<File> e : results.values()) {
            //If a series does have all the elements it means is not complete
            if (e.size() == maxSeriesSize) {
                for (File f : e) {
                    FileUtils.copyFileToDirectory(f.getAbsolutePath(), outputPath);
                }
                if (i == 100) {
                    break;
                }
                i++;
            }
        }
    }
}
