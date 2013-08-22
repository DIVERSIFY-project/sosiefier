package fr.inria.diversify.transformation;


import org.apache.maven.shared.invoker.*;
import org.hyperic.sigar.Sigar;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: Simon
 * Date: 5/17/13
 * Time: 11:34 AM
 */
public class RunMaven extends  Thread {
    protected String directory;
    protected boolean compileError = false;
    protected boolean allTestRun = false;
    protected String lifeCycle;
    protected Integer failure = null;
    protected Boolean clojureTest = false;


    public RunMaven(String directory, String lifeCycle) {
        this.directory = directory;
        this.lifeCycle = lifeCycle;
    }

    public RunMaven(String directory, String lifeCycle, boolean clojureTest) {
        this.directory = directory;
        this.lifeCycle = lifeCycle;
        this.clojureTest = clojureTest;
    }


//    public void run() {
//        MavenCli cli = new MavenCli();
//        ByteArrayOutputStream os = new ByteArrayOutputStream();
//        PrintStream ps = new PrintStream(os);
//
//        try {
//            cli.doMain(new String[]{"clean", lifeCycle}, directory, ps, ps);
//            if(clojureTest)
//                parseClojureResult(os.toString());
//            else
//                parseResult(os.toString());
//        } catch (OutOfMemoryError e) {
//            e.printStackTrace();
//        }
//        ps.close();
//    }

//
    public void run() {
        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile( new File( directory + "/pom.xml" ) );
        List<String> l = new ArrayList<String>();
        l.add("clean");
        l.add(lifeCycle);
        request.setGoals(l);

        Invoker invoker = new DefaultInvoker();
        //freebsd
        File mvnHome = new File("/usr/local/share/java/maven3");
        if(!mvnHome.exists())
            //osx and ubuntu
            mvnHome = new File("/usr/share/maven");

        invoker.setMavenHome(mvnHome);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStreamHandler psh = new PrintStreamHandler(new PrintStream(os), true);
        invoker.setOutputHandler(psh);
        invoker.setErrorHandler(psh);

        try {
            invoker.execute(request);
            if(clojureTest)
                parseClojureResult(os.toString());
            else
                parseResult(os.toString());

        } catch (MavenInvocationException e) {
            e.printStackTrace();
        }
    }

//    public void run() {
//        Runtime r = Runtime.getRuntime();
//        try {
//            Process p = r.exec("mvn -f " + directory + "/pom.xml " + lifeCycle);
//            p.waitFor();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
//            String line;
//            StringBuffer output = new StringBuffer();
//            while ((line = reader.readLine()) != null) {
//                output.append(line + "\n");
//                System.out.println(line);
//            }
//            reader.close();
//            parseResult(output.toString());
//    } catch (Exception e) {}
//
//    }
//    "compile-tests:"
//            "*** Some tests failed ***"

    protected void parseResult(String r) {
        Pattern pattern = Pattern.compile("Tests run: (\\d+), Failures: (\\d+), Errors: (\\d+), Skipped: (\\d+)");
        Matcher matcher = null;
        boolean result = false;

        for (String s : r.split("\n")) {
            System.out.println(s);
            if (s.startsWith("[ERROR] COMPILATION ERROR"))
                compileError = true;
            if (s.startsWith("Results :")) {
                result = true;
            }
            Matcher m = pattern.matcher(s);
            if (result && m.matches())
                matcher = m;
        }
        if(matcher != null) {
            failure = Integer.parseInt(matcher.group(2)) + Integer.parseInt(matcher.group(3));
            allTestRun = !matcher.group(1).equals("0") ;
        }
        else {
            failure = -2;
        }
    }

    protected void parseClojureResult(String r) {
        Integer tmpFailure = null;
        for (String s : r.split("\n")) {
            System.out.println(s);
            if (s.startsWith("[ERROR] COMPILATION ERROR"))  {
                tmpFailure = -2;
                compileError = true;
            }
            if (s.startsWith("compile-clojure:")) {
                tmpFailure = -1;
            }
            if (s.contains("test:")) {
                tmpFailure = 1;
                allTestRun = true;
            }
            if (s.contains("[INFO] BUILD SUCCESS")) {
                allTestRun = true;
                tmpFailure = 0;
            }
        }
        failure = tmpFailure;
    }


    public Integer getFailures() {
        return failure;
    }

    public boolean allTestRun() {
        return allTestRun;
    }

    public boolean getCompileError() {
        return compileError;
    }


}
