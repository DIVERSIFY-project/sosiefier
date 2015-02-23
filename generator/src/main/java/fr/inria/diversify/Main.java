package fr.inria.diversify;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.util.GitUtils;
import fr.inria.diversify.util.Log;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.util.Random;

/**
 * Main program
 */
public class Main {

    /**
     * Entry point for the sosie-generator
     *
     * @param args Property file that contains all the input parameters
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception, InvalidSdkException {

        if(args[0].equals("git")) {
            try {
                initNbOfProcess();
                initPropertiesFile(args[1]);
            } catch (Exception e) {
                Log.error("Main ",e);
            }
        }
        else
            new DiversifyMain(args[0]);
        System.exit(0);
        suicide();
    }

    protected static void initPropertiesFile(String git) throws IOException, InterruptedException, GitAPIException {
        Log.info("clone the repository https://github.com/simonAllier/sosie-exp.git in {}", git);
        GitUtils gitUtils = new GitUtils(git);

        gitUtils.cloneRepo();

        Random r = new Random();
        int sleep = r.nextInt(600);
        Log.info("sleep {} seconds", sleep);
        Thread.sleep(sleep*1000);

        gitUtils.pull();

        String propertiesFile = gitUtils.getFirstPropertyFile();
        BufferedWriter out = new BufferedWriter(new FileWriter("propertiesFile"));
        out.write(propertiesFile);
        out.close();
    }

    protected static void initNbOfProcess() throws InterruptedException, IOException {
        Runtime r = Runtime.getRuntime();

        Process p = r.exec("cat /proc/cpuinfo");
        p.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null) {
            if(line.startsWith("processor"))
                i++;
        }
        reader.close();
        BufferedWriter out = new BufferedWriter(new FileWriter("nbProcess"));
        out.write(Math.max(1,i/4)+"");
        out.close();
    }

    protected static void suicide() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("suicide");
        Log.debug("PID :"+pid);
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("kill "+pid);
        } catch (Exception e) {
            Log.error("suicide ",e);
        }
    }

}
