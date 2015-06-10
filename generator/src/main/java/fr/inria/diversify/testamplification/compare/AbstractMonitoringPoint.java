package fr.inria.diversify.testamplification.compare;

import fr.inria.diversify.testamplification.compare.diff.MonitoringPointDiff;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 06/03/15
 * Time: 12:28
 */
@Deprecated
public abstract class AbstractMonitoringPoint {

    static Map<Integer, String> dico = new HashMap<>();

    protected int id;


    public int getId() {
        return id;
    }



    public abstract  MultiMonitoringPoint toMulti();

    public abstract MonitoringPointDiff compare(AbstractMonitoringPoint sosieMonitoringPoint);
}
