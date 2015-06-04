package fr.inria.diversify.logger.branch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 23/04/15
 * Time: 10:04
 */
public class CoverageReader {
    protected final String directory;


    public CoverageReader(String directory) {
        this.directory = directory;
    }


    public Coverage load() throws IOException {
        Map<Integer, MethodCoverage> idToMethod = loadInfo();
        loadData(idToMethod);
        return new Coverage(idToMethod.values());
    }

    public List<TestCoverage> loadTest() throws IOException {
        Map<Integer, MethodCoverage> idToMethod =  loadInfo();
        return loadTestData(idToMethod);
    }

    protected List<TestCoverage> loadTestData(Map<Integer, MethodCoverage> idToMethod) throws IOException {
        File dir = new File(directory);
        List<TestCoverage> testCoverages = new ArrayList<>();

        for(File file : dir.listFiles()) {
            if(file.isFile() && file.getName().startsWith("log")) {
                List<TestCoverage> tmp = parseTestCoverageFile(file, idToMethod);
                testCoverages = mergeTestCoverageList(testCoverages, tmp);
            }
        }

        return testCoverages;
    }

    protected List<TestCoverage> mergeTestCoverageList(List<TestCoverage> list1, List<TestCoverage> list2) {
        for(TestCoverage tc : list2) {
            TestCoverage find = list1.stream()
                    .filter(t -> t.testName.equals(tc.testName))
                    .findFirst()
                    .orElse(null);

            if(find == null) {
                list1.add(tc);
            } else {
                find.merge(find);
            }
        }

        return list1;
    }

    protected List<TestCoverage> parseTestCoverageFile(File file, Map<Integer, MethodCoverage> idToMethod) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<TestCoverage> testCoverages = new ArrayList<>();
        String currentTestCoverage = "";
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
                    case "TS":
                        currentTest = split[1];
                        currentTestCoverage = "";
                        resetIdMethod(idToMethod);
                        break;
                    case "TE":
                        if (currentTest != null) {
                            parseCoverage(currentTestCoverage, idToMethod);
                            testCoverages.add(new TestCoverage(currentTest, idToMethod));
                            currentTest = null;
                            resetIdMethod(idToMethod);
                        }
                        break;
                    case "P":
                        currentTestCoverage += logEntry + "\n";
                        break;
                    default:
                        break;
                }
                logEntry = "";
            }
            if(logEntry.startsWith("TE") && currentTest != null) {
                parseCoverage(currentTestCoverage, idToMethod);
                testCoverages.add(new TestCoverage(currentTest, idToMethod));
                currentTest = null;
                resetIdMethod(idToMethod);
            }
        }

        return testCoverages;
    }

    protected void resetIdMethod(Map<Integer, MethodCoverage> idToMethod) {

        for(Integer key : idToMethod.keySet()) {
            MethodCoverage mc = idToMethod.get(key);
            if(mc.allPath.size() != 0) {
                idToMethod.put(key, new MethodCoverage(key, mc.getMethodName(), mc.getAllBranch()));
            }
        }
    }

    public void loadData(Map<Integer, MethodCoverage> idToMethod) throws IOException {
        File dir = new File(directory);

        for(File file : dir.listFiles()) {
            if(file.isFile() && file.getName().startsWith("log")) {
                parseCoverageFile(file, idToMethod);
            }
        }
    }

    protected void parseCoverage(String data, Map<Integer, MethodCoverage> idToMethod)  {
        String[] lines = data.split("\n");

        for(String line : lines) {
            parseCoverageLine(line, idToMethod);
        }
    }

    protected void parseCoverageFile(File file, Map<Integer, MethodCoverage> idToMethod) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        String logEntry = "";
        while (line != null) {
            line = br.readLine();
            logEntry = logEntry + line;
            if (logEntry.endsWith("$$")) {
                logEntry = logEntry.substring(0, logEntry.length() - 2);
                if(logEntry.startsWith("P;")) {
                    parseCoverageLine(logEntry, idToMethod);
                }
                logEntry = "";
            }
        }
    }

    protected void parseCoverageLine(String line, Map<Integer, MethodCoverage> idToMethod) {
        String[] split = line.split(";");
        if(split.length != 1) {
            int methodId = Integer.parseInt(split[1]);
            int methodDeep = Integer.parseInt(split[2]);
            MethodCoverage methodCoverage = idToMethod.get(methodId);

            String[] path = Arrays.copyOfRange(split, 3, split.length);
             methodCoverage.addPath(methodDeep, path);
        }
    }

    public Map<Integer, MethodCoverage> loadInfo() throws IOException {
        Map<Integer, MethodCoverage> idToMethod = new HashMap<>();
        File infoFile = new File(directory + "/info");
        BufferedReader br = new BufferedReader(new FileReader(infoFile));

        String line = br.readLine();
        while (line != null) {
            if(!line.startsWith("id")) {
                String[] split = line.split(" ");
                Integer methodId = Integer.parseInt(split[0]);
                MethodCoverage methodCoverage = new MethodCoverage(methodId, split[1], Arrays.copyOfRange(split, 2, split.length));
                idToMethod.put(methodId, methodCoverage);
            }
            line = br.readLine();
        }

        return idToMethod;
    }
}
