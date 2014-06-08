package fr.inria.diversify.diversification;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.coverage.ICoverageReport;

/**
 *
 * The InputProgram class encapsulates all the known information of the program being sosiefiecated
 *
 * Created by marcel on 6/06/14.
 */
public class InputProgram {

    /**
     *  List of all the code fragments extracted by Spoon of the input program
     */
    private CodeFragmentList codeFragments;

    /**
     * Coverage report for the input program
     */
    private ICoverageReport coverageReport;

    /**
     * Path to the source code of the input program
     */
    private String sourceCodeDir;

    /**
     * Path to the built classes
     */
    private String classesDir;

    /**
     * Path to the coverage information
     */
    private String coverageDir;

    /**
     *  Path to previous transformations made in this input program
     */
    private String previousTransformationsPath;

    /**
     * Number of transformations that we are going to attempt in every run of the diversificator
     */
    private int transformationPerRun;


    /**
     *  List of all the code fragments extracted by Spoon of the input program
     */
    public CodeFragmentList getCodeFragments() {
        return codeFragments;
    }

    /**
     *  List of all the code fragments extracted by Spoon of the input program
     */
    public void setCodeFragments(CodeFragmentList codeFragments) {
        this.codeFragments = codeFragments;
    }

    /**
     * Coverage report for the input program
     */
    public ICoverageReport getCoverageReport() {
        return coverageReport;
    }

    /**
     * Coverage report for the input program
     */
    public void setCoverageReport(ICoverageReport coverageReport) {
        this.coverageReport = coverageReport;
    }

    /**
     * Path to the source of the input program
     */
    public String getSourceCodeDir() {
        return sourceCodeDir;
    }

    public void setSourceCodeDir(String sourceCodeDir) {
        this.sourceCodeDir = sourceCodeDir;
    }

    /**
     *  Path to the know sosie information stored in file
     */
    public String getPreviousTransformationsPath() {
        return previousTransformationsPath;
    }

    public void setPreviousTransformationsPath(String path) {
        this.previousTransformationsPath = path;
    }

    /**
     * Number of transformations that we are going to attempt in every run of the diversificator
     */
    public int getTransformationPerRun() {
        return transformationPerRun;
    }

    public void setTransformationPerRun(int transformationPerRun) {
        this.transformationPerRun = transformationPerRun;
    }

    /**
     * Path to the built classes
     */
    public String getClassesDir() {
        return classesDir;
    }

    public void setClassesDir(String classesDir) {
        this.classesDir = classesDir;
    }

    /**
     * Path to the coverage information
     */
    public String getCoverageDir() {
        return coverageDir;
    }

    public void setCoverageDir(String coverageDir) {
        this.coverageDir = coverageDir;
    }
}
