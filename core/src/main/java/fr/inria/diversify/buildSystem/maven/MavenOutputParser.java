package fr.inria.diversify.buildSystem.maven;

import fr.inria.diversify.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by marodrig on 03/07/2014.
 */
public class MavenOutputParser {

    //List of test that failed during the compilation
    private List<String> failedTest;

    //List of compilation errors
    private List<String> compilationErrors;

    //Last compilation status
    private int status = -3;

    //Indicates if they where compile errors
    private boolean compileError;

    public boolean hasDeviated = false;


    //Errors we don't mind about
    private List<String> acceptedErrors;

    public MavenOutputParser() {
        status = -3;
        compilationErrors = new ArrayList<>();
        acceptedErrors = new ArrayList<>();
        failedTest = new ArrayList<>();
    }

    /**
     * Parse an output
     *
     * @param output Output
     * @param regex  Regex to split the string
     * @return 0 if locate success, -1 if test fails, -2 compilation error, -3 nothing parsed, -4 parsing error
     */
    public int parse(String output, String regex) {
        return parse(output.split(regex));
    }

    /**
     * Parse an output
     *
     * @param output lines of compilation
     * @return 0 if locate success, -1 if test fails, -2 compilation error, -3 nothing parsed, -4 parsing error
     */
    public int parse(String[] output) {
        Pattern failedTestPattern = Pattern.compile("(\\w+)\\(((\\w+\\.)*\\w+)\\)\\s+Time elapsed:\\s+((\\d+\\.)?\\d+)\\s+sec\\s+<<<\\s+((FAILURE)|(ERROR))!");
        Pattern deviationPattern = Pattern.compile(".*\\[OFF TRACK\\].*");


        List<String> resultFailedTests = new ArrayList<>();
        boolean addToFailedTest = false;

        setCompileError(false);
        status = -3;

        for (int i = 0; i < output.length && getCompileError() == false; i++) {
            String s = output[i];
            Matcher m = failedTestPattern.matcher(s);
            boolean matches = m.find();
            if (matches) {
                this.failedTest.add(m.group(2) + "." + m.group(1));
            }
            Matcher mDev = deviationPattern.matcher(s);
            boolean matchesmDev = mDev.find();
            if (matchesmDev) {
                this.hasDeviated = true;
            }

            if(addToFailedTest) {
                resultFailedTests.add(s);
            }
            if(s.contains("Failed tests:")) {
                addToFailedTest = true;
                resultFailedTests.add(s.substring("Failed tests:".length(), s.length()));
            }
            if(s.contains("Tests in error:")) {
                addToFailedTest = true;
//                resultFailedTests.add(s.substring("Failed tests:".length(), s.length()));
            }
            if(s.contains("Tests run:")  || s.isEmpty()) {
                addToFailedTest = false;
            }

            //If we find a compile error there is no need for parsing more output
            if (s.contains("[ERROR] COMPILATION ERROR")) {
                setCompileError(true);
                status = -2;
            } else if (s.contains("[INFO] BUILD FAILURE")) {
                if(!acceptedErrors.isEmpty()) {
                    failedTest.removeAll(acceptedErrors);
                    if(failedTest.isEmpty()) {
                        status = 0;
                    }
                } else {
                    status = -1;
                }
            } else if ( s.contains("[INFO] BUILD SUCCESS") ) {
                status = 0;
            }
        }
        if((status == 0) && (this.hasDeviated)) status = 1;

        //We assume that if no explicit Build success message was issue something really wrong happened
        if ( status == -3 ) {
            status = -2;
        }
        return status;
    }

    /**
     * Indicates if they where compile errors
     *
     * @return True if there where compile errors
     */
    public boolean getCompileError() {
        return compileError;
    }

    public void setCompileError(boolean compileError) {
        this.compileError = compileError;
    }

    /**
     * Errors found during the parsing
     *
     * @return
     */
    public List<String> getCompileErrors() {
        return compilationErrors;
    }

    public void setErrors(List<String> errors) {
        this.compilationErrors = errors;
    }

//    /**
//     * Get errors that we don't mind about
//     *
//     * @return
//     */
//    public List<String> getAcceptedErrors() {
//        return acceptedErrors;
//    }

    public void setAcceptedErrors(List<String> acceptedErrors) {
        this.acceptedErrors = acceptedErrors;
    }

    /**
     * Return the status of the parser
     *
     * @return
     */
    public int getStatus() {
        return status;
    }

    public List<String> getFailedTests() {
        return failedTest;
    }
}
