package fr.inria.diversify;

import fr.inria.diversify.util.GitUtil;
import fr.inria.diversify.util.Log;

import java.io.*;
import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) throws Exception {

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

        suicide();
    }


    protected static void initPropertiesFile(String git) throws IOException, InterruptedException {
        GitUtil.initGit(git);

        String propertiesFile = GitUtil.getFirstPropertyFile();
        Runtime r = Runtime.getRuntime();
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
        out.write(i/2+"");
        out.close();
    }

    protected static void suicide() {
        String pid = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        Log.debug("PID :"+pid);
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("kill "+pid);
        } catch (Exception e) {
            Log.error("suicide ",e);
        }
    }

}
