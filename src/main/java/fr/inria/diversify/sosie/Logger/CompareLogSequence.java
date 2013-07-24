package fr.inria.diversify.sosie.Logger;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 4:17 PM
 */
public class CompareLogSequence {
    protected PointSequence original;
    protected PointSequence sosie;


    public int findDivergence(int startOriginal, int startSosie) {
        int bound = Math.min(original.size() - startOriginal, sosie.size() - startSosie);

        for(int i = 0; i < bound; i++) {
            Point oPoint = original.get(startOriginal+i);
            Point sPoint = sosie.get(startOriginal+i);
            if(!oPoint.sameLogPoint(sPoint))
                return i;
        }
        return -1;
    }

    public int findDivergenceV(int startOriginal, int startSosie) {
        int bound = Math.min(original.size() - startOriginal, sosie.size() - startSosie);

        for(int i = 0; i < bound; i++) {
            Point oPoint = original.get(startOriginal+i);
            Point sPoint = sosie.get(startOriginal+i);
            if(!(oPoint.sameLogPoint(sPoint) && oPoint.sameValue(sPoint)))
                return i;
        }
        return -1;
    }
}
