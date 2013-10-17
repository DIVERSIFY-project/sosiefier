package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.pointSequence.ConditionalPoint;

/**
 * User: Simon
 * Date: 10/16/13
 * Time: 4:20 PM
 */
public class VariableDiff {
    protected ConditionalPoint point;
    protected String name;
    protected int positionInOriginal;
    protected int positionInSosie;
    protected String originalValue;
    protected String sosieValue;


    public VariableDiff(ConditionalPoint point, String name, String originalValue, String sosieValue) {
        this.point = point;
        this.name = name;
        this.originalValue = originalValue;
        this.sosieValue = sosieValue;
    }

    public String toString() {
        return point.getClassName()+":"+point.getMethodSignature()+":"+name+":("+originalValue+" / "+sosieValue+")";
    }

//    public boolean equals(Object other) {
//        if(!(other instanceof VariableDiff))
//            return  false;
//
//        VariableDiff v = (VariableDiff)other;
//        return name.equals(v.name)
//            &&  point.getClassName().equals(v.point.getClassName())
//            && point.getMethodSignature().equals(v.point.getMethodSignature())
//    }
}
