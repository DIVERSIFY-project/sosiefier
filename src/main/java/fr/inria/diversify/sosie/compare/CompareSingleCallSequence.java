package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.pointSequence.CallPoint;
import fr.inria.diversify.sosie.pointSequence.Point;
import fr.inria.diversify.sosie.pointSequence.PointSequence;
import fr.inria.diversify.util.Log;

import java.util.Arrays;

/**
 * User: Simon
 * Date: 13/01/14
 * Time: 10:05
 */
public class CompareSingleCallSequence {
    protected PointSequence original;
    protected PointSequence sosie;
    protected CodeFragment startPoint;


    public CompareSingleCallSequence(PointSequence original, PointSequence sosie, CodeFragment startPoint) {
        this.original = original;
        this.sosie = sosie;
        this.startPoint = startPoint;
    }

    public int[][] findDivergence(int syncroRange) {
        if(startPoint == null || true)
            return findDivergence(syncroRange, 0,0);
        else {
            return findDivergence(syncroRange, findDiversificationIndex(original),findDiversificationIndex(sosie));
        }
    }

    /**
     * search if original and sosie (two traces) are the same trace at the call level (module the syncro range).
     * @param syncroRange
     * @param startOriginal
     * @param startSosie
     * @return the local conditionalDivergence. null if original and sosie are not the same trace
     */
    protected int[][] findDivergence(int syncroRange, int startOriginal, int startSosie) {
        int[][] tmp = findDivergence(syncroRange, startSosie, startOriginal, sosie, original);
        if(tmp == null)
            return findDivergence(syncroRange, startOriginal, startSosie, original, sosie);
        else {
            int[][] tmp2 = findDivergence(syncroRange, startOriginal, startSosie, original, sosie);
            if(nbCallDivergence(tmp) < nbCallDivergence(tmp2))
                return tmp;
            else
                return tmp2;
        }
    }

    /**
     * search if two traces are the same trace at the call level (module the syncro range).

     * @return the local conditionalDivergence. null if original and sosie are not the same trace
     */
    protected int[][] findDivergence(int syncroRange, int start1, int start2, PointSequence ps1, PointSequence ps2) {
        int bound = Math.min(ps1.callSize(), ps2.callSize());
        if(bound == 0)
            return null;
        int[][] divergence = new int[bound][2];
        int i = 0;
        try {
        while(start1 < bound - 1 && start2 < bound - 1) {
            divergence[i][0] = start1;
            divergence[i][1] = start2;

            CallPoint oPoint = ps1.getCallPoint(start1);
            CallPoint sPoint = ps2.getCallPoint(start2);
            if(!oPoint.samePosition(sPoint)) {
                int newSyncho[] = findSyncro(syncroRange, ps1, ps2, start1,start2);
                if(newSyncho == null)
                    return null;
                else {
                    start1 = newSyncho[0];
                    start2 = newSyncho[1];
                }
            } else {
                start1++;
                start2++;
            }
            i++;
        }

        }catch (Exception e) {}
        return Arrays.copyOf(divergence, i);
    }

    protected int findDiversificationIndex(PointSequence sequence) {

        for (int i = 0; i < sequence.callSize(); i++)
            if(sequence.getCallPoint(i).containsInto(startPoint)) {
                if(i == 0)

                    Log.info("{} {}", sequence.getCallPoint(i).getClassName(), startPoint.getSourceClass().getQualifiedName());
                return i;
            }

        return sequence.callSize();
    }

    protected int[] findSyncro(int syncroRange, PointSequence ps1, PointSequence ps2, int iOriginal, int iSosie) {
        if(iSosie <= iOriginal)
            return findSyncroP(syncroRange, ps1, ps2, iOriginal, iSosie);
        else {
            int[] tmp = findSyncroP(syncroRange, ps2, ps1, iSosie, iOriginal);
            if(tmp == null)
                   return null;
            return new int[]{tmp[1],tmp[0]};
        }
    }

    protected int[] findSyncroP(int syncroRange, PointSequence ps1, PointSequence ps2, int iOriginal, int iSosie){
        for(int i = iOriginal; (i < syncroRange + iOriginal) && (i < ps1.callSize()); i++) {
            for(int j = iSosie; (j < syncroRange + iSosie) && (j < ps2.callSize()); j++) {
                Point oPoint = ps1.getCallPoint(i);
                Point sPoint = ps2.getCallPoint(j);
                if(oPoint.samePosition(sPoint))
                    return new int[]{i,j};
            }
        }
        return null;
    }

    protected int nbCallDivergence(int[][] d) {
        int nb = 0;
        if (d != null)
            for(int i = 1; i < d.length; i++) {
                int diff = (d[i][0] - d[i-1][0]) - (d[i][1] - d[i-1][1]);

                nb += Math.abs(diff);
                // nb += Math.abs((d[i][0]- d[i-1][0]) - (d[i][1] - d[i-1][1]));
            }
        return nb;
    }
}
