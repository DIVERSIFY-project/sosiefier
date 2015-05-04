package fr.inria.diversify.testamplification.branchcoverage.load;

import java.io.*;
import java.util.*;

/**
 * User: Simon
 * Date: 23/04/15
 * Time: 10:04
 */
public class CoverageReader {
//    protected final Map<Integer, MethodCoverage> idToMethod;
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
        while (line != null) {
            String[] split = line.split(" ");
            if(split.length == 1) {
                if(split[0].equals("TN")) {
                    if(currentTest != null) {
                        parseCoverage(currentTestCoverage, idToMethod);
                        testCoverages.add(new TestCoverage(currentTest, idToMethod));
                        currentTest = null;
                        resetIdMethod(idToMethod);
                    }
                }  else {
                    currentTest = split[0];
                    currentTestCoverage = "";
                    resetIdMethod(idToMethod);
                }
            } else {
                currentTestCoverage += line +"\n";
            }
            line = br.readLine();
        }

        return testCoverages;
    }

    protected void resetIdMethod(Map<Integer, MethodCoverage> idToMethod) {

        for(Integer key : idToMethod.keySet()) {
            MethodCoverage mc = idToMethod.get(key);
            if(mc.allPath.size() != 0) {
                idToMethod.put(key, new MethodCoverage(mc.getMethodName(), mc.getAllBranch()));
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
            String[] split = line.split(" ");
            if(split.length != 1) {
                int id = Integer.parseInt(split[1]);
                MethodCoverage methodCoverage = idToMethod.get(id);
                methodCoverage.addPath(Arrays.copyOfRange(split, 2, split.length));
            }
        }
    }

    protected void parseCoverageFile(File file, Map<Integer, MethodCoverage> idToMethod) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        while (line != null) {
            String[] split = line.split(" ");
            if(split.length != 1) {
                int id = Integer.parseInt(split[1]);
                MethodCoverage methodCoverage = idToMethod.get(id);
                methodCoverage.addPath(Arrays.copyOfRange(split, 2, split.length));
            }
            line = br.readLine();
        }
    }

    public Map<Integer, MethodCoverage> loadInfo() throws IOException {
        Map<Integer, MethodCoverage> idToMethod = new HashMap<>();
        File infoFile = new File(directory + "/info");
        BufferedReader br = new BufferedReader(new FileReader(infoFile));

        String line = br.readLine();
        while (line != null) {
            String[] split = line.split(" ");

            MethodCoverage methodCoverage = new MethodCoverage(split[1], Arrays.copyOfRange(split, 2, split.length));
            idToMethod.put(Integer.parseInt(split[0]), methodCoverage);

            line = br.readLine();
        }

        return idToMethod;
    }
}
