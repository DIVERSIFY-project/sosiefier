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
public class CompareMultiLogSequence {

    protected List<PointSequence> originals;
    protected List<PointSequence> sosies;
    protected Set<VariableDiff> varToExclude;
    protected int syncroRange = 0;
    protected CodeFragment startPoint;

    public CompareMultiLogSequence(String dirOriginal, String dirSosie) {
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,true);
        varToExclude = new HashSet<VariableDiff>();

    }

    public CompareMultiLogSequence(String dirOriginal, String dirSosie, CodeFragment startPoint, String fileExcludeVar) throws IOException, JSONException {
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,true);
        varToExclude = loadVarToExclude(fileExcludeVar);
        this.startPoint = startPoint;

    }


    public boolean findAndWriteDiffVar(String fileName) throws IOException {
        loadVarToExclude(fileName);
        try {
            this.findDiffVarToExclude();
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for(VariableDiff var: varToExclude) {
                Log.debug("var to exclude: {}",var);
                bw.write(var.stringForExcludeFile()+"\n");
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
    * search if the original and sosie (two set of trace) not diverge at the call level and variable level
    *
    * @throws IOException
    */
    public Diff findDiffVar() throws IOException {
        Diff diff = new Diff(startPoint);
 	    for (PointSequence original : originals) {
		    for (PointSequence sosie : sosies) {
                 Log.debug("compare original: {} with {}",original, sosie );
			    CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie, startPoint);
	    		cls.setDiffVar(varToExclude);
                if (sosie.getName().equals(original.getName())) {
                    diff.addMatch(original,sosie);
                    diff.addVarFor(original,cls.findDivergenceVar(syncroRange));
                    diff.addDivergence(original, cls.findDivergence(syncroRange));
	    		}
	    	}
		    if(!diff.hasMatch(original))
                diff.addMatch(original,null);
    	}
	    return diff;
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
//                    Log.debug("{} == {} {}",original.getName(), sosie.getName(), original.getName().equals(sosie.getName()));
                        // printDivergencePoint(cls.findDivergence(syncroRange));
                        same = true;
                        break;
                }
            }
            if (!same)
                new Exception("not same set of trace");
        }
    }

    protected Set<VariableDiff> loadVarToExclude(String fileExcludeVar) throws IOException {
        Log.debug("load exclude variables");
        varToExclude = new HashSet<VariableDiff>();
        BufferedReader reader = new BufferedReader(new FileReader(fileExcludeVar));

        String line = reader.readLine();
        while (line != null) {
            Log.debug("exclude var: {}",line);
            varToExclude.add(new VariableDiff(line));
            line = reader.readLine();
        }
        return varToExclude;
    }

    protected List<PointSequence> loadPointSequence(String dir, boolean recursive) {
        List<PointSequence> list = new ArrayList<PointSequence>();
        File file = new File(dir);
        Log.debug("load trace in directory: {}",dir);
        for (File f : file.listFiles()) {
            if(recursive && f.isDirectory())
                list.addAll(loadPointSequence(f.getAbsolutePath(),recursive));
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