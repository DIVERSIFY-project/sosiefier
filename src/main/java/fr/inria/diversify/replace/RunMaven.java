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
    protected boolean compileError;
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

    protected void parseResult(String r) {
        result = new ArrayList<String>();
        boolean error = false;
        boolean start = false;
        for (String s : r.split("\n")) {
            System.out.println(s);
            if (s.startsWith("[ERROR]"))
                error = true;
            if (s.startsWith("Tests in error:"))
                start = true;
            if (start && s.equals(""))
                start = false;
            if (!s.startsWith("Tests in error:") && start)
                result.add(s);
        }
        if (result.isEmpty() && error)
            compileError = true;
    }

    public List<String> getResult() {
        return result;
    }

    public boolean getCompileError() {
        return compileError || result == null;
    }

//    public void run() {
//        System.out.println("run test in: " + directory);
//
//        Runtime r = Runtime.getRuntime();
//        Process p = null;
//        try {
//            p = r.exec("mvn -f " + directory + "/pom.xml test");
//        } catch (IOException e) {}
//        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
//
//
//        String line;
//        StringBuffer output = new StringBuffer();
//        try {
//            p.waitFor();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            while ((line = reader.readLine()) != null)
//                output.append(line + "\n");
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////        System.out.println(output+"\n\npid "+CLibrary.INSTANCE.getpid());
//        p.destroy();
//        parseResult(output.toString());
//    }
}
