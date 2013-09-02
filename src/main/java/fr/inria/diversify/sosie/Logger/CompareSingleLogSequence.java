package fr.inria.diversify.sosie.logger;


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
    protected  Set<String> difVar;
    protected PointSequence original;
    protected PointSequence sosie;


    public CompareSingleLogSequence(PointSequence original, PointSequence sosie) {
        this.original = original;
        this.sosie = sosie;
        this.difVar = new HashSet<String>();
    }


    public int[][] findDivergence(int syncroRange) {

        int startOriginal = -1;
        int startSosie = -1;
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

    public void computeDiffVar(int syncroRange) {
        int startOriginal = -1;
        int startSosie = -1;
        int bound = Math.min(original.size(), sosie.size());

        while(startOriginal < bound - 1 && startSosie < bound - 1) {
            startOriginal++;
            startSosie++;
            Point oPoint = original.get(startOriginal);
            Point sPoint = sosie.get(startSosie);
            if(oPoint.sameLogPoint(sPoint)) {
                if(!oPoint.sameValue(sPoint))
                    difVar.addAll(oPoint.getDifVar(sPoint));
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
    }

    public int findDivergenceVar(int syncroRange) {
        int startOriginal = -1;
        int startSosie = -1;
        int bound = Math.min(original.size(), sosie.size());

        while(startOriginal < bound - 1 && startSosie < bound - 1) {
            startOriginal++;
            startSosie++;
            Point oPoint = original.get(startOriginal);
            Point sPoint = sosie.get(startSosie);
            if(oPoint.sameLogPoint(sPoint)) {
                if(!oPoint.sameValue(sPoint))
                    difVar.addAll(oPoint.getDifVar(sPoint));
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
        return -1;
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

    public Set<String> getDiffVar() {
        return difVar;
    }
    public void addAllDiffVar(Collection<String> set) {
        difVar.addAll(set);
    }
}