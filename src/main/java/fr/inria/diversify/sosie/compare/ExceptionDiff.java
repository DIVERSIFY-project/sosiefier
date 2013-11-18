package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.pointSequence.ExceptionPoint;
import fr.inria.diversify.sosie.pointSequence.PointSequence;

/**
 * User: Simon
 * Date: 14/11/13
 * Time: 17:15
 */
public class ExceptionDiff {
    protected PointSequence original;
    protected PointSequence sosie;
    protected int positionInOriginal;
    protected int positionInSosie;

    public void setOriginal(PointSequence original) {
        this.original = original;
    }

    public void setSosie(PointSequence sosie) {
        this.sosie = sosie;
    }

    public void setPositionInOriginal(int positionInOriginal) {
        this.positionInOriginal = positionInOriginal;
    }

    public void setPositionInSosie(int positionInSosie) {
        this.positionInSosie = positionInSosie;
    }


    public String toString() {
        ExceptionPoint cpO =  original.getCatchPoint(positionInOriginal);
        ExceptionPoint cpS = sosie.getCatchPoint(positionInSosie);
        return cpO.getClassName() +":"+cpO.getMethodSignature()+":"+cpO.getStackTrace() +" / "+cpS.getStackTrace();
    }

    public String toDot() {
        ExceptionPoint cpO =  original.getCatchPoint(positionInOriginal);
        ExceptionPoint cpS = sosie.getCatchPoint(positionInSosie);
        return cpO.getClassName() +":"+cpO.getMethodSignature()+":"+cpO.getStackTrace() +" / "+cpS.getStackTrace();
    }
}
