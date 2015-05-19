package fr.inria.diversify.logger.logvariable;

import fr.inria.diversify.logger.logvariable.diff.MonitoringPointDiff;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 06/03/15
 * Time: 12:27
 */
public class MultiMonitoringPoint extends AbstractMonitoringPoint {
    List<SingleMonitoringPoint> monitoringPoints;


    public MultiMonitoringPoint(int assertId) {
        this.id = assertId;
        monitoringPoints = new ArrayList<>();
    }


    public void add(SingleMonitoringPoint m) {
        monitoringPoints.add(m);
    }

    public MultiMonitoringPoint toMulti() {
        return this;
    }

    @Override
    public MonitoringPointDiff compare(AbstractMonitoringPoint other) {
        MonitoringPointDiff diff = new MonitoringPointDiff(id);
        if(other instanceof SingleMonitoringPoint) {
            diff.setIsMulti(true);
            return diff;
        } else {
            boolean notSameSize = false;
            MultiMonitoringPoint otherCast = (MultiMonitoringPoint) other;
            int borne = monitoringPoints.size();
            if(this.monitoringPoints.size() != otherCast.monitoringPoints.size())  {
                borne = Math.min(this.monitoringPoints.size(), otherCast.monitoringPoints.size());
                notSameSize = true;
            }
            int i = 0;
            for(; i< borne; i++) {
                MonitoringPointDiff tmp = this.monitoringPoints.get(i).compare(otherCast.monitoringPoints.get(i));
                diff.addAllMethodDiff(tmp.getMethodsDiff(), tmp.getValueOriginal(), tmp.getValueSosie());
                if (tmp.getClassDiff()) {
                    notSameSize = true;
                    break;
                }
            }

            if(notSameSize) {
                diff.setMaxSize(i);
            }
            return diff;
        }
    }


}
