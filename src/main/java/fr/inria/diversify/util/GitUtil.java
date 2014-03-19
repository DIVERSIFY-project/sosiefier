package fr.inria.diversify.util;

import java.io.*;

/**
 * User: Simon
 * Date: 9/5/13
 * Time: 2:32 PM
 */
public class GitUtil {
    protected static String directory = "repo";
    protected static String expFileName = "exp";
    protected static String scriptDir = "script/git";

    public static void initGit(String dir) {
        Log.debug("init git: {}", dir);
        directory = dir;
        new File(dir).mkdirs();
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("sh "+ scriptDir + "/init.sh " +directory);
            p.waitFor();
        } catch (Exception e) {
            Log.error("initGit ",e);
        }
    }

    public static String getFirstPropertyFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(directory+"/sosie-exp/"+expFileName));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        String ret = "";
        while (line != null) {
            if(line.split(" ").length == 1 && ret.equals("")) {
                ret = line;
                sb.append(line+" OK\n");
            }
            else
                sb.append(line+"\n");
            line = br.readLine();
        }
        Log.info("properties file: {}",ret);
        updateExpList(sb.toString());
        return ret;
    }

    private static void updateExpList(String s) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(directory+"/sosie-exp/"+expFileName));
        out.write(s);
        out.close();
        addToGit(expFileName);
        pushGit();
    }

    public static void addToGit(String file) {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("sh "+ scriptDir + "/add.sh " +directory+"/sosie-exp/ "+file+ " \"add file "+file+"\"");
            Log.debug("sh "+ scriptDir + "/add.sh " +directory+"/sosie-exp/ "+file+ " \"add file "+file+"\"");
            p.waitFor();
        } catch (Exception e) {
            Log.error("addToGit ",e);
        }
        Log.info("add file: {} to git: {}",file,directory+"/sosie-exp/");
    }

    public static void addToGit(String subDir, String file) {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("sh "+ scriptDir + "/add.sh " +subDir+ " " +file+ " \"add file "+file+"\"");
            Log.debug("sh "+ scriptDir + "/add.sh " +subDir+ " " +file+ " \"add file "+file+"\"");
            p.waitFor();
        } catch (Exception e) {
            Log.error("addToGit ",e);
        }
        Log.info("add file: {} to git: {}",file,directory+"/sosie-exp/");
    }

    public static void pushGit() {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("sh "+ scriptDir + "/push.sh " +directory+"/sosie-exp/");
            Log.debug("sh "+ scriptDir + "/push.sh " +directory+"/sosie-exp/");
            p.waitFor();
        } catch (Exception e) {
            Log.error("addToGit ",e);
        }
    }

}
