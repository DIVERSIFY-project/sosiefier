package fr.inria.diversify.diversification.builder;


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
        Pattern errorPattern = Pattern.compile("(\\w+)\\(((\\w+\\.)*\\w+)\\)\\s+Time elapsed:\\s+((\\d+\\.)?\\d+)\\s+sec\\s+<<<\\s+((FAILURE)|(ERROR))!");
        Matcher matcher = null;
        boolean result = false;
        boolean buildFailure = false;

        for (String s : r.split("\n")) {
            Log.debug(s);
            if (s.startsWith("[ERROR] COMPILATION ERROR"))
                compileError = true;
            if (s.startsWith("Results :")) {
                result = true;
            }
            //for junit
            if (s.startsWith("[INFO] BUILD FAILURE")) {
                buildFailure = true;
            }

            Matcher m = pattern.matcher(s);
            if (result && m.matches()) {
                matcher = m;
            }

            Matcher errorMatcher = errorPattern.matcher(s);
            if(errorMatcher.matches()) {
                errors.add(errorMatcher.group(2)+"."+errorMatcher.group(1));
            }

        }
        if(matcher != null) {
            if(acceptedErrors.containsAll(errors) && (Integer.parseInt(matcher.group(2)) + Integer.parseInt(matcher.group(3)) == 0))
                status = 0;
            else
                status = -1;
            allTestRun = !matcher.group(1).equals("0") ;
        }
        else {
            status = -2;
        }
        //for junit
        if(status == 0 && buildFailure)
            status = -1;
    }

    protected void parseClojureResult(String r) {
        Integer tmpFailure = null;
        for (String s : r.split("\n")) {
            Log.debug(s);
            if (s.startsWith("[ERROR] COMPILATION ERROR"))  {
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
        File failFastDir = new File(directory+"/"+ srcDir + "/fr/inria/diversify/diversification/builder");
        FileUtils.forceMkdir(failFastDir);
        FileUtils.copyFileToDirectory(new File("src/main/java/fr/inria/diversify/transformation/builder/FailFastListener.java"),failFastDir);

    }
}
