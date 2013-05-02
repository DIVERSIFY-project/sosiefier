package fr.inria.diversify.fr.inria.diverfy.runtest;


import fr.inria.diversify.statement.Statement;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.data.ExecutionDataReader;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.SessionInfoStore;
import spoon.reflect.declaration.CtSimpleType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class CoverageReport {

    CoverageBuilder coverageBuilder;
    private final File executionDataFile;
    private final File classesDirectory;

    private ExecutionDataStore executionDataStore;
    private SessionInfoStore sessionInfoStore;


    public CoverageReport(String classesDir, String jacocoFile) {
        System.out.println(classesDir);
        this.executionDataFile = new File(jacocoFile);

        this.classesDirectory = new File(classesDir);
    }


    public void create() throws IOException {
        loadExecutionData();
        coverageBuilder = analyzeStructure();
//       printResult(coverageBuilder);
    }


    private void loadExecutionData() throws IOException {
        final FileInputStream fis = new FileInputStream(executionDataFile);
        final ExecutionDataReader executionDataReader = new ExecutionDataReader(
                fis);
        executionDataStore = new ExecutionDataStore();
        sessionInfoStore = new SessionInfoStore();

        executionDataReader.setExecutionDataVisitor(executionDataStore);
        executionDataReader.setSessionInfoVisitor(sessionInfoStore);

        while (executionDataReader.read()) {}
        fis.close();
    }

    private CoverageBuilder analyzeStructure() throws IOException {
        final CoverageBuilder coverageBuilder = new CoverageBuilder();
        final Analyzer analyzer = new Analyzer(executionDataStore,
                coverageBuilder);

        analyzer.analyzeAll(classesDirectory);

        return coverageBuilder;
    }

//    public void printResult(CoverageBuilder coverageBuilder)  {
//        // Let's dump some metrics and line coverage information:
//        System.out.println( coverageBuilder.getClasses().size());
//        for (IClassCoverage cc : coverageBuilder.getClasses()) {
//            System.out.printf("Coverage of class %s%n", cc.getName());
//
//            printCounter("instructions", cc.getInstructionCounter());
//            printCounter("branches", cc.getBranchCounter());
//            printCounter("lines", cc.getLineCounter());
//            printCounter("methods", cc.getMethodCounter());
//            printCounter("complexity", cc.getComplexityCounter());
//
//            for (int i = cc.getFirstLine(); i <= cc.getLastLine(); i++) {
//                System.out.printf("Line %s: %s%n", Integer.valueOf(i),
//                        getColor(cc.getLine(i).getStatus()));
//            }
//        }
//    }
//    private void printCounter(final String unit, final ICounter counter) {
//        final Integer missed = Integer.valueOf(counter.getMissedCount());
//        final Integer total = Integer.valueOf(counter.getTotalCount());
//        System.out.printf("%s of %s %s missed%n", missed, total, unit);
//    }
//
//    private String getColor(final int status) {
//        switch (status) {
//            case ICounter.NOT_COVERED:
//                return "red";
//            case ICounter.PARTLY_COVERED:
//                return "yellow";
//            case ICounter.FULLY_COVERED:
//                return "green";
//        }
//        return "";
//    }

    public boolean statementCoverage(Statement stmt) {
        IClassCoverage classCoverage = null;
        for (IClassCoverage cc : coverageBuilder.getClasses()) {
            CtSimpleType<?> cl = stmt.getSourceClass();
            String name =  cl.getPackage().getSignature().replace(".","/")+"/"+cl.getSimpleName().toString();
            if(name.equals(cc.getName())) {
                classCoverage = cc;
                break;
            }
        }
        if(classCoverage == null)
            return false;
//        System.out.println(classCoverage.getName());
        boolean ret = false;
        for (int i = stmt.getStartLine(); i <= stmt.getEndLine(); i++) {
            if(classCoverage.getLine(i).getStatus() == 2 || classCoverage.getLine(i).getStatus() == 1) {
                ret = true;
                break;
            }
        }
        return ret;
    }
}
