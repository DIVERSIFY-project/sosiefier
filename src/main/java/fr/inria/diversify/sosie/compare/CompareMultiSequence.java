package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.pointSequence.PointSequence;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.*;
import java.util.*;

/**
 * User: Simon
 * Date: 15/01/14
 * Time: 16:21
 */
public class CompareMultiSequence {

    protected List<PointSequence> originals;
    protected List<PointSequence> sosies;
    protected Set<VariableDiff> varToExclude;
    protected int syncroRange = 0;
    protected CodeFragment startPoint;

    public CompareMultiSequence(String dirOriginal, String dirSosie) {
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,false);
        varToExclude = new HashSet<VariableDiff>();
    }

    public CompareMultiSequence(String dirOriginal, String dirSosie, CodeFragment startPoint, String fileExcludeVar) throws IOException, JSONException {
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,false);
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
                Log.debug("var to exclude: {}", var);
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
    public void findDiffVar(Diff diff) throws IOException {
        for (PointSequence original : originals) {
            for (PointSequence sosie : sosies) {

                CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie, startPoint);
                cls.setDiffVar(varToExclude);
                if (sosie.getFullName().equals(original.getFullName())) {
                    diff.addMatch(original,sosie);
                    diff.addVarFor(original, cls.findDivergenceVar(syncroRange));
                    diff.addDivergence(original, cls.findDivergence(syncroRange));
                }
            }
            if(!diff.hasMatch(original))
                diff.addMatch(original,null);
        }
    }

    public void findDiffVarToExclude() {
        for (PointSequence original : originals) {
            for (PointSequence sosie : sosies) {

                CompareSingleLogSequence cls = new CompareSingleLogSequence(original, sosie, startPoint);
                cls.setDiffVar(varToExclude);
                if (sosie.getName().equals(original.getName())) {
                    varToExclude.addAll(cls.findDivergenceVar(syncroRange));
                }
            }
        }
    }

    /**
     * search if the original and sosie (two set of trace) diverge at the call level
     * @throws java.io.IOException
     */
    public void findDivergenceCall(Diff diff) {

        for (PointSequence original : originals) {
            String originalName = original.getFullName();
            for (PointSequence sosie : sosies) {

                String sosieName = sosie.getFullName();
                CompareSingleCallSequence cls = new CompareSingleCallSequence(original, sosie, startPoint);
                if (sosieName.equals(originalName)) {
                    diff.addMatch(original,sosie);
                    diff.addCallDivergence(original, cls.findDivergence(200));
                }
//                if(!diff.hasMatch(original))
//                    diff.addMatch(original,null);
            }
        }
    }



    protected Set<VariableDiff> loadVarToExclude(String fileExcludeVar) throws IOException {
        Log.debug("load exclude variables");
        varToExclude = new HashSet<VariableDiff>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileExcludeVar));
            String line = reader.readLine();
            while (line != null) {
                Log.debug("exclude var: {}",line);
                varToExclude.add(new VariableDiff(line));
                line = reader.readLine();
            }

        } catch (Exception e) {
            Log.warn("exclude variable file: {} do net exist", fileExcludeVar);
        }
        return varToExclude;
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
        Log.debug("load trace in directory: {}",dir);
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
