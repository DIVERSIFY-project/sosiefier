package fr.inria.diversify.testamplification.harman;


import fr.inria.diversify.util.Log;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.data.ExecutionDataReader;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.SessionInfoStore;
import spoon.reflect.code.CtBlock;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;


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
            coverage.addAll(branchCoverageInfo(cl));
        }
        return coverage;
    }

    public List<Double> branchCoverageInfo(CtClass cl) {
        List<Double> coverage = new ArrayList<>();

        IClassCoverage classCoverage = null;
        if(!(cl == null || cl.getPackage() == null || cl.getPackage().getSignature() == null)) {
            String name =  cl.getPackage().getSignature().replace(".","/")+"/"+cl.getSimpleName();
            for (IClassCoverage cc : coverageBuilder.getClasses()) {
                if(name.equals(cc.getName())) {
                    classCoverage = cc;
                    break;
                }
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

    protected List<Double> initListFor(CtClass cl) {
        int begin = begin(cl);
        int end = end(cl);
        List<Double> list = new ArrayList<>(end - begin);
        for(int i = begin; i < end ; i++) {
            list.add(0d);
        }
        return list;
    }


    protected int begin(CtClass cl) {
        return cl.getPosition().getLine();
    }

    protected int end(CtClass cl) {
        return cl.getMethods().stream()
                .map(mth -> ((CtMethod) mth).getBody())
                .filter(body -> body != null)
                .mapToInt(body -> ((CtBlock) body).getPosition().getEndLine())
                .max()
                .orElse(begin(cl));

    }

    public String getFileName() {
        return executionDataFile.getName();
    }
}
