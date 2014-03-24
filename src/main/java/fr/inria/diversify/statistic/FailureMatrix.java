package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.Transformation;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 20/03/14.
 */
public class FailureMatrix {
    protected Collection<Transformation> transformations;
    protected List<String> allTest;

    public FailureMatrix(Collection<Transformation> transformations, String allTestFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(allTestFile));
        allTest = new ArrayList<String>();

        String line = br.readLine();
        while (line != null) {
            allTest.add(line.replace("#","."));
            line = br.readLine();
        }

        this.transformations = transformations;
    }

    protected List<String> buildMatrix() {
        Map<String,Integer> map = new HashMap<String,Integer>();


        for(Transformation transformation: transformations) {
            if(transformation.getStatus() == -1) {
                StringBuilder sb = new StringBuilder();
                List<String> failures = transformation.getFailures();
                for(String test: allTest) {
                   if(failures.contains(test))
                       sb.append(";1");
                   else
                       sb.append(";0");
                }
                String key = sb.toString();
                if(!map.containsKey(key))
                    map.put(key, 1);
                else
                    map.put(key, map.get(key) + 1);
            }
        }
        List<String> matrix = new ArrayList<String>(map.size());
        for(String key : map.keySet()) {
            matrix.add(map.get(key)+key);
        }
        return matrix;
    }

    public void printMatrix(String fileName) throws IOException {
        List<String> matrix = buildMatrix();

        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.append("nb");
        for(String test: allTest) {
            out.append(";"+test);
        }
        for (String line :matrix) {
            out.append("\n"+line);
        }
        out.close();
    }
}
