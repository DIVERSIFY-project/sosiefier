package fr.inria.diversify.sosie.stackTraceCompare;

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
 * Created by Simon on 18/04/14.
 */
public class CompareAllStackTrace {
    protected List<StackTrace> stackTraces1;
    protected List<StackTrace> stackTraces2;


    public CompareAllStackTrace(String dirOriginal, String dirSosie) throws IOException {
        stackTraces1 = loadPointSequence(dirOriginal,false);
        stackTraces2 = loadPointSequence(dirSosie,false);
    }


    /**
     * search if the original and sosie (two set of trace) not diverge at the call level and variable level
     *
     * @throws java.io.IOException
     */
    public void findDiff() throws Exception {
        for (StackTrace original : stackTraces1) {
            for (StackTrace sosie : stackTraces2) {

                CompareStackTrace cls = new CompareStackTrace(original, sosie);
//                cls.setDiff(varToExclude);
                if (sosie.getFullName().equals(original.getFullName())) {
                    List<Integer> tmp = cls.findDiff();
                    tmp.isEmpty();
                }
            }
        }
    }


    protected List<StackTrace> loadPointSequence(String dir, boolean recursive) throws IOException {
        List<StackTrace> list = new ArrayList<>();
        File file = new File(dir);
        Map<String, String> idMap = loadIdMap(dir + "/id");


        Log.debug("load trace in directory: {}", file.getAbsolutePath());
        for (File f : file.listFiles()) {
            if(recursive && f.isDirectory())
                list.addAll(loadPointSequence(f.getAbsolutePath(),recursive));
            else {
                try {
                    StackTrace st = new StackTrace();
                    st.parseFile(f,idMap);
                    list.add(st);
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
}
