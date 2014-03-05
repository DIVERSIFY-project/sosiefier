package fr.inria.diversify.sosie.compare.refactor;

import fr.inria.diversify.codeFragment.CodeFragment;
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

    protected List<AbstractPointSequence> originals;
    protected List<AbstractPointSequence> sosies;
    protected Set<Diff> varToExclude;
    protected int syncroRange = 0;
    protected CodeFragment startPoint;
    protected Set<Diff> diffs;
    protected Class cl;


    public CompareMultiSequence(String dirOriginal, String dirSosie, Class cl) {
        varToExclude = new HashSet<Diff>();
        this.cl = cl;
        diffs = new HashSet<Diff>();
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,false);
    }

    public CompareMultiSequence(String dirOriginal, String dirSosie, CodeFragment startPoint, String fileExcludeVar, Class cl) throws IOException, JSONException {
        this.startPoint = startPoint;
        this.cl = cl;
        diffs = new HashSet<Diff>();
        originals = loadPointSequence(dirOriginal,false);
        sosies = loadPointSequence(dirSosie,false);
        varToExclude = loadVarToExclude(fileExcludeVar);
    }


    public boolean findAndWriteDiff(String fileName) throws IOException {
        loadVarToExclude(fileName);
        try {
            this.findDiffToExclude();
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Diff var: varToExclude) {
                Log.debug("var to exclude: {}", var);
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
     * search if the original and sosie (two set of trace) not diverge at the call level and variable level
     *
     * @throws java.io.IOException
     */
    public void findDiff() throws IOException {
        for (AbstractPointSequence original : originals) {
            for (AbstractPointSequence sosie : sosies) {

                CompareSingleSequence cls = new CompareSingleSequence(original, sosie, startPoint);
                cls.setDiff(varToExclude);
                if (sosie.getFullName().equals(original.getFullName())) {
                    diffs.addAll(cls.findDiff(syncroRange));
                }
            }
        }
    }

    public void findDiffToExclude() {
        for (AbstractPointSequence original : originals) {
            for (AbstractPointSequence sosie : sosies) {

                CompareSingleSequence cls = new CompareSingleSequence(original, sosie, startPoint);
                cls.setDiff(varToExclude);
                if (sosie.getName().equals(original.getName())) {
                    varToExclude.addAll(cls.findDiff(syncroRange));
                }
            }
        }
    }

    protected Set<Diff> loadVarToExclude(String fileExcludeVar) throws IOException {
        Log.debug("load exclude variables");
        varToExclude = new HashSet<Diff>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileExcludeVar));
            String line = reader.readLine();
            while (line != null) {
                Log.debug("exclude var: {}",line);
                Diff d = null;
                if(cl == AssertPointSequence.class) {
                    d = new AssertDiff(line);
                }
                if(cl == ExceptionPointSequence.class) {
                    d = new ExceptionDiff(line);
                }
                varToExclude.add(d);
                line = reader.readLine();
            }

        } catch (Exception e) {
            Log.warn("exclude variable file: {} do net exist", fileExcludeVar);
        }
        return varToExclude;
    }

    protected List<AbstractPointSequence> loadPointSequence(String dir, boolean recursive){
        List<AbstractPointSequence> list = new ArrayList<AbstractPointSequence>();
        File file = new File(dir);
        Map<String, String> idMap = null;
        try {
            idMap = loadIdMap(dir + "/id");
        } catch (IOException e) {
            //e.printStackTrace();
        }

        Log.debug("load trace in directory: {}",file.getAbsolutePath());
        for (File f : file.listFiles()) {
            if(recursive && f.isDirectory())
                list.addAll(loadPointSequence(f.getAbsolutePath(),recursive));
            else {
                try {
                    AbstractPointSequence ps = (AbstractPointSequence)cl.newInstance();
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

    public Set<Diff> getDiffs() {
        return diffs;
    }
}
