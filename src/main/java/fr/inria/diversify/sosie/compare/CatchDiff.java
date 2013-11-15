package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.pointSequence.PointSequence;

/**
 * User: Simon
 * Date: 14/11/13
 * Time: 17:15
 */
public class CatchDiff {
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

    public String toDot() {
        return "";
    }
}
