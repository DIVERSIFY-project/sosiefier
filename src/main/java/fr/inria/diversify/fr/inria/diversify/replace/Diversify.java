package fr.inria.diversify.fr.inria.diversify.replace;

import fr.inria.diversify.fr.inria.diverfy.runtest.CoverageReport;
import fr.inria.diversify.fr.inria.diverfy.runtest.RunTest;
import fr.inria.diversify.statement.Statement;
import fr.inria.diversify.statistic.Statistic;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.JavaOutputProcessor;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 5/2/13
 * Time: 5:39 PM
 */
public class Diversify {


    protected String tmpDir;
    private List<Statement> statements;
    private Factory factory;
    protected CoverageReport coverageReport;
    List<String> classPath;

    public Diversify(List<Statement> statements, CoverageReport coverageReport, String testDirectory ) {
        this.coverageReport = coverageReport;
        this.statements = statements;
        this.factory = statements.get(0).getCtStatement().getFactory();
        this.tmpDir = "output";

        classPath = new ArrayList<String>();
        classPath.add(System.getProperty("user.dir")+"/"+tmpDir + "_diversify/");
        classPath.add(testDirectory);
    }

    public void run() {
        Statistic stat = new Statistic(statements);
        try {
            printJavaFile(tmpDir);
            printJavaFile(tmpDir + "_diversify");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Replace rp = new Replace(statements, stat.allStat().getUniqueStatementList(), coverageReport, tmpDir + "_diversify");

        rp.compile(new File(tmpDir + "_diversify"), factory);
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
            rp = new Replace(statements, stat.allStat().getUniqueStatementList(), coverageReport, tmpDir + "_diversify");
            try {
                rp.replace();

            } catch (Exception e) {
                System.out.println("erreur dans replace");
            }

            runTest("tests.AllTests");
            rp.restore();

        }
    }

    protected void runTest(String classNane) {

        try {
            RunTest runTest = new RunTest(classNane, classPath);
            runTest.run();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    protected void printJavaFile(String repository) throws IOException {
        ProcessingManager pm = new QueueProcessingManager(factory);
        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));

        pm.addProcessor(processor);
        pm.process();
    }

    public void setTmpDirectory(String tmp) {
        tmpDir = tmp;
    }
}
