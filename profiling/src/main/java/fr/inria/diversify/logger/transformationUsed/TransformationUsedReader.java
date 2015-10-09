package fr.inria.diversify.logger.transformationUsed;


import fr.inria.diversify.logger.logger.KeyWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 08/09/15
 * Time: 10:51
 */
public class TransformationUsedReader {
    protected Map<Integer, String> methodDeep;
    protected Map<String, Set<String>> branchesUsedByTest;
    String directory;

    public TransformationUsedReader(String directory) {
        this.directory = directory;
        branchesUsedByTest = new HashMap<>();

    }

    public Map<String, Set<String>> load() throws IOException {
        File dir = new File(directory);

        for(File file : dir.listFiles()) {
            if(file.isFile() && file.getName().startsWith("log")) {
                parseFile(file);
            }
        }
        return branchesUsedByTest;
    }

    protected void parseFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String currentTest = null;
        methodDeep = new HashMap<>();

        String line = br.readLine();
        String logEntry = "";
        while (line != null) {
            line = br.readLine();
            logEntry = logEntry + line;
            if (logEntry.endsWith("$$")) {
                logEntry = logEntry.substring(0, logEntry.length() - 2);
                String[] split = logEntry.split(";");
                switch (split[0]) {
                    case KeyWord.testStartObservation:
                        currentTest = split[1];
                        break;
                    case KeyWord.testEndObservation:
                        currentTest = null;
                        break;
                    case KeyWord.methodCallObservation:
                        addMethodCall(logEntry);
                       // methodsCall.add(logEntry);
                        break;
                    case KeyWord.logTransformation:
                        addBranch(currentTest, logEntry);
                        break;
                    default:
                        break;
                }
                logEntry = "";
            }
        }

    }

    protected void addMethodCall(String logEntry) {
        String[] tmp = logEntry.split(";");
        Integer deep = Integer.parseInt(tmp[1]);
        methodDeep.put(deep, tmp[2]);
    }

    protected void addBranch(String currentTest, String logEntry) {
        if(!branchesUsedByTest.containsKey(currentTest)) {
            branchesUsedByTest.put(currentTest, new HashSet<>());
        }
        String[] tmp = logEntry.split(";");
        Integer deep = Integer.parseInt(tmp[1]);
        branchesUsedByTest.get(currentTest).add(methodDeep.get(deep) + "." + tmp[2]);
    }
}
