package fr.inria.diversify.buildSystem.maven;


import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.buildSystem.maven.MavenInvoker;
import org.apache.commons.io.FileUtils;
import org.apache.maven.shared.invoker.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: Simon
 * Date: 5/17/13
 * Time: 11:34 AM
 */
public class MavenBuilder extends AbstractBuilder {

    public MavenBuilder(String directory, String srcDir) throws IOException {
        super(directory, srcDir);
    }

    protected void runPrivate() {
        Log.debug("run maven");
        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile(new File(directory + "/pom.xml"));
        List<String> l = new ArrayList<String>();

        for (String phase : phases)
            l.add(phase);

        request.setGoals(l);

        MavenInvoker invoker = new MavenInvoker();
        //freebsd
        File mvnHome = new File("/usr/local/share/java/maven3");
        if (!mvnHome.exists())
            //ubuntu
            mvnHome = new File("/usr/share/maven");
        if (!mvnHome.exists())
            //osx
            mvnHome = new File("/usr/local/Cellar/maven/3.1.1/libexec/");

        if (!mvnHome.exists())
            mvnHome = new File(System.getenv("M2_HOME"));

        invoker.setMavenHome(mvnHome);
        invoker.setTimeOut(timeOut);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(os);
        PrintStreamHandler psh = new PrintStreamHandler(stream, true);
        invoker.setOutputHandler(psh);
        invoker.setErrorHandler(psh);
        try {
            invoker.execute(request);
            if (clojureTest)
                parseClojureResult(os.toString());
            else
                parseResult(os.toString());

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

    protected void parseResult(String r) {

        Pattern pattern = Pattern.compile("Tests run:\\s*(\\d+),\\s*Failures:\\s*(\\d+),\\s*Errors:\\s*(\\d+),\\s*Skipped:\\s*(\\d+)");
        Pattern errorPattern = Pattern.compile("(\\w+)\\(((\\w+\\.)*\\w+)\\)\\s+Time elapsed:\\s+((\\d+\\.)?\\d+)\\s+sec\\s+<<<\\s+((FAILURE)|(ERROR))!");

        boolean buildFailure = false;

        int testRuns = 0;
        int testFail = 0;

        compileError = false;

        for (String s : r.split("\n")) {
            Log.debug(s);

            //If we find a compile error there is no need for parsing more output
            if ( !compileError  ) {
                if (s.startsWith("[ERROR] COMPILATION ERROR"))
                    compileError = true;

                if (s.startsWith("[INFO] BUILD FAILURE")) {
                    buildFailure = true;
                }

                Matcher m = pattern.matcher(s);
                boolean found = m.find();
                if ( found )
                    Log.debug(s);
                if ( found ) {
                    testRuns += Integer.parseInt(m.group(1));
                    testFail += Integer.parseInt(m.group(2)) + Integer.parseInt(m.group(3));
                }

                Matcher errorMatcher = errorPattern.matcher(s);
                if (errorMatcher.matches()) {
                    errors.add(errorMatcher.group(2) + "." + errorMatcher.group(1));
                }
            }
        }

        if (compileError || (buildFailure && testRuns == 0)) {
            status = -2;
        } else if (buildFailure || testFail > 0) {
            status = -1;
        } else {
            status = 0;
        }
        if (acceptedErrors.containsAll(errors) && testFail == 0)
            status = 0;
    }


    protected void parseClojureResult(String r) {
        Integer tmpFailure = null;
        for (String s : r.split("\n")) {
            Log.debug(s);
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

    public void initPom(String newPomFile) throws Exception {
        super.initPom(newPomFile);
        File failFastDir = new File(directory + "/" + srcDir + "/fr/inria/diversify/buildSystem/builder");
        FileUtils.forceMkdir(failFastDir);
        FileUtils.copyFileToDirectory(new File("src/main/java/fr/inria/diversify/transformation/builder/FailFastListener.java"), failFastDir);

    }
}
