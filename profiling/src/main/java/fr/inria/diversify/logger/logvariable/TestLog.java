package fr.inria.diversify.logger.logvariable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Simon on 15/01/15.
 */
public class TestLog {
    protected String signature;
    protected List<AbstractMonitoringPoint> monitoringPoints;
//    protected int index;


    public TestLog(String signature) {
        this.signature = signature;
        monitoringPoints = new ArrayList<>();
    }

    public String getSignature() {
        return signature;
    }


    public void addAllMonitoringPoint(List<AbstractMonitoringPoint> monitoringPoints) {
        this.monitoringPoints.addAll(monitoringPoints);
    }

    public int size() {
        return monitoringPoints.size();
    }

    public AbstractMonitoringPoint geMonitoringPoint(int i) {
        return monitoringPoints.get(i);
    }

    public List<Integer> getAllId() {
        return monitoringPoints.stream()
                .map(point -> point.getId())
                .collect(Collectors.toList());
    }

    public AbstractMonitoringPoint getMonitoringPoint(int id) {
        return monitoringPoints.stream()
                .filter(point -> point.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
