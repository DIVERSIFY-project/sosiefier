package fr.inria.diversify;


import fr.inria.diversify.logger.branch.CoverageReader;
import fr.inria.diversify.logger.branch.TestCoverage;
import fr.inria.diversify.logger.logvariable.LogTestReader;
import fr.inria.diversify.logger.logvariable.TestLog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

/**
 * User: Simon
 * Date: 18/05/15
 * Time: 11:27
 */
public class LoadLog {


    public static void main(String args[]) throws IOException {
        List<TestCoverage> result = loadCoverageInfo(args[0]);
        loadTestInfo(args[0]);
        write(result);
    }

    protected static List<TestCoverage> loadCoverageInfo(String logDir) throws IOException {
        CoverageReader reader = new CoverageReader(logDir);
        List<TestCoverage> result = reader.loadTest();

        return result;
    }


    protected static Collection<TestLog> loadTestInfo(String logDir) throws IOException {
        LogTestReader reader = new LogTestReader();
        Collection<TestLog> result = reader.loadLog(logDir);

        return result;
    }


    protected static void write(List<TestCoverage> testCoverage) throws IOException {
        PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter("coverage.csv")));

        fileWriter.append("test;class;method;branch;branchGlobalId;deep\n");
        for(TestCoverage tc : testCoverage) {
            tc.csv(fileWriter);
        }

        fileWriter.close();
    }
}
