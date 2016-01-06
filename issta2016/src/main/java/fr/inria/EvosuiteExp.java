package fr.inria;

import fr.inria.diversify.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * User: Simon
 * Date: 05/01/16
 * Time: 16:22
 */
public class EvosuiteExp {
    protected String projectId;
    protected int nbVersion;
    protected Defect4J defect4J;
    protected String tmpDir;

    EvosuiteExp() throws IOException {
        tmpDir = "tmpDir/evosuite_"+ System.currentTimeMillis();

//        File tmpDirFile = new File(tmpDir);
//        tmpDirFile.mkdirs();
//
//        FileWriter fw = new FileWriter(tmpDirFile + "/resultLog");
//        log = new BufferedWriter(fw);

        defect4J = new Defect4J("/Users/Simon/Documents/code/defects4j/framework", tmpDir);

        projectId = "Lang";
        nbVersion = 65;
    }

    private void run() throws IOException, InterruptedException {
        for(int i = 1; i <= nbVersion; i++) {
            try {
                String archive = defect4J.runEvosuite(projectId, i, false);
                defect4J.fixTestSuite(projectId, i, "evosuite-branch");

                boolean status = defect4J.bugDetection(projectId, i, "evosuite-branch");
                Log.info("Lang_" + i + ": test status on bug version : " + status);
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        (new EvosuiteExp()).run();
    }
}
