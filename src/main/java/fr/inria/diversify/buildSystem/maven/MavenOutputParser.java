package fr.inria.diversify.buildSystem.maven;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by marodrig on 03/07/2014.
 */
public class MavenOutputParser {

    //List of test that failed during the compilation
    private List<String> failedTest;

    //List of compilation errors
    private List<String> compilationErrors;

    //Last compilation status
    private int lastStatus = -3;

    /**
     * Parse an output
     * @param output Output
     * @param regex Regex to split the string
     * @return 0 if build success, -1 if test fails, -2 compilation error, -3 nothing parsed, -4 parsing error
     */
    public int parse(String output, String regex) {
        return parse(output.split(regex));
    }

    /**
     * Parse an output
     * @param output lines of compilation
     * @return 0 if build success, -1 if test fails, -2 compilation error, -3 nothing parsed, -4 parsing error
     */
    public int parse (String[] output) {
        throw new NotImplementedException();
    }

}
