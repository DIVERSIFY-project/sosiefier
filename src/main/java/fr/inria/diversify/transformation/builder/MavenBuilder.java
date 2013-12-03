package fr.inria.diversify.transformation.builder;


import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.maven.MavenInvoker;
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
        File failFastDir = new File(directory+"/"+ srcDir + "/fr/inria/diversify/transformation/builder");
        FileUtils.forceMkdir(failFastDir);
        FileUtils.copyFileToDirectory(new File("src/main/java/fr/inria/diversify/transformation/maven/FailFastListener.java"),failFastDir);
    }

    protected void runPrivate() {
        Log.debug("run maven");
        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile( new File( directory + "/pom.xml" ) );
        List<String> l = new ArrayList<String>();

        for(String phase: phases)
            l.add(phase);

        request.setGoals(l);

        MavenInvoker invoker = new MavenInvoker();
        //freebsd
        File mvnHome = new File("/usr/local/share/java/maven3");
        if(!mvnHome.exists())
            //ubuntu
            mvnHome = new File("/usr/share/maven");
        if(!mvnHome.exists())
            //osx
            mvnHome = new File("/usr/local/Cellar/maven/3.1.1/libexec/");

        invoker.setMavenHome(mvnHome);
        invoker.setTimeOut(timeOut);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(os);
        PrintStreamHandler psh = new PrintStreamHandler(stream, true);
        invoker.setOutputHandler(psh);
        invoker.setErrorHandler(psh);
        try {
            invoker.execute(request);
            if(clojureTest)
                parseClojureResult(os.toString());
            else
                parseResult(os.toString());

        } catch (MavenInvocationException e) {
            Log.debug("Error in run Maven",e);
        }
        try {
            stream.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void parseResult(String r) {
        Pattern pattern = Pattern.compile("Tests run: (\\d+), Failures: (\\d+), Errors: (\\d+), Skipped: (\\d+)");
        Matcher matcher = null;
        boolean result = false;

        for (String s : r.split("\n")) {
            Log.debug(s);
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
            Log.debug(s);
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
}
