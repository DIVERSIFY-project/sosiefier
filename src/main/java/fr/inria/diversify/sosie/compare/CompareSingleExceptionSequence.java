package fr.inria.diversify.sosie.compare;


import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.pointSequence.ExceptionPoint;
import fr.inria.diversify.sosie.pointSequence.Point;
import fr.inria.diversify.sosie.pointSequence.PointSequence;
import fr.inria.diversify.util.Log;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 4:17 PM
 */
public class
        CompareSingleExceptionSequence {
    protected PointSequence original;
    protected PointSequence sosie;
    protected CodeFragment startPoint;


    public CompareSingleExceptionSequence(PointSequence original, PointSequence sosie, CodeFragment startPoint) {
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
     * search if original and sosie (two traces) are the same trace at the catch level (module the syncro range).
     * @param syncroRange
     * @param startOriginal
     * @param startSosie
     * @return the local conditionalDivergence. null if original and sosie are not the same trace
     */
    protected int[][] findDivergence(int syncroRange, int startOriginal, int startSosie) {
        if(findDivergence(syncroRange, startSosie, startOriginal, sosie, original) != null)
            return findDivergence(syncroRange, startOriginal, startSosie, original, sosie);
        return null;
    }

    /**
     * search if two traces are the same trace at the call catch (module the syncro range).

     * @return the local conditionalDivergence. null if original and sosie are not the same trace
     */
    protected int[][] findDivergence(int syncroRange, int start1, int start2, PointSequence ps1, PointSequence ps2) {
        int bound = Math.min(ps1.cathSize(), ps2.cathSize());
        if(bound == 0)
            return null;
        int[][] divergence = new int[bound][2];
        int i = 0;
        divergence[i][0] = start1;
        divergence[i][1] = start2;

        while(start1 < bound - 1 && start2 < bound - 1) {
            i++;
            start1++;
            start2++;
            Point oPoint = ps1.getCatchPoint(start1);
            Point sPoint = ps2.getCatchPoint(start2);
            if(!oPoint.sameLogPoint(sPoint)) {
                int newSyncho[] = findSyncro(syncroRange, start1,start2);
                if(newSyncho == null)
                    return null;
                else {
                    start1 = newSyncho[0];
                    start2 = newSyncho[1];
                }
            }
            divergence[i][0] = start1;
            divergence[i][1] = start2;
        }
        if(i == 0)
            i++;
        return Arrays.copyOf(divergence, i);
    }

    /**
     * search in original and sosie (two traces) the conditionalDivergence variable. a exception is thrown if the two traces are not the same at the call level
     *
     * @param syncroRange
     * @return the set of conditionalDivergence variables
     */
    public Set<ExceptionDiff> findDivergenceException(int syncroRange) {
        int startOriginal = -1;
        int startSosie = -1;
        int bound = Math.min(original.cathSize(), sosie.cathSize());

        Set<ExceptionDiff> var = new HashSet<ExceptionDiff>();
        while(startOriginal < bound - 1 && startSosie < bound - 1) {
            startOriginal++;
            startSosie++;
            ExceptionPoint oPoint = original.getCatchPoint(startOriginal);
            ExceptionPoint sPoint = sosie.getCatchPoint(startSosie);
            if(oPoint.sameLogPoint(sPoint) && !oPoint.sameCatchTrace(sPoint)) {
                ExceptionDiff cd = new ExceptionDiff();
                cd.setOriginal(original);
                cd.setSosie(sosie);
                cd.setPositionInOriginal(startOriginal);
                cd.setPositionInSosie(startSosie);
                var.add(cd);

            }
            else {
                int newSyncho[] = findSyncro(syncroRange, startOriginal,startSosie);
                if(newSyncho == null)
                    new Exception("call trace "+original.getName()+ " and "+sosie.getName()+" no syncro");
                else {
                    startOriginal = newSyncho[0];
                    startSosie = newSyncho[1];
                }
            }
        }
        return var;
    }

    protected int findDiversificationIndex(PointSequence sequence) {

        for (int i = 0; i < sequence.cathSize(); i++)
            if(sequence.getCatchPoint(i).containsInto(startPoint)) {
                if(i == 0)

                 Log.info("{} {}",sequence.getCatchPoint(i).getClassName(),startPoint.getSourceClass().getQualifiedName());
                return i;
            }

        return sequence.cathSize();
    }


    protected int[] findSyncro(int syncroRange, int iOriginal, int iSosie) {
        if(iSosie < iOriginal)
            return findSyncroP(syncroRange, iOriginal, iSosie);
            else
        return findSyncroP(syncroRange,iSosie, iOriginal);
    }

    protected int[] findSyncroP(int syncroRange, int iOriginal, int iSosie){
        for(int i = iOriginal; (i < syncroRange + iOriginal) && (i < original.cathSize()); i++) {
            for(int j = iSosie; (j < syncroRange + iSosie) && (j < sosie.cathSize()); j++) {
                Point oPoint = original.getCatchPoint(i);
                Point sPoint = sosie.getCatchPoint(j);
                if(oPoint.sameLogPoint(sPoint))
                    return new int[]{i,j};
            }
        }
        return null;
    }
}