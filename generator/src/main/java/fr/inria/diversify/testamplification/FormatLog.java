package fr.inria.diversify.testamplification;

import fr.inria.diversify.util.Log;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Simon on 18/12/14.
 */
public class FormatLog {
    protected Map<String, List<Integer>> deepsByTest;
    protected Map<String, List<String>> numberOfTest;
    protected Map<String, Integer> numberOfTestExecuted;


    public FormatLog() {
        deepsByTest = new HashMap<>();
        numberOfTest = new HashMap<>();
        numberOfTestExecuted = new HashMap<>();
    }


    public static void main(String[] args) throws IOException {
        FormatLog formatLog = new FormatLog();
        formatLog.parseFile(args[0]);
        formatLog.writeResult(args[1]);
    }

    public void parseFile(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        while (line != null) {
            String name = line.split(";")[0];
            String originalName = originalName(name);
            if( line.split(";").length != 1) {
                List<Integer> deeps = parseDeep(line.split(";")[1]);

                if (!deepsByTest.containsKey(originalName)) {
                    Log.info(originalName);
                    deepsByTest.put(originalName, new ArrayList<>());
                    numberOfTest.put(originalName, new ArrayList<>());
                    numberOfTestExecuted.put(originalName, 0);
                }
                deepsByTest.get(originalName).addAll(deeps);
                numberOfTest.get(originalName).add(name);
                numberOfTestExecuted.put(originalName, numberOfTestExecuted.get(originalName) + 1);
            }
            line = br.readLine();
        }

    }

    public void writeResult(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        char separator = ';';

        out.append("test;call;meanDeep;medianDeep;nbOfExecution:nbOfClone\n");
        for(String test : deepsByTest.keySet()) {
            out.append(test);
            out.append(separator);

            out.append(deepsByTest.get(test).size()/numberOfTestExecuted.get(test)+"");
            out.append(separator);
            out.append(mean(deepsByTest.get(test))+"");
            out.append(separator);
            out.append(median(deepsByTest.get(test))+"");
            out.append(separator);
            out.append(numberOfTestExecuted.get(test)+"");
            out.append(separator);
            out.append(numberOfTest.get(test).size() + "");
            out.append("\n");
        }
        out.close();
    }

    protected List<Integer> parseDeep(String deeps) {
        return Stream.of(deeps.split(","))
                .map(string -> Integer.parseInt(string))
                .collect(Collectors.toList());
    }

    protected String originalName(String name) {
       return name.split("_")[0];
    }

    protected double mean(List<Integer> deeps) {
        if(deeps.size() != 0) {
            long sum = 0;
            for (Integer deep : deeps) {
                sum += deep;
            }
            return (double)sum / (double)deeps.size();
        }
        return 0;
    }

    protected int median(List<Integer> deeps) {
        if(deeps.size() != 0) {
            Collections.sort(deeps);
            int middle = deeps.size() / 2;
            return deeps.get(middle);
        }
        return 0;
    }
}
