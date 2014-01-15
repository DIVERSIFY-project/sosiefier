package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.pointSequence.PointSequence;
import fr.inria.diversify.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 13/01/14
 * Time: 10:05
 */
public class CompareMultiCallSequence {
    protected List<PointSequence> originals;
    protected List<PointSequence> sosies;
    protected int syncroRange = 0;
    protected CodeFragment startPoint;

    public CompareMultiCallSequence(String dirOriginal, String dirSosie) {
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,true);
    }

    public CompareMultiCallSequence(String dirOriginal, String dirSosie, CodeFragment startPoint) {
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie, true);
        this.startPoint = startPoint;
    }

    /**
     * search if the original and sosie (two set of trace) diverge at the call level
     * @throws java.io.IOException
     */
    public Diff findDivergenceCall() {
        Diff diff = new Diff(startPoint);
        for (PointSequence original : originals) {
            String originalName = original.getName();
            for (PointSequence sosie : sosies) {
                String sosieName = original.getName();
                CompareSingleCallSequence cls = new CompareSingleCallSequence(original, sosie, startPoint);
                if (sosieName.equals(originalName)) {
                    diff.addMatch(original,sosie);
                    diff.addCallDivergence(original, cls.findDivergence(1000));

                }
                if(!diff.hasMatch(original))
                    diff.addMatch(original,null);
            }
        }
            return diff;
    }

    protected List<PointSequence> loadPointSequence(String dir, boolean recursive){
        List<PointSequence> list = new ArrayList<PointSequence>();
        File file = new File(dir);
        Map<String, String> idMap = null;
        try {
            idMap = loadIdMap(dir + "/id");
        } catch (IOException e) {
            //e.printStackTrace();
        }
        int i = 0;
        Log.debug("load trace in directory: {}", dir);
        for (File f : file.listFiles()) {
            if(recursive && f.isDirectory())
                list.addAll(loadPointSequence(f.getAbsolutePath(),recursive));
            else {
                try {
                    i++;
                    PointSequence ps = new PointSequence();
                    ps.parseFile(f,idMap);
                    list.add(ps);
                } catch (Exception e) {
                    Log.debug("",e);
                }
            }
        }
        return list;
    }

    protected Map<String,String> loadIdMap(String file) throws IOException {
        Map<String,String> map = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();

        while (line != null) {
            String[] tmp = line.split(" ");
            map.put(tmp[0],line.substring(tmp[0].length(), line.length()));
            line = reader.readLine();
        }
        return map;
    }

    public void setSyncroRange(int syncroRange) {
        this.syncroRange = syncroRange;
    }
}
