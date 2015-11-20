package fr.inria.diversify.statistic;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.util.Log;
import spoon.reflect.declaration.CtClass;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 20/03/14.
 */
public class FailureMatrix {
    protected Collection<SingleTransformation> transformations;
    protected List<String> allTest;
    InputProgram inputProgram;

    public FailureMatrix(InputProgram inputProgram, Collection<SingleTransformation> transformations, String allTestFile) throws IOException {
        this.inputProgram = inputProgram;
        BufferedReader br = new BufferedReader(new FileReader(allTestFile));
        allTest = new ArrayList<>();

        String line = br.readLine();
        while (line != null) {
            allTest.add(line.replace("#","."));
            line = br.readLine();
        }

        this.transformations = transformations;
    }

    protected List<String> buildMatrix() {
        return buildMatrix(transformations);
    }

    protected List<String> buildMatrixForClass(String className) {
        return buildMatrix(transformations.stream()
                .filter(t -> t.classLocationName().equals(className))
                .collect(Collectors.toList()));
    }

    protected List<String> buildMatrix(Collection<SingleTransformation> transformations) {
        Map<String,Integer> map = new HashMap<>();

        for(SingleTransformation transformation: transformations) {
            if(transformation.getStatus() == -1) {
                StringBuilder sb = new StringBuilder();
                List<String> failures = transformation.getFailures();
                int count = 0;
                for(String test: allTest) {
                   if(failures.contains(test)){
                       sb.append(";1");
                       count++;
                   }
                   else
                       sb.append(";0");
                }
                String key = sb.toString();
                if(!map.containsKey(key))
                    map.put(key, 1);
                else {
                    if(transformation.getFailures().size() < count) {
                        Log.debug("halt");
                    }
                    map.put(key, map.get(key) + 1);
                }
            }
        }
        List<String> matrix = new ArrayList<String>(map.size());
        for(String key : map.keySet()) {
            matrix.add(map.get(key)+key);
        }
        return matrix;
    }

    public void printAllMatrix(String prefix) throws IOException {
        new File(prefix+"_matrix/").mkdirs();

        printMatrix(prefix+"_matrix/all.csv", buildMatrix());

        List<String> classes = inputProgram.getAllElement(CtClass.class).stream()
                .map(cl -> ((CtClass) cl).getQualifiedName())
                .collect(Collectors.toList());

        for(String className: classes) {
            printMatrix(prefix+"_matrix/"+className+".csv",buildMatrixForClass(className));
        }
    }



    protected void printMatrix(String fileName, List<String> matrix) throws IOException {
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
