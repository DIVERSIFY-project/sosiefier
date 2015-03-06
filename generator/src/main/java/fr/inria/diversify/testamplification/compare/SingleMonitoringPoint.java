package fr.inria.diversify.testamplification.compare;

import fr.inria.diversify.testamplification.compare.diff.MonitoringPointDiff;

/**
 * User: Simon
 * Date: 06/03/15
 * Time: 12:27
 */
public class SingleMonitoringPoint extends AbstractMonitoringPoint {
    String[] methods;
    Object[] values;
    protected String className;



    public SingleMonitoringPoint(int assertId, String className, String[] methods) {
        this.id = assertId;
        this.className = className;
        if(methods == null) {
            this.methods = new String[0];
        } else {
            this.methods = methods;
        }

    }


    public MonitoringPointDiff compare(AbstractMonitoringPoint other) {
        MonitoringPointDiff diff = new MonitoringPointDiff(id);
        if(other instanceof MultiMonitoringPoint) {
            diff.setIsMulti(true);
            return diff;
        } else {
            SingleMonitoringPoint otherCast = (SingleMonitoringPoint) other;
            if(otherCast.className != this.className) {
                diff.setClassDiff(true);
                return diff;
            } else {
                for (int i = 0; i < values.length; i++) {
                    Object oValue = this.getValues()[i];
                    Object sValue = otherCast.getValues()[i];
                    if (!oValue.equals(sValue)) {
                       diff.addMethodDiff(methods[i], oValue, sValue);
                    }
                }
            }
        }
        return diff;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public String toString() {
        String ret = id + ", "  + className + ": ";

        for(int i = 0; i < values.length; i++)  {
            ret += "\n\t" + methods[i] + "(): " + values[i];
        }

        return ret;
    }

    public MultiMonitoringPoint toMulti() {
        MultiMonitoringPoint multi = new MultiMonitoringPoint(id);
        multi.add(this);
        return multi;
    }

    public Object[] getValues() {
        return values;
    }

    public String[] getMethods() {
        return methods;
    }

    public String getClassName() {
        return className;
    }
}
