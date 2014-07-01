package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.diff.CallDiff;
import fr.inria.diversify.sosie.compare.diff.Diff;
import fr.inria.diversify.sosie.compare.diff.Report;
import fr.inria.diversify.sosie.compare.diff.VariableDiff;
import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;
import fr.inria.diversify.sosie.compare.stackTraceOperation.StackTrace;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

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

    protected Map<String, Report> reports;
    protected JSONObject previousReport;

    public CompareAllStackTrace(String dirOriginal, String dirSosie, String diffFile, JSONObject previousReport) throws IOException, JSONException {
        stackTraces1 = loadLog(dirOriginal, false);
        stackTraces2 = loadLog(dirSosie, false);
        diffToExclude = parseDiff(diffFile);
        reports = new HashMap();
        if(previousReport != null) {
            Log.debug("previousReport used");

            reports.put("allTest", new Report(previousReport.getJSONObject("allTest")));
            Log.debug(reports.get("allTest").summary());
        } else {
            reports.put("allTest", new Report());
        }
        this.previousReport = previousReport;
    }

//    /**
//     * search if the original and sosie (two set of trace) not diverge at the call level
//     *
//     * @throws java.io.IOException
//     */
//    public Set<Diff> findCallDiff() throws Exception {
//        return findDiff(cls -> cls.findCallDiff());
//    }
//
//
//    /**
//     * search if the original and sosie (two set of trace) not diverge at the  variable level
//     *
//     * @throws java.io.IOException
//     */
//    public Set<Diff> findVariableDiff() throws Exception {
//        return findDiff(cls -> cls.findVariableDiff());
//    }

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
                if (sosie.getFullName().equals(original.getFullName())) {
                    CompareStackTrace cls = new CompareStackTrace(original, sosie);
                    diffs.addAll(diffOperator.apply(cls));
                    Report report = cls.getReport();
                    if(previousReport != null && previousReport.has(original.getName())) {
                       Report r = new Report(previousReport.getJSONObject(original.getName()));
                       report.merge2(r);
                        reports.put(original.getName(), report);
                    } else {
                        reports.put(original.getName(), report);
                    }
                    reports.get("allTest").merge(report);
                }
            }
        }
        return diffFilter(diffs);
    }

    protected Set<Diff> diffFilter(Set<Diff> diffs) {
        Set<Diff> filtered = new HashSet<>();
        Map<StackTraceElement, Integer> callDiffs = new HashMap<>();

        //init of callDiffs
        for(Diff diff : diffToExclude) {
            if (diff instanceof CallDiff) {
                int nbCallDiff = ((CallDiff) diff).getMaxStackDiff();
                StackTraceElement key = diff.getDiffStart();
                if (callDiffs.containsKey(key)) callDiffs.put(key, Math.max(callDiffs.get(key), nbCallDiff));
                else {
                    callDiffs.put(key, nbCallDiff);
                }
            }
        }

        for(Diff diff : diffs) {
            if(diff instanceof CallDiff) {
                CallDiff cDiff = (CallDiff) diff;
                StackTraceElement key = cDiff.getDiffStart();
                if(!callDiffs.containsKey(key))
                    filtered.add(diff);
                if(callDiffs.containsKey(key) && callDiffs.get(key) < cDiff.getMaxStackDiff()) {
                    filtered.add(diff);
                    callDiffs.put(key,cDiff.getMaxStackDiff());
                }
            }
            else {
                if(!diffToExclude.contains(diff))
                    filtered.add(diff);
            }
        }
        return filtered;
    }

    protected int idMapSize;

    protected List<StackTrace> loadLog(String dir, boolean recursive) throws IOException {
        List<StackTrace> list = new ArrayList<>();
        File file = new File(dir);
        Map<String, String> idMap = loadIdMap(dir + "/id");
        idMapSize = idMap.size();

        Log.debug("load trace in directory: {}", file.getAbsolutePath());
        for (File f : file.listFiles()) {
            if(recursive && f.isDirectory())
                list.addAll(loadLog(f.getAbsolutePath(), recursive));
            else {
                try {
                    Log.debug("parse file: {}",f.getAbsoluteFile());
                    Map<String, List<String>> splitByTest = splitByTest(f);
                    for(String key: splitByTest.keySet()) {
                        StackTrace st = new StackTrace();
                        st.parseFile(key, splitByTest.get(key), idMap);
                        list.add(st);
                    }
                } catch (Exception e) {
                    Log.debug("error for: {}",f.getAbsoluteFile());
                }
            }
        }
        return list;
    }

    protected Map<String, List<String>> splitByTest(File file) throws Exception {
        Map<String, List<String>> traceByTest = new HashMap<>();
        Set<String> testToExclude = new HashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();
        String tmp = "";

        if(line == null)
            throw new Exception("empty file");

        List<String> trace = new LinkedList<>();
        traceByTest.put("null",trace);
        while (line != null) {
            if(!line.isEmpty()) {
                if(line.endsWith("$$$")) {
                    try {
                        if(line.startsWith("NewTest")) {
                            String test = line.substring(8, line.length() - 3);
                            if(traceByTest.containsKey(test)) {
                                testToExclude.add(test);
                                trace = traceByTest.get(test);
                            } else {
//                                Log.debug("New test: {}",test);
                                trace = new LinkedList<>();
                                traceByTest.put(test, trace);
                            }
                        } else {
                            trace.add(tmp + line.substring(0, line.length() - 3));
                        }
                        tmp = "";
                    } catch (Exception e) {
                        Log.error("malformed line: {}",line);
                        tmp = "";
                    }
                }
                else {
                    tmp = tmp + line;
                }
            }
            line = reader.readLine();
        }
        if(!tmp.equals(""))
            trace.add(tmp);

        Log.debug("all test: {}, to exclude: {}", traceByTest.size(), testToExclude.size());
        for(String test: testToExclude)
            traceByTest.remove(test);


        return traceByTest;
    }

    protected Map<String,String> loadIdMap(String file) throws IOException {
        Map<String,String> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
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

    public List<Diff> getDiffToExclude() {
        return diffToExclude;
    }


    public JSONObject buildReport() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        for(String st : reports.keySet()) {
            Report report = reports.get(st);
            jsonObject.put(st,report.buildReport());
        }
        if(previousReport != null) {
            Iterator it = previousReport.keys();
            while (it.hasNext()) {
                String key = (String) it.next();
                if (!reports.containsKey(key))
                    jsonObject.put(key, previousReport.getJSONObject(key));
            }
        }
        Log.debug("AllTest: "+reports.get("allTest").summary());
        return jsonObject;
    }


    public String summary()  {
//        String summary = "";
//        for(String st : reports.keySet()) {
//            summary += reports.get(st).summary() + "-----------------------\n"+st+"\n";
//        }
//        return summary;
        return reports.get("allTest").summary();
    }
}
