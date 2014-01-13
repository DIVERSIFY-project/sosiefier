package fr.inria.diversify.sosie.compare;


import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.pointSequence.PointSequence;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 8/23/13
 * Time: 11:29 AM
 */
public class CompareMultiExceptionSequence {

    protected List<PointSequence> originals;
    protected List<PointSequence> sosies;
    protected int syncroRange = 0;
    protected CodeFragment startPoint;


    public CompareMultiExceptionSequence(String dirOriginal, String dirSosie, CodeFragment startPoint) throws IOException, JSONException {
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,true);
        this.startPoint = startPoint;

    }

    /**
    * search if the original and sosie (two set of trace) not diverge at the catch level
    *
    * @throws java.io.IOException
    */
    public Diff findDiffException() throws IOException {
        Diff diff = new Diff(startPoint);
 	    for (PointSequence original : originals) {
		    for (PointSequence sosie : sosies) {
                 Log.debug("compare original: {} with {}",original, sosie );
			    CompareSingleExceptionSequence cls = new CompareSingleExceptionSequence(original, sosie, startPoint);
                if (sosie.getName().equals(original.getName())) {
                    diff.addMatch(original,sosie);
                    diff.addExceptionFor(original, cls.findDivergenceException(syncroRange));
                    diff.addExceptionDivergence(original, cls.findDivergence(syncroRange));
	    		}
	    	}
		    if(!diff.hasMatch(original))
                diff.addMatch(original,null);
    	}
	    return diff;
    }

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
                    ps.parseFile(f,null);
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