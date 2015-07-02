//package fr.inria.diversify.logger.variable;
//
//
///**
// * User: Simon
// * Date: 06/03/15
// * Time: 12:27
// */
//public class OldSingleMonitoringPoint extends AbstractMonitoringPoint {
////    public static int executedPoint = 0;
//    String[] methods;
//    Object[] values;
//    protected String className;
//
//
//    public OldSingleMonitoringPoint(String assertId, String className, String[] methods) {
//        this.id = assertId;
//        this.className = className;
//        if(methods == null) {
//            this.methods = new String[0];
//        } else {
//            this.methods = methods;
//        }
//    }
//
//    public boolean equals(AbstractMonitoringPoint other) {
//        if(other instanceof MultiMonitoringPoint) {
//            return false;
//        } else {
//            OldSingleMonitoringPoint otherCast = (OldSingleMonitoringPoint) other;
//            if(otherCast.className != this.className) {
//                return false;
//            } else {
//                for (int i = 0; i < methods.length; i++)  {
////                    executedPoint++;
//                    String mth = methods[i];
//                    Object oValue = this.getValues()[i];
//                    Object sValue = otherCast.getValues()[otherCast.indexOfMethod(mth)];
////                    addValue(id+mth, oValue);
////                    addValue(id+mth, sValue);
//                    if (!oValue.equals(sValue)) {
//                       return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }
//
//
//    protected int indexOfMethod(String mth) {
//        for (int i = 0; i < methods.length; i++) {
//            if(methods[i].equals(mth)) {
//                return  i;
//            }
//        }
//        return  -1;
//    }
//
//    public void setValues(Object[] values) {
//        this.values = values;
//    }
//
//    public String toString() {
//        String ret = id + ", "  + className + ": ";
//
//        for(int i = 0; i < values.length; i++)  {
//            ret += "\n\t" + methods[i] + "(): " + values[i];
//        }
//
//        return ret;
//    }
//
//    public MultiMonitoringPoint toMulti() {
//        MultiMonitoringPoint multi = new MultiMonitoringPoint(id);
//        multi.add(this);
//        return multi;
//    }
//
//    public Object[] getValues() {
//        return values;
//    }
//
//
//
//
////    static Map<String, Boolean> pointIsFix;
////    static Map<String, Object> pointValue;
//
////    public static int nbOfFixPoint() {
////        return pointIsFix.values().stream()
////                .filter(b -> b)
////                .collect(Collectors.toList())
////                .size();
////    }
////
////    public static int nbOfNotFixPoint() {
////        return pointIsFix.values().stream()
////                .filter(b -> !b)
////                .collect(Collectors.toList())
////                .size();
////    }
////
////    public static void initPoint() {
////        pointIsFix = new HashMap<>();
////        pointValue = new HashMap<>();
////    }
//
////    public static void addValue(String id, Object value) {
////        if(!pointValue.containsKey(id)) {
////            pointValue.put(id, value);
////            pointIsFix.put(id, true);
////        } else {
////            if(!pointValue.get(id).equals(value)) {
////                pointIsFix.put(id, false);
////            }
////        }
////    }
//}
