package fr.inria.diversify.statistic;

import fr.inria.diversify.replace.Transformation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 5/7/13
 * Time: 8:48 AM
 */
public class StatisticDiversification {
    protected static char separator = ';';
    protected static String classFileSuffix = "_diversification_class.csv";
    protected static String statementFileSuffix = "_diversification_statement.csv";

    protected List<Transformation> transformations;
    protected int numberOfFailureMax;

    public StatisticDiversification(List<Transformation> transformations) {
        this.transformations = transformations;
        this.numberOfFailureMax = 0;
        for(Transformation t : transformations)
            this.numberOfFailureMax = Math.max(this.numberOfFailureMax, t.numberOfFailure());
        System.out.println("max failure: "+numberOfFailureMax);
    }

    public StatisticDiversification() {
        this.transformations = new ArrayList<Transformation>();
        this.numberOfFailureMax = 0;
    }

    public void addTransformation(Transformation t) {
        transformations.add(t);
    }

    public void writeStat(String output) {
        try {
            write(statByClass(), output+classFileSuffix);
            write(statByType(), output+statementFileSuffix);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected Map<String, Map<Integer,Integer>> statByClass(){
        Map<String, Map<Integer,Integer>> map = new HashMap<String, Map<Integer,Integer>>();

        for(Transformation trans : transformations) {
            try {
            String key = trans.getSourceClass().getQualifiedName();
            if(!map.containsKey(key)) {
                Map<Integer,Integer> list = new HashMap<Integer,Integer>();
                for(int i = -1; i <= numberOfFailureMax; i++)
                    list.put(i, 0);
                map.put(key, list);
            }
            int n =  map.get(key).get(trans.numberOfFailure());
            map.get(key).put(trans.numberOfFailure(),n + 1);
            } catch (Exception e) {}
        }
        return  map;
    }

    protected Map<String, Map<Integer,Integer>> statByType(){
        Map<String, Map<Integer,Integer>> map = new HashMap<String, Map<Integer,Integer>>();

        for(Transformation trans : transformations) {
            try {
            String key = trans.geCodeFragmentType().getSimpleName();
            if(!map.containsKey(key)) {
                Map<Integer,Integer> list = new HashMap<Integer,Integer>();
                for(int i = -1; i <= numberOfFailureMax; i++)
                    list.put(i,0);
                map.put(key, list);
            }
            int n =  map.get(key).get(trans.numberOfFailure());
            map.get(key).put(trans.numberOfFailure(),n + 1);
            } catch (Exception e) {}
        }
        return  map;
    }

    protected void write(Map<String, Map<Integer,Integer>> result, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("item");
        for (int i = -1; i <= numberOfFailureMax; i++)
            bw.write(separator+""+i);
        bw.write("\n");

        for(String key : result.keySet()) {
            bw.write(key);
            for (int i = -1; i <= numberOfFailureMax; i++)
                bw.write(separator+""+result.get(key).get(i));
            bw.write("\n");
        }
        bw.close();
    }
}
