package fr.inria.diversify.logger.logvariable.diff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 05/03/15
 * Time: 14:06
 */
public class Filter {
    Set<String> testToExclude;
    Set<Integer> monitorPointToExclude;
    Map<String, Set<String>> filter;

    public Filter(String filterFile) throws IOException {
        filter = new HashMap<>();
        testToExclude = new HashSet<>();
        monitorPointToExclude = new HashSet<>();
        load(filterFile);
    }

    public Filter() {
        filter = new HashMap<>();
        testToExclude = new HashSet<>();
        monitorPointToExclude = new HashSet<>();
    }

    public Filter(Filter other) {
        filter = new HashMap<>(other.filter);
        testToExclude = new HashSet<>(other.testToExclude);
        monitorPointToExclude = new HashSet<>(other.monitorPointToExclude);
    }

    public void addFilter(Set<String> set) {
        for(String string : set) {
            String[] tmp = string.split(" ");
            if (!filter.containsKey(tmp[0])) {
                filter.put(tmp[0], new HashSet<>());
            }
            filter.get(tmp[0]).add(string.substring(tmp[0].length() + 1, string.length()));
        }
    }

    protected void load(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while (line != null) {
            String[] tmp = line.split(" ");
            if (tmp[1].equals("exclude")) {
                if(isInteger(tmp[0])) {
                    monitorPointToExclude.add(Integer.parseInt(tmp[0]));
                } else {
                    testToExclude.add(tmp[0]);
                }
            } else {
                if (!filter.containsKey(tmp[0])) {
                    filter.put(tmp[0], new HashSet<>());
                }
                filter.get(tmp[0]).add(line.substring(tmp[0].length() + 1, line.length()));
            }
            line = reader.readLine();
        }
    }

    protected boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean excludeThisTest(String signature) {
        return testToExclude.stream()
                .anyMatch(test -> signature.contains(test));

    }

    public Set<String> get(String signature) {
        return filter.get(signature);
    }

    public Set<Integer> getMonitorPoint() {
        return monitorPointToExclude;
    }

    public void print(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);

        for(String test: filter.keySet()) {
            filter.get(test).stream()
                    .distinct()
                    .forEach(f -> {
                        try {
                            fw.append(test +" "+f + "\n");
                        } catch (Exception e) {}
                    });
        }
        testToExclude.stream()
                .forEach(test -> {
                    try {
                        fw.append(test + " exclude\n");
                    } catch (Exception e) {}
                });
        monitorPointToExclude.stream()
                .forEach(point -> {
                    try {
                        fw.append(point + " exclude\n");
                    } catch (Exception e) {}
                });

        fw.close();
    }

    public void addTest(String test) {
        testToExclude.add(test);
    }

    public void addMonitorPoint(int id) {
        monitorPointToExclude.add(id);
    }
}
