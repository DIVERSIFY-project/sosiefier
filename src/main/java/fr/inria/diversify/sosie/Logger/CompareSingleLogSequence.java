package fr.inria.diversify.sosie.logger;


import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.util.Log;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 4:17 PM
 */
public class CompareSingleLogSequence {
    //set of variables whose value changes at each execution
    protected  Set<String> diffVar;
    protected PointSequence original;
    protected PointSequence sosie;
    protected CodeFragment startPoint;


    public CompareSingleLogSequence(PointSequence original, PointSequence sosie, CodeFragment startPoint) {
        this.original = original;
        this.sosie = sosie;
        this.diffVar = new HashSet<String>();
        this.startPoint = startPoint;
    }


    public int[][] findDivergence(int syncroRange) {
        if(startPoint == null)
            return findDivergence(syncroRange, -1,-1);
        else {
//            Log.debug("{} {} {}",original.size(), findDiversificationIndex(original), original.size() == findDiversificationIndex(original));
//            Log.debug("{} {} {}",sosie.size(), findDiversificationIndex(sosie), sosie.size() == findDiversificationIndex(sosie));
            return findDivergence(syncroRange, findDiversificationIndex(original),findDiversificationIndex(sosie));
        }
    }


    /**
     * search in original and sosie (two traces) are the same trace at the call level (module the syncro range).
     * @param syncroRange
     * @param startOriginal
     * @param startSosie
     * @return the local divergence. null if original and sosie are not the same trace
     */
    public int[][] findDivergence(int syncroRange, int startOriginal, int startSosie) {
        int bound = Math.min(original.size(), sosie.size());
        int[][] divergence = new int[bound][2];
        int i = 0;
        while(startOriginal < bound - 1 && startSosie < bound - 1) {
            startOriginal++;
            startSosie++;
            Point oPoint = original.get(startOriginal);
            Point sPoint = sosie.get(startSosie);
            if(!oPoint.sameLogPoint(sPoint)) {
                int newSyncho[] = findSyncro(syncroRange, startOriginal,startSosie);
                if(newSyncho == null)
                    return null;
                else {
                    startOriginal = newSyncho[0];
                    startSosie = newSyncho[1];
                }
            }
            divergence[i][0] = startOriginal;
            divergence[i][1] = startSosie;
            i++;
        }
        return Arrays.copyOf(divergence, i);
    }

    /**
     * search in original and sosie (two traces) the divergence variable. a exception is thrown if the two traces are not the same at the call level
     * @param syncroRange
     * @return the set of divergence variables
     */
    public Set<String> findDivergenceVar(int syncroRange) {
        int startOriginal = -1;
        int startSosie = -1;
        int bound = Math.min(original.size(), sosie.size());

        Set<String> var = new HashSet<String>();
        while(startOriginal < bound - 1 && startSosie < bound - 1) {
            startOriginal++;
            startSosie++;
            ConditionalPoint oPoint = original.get(startOriginal);
            ConditionalPoint sPoint = sosie.get(startSosie);
            if(oPoint.sameLogPoint(sPoint) && !oPoint.sameValue(sPoint)) {
                for(String dVar : oPoint.getDifVar(sPoint))
                    if(!diffVar.contains(dVar))
                        var.add(dVar);
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

//    public void computeDiffVar(int syncroRange) {
//        int startOriginal = -1;
//        int startSosie = -1;
//        int bound = Math.min(original.size(), sosie.size());
//
//        while(startOriginal < bound - 1 && startSosie < bound - 1) {
//            startOriginal++;
//            startSosie++;
//            ConditionalPoint oPoint = original.get(startOriginal);
//            ConditionalPoint sPoint = sosie.get(startSosie);
//            if(oPoint.sameLogPoint(sPoint)) {
//                if(!oPoint.sameValue(sPoint))
//                    difVar.addAll(oPoint.getDifVar(sPoint));
//            }
//            else {
//                int newSyncho[] = findSyncro(syncroRange, startOriginal,startSosie);
//                if(newSyncho == null)
//                    new Exception("call trace "+original.getName()+ " and "+sosie.getName()+" no syncro");
//                else {
//                    startOriginal = newSyncho[0];
//                    startSosie = newSyncho[1];
//                }
//            }
//        }
//    }

    protected int findDiversificationIndex(PointSequence sequence) {
        int i = 0;
        while (i < sequence.size() && !sequence.get(i).containsInto(startPoint))
            i++;
        return i;
    }


    protected int[] findSyncro(int syncroRange, int iOriginal, int iSosie) {
        if(iSosie < iOriginal)
            return findSyncroP(syncroRange, iOriginal, iSosie);
            else
        return findSyncroP(syncroRange,iSosie, iOriginal);
    }
    protected int[] findSyncroP(int syncroRange, int iOriginal, int iSosie){
        for(int i = iOriginal; (i < syncroRange + iOriginal) && (i < original.size()); i++) {
            for(int j = iSosie; (j < syncroRange + iSosie) && (j < sosie.size()); j++) {
                Point oPoint = original.get(i);
                Point sPoint = sosie.get(j);
                if(oPoint.sameLogPoint(sPoint))
                    return new int[]{i,j};
            }
        }
        return null;
    }


    public void setDiffVar(Collection<String> set) {
        diffVar.addAll(set);
    }
}