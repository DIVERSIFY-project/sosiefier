package fr.inria.diversify.testamplification.branchcoverage.load;

import java.io.*;
import java.util.*;

/**
 * User: Simon
 * Date: 23/04/15
 * Time: 10:04
 */
public class CoverageReader {
    protected final Map<Integer, MethodCoverage> idToMethod;
    protected final String directory;


    public CoverageReader(String directory) {
        this.directory = directory;
        this.idToMethod = new HashMap<>();
    }

    public Coverage load() throws IOException {
        loadInfo();
        loadData();
        return new Coverage(getMethodCoverages());
    }


    public void loadData() throws IOException {
        File dir = new File(directory);

        for(File file : dir.listFiles()) {
            if(file.isFile() && file.getName().startsWith("log")) {
                parseCoverageFile(file);
            }
        }
    }

    protected void parseCoverageFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        while (line != null) {
            String[] split = line.split(" ");
            int id = Integer.parseInt(split[0]);
            MethodCoverage methodCoverage = idToMethod.get(id);
            methodCoverage.addPath(Arrays.copyOfRange(split, 1, split.length));
            line = br.readLine();
        }
    }

    public void loadInfo() throws IOException {
        File infoFile = new File(directory + "/info");
        BufferedReader br = new BufferedReader(new FileReader(infoFile));

        String line = br.readLine();
        while (line != null) {
            String[] split = line.split(" ");

            MethodCoverage methodCoverage = new MethodCoverage(split[1], Arrays.copyOfRange(split, 2, split.length));
            idToMethod.put(Integer.parseInt(split[0]), methodCoverage);

            line = br.readLine();
        }
    }

    protected Collection<MethodCoverage> getMethodCoverages()  {
        return idToMethod.values();
    }



}
