package fr.inria.diversify.logger.exception;


import fr.inria.diversify.logger.graph.Graph;
import fr.inria.diversify.logger.logger.KeyWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 10:51
 */
public class ExceptionReader {
    Map<String, ExceptionPosition> exceptionPositionByTest;
    Map<String, String> idToMethod;
    String directory;

    public ExceptionReader(String directory) {
        this.directory = directory;
        exceptionPositionByTest = new HashMap<>();

    }

    protected Collection<ExceptionPosition> load() throws IOException {
        loadInfo();
        File dir = new File(directory);

        for(File file : dir.listFiles()) {
            if(file.isFile() && file.getName().startsWith("log")) {
                parseFile(file);
            }
        }
        return exceptionPositionByTest.values();
    }

    protected void parseFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> exceptions = new LinkedList();
        String currentTest = null;


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
                        if (currentTest != null) {
                            buildExceptionPosition(currentTest, exceptions);
                        }
                        currentTest = null;
                        exceptions.clear();
                        break;
                    case KeyWord.catchObservation:
                        exceptions.add(logEntry);
                        break;
                    case KeyWord.throwObservation:
                        exceptions.add(logEntry);
                        break;
                    default:
                        break;
                }
                logEntry = "";
            }
            if (logEntry.startsWith(KeyWord.testEndObservation) && currentTest != null) {
                buildExceptionPosition(currentTest, exceptions);
            }
        }
    }

    protected void buildExceptionPosition(String currentTest, List<String> exceptions) {
        ExceptionPosition exceptionPosition = getOrBuildExceptionPosition(currentTest);

        for(String exception : exceptions) {
            String[] split = exception.split(KeyWord.simpleSeparator);
            String methodName = idToMethod.get(split[2]);
            String localPosition = idToMethod.get(split[3]);
            String exceptionType = split[4];
            String exceptionValue = split[5];

            if(split[0].equals(KeyWord.catchObservation)) {
                exceptionPosition.addCatch(methodName, localPosition, exceptionType, exceptionValue);
            } else {
                exceptionPosition.addThrow(methodName, localPosition, exceptionType, exceptionValue);
            }
        }
    }

    protected ExceptionPosition getOrBuildExceptionPosition(String name) {
        if (!exceptionPositionByTest.containsKey(name)) {
            exceptionPositionByTest.put(name, new ExceptionPosition(name));
        }
        return exceptionPositionByTest.get(name);
    }

    protected void loadInfo() throws IOException {
        idToMethod = new HashMap<>();
        File infoFile = new File(directory + "/info");
        BufferedReader br = new BufferedReader(new FileReader(infoFile));

        String line = br.readLine();
        while (line != null) {
            if(line.startsWith("id")) {
                String[] split = line.split(";");
                idToMethod.put(split[1], split[2]);
            }
            line = br.readLine();
        }
    }

}
