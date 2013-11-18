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
    protected List<ExceptionPoint> exceptionPoints;
    protected String threadName;
    protected String name;

    protected static int maxSizeException = 0;

    public PointSequence() {
        conditionalPoints = new ArrayList<ConditionalPoint>();
        exceptionPoints = new ArrayList<ExceptionPoint>();
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
       maxSizeException = Math.max(maxSizeException,exceptionPoints.size());
    }

    protected void addPoint(String stringPoint) {
        if(stringPoint.startsWith("ST"))
            exceptionPoints.add(new ExceptionPoint(stringPoint));
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

    public int conditionalSize() {
        return conditionalPoints.size();
    }

    public int cathSize() {
        return exceptionPoints.size();
    }

    public ConditionalPoint getConditionalPoint(int i) {
        return conditionalPoints.get(i);
    }

    public ExceptionPoint getCatchPoint(int i) {
        return exceptionPoints.get(i);
    }

    @Override
    public String toString() {
        return name+":"+conditionalSize();
    }

    protected void parseFileName(String fileName) {
        String[] tmp = fileName.split("_");
        name = tmp[0] + "_" +tmp[1];
        threadName = tmp[2];
    }

    public String getName() {
        return name;
    }

    public String toDot() {
        return hashCode() + " [label=\"" + name + "\"];";
    }

    public static int getMaxSizeException() {
        return maxSizeException;

    }
}
