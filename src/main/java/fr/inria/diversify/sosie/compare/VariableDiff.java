package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.pointSequence.ConditionalPoint;

/**
 * User: Simon
 * Date: 10/16/13
 * Time: 4:20 PM
 */
public class VariableDiff {
    protected String className;
    protected String methodSignature;
    protected String name;
    protected int positionInOriginal;
    protected int positionInSosie;
    protected String originalValue;
    protected String sosieValue;


    public VariableDiff(String className, String methodSignature, String name, String originalValue, String sosieValue) {
        this.className = className;
        this.methodSignature =methodSignature;
        this.name = name;
        this.originalValue = originalValue;
        this.sosieValue = sosieValue;
    }

    public VariableDiff(String var) {
        String[] tmp = var.split(":");
        this.className = tmp[0];
        this.methodSignature = tmp[1];
        this.name = tmp[2];
    }

    public String toString() {
        return className+":"+methodSignature+":"+name+":("+originalValue+" / "+sosieValue+") index:"+positionInOriginal+"/"+positionInSosie;
    }

    public String toDot() {
        return name+":("+originalValue+" / "+sosieValue+")";
    }

    public String stringForExcludeFile() {
        return className+":"+methodSignature+":"+name;
    }

    public void setOrignalIndex(int orignalIndex) {
        this.positionInOriginal = orignalIndex;
    }

    public int getPositionInOriginal() {
        return positionInOriginal;
    }

    public void setPositionInOrignal(int positionInOriginal) {
        this.positionInOriginal = positionInOriginal;
    }

    public void setPositionInSosie(int sosieIndex) {
        this.positionInSosie = sosieIndex;
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
