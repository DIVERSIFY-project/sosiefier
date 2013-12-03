package fr.inria.diversify.transformation.builder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.inria.diversify.util.Log;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.apache.tools.ant.Target;

/**
 * User: Simon
 * Date: 02/12/13
 * Time: 11:54
 */
public class AntBuilder extends AbstractBuilder {

    public AntBuilder(String directory, String src) {
        super(directory,src);
    }

    protected void runPrivate(){
        File buildFile = new File(directory+"/build.xml");
        Project p = new Project();
        DefaultLogger consoleLogger = new DefaultLogger();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(os);
        consoleLogger.setErrorPrintStream(stream);
        consoleLogger.setOutputPrintStream(stream);
        p.addBuildListener(consoleLogger);
        p.setUserProperty("ant.file", buildFile.getAbsolutePath());
        p.init();
        ProjectHelper helper = ProjectHelper.getProjectHelper();
        p.addReference("ant.projectHelper", helper);
        helper.parse(p, buildFile);
        p.executeTargets(new Vector(Arrays.asList(phases)));

        parseResult(os.toString());
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
