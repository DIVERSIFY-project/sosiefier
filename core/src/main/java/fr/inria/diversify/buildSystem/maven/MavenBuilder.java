package fr.inria.diversify.buildSystem.maven;


import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.util.Log;
import org.apache.maven.shared.invoker.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: Simon
 * Date: 5/17/13
 * Time: 11:34 AM
 */
public class MavenBuilder extends AbstractBuilder {


    public MavenBuilder(String directory) throws IOException {
        super(directory);
    }

    protected void runPrivate(String[] goals, boolean verbose) {
        output = null;
        if(goals == null) {
            goals = this.goals;
        }
        Log.debug("run maven, phase: {}, timeout {}", Arrays.toString(goals), timeOut);

        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile(new File(directory + "/pom.xml"));

        List<String> l = new ArrayList<String>();

        for (String phase : goals)
            l.add(phase);
        request.setLocalRepositoryDirectory(setting);
        request.setGoals(l);

        MavenInvoker invoker = new MavenInvoker();

        invoker.setMavenHome(getBuilderPath());
        invoker.setTimeOut(timeOut);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(os);
        PrintStreamHandler psh = new PrintStreamHandler(stream, true);
        invoker.setOutputHandler(psh);
        invoker.setErrorHandler(psh);
        try {
            invoker.execute(request);
            output = os.toString();
            if(verbose) {
                Log.debug(output);
            }
            if (getSaveOutputToFile()) { saveOutputToFile(output); }
            if (clojureTest) {
                parseClojureResult(output);
            } else {
                parseResult(output);
            }

        } catch (MavenInvocationException e) {
            Log.debug("Error in run Maven", e);
        }
        try {
            stream.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected File getBuilderPath() {
        if(builderPath != null) {
            return new File(builderPath);
        } else {
            //freebsd
            File mvnHome = new File("/usr/local/share/java/maven3");
            if (!mvnHome.exists()) {
                //ubuntu
                mvnHome = new File("/usr/share/maven-3.3.3");
            }
            if (!mvnHome.exists()) {
                //debian
                mvnHome = new File("/opt/maven");
            }
            if (!mvnHome.exists()) {
                //osx
                mvnHome = new File("/usr/local/Cellar/maven/3.3.9/libexec/");
            }
            return mvnHome;
        }
    }

    /**
     * Parse status from the maven output
     * @param r
     */
    protected void parseResult(String r) {
        //Save r to further analysis
        MavenOutputParser parser = new MavenOutputParser();
        parser.setAcceptedErrors(acceptedErrors);

        parser.parse(r, "\n");
//        errors = parser.getCompileErrors();
        failedTests = parser.getFailedTests();
        status = parser.getStatus();
    }

    protected void parseClojureResult(String r) {
        Integer tmpFailure = null;
        for (String s : r.split("\n")) {
            if (s.startsWith("[ERROR] COMPILATION ERROR")) {
                tmpFailure = -2;
                compileError = true;
            }
            if (s.startsWith("setCompile-clojure:")) {
                tmpFailure = -1;
            }
            if (s.contains("test:")) {
                tmpFailure = -1;
                allTestRun = true;
            }
            if (s.contains("[INFO] BUILD SUCCESS")) {
                allTestRun = true;
                tmpFailure = 0;
            }
        }
        status = tmpFailure;
    }
}
