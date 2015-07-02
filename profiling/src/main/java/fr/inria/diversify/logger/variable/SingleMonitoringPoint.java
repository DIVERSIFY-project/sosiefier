package fr.inria.diversify.logger.variable;


/**
 * User: Simon
 * Date: 06/03/15
 * Time: 12:27
 */
public class SingleMonitoringPoint extends AbstractMonitoringPoint {
    String[] vars;
    Object[] values;


    public SingleMonitoringPoint(String methodId, String localId) {
        this.methodId = methodId;
        this.localId = localId;
    }

    public boolean equals(AbstractMonitoringPoint other) {
        if(!methodId.equals(other.methodId) || !localId.equals(other.localId)) {
            return false;
        }
        if(other instanceof MultiMonitoringPoint) {
            return false;
        }
        SingleMonitoringPoint sOther = (SingleMonitoringPoint) other;
        for(int i = 0; i < values.length; i++) {
            if(!values[i].equals(sOther.values[i])) {
                return false;
            }
        }
        return true;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public void setVars(String[] vars) {
        this.vars = vars;
    }

    public MultiMonitoringPoint toMulti() {
        MultiMonitoringPoint multi = new MultiMonitoringPoint(methodId, localId);
        multi.add(this);
        return multi;
    }

    public Object[] getValues() {
        return values;
    }

}
