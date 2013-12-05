package fr.inria.diversify.transformation.builder;

import java.io.*;
import java.util.Arrays;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.inria.diversify.util.Log;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

/**
 * User: Simon
 * Date: 02/12/13
 * Time: 11:54
 */
public class AntBuilder extends AbstractBuilder {

    public AntBuilder(String directory, String src) {
        super(directory,src);
    }

    protected void runPrivate() {
//        File buildFile = new File(directory+"/build.xml");
//        Project p = new Project();
//        DefaultLogger consoleLogger = new DefaultLogger();
//        ByteArrayOutputStream os = new ByteArrayOutputStream();
//        PrintStream stream = new PrintStream(os);
//        consoleLogger.setErrorPrintStream(stream);
//        consoleLogger.setOutputPrintStream(stream);
//        p.addBuildListener(consoleLogger);
//        p.setUserProperty("ant.file", buildFile.getAbsolutePath());
//        p.init();
//        ProjectHelper helper = ProjectHelper.getProjectHelper();
//        p.addReference("ant.projectHelper", helper);
//        helper.parse(p, buildFile);
//        p.executeTargets(new Vector(Arrays.asList(phases)));
        Log.debug("run ant: sh script/runAnt.sh "+directory+ " "+"junit-all");
//        try {
//            Process process = Runtime.getRuntime().exec("sh script/runAnt.sh "+directory+ " "+"junit-all");
//            BufferedReader stream  = new BufferedReader( new InputStreamReader( process.getInputStream() ));
//             process.waitFor();
//            String line = stream.readLine();
//            String result = "";
//            while (line != null) {
//                Log.debug(line);
//                result += line;
//                line = stream.readLine();
//            }
//            parseResult(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        String[] command = {"sh", "script/runAnt.sh", directory,"junit-all"};
        ProcessBuilder probuilder = new ProcessBuilder( command );

        //You can set up your work directory
        probuilder.directory(new File(System.getProperty("user.dir")));

        Process process = null;
        try {
            process = probuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read out dir output
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;

        try {
            String result = "";
            while ((line = br.readLine()) != null) {
                result += line;
            }

            process.waitFor();
            parseResult(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void parseResult(String r) {
        Pattern patternCompileError = Pattern.compile("\\s*[javac] (\\d+) error");
        Pattern patternJunitError = Pattern.compile("\\s*[junit] Tests FAILED");
        Pattern patternJunitOK = Pattern.compile("\\s*BUILD SUCCESSFUL");
        for (String s : r.split("\n")) {
            Log.debug(s);
            Matcher m = patternCompileError.matcher(s);
            if (m.matches()) {
                compileError = true;
                break;
            }
            m = patternJunitError.matcher(s);
            if ( m.matches()) {
                failure = -2;
                allTestRun = true;
                break;
            }
            m = patternJunitOK.matcher(s);
            if ( m.matches()) {
                failure = 0;
                allTestRun = true;
                break;
            }
        }
    }
}
