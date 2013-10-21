package fr.inria.diversify.sosie.pointSequence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 11:46 AM
 */
public class PointSequence {
    protected List<ConditionalPoint> conditionalPoints;
    protected List<CatchPoint> cacthPoints;
    protected String threadName;
    protected String name;

    public PointSequence() {
        conditionalPoints = new ArrayList<ConditionalPoint>();
        cacthPoints = new ArrayList<CatchPoint>();
    }

    public void parseFile(File file) throws IOException {
        parseFileName(file.getName());

        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        String line = reader.readLine();
        String tmp = "";
        while (line != null) {
            if(!line.isEmpty()) {
                if(line.endsWith("$$$")) {
                    addPoint(tmp + line.substring(0,line.length()-3));

                    tmp = "";
                }
                    else {
                        tmp = tmp + line;
                }
            }
            line = reader.readLine();
        }
        addPoint(tmp);
    }

    protected void addPoint(String stringPoint) {
        if(stringPoint.startsWith("----------------------------------ST"))
            cacthPoints.add(new CatchPoint(stringPoint));
        else
            conditionalPoints.add(new ConditionalPoint(stringPoint));
    }

    public int findPoint(int id, String className, String methodSignature) {
        int i = 0;
        for (Point point : conditionalPoints) {
            if(point.getId() == id && point.getClassName().equals(className) && point.getMethodSignature().equals(methodSignature))
                return i;
            i++;
        }
        return -1;
    }

    public int findPoint(String className, String methodSignature) {
        int i = 0;
        for (Point point : conditionalPoints) {
            if(point.getClassName().equals(className) && point.getMethodSignature().equals(methodSignature))
                return i;
            i++;
        }
        return -1;
    }

    public int size() {
        return conditionalPoints.size();
    }

    public ConditionalPoint get(int i) {
        return conditionalPoints.get(i);
    }

    @Override
    public String toString() {
        return name+":"+size();
    }

    protected void parseFileName(String fileName) {
        String[] tmp = fileName.split("__");
        name = tmp[0];
        threadName = tmp[1];
    }

    public String getName() {
        return name;
    }

    public String toDot() {
        return hashCode() + " [label=\"" + name + "\"];";
    }
}
