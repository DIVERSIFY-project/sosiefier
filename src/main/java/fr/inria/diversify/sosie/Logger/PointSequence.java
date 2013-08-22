package fr.inria.diversify.sosie.logger;

import java.io.BufferedReader;
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
    protected List<Point> points;

    public PointSequence() {
        points = new ArrayList<Point>();
    }

    public void parseFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        while (reader != null) {
            points.add(new Point(line));
            line = reader.readLine();
        }
    }

    public int findPoint(int id, String className, String methodSignature) {
        int i = 0;
        for (Point point : points) {
            if(point.getId() == id && point.getClassName().equals(className) && point.getMethodSignature().equals(methodSignature))
                return i;
            i++;
        }
        return -1;
    }

    public int size() {
        return points.size();
    }

    public Point get(int i) {
        return points.get(i);
    }
}
