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
        int bound = Math.min(ps1.exceptionSize(), ps2.exceptionSize());
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
            Point oPoint = ps1.getExceptionPoint(start1);
            Point sPoint = ps2.getExceptionPoint(start2);
            if(!oPoint.samePosition(sPoint)) {
                int newSyncho[] = findSyncro(syncroRange, ps1, ps2, start1,start2);
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
        int bound = Math.min(original.exceptionSize(), sosie.exceptionSize());

        Set<ExceptionDiff> var = new HashSet<ExceptionDiff>();
        while(startOriginal < bound - 1 && startSosie < bound - 1) {
            startOriginal++;
            startSosie++;
            ExceptionPoint oPoint = original.getExceptionPoint(startOriginal);
            ExceptionPoint sPoint = sosie.getExceptionPoint(startSosie);
            if(oPoint.samePosition(sPoint)) { //&& !oPoint.sameExceptionTrace(sPoint)) {
                ExceptionDiff cd = new ExceptionDiff();
                cd.setOriginal(original);
                cd.setSosie(sosie);
                cd.setPositionInOriginal(startOriginal);
                cd.setPositionInSosie(startSosie);
                var.add(cd);

            }
            else {
                int newSyncho[] = findSyncro(syncroRange, original, sosie, startOriginal,startSosie);
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

        for (int i = 0; i < sequence.exceptionSize(); i++)
            if(sequence.getExceptionPoint(i).containsInto(startPoint)) {
                if(i == 0)

                 Log.info("{} {}",sequence.getExceptionPoint(i).getClassName(),startPoint.getSourceClass().getQualifiedName());
                return i;
            }

        return sequence.exceptionSize();
    }


    protected int[] findSyncro(int syncroRange, PointSequence ps1, PointSequence ps2, int iOriginal, int iSosie) {
        if(iSosie <= iOriginal)
            return findSyncroP(syncroRange, ps1, ps2, iOriginal, iSosie);
        else {
            int[] tmp = findSyncroP(syncroRange, ps2, ps1, iSosie, iOriginal);
            return new int[]{tmp[1],tmp[0]};
        }
    }

    protected int[] findSyncroP(int syncroRange, PointSequence ps1, PointSequence ps2, int iOriginal, int iSosie){
        for(int i = iOriginal; (i < syncroRange + iOriginal) && (i < ps1.exceptionSize()); i++) {
            for(int j = iSosie; (j < syncroRange + iSosie) && (j < ps2.exceptionSize()); j++) {
                Point oPoint = ps1.getExceptionPoint(i);
                Point sPoint = ps2.getExceptionPoint(j);
                if(oPoint.samePosition(sPoint))
                    return new int[]{i,j};
            }
        }
        return null;
    }
}