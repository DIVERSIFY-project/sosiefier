package fr.inria.diversify.sosie.logger;


import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.transformation.Replace;
import fr.inria.diversify.transformation.TransformationParser;
import org.json.JSONException;

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
    protected CodeFragment startPoint;

    public CompareMultiLogSequence(String dirOriginal, String dirSosie) {
        originals = loadPointSequence(dirOriginal);
        sosies = loadPointSequence(dirSosie);
        varToExclude = new HashSet<String>();
    }

    public CompareMultiLogSequence(String dirOriginal, String dirSosie, CodeFragment startPoint, String fileExcludeVar) throws IOException, JSONException {
        originals = loadPointSequence(dirOriginal);
        sosies = loadPointSequence(dirSosie);
        varToExclude = loadVarToExclude(fileExcludeVar);
        this.startPoint = startPoint;

    }


    public boolean findAndWriteDiffVar(String fileName) {
        try {
            this.findDiffVarToExclude();
            FileWriter fw = new FileWriter(fileName);
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


    /**
    * search if the original and sosie (two set of trace) diverge at the call level and variable level
    *
    * @throws IOException
    */
    public boolean findDiffVar() throws IOException {
 	    for (PointSequence original : originals) {
		    boolean same = false;
		    for (PointSequence sosie : sosies) {
			    CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie, startPoint);
	    		cls.setDiffVar(varToExclude);
		    	if (sosie.getName().equals(original.getName())) {
		    		Set<String> var = cls.findDivergenceVar(syncroRange);
		    		if (var.isEmpty()) {// same sequence
		    			System.out.println(original.getName() + original.threadName + " and " + sosie.getName()
			    		    + sosie.threadName + " same call trace");
					// printDivergencePoint(cls.findDivergence(syncroRange));
			    		same = true;
				    	break;
    				}
	    		}
	    	}
		    if (!same) return !same;
    	}
	    return true;
    }


    /**
     * search if the original and sosie (two set of trace) diverge at the call level
     * @throws IOException
     */
    public boolean findDivergence() {
        for (PointSequence original : originals) {
            String originalName = original.getName();
            boolean same = false;
            for (PointSequence sosie : sosies) {
                String sosieName = original.getName();
                CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie, startPoint);
                if (sosieName.equals(originalName) && cls.findDivergence(syncroRange) != null) {//same sequence
                    System.out.println(original.getName()+ " and "+ original.getName()+ " same call trace");
                    same = true;
                    break;
                }
            }
            if (!same)
                return true;
        }
        return false;
    }


    public void findDiffVarToExclude() {
        for (PointSequence original : originals) {
            boolean same = false;
            for (PointSequence sosie : sosies) {
                CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie, startPoint);
                cls.setDiffVar(varToExclude);
                if (sosie.getName().equals(original.getName()) && cls.findDivergence(syncroRange) != null) {
                    varToExclude.addAll(cls.findDivergenceVar(syncroRange));
//                        System.out.println(original.getName() + original.threadName + " and " + sosie.getName()
//                                + sosie.threadName + " same call trace");
                        // printDivergencePoint(cls.findDivergence(syncroRange));
                        same = true;
                        break;
                }
            }
            if (!same)
                new Exception("not same set of trace");
        }

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



    protected void printDivergencePoint(int[][] divergence) {
        if(divergence.length == 0)
            return;

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