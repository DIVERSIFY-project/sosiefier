package fr.inria.diversify.replace;

import org.apache.maven.cli.MavenCli;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 5/17/13
 * Time: 11:34 AM
 */
public class RunMavenTest extends Thread {
    protected String directory;
    protected List<String> result;
    protected boolean compileError;


    public RunMavenTest(String directory) {
        this.directory = directory;
    }

    public void run() {
        System.out.println("run test in: " + directory);
        MavenCli cli = new MavenCli();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);

        try {
            cli.doMain(new String[]{"test"}, directory, ps, ps);
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
            if (s.startsWith("[ERROR]"))
                error = false;
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
        return compileError;
    }

    protected void runTest2(String directory) throws IOException, ClassNotFoundException, InterruptedException {
        System.out.println("run test in: " + directory);

        Runtime r = Runtime.getRuntime();
        Process p = r.exec("mvn -f " + System.getProperty("user.dir") + "/" + "/pom.xml test");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));


        String line;
        StringBuffer output = new StringBuffer();
        while ((line = reader.readLine()) != null)
            output.append(line + "\n");

        p.exitValue();
        System.out.println(output);
        reader.close();

        p.destroy();
        parseResult(output.toString());
    }
}
