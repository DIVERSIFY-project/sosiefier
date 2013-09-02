package fr.inria.diversify.sosie.logger;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 8/23/13
 * Time: 11:29 AM
 */
public class CompareMultiLogSequence {
    protected List<PointSequence> originals;
    protected List<PointSequence> sosies;
    protected Set<String> varToExclude;
    protected int syncroRange = 10;

    public CompareMultiLogSequence(String dirOriginal, String dirSosie) {
        originals = loadPointSequence(dirOriginal);
        sosies = loadPointSequence(dirSosie);
        varToExclude = new HashSet<String>();
    }

    public CompareMultiLogSequence(String dirOriginal, String dirSosie, String fileExcludeVar) throws IOException {
        originals = loadPointSequence(dirOriginal);
        sosies = loadPointSequence(dirSosie);
        varToExclude = loadVarToExclude(fileExcludeVar);
    }


    public boolean findAndWriteDiffVar() {
        try {
            this.findDiffVar();
            FileWriter fw = new FileWriter("varToExclude");
            BufferedWriter bw = new BufferedWriter(fw);
            for(String var: varToExclude) {
                bw.write(var+"\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void findDiffVar() throws IOException {
        for (PointSequence original : originals) {
            boolean same = false;
            for (PointSequence sosie : sosies) {
                CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie);
                cls.addAllDiffVar(varToExclude);
                    if (sosie.getName().equals(original.getName()) && cls.findDivergence(syncroRange) != null) {//same sequence
                        System.out.println(original.getName()+original.threadName+ " and "+ sosie.getName()+sosie.threadName+ " same call trace");
                        cls.computeDiffVar(syncroRange);
                        printDivergencePoint(cls.findDivergence(syncroRange));
                        varToExclude.addAll(cls.getDiffVar());
                        same = true;
                        break;
                }
            }
            if (!same)
                new Exception("not same call trace");
        }
    }



    public boolean findDivergence() {
        for (PointSequence original : originals) {
            boolean same = false;
            for (PointSequence sosie : sosies) {
                CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie);
                if (sosie.getName().equals(original.getName()) && cls.findDivergence(syncroRange) != null) {//same sequence
                    System.out.println(original.getName()+ " and "+ original.getName()+ " same call trace");
                        System.out.println(cls.findDivergenceVar(syncroRange));
                    same = true;
                    break;
                }
            }
            if (!same)
                return true;
        }

        return false;
    }

    protected Set<String> loadVarToExclude(String fileExcludeVar) throws IOException {
        varToExclude = new HashSet<String>();
        BufferedReader reader = new BufferedReader(new FileReader(fileExcludeVar));

        String line = reader.readLine();
        while (line != null) {
            varToExclude.add(line);
            line = reader.readLine();
        }
        return varToExclude;
    }

    protected List<PointSequence> loadPointSequence(String dir) {
        List<PointSequence> list = new ArrayList<PointSequence>();
        File file = new File(dir);

        for (File f : file.listFiles()) {
            try {
                PointSequence ps = new PointSequence();
                ps.parseFile(f);
                list.add(ps);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        CompareMultiLogSequence un = new CompareMultiLogSequence(args[1],args[2],args[3]);
        if(args[0].equals("-same"))
            un.findAndWriteDiffVar();
        if(args[0].equals("-diff"))
            un.findDivergence();

    }

    protected void printDivergencePoint(int[][] divergence) {
        int c1 = divergence[0][0];
        int c2 = divergence[0][1];
        for(int[] p : divergence) {
            if(c1 != p[0] || c2 != p[1]){
                System.out.println(p[0]+ " "+p[1]);
                c1 = p[0];
                c2 = p[1];
            }
            c1++;
            c2++;
        }
    }
}