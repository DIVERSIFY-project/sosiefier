package fr.inria.diversify.util;

import fr.ybonnel.csvengine.annotation.CsvColumn;
import fr.ybonnel.csvengine.annotation.CsvFile;

/**
 * Created by nharrand on 04/07/17.
 */
@CsvFile
public class StmtInfo {

    @CsvColumn("position")
    public String position;

    @CsvColumn("isCandidate")
    public String isCandidate;

    @CsvColumn("isCandidateDelete")
    public String isCandidateDelete;

    @CsvColumn("nbTrial")
    public String nbTrial;

    @CsvColumn("nbCompile")
    public String nbCompile;

    @CsvColumn("nbSosie")
    public String nbSosie;

    @CsvColumn("nbTest")
    public String nbTest;

    @CsvColumn("nbAssert")
    public String nbAssert;

    @CsvColumn("maxDeep")
    public String maxDeep;

    @CsvColumn("meanDeep")
    public String meanDeep;

    @CsvColumn("medianDeep")
    public String medianDeep;

    @CsvColumn("minDeep")
    public String minDeep;

    @CsvColumn("methodNameInTests")
    public String methodNameInTests;

    @CsvColumn("methodClassTargetByTests")
    public String methodClassTargetByTests;

    @CsvColumn("nbDiff")
    public String nbDiff;

    @CsvColumn("nbStaticDiff")
    public String nbStaticDiff;

    public int nbMutantSurvived = 0;
    public int nbMutantTried = 0;


    public String toString() {
        return "\"" + position + "\"" + "," +
                "\"" + isCandidate + "\"" + "," +
                "\"" + isCandidateDelete + "\"" + "," +
                nbTrial + "," +
                nbCompile + "," +
                nbSosie + "," +
                nbTest + "," +
                nbAssert + "," +
                maxDeep + "," +
                meanDeep + "," +
                medianDeep + "," +
                minDeep + "," +
                methodNameInTests + "," +
                methodClassTargetByTests + "," +
                nbDiff + "," +
                nbStaticDiff + "," +
                nbMutantSurvived + "," +
                nbMutantTried + "\n";
    }

    public static String header() {
        return "\"position\"" + "," +
                "\"isCandidate\"" + "," +
                "\"isCandidateDelete\"" + "," +
                "\"nbTrial\"" + "," +
                "\"nbCompile\"" + "," +
                "\"nbSosie\"" + "," +
                "\"nbTest\"" + "," +
                "\"nbAssert\"" + "," +
                "\"maxDeep\"" + "," +
                "\"meanDeep\"" + "," +
                "\"medianDeep\"" + "," +
                "\"minDeep\"" + "," +
                "\"methodNameInTests\"" + "," +
                "\"methodClassTargetByTests\"" + "," +
                "\"nbDiff\"" + "," +
                "\"nbStaticDiff\"" + "," +
                "\"nbMutantKilled\"" + "," +
                "\"nbMutantSurvived\"" + "\n";
    }

}
