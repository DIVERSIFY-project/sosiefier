package fr.inria.diversify.replace;


import org.apache.maven.cli.MavenCli;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 5/17/13
 * Time: 11:34 AM
 */
public class RunMaven extends  Thread {
    protected String directory;
    protected List<String> result;
    protected boolean compileError = false;
    protected boolean allTestRun = false;
    protected String lifeCycle;


    public RunMaven(String directory, String lifeCycle) {
        this.directory = directory;
        this.lifeCycle = lifeCycle;
    }


    public void run() {
        MavenCli cli = new MavenCli();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);

        try {
            cli.doMain(new String[]{lifeCycle}, directory, ps, ps);
            parseResult(os.toString());
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        ps.close();
    }

//
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

    protected void parseResult(String r) {
        result = new ArrayList<String>();
        boolean start = false;
        allTestRun = false;
        compileError= false;
        for (String s : r.split("\n")) {
            System.out.println(s);
            if (s.startsWith("[ERROR] COMPILATION ERROR"))
                compileError = true;
            if (s.startsWith("Tests in error:")) {
                start = true;
                allTestRun = true;
            }
            if (start && s.equals(""))
                start = false;
            if (!s.startsWith("Tests in error:") && start)
                result.add(s);
        }
        System.out.println("allTestRun "+ allTestRun+" "+result.isEmpty() + " "+ compileError);
        allTestRun = allTestRun || (result.isEmpty() && !compileError);
    }

    public List<String> getResult() {
        return result;
    }

    public boolean allTestRun() {
        return allTestRun;
    }

    public boolean getCompileError() {
        return compileError;
    }
}
