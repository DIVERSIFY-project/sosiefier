//package fr.inria.diversify.logger.variable;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * User: Simon
// * Date: 06/03/15
// * Time: 12:27
// */
//public class OldMultiMonitoringPoint extends AbstractMonitoringPoint {
//    List<SingleMonitoringPoint> monitoringPoints;
//
//
//    public OldMultiMonitoringPoint(String assertId) {
//        this.id = assertId;
//        monitoringPoints = new ArrayList<>();
//    }
//
//
//    public void add(SingleMonitoringPoint m) {
//        monitoringPoints.add(m);
//    }
//
//    public OldMultiMonitoringPoint toMulti() {
//        return this;
//    }
//
//    @Override
//    public boolean equals(AbstractMonitoringPoint other) {
//        if(other instanceof SingleMonitoringPoint) {
//            return false;
//        } else {
//            OldMultiMonitoringPoint otherCast = (OldMultiMonitoringPoint) other;
//            if(this.monitoringPoints.size() != otherCast.monitoringPoints.size())  {
//                return false;
//            }
//            int borne = monitoringPoints.size();
//            int i = 0;
//            for(; i< borne; i++) {
//                if(!this.monitoringPoints.get(i).equals(otherCast.monitoringPoints.get(i))) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
//
//
//}
