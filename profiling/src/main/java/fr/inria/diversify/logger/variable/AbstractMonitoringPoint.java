package fr.inria.diversify.logger.variable;


import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 06/03/15
 * Time: 12:28
 */
public abstract class AbstractMonitoringPoint {

//    Map<Integer, String> dico = new HashMap<>();

    protected String methodId;
    protected String localId;


    public String getId() {
        return methodId + "_" + localId;
    }

//    public String getStringPosition(String id) {
//        String[] split = id.split("_");
//        return dico.get(Integer.parseInt(split[0])) + "_" + dico.get(Integer.parseInt(split[1]));
//    }

    public abstract MultiMonitoringPoint toMulti();

    public abstract boolean equals(AbstractMonitoringPoint other);
}
