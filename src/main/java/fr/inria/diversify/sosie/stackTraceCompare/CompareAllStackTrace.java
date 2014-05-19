package fr.inria.diversify.sosie.stackTraceCompare;

import fr.inria.diversify.sosie.stackTraceCompare.diff.CallDiff;
import fr.inria.diversify.sosie.stackTraceCompare.diff.Diff;
import fr.inria.diversify.sosie.stackTraceCompare.diff.VariableDiff;
import fr.inria.diversify.sosie.stackTraceCompare.stackTraceOperation.StackTrace;
import fr.inria.diversify.util.Log;

import java.io.*;
import java.util.*;
import java.util.function.Function;

/**
 * Created by Simon on 18/04/14.
 */
public class CompareAllStackTrace {
    protected List<StackTrace> stackTraces1;
    protected List<StackTrace> stackTraces2;
    protected List<Diff> diffToExclude;
    protected Collection<Diff> diffs;

    public CompareAllStackTrace(String dirOriginal, String dirSosie, String diffFile) throws IOException {
        stackTraces1 = loadPointSequence(dirOriginal,false);
        stackTraces2 = loadPointSequence(dirSosie,false);
        diffToExclude = parseDiff(diffFile);
    }

    /**
     * search if the original and sosie (two set of trace) not diverge at the call level
     *
     * @throws java.io.IOException
     */
    public Set<Diff> findCallDiff() throws Exception {
        return findDiff(cls -> cls.findCallDiff());
    }


    /**
     * search if the original and sosie (two set of trace) not diverge at the  variable level
     *
     * @throws java.io.IOException
     */
    public Set<Diff> findVariableDiff() throws Exception {
        return findDiff(cls -> cls.findVariableDiff());
    }

    /**
     * search if the original and sosie (two set of trace) not diverge at the call level and variable level
     *
     * @throws java.io.IOException
     */
    public Set<Diff> findDiff() throws Exception {
        return findDiff(cls -> cls.findDiff());
    }

    protected Set<Diff> findDiff(Function<CompareStackTrace, List<Diff>> diffOperator) throws Exception {
        Set<Diff> diffs = new HashSet<>();
        for (StackTrace original : stackTraces1) {
            for (StackTrace sosie : stackTraces2) {
                CompareStackTrace cls = new CompareStackTrace(original, sosie, diffToExclude);
//                cls.setDiff(diffToExclude);
                if (sosie.getFullName().equals(original.getFullName())) {
                    Log.debug("compare: {}", original.getFullName());
                    diffs.addAll(diffOperator.apply(cls));
                }
            }
        }
        return diffs;
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
        Map<String,String> map = new HashMap<>();
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

    protected List<Diff> parseDiff(String fileName) throws IOException {
        ArrayList<Diff> diff = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine();

        String line = reader.readLine();
        while (line != null) {
            if(line.startsWith("C"))
                diff.add(new CallDiff(line));
            if(line.startsWith("V"))
                diff.add(new VariableDiff(line));

            line = reader.readLine();
        }
        return diff;
    }
}
