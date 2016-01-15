package fr.inria.diversify.logger.transformationUsed;

import fr.inria.diversify.logger.Diff;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 20/08/15
 * Time: 16:48
 */
public class StaticDiff implements Diff {
    protected Map<String, Set<String>> methodDiffs;
    protected Map<String, Set<String>> branchesDiff;

    public StaticDiff() {
        this.branchesDiff = new HashMap<>();
        this.methodDiffs = new HashMap<>();
    }

    public StaticDiff(Map<String, Set<String>> branchesDiff, Map<String, Set<String>> methodDiffs) {
        this.branchesDiff = branchesDiff;
        this.methodDiffs = methodDiffs;
    }

    public StaticDiff(JSONObject diff) throws JSONException {
        this.branchesDiff = new HashMap<>();
        this.methodDiffs = new HashMap<>();
        parse(diff);
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "staticDiff");

        if(!methodDiffs.isEmpty()) {
            object.put("methodsDiff", methodDiffs);
        }
        if(!branchesDiff.isEmpty()) {
            object.put("branchesDiff", branchesDiff);
        }
        return object;
    }

    @Override
    public void filter(Diff filter) {
    }


    @Override
    public int size() {
        return methodDiffs.values()
                .stream()
                .mapToInt(set -> set.size())
                .sum()
                + branchesDiff.values()
                .stream()
                .mapToInt(set -> set.size())
                .sum();
    }

    public int branchDiffSize() {
        return branchesDiff.values()
                .stream()
                .mapToInt(set -> set.size())
                .sum();
    }

    public int methodDiffSize() {
        return methodDiffs.values()
                .stream()
                .mapToInt(set -> set.size())
                .sum();
    }

    @Override
    public void parse(JSONObject jsonObject) throws JSONException {
        if(jsonObject.has("methodsDiff")) {
            JSONObject o = jsonObject.getJSONObject("methodsDiff");
            Iterator i = o.keys();
            while (i.hasNext()) {
                String key = (String) i.next();
                String value = o.getString(key);
                String[] tmp = value.substring(1, value.length() - 1).split(",");
                List<String> list = new ArrayList<>();
                for(int n = 0; n < tmp.length; n++) {
                    if(n != 0 &&
                            ((tmp[n].contains(">") && tmp[n-1].contains("<"))
                                    || (tmp[n].contains(")") && tmp[n-1].contains("(")))) {
                        String add = list.remove(list.size()-1) + tmp[n];
                        list.add(add);
                    } else {
                        list.add(tmp[n]);
                    }
                }
                methodDiffs.put(key, new HashSet<>(list));
            }
        }
        if(jsonObject.has("branchesDiff")) {
            JSONObject o = jsonObject.getJSONObject("branchesDiff");
            Iterator i = o.keys();
            while (i.hasNext()) {
                String key = (String) i.next();
                String value = o.getString(key);
                Set<String> set = Arrays.stream(value.substring(1, value.length() - 1).split(","))
                        .map(item -> item.substring(1, item.length() - 1))
                        .collect(Collectors.toSet());
                branchesDiff.put(key, set);
            }
        }
    }

    @Override
    public void merge(Diff other) {
        StaticDiff otherStaticDiff = (StaticDiff) other;

        if(!methodDiffs.containsKey("add")) {
            methodDiffs.put("add", new HashSet<>());
        }
        if(!methodDiffs.containsKey("delete")) {
            methodDiffs.put("delete", new HashSet<>());
        }

        if(!branchesDiff.containsKey("add")) {
            branchesDiff.put("add", new HashSet<>());
        }
        if(!branchesDiff.containsKey("delete")) {
            branchesDiff.put("delete", new HashSet<>());
        }

        methodDiffs.get("add").addAll(otherStaticDiff.methodDiffs.getOrDefault("add", new HashSet<>()));
        methodDiffs.get("delete").addAll(otherStaticDiff.methodDiffs.getOrDefault("delete", new HashSet<>()));

        branchesDiff.get("add").addAll(otherStaticDiff.branchesDiff.getOrDefault("add", new HashSet<>()));
        branchesDiff.get("delete").addAll(otherStaticDiff.branchesDiff.getOrDefault("delete", new HashSet<>()));
    }

    public Map<String, Set<String>> getMethodDiffs() {
        return methodDiffs;
    }

    public Map<String, Set<String>> getBranchesDiff() {
        return branchesDiff;
    }
}
