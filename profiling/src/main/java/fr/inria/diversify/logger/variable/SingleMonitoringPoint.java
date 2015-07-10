package fr.inria.diversify.logger.variable;


import java.util.HashSet;
import java.util.Set;

/**
 * User: Simon
 * Date: 06/03/15
 * Time: 12:27
 */
public class SingleMonitoringPoint{
    protected String var;
    protected Set<Object> values;
    protected String methodId;


    public SingleMonitoringPoint(String methodId, String var) {
        this.methodId = methodId;
        this.var = var;
        values = new HashSet<>();
    }

    public boolean equals(SingleMonitoringPoint other) {
        if(!methodId.equals(other.methodId) || !var.equals(other.var)) {
            return false;
        }

        return values.equals(other.values);
    }

    public Set<Object> getValues() {
        return values;
    }

    public String getId() {
        return methodId + "_" + var;
    }

    public void addAllValue(Set<Object> values) {
        this.values.addAll(values);
    }

    public void addValue(Object value) {
        this.values.add(value);
    }
}
