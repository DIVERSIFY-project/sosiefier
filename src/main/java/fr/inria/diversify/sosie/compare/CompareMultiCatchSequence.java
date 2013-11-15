package fr.inria.diversify.sosie.compare;


import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.pointSequence.PointSequence;
import fr.inria.diversify.util.Log;
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
public class CompareMultiCatchSequence {

    protected List<PointSequence> originals;
    protected List<PointSequence> sosies;
    protected int syncroRange = 0;
    protected CodeFragment startPoint;

//    public CompareMultiCatchSequence(String dirOriginal, String dirSosie) {
//        originals = loadPointSequence(dirOriginal,false);
//        sosies = loadPointSequence(dirSosie,true);
//
//    }

    public CompareMultiCatchSequence(String dirOriginal, String dirSosie, CodeFragment startPoint) throws IOException, JSONException {
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,true);
        this.startPoint = startPoint;

    }


//    public boolean findAndWriteDiffVar(String fileName) throws IOException {
//        loadVarToExclude(fileName);
//        try {
//            this.findDiffVarToExclude();
//            FileWriter fw = new FileWriter(fileName);
//            BufferedWriter bw = new BufferedWriter(fw);
//            for(VariableDiff var: varToExclude) {
//                Log.debug("var to exclude: {}",var);
//                bw.write(var.stringForExcludeFile()+"\n");
//            }
//            bw.close();
//            fw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }

    /**
    * search if the original and sosie (two set of trace) not diverge at the catch level
    *
    * @throws java.io.IOException
    */
    public Diff findDiffCatch() throws IOException {
        Diff diff = new Diff(startPoint);
 	    for (PointSequence original : originals) {
		    for (PointSequence sosie : sosies) {
                 Log.debug("compare original: {} with {}",original, sosie );
			    CompareSingleCatchSequence cls = new CompareSingleCatchSequence(original, sosie, startPoint);
                if (sosie.getName().equals(original.getName())) {
                    diff.addMatch(original,sosie);
                    diff.addCatchFor(original, cls.findDivergenceCatch(syncroRange));
                    diff.addCatchDivergence(original, cls.findDivergence(syncroRange));
	    		}
	    	}
		    if(!diff.hasMatch(original))
                diff.addMatch(original,null);
    	}
	    return diff;
    }


//    /**
//     * search if the original and sosie (two set of trace) diverge at the call level
//     * @throws java.io.IOException
//     */
//    public boolean findDivergence() {
//        for (PointSequence original : originals) {
//            String originalName = original.getName();
//            boolean same = false;
//            for (PointSequence sosie : sosies) {
//                String sosieName = original.getName();
//                CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie, startPoint);
//                if (sosieName.equals(originalName) && cls.findDivergence(syncroRange) != null) {//same sequence
//                    same = true;
//                    break;
//                }
//            }
//            if (!same)
//                return true;
//        }
//        return false;
//    }


    protected List<PointSequence> loadPointSequence(String dir, boolean recursive) {
        List<PointSequence> list = new ArrayList<PointSequence>();
        File file = new File(dir);
        Log.debug("load trace in directory: {}",dir);
        for (File f : file.listFiles()) {
            if(recursive && f.isDirectory())
                list.addAll(loadPointSequence(f.getAbsolutePath(), recursive));
            else {
                try {
                    PointSequence ps = new PointSequence();
                    ps.parseFile(f);
                    list.add(ps);
                } catch (Exception e) {
//                Log.warn("error during parse file {}",e,f);
                }
            }
        }
        return list;
    }

    public void setSyncroRange(int syncroRange) {
        this.syncroRange = syncroRange;
    }
}