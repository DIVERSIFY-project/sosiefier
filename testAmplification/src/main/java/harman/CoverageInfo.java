package harman;


import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.data.ExecutionDataReader;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.SessionInfoStore;
import spoon.reflect.declaration.CtClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 19/02/15.
 */
public class CoverageInfo {


    protected CoverageBuilder coverageBuilder;
    private final File executionDataFile;
    private final File classesDirectory;

    private ExecutionDataStore executionDataStore;
    private SessionInfoStore sessionInfoStore;


    public CoverageInfo(String classesDir, File jacocoFile) {
        this.executionDataFile = jacocoFile;
        this.classesDirectory = new File(classesDir);
    }


    public void create() throws IOException {
        loadExecutionData();
        coverageBuilder = analyzeStructure();
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

    protected CoverageBuilder analyzeStructure() throws IOException {
        final CoverageBuilder coverageBuilder = new CoverageBuilder();
        final Analyzer analyzer = new Analyzer(executionDataStore,
                                               coverageBuilder);

        analyzer.analyzeAll(classesDirectory);

        return coverageBuilder;
    }

    public List<Double> branchCoverageInfo(List<CtClass> classes) {
        List<Double> coverage = new ArrayList<>();
        for(CtClass cl : classes) {
            if(!(cl == null || cl.getPackage() == null || cl.getPackage().getSignature() == null)) {
                String name = cl.getPackage().getSignature().replace(".", "/") + "/" + cl.getSimpleName();
                coverage.addAll(branchCoverageInfo(name));
            }
        }
        return coverage;
    }

    public List<Double> branchCoverageInfo(String className) {
        List<Double> coverage = new ArrayList<>();

        IClassCoverage classCoverage = null;
        for (IClassCoverage cc : coverageBuilder.getClasses()) {
            if(className.equals(cc.getName())) {
                classCoverage = cc;
                break;
            }
        }
        if(classCoverage == null || classCoverage.getBranchCounter().getCoveredCount() == 0) {
            return coverage;
        }

        int begin = classCoverage.getFirstLine();
        int end = classCoverage.getLastLine();

        for(int i = begin; i < end ; i++) {
            ICounter branchCounter = classCoverage.getLine(i).getBranchCounter();
            if(branchCounter.getCoveredCount() + branchCounter.getMissedCount() != 0) {
                coverage.add(classCoverage.getLine(i).getBranchCounter().getCoveredRatio());
            }
        }

        return coverage;
    }

    public boolean isCoveredClass(String className) {
        return branchCoverageInfo(className).stream().mapToDouble(e -> e).sum() != 0;
    }

    public String getFileName() {
        return executionDataFile.getName();
    }
}
