package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.codeFragment.CodeFragment;

import java.util.*;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 4:17 PM
 */
public class CompareSingleSequence {
    //set of variables whose value changes at each execution
    protected  Set<Diff> diff;
    protected AbstractPointSequence original;
    protected AbstractPointSequence sosie;
    protected CodeFragment startPoint;
    protected static int nbDivergence;

//    protected Map<AbstractPointSequence,int[][]> divergence;
//    protected Map<AbstractPointSequence, Set<Diff>> diffs;

    public CompareSingleSequence(AbstractPointSequence original, AbstractPointSequence sosie, CodeFragment startPoint) {
        this.original = original;
        this.sosie = sosie;
        this.diff = new HashSet<Diff>();
        this.startPoint = startPoint;
    }

    /**
     * search if two traces are the same trace at the call level (module the syncro range).

     * @return the local conditionalDivergence. null if original and sosie are not the same trace
     */
    protected int[][] findDivergence(int syncroRange, int start1, int start2, AbstractPointSequence ps1, AbstractPointSequence ps2) {
        int bound = Math.min(ps1.size(), ps2.size());
        if(bound == 0)
            return null;
        int[][] divergence = new int[bound][2];
        int i = 0;

        try {
            while(start1 < bound && start2 < bound ) {
                divergence[i][0] = start1;
                divergence[i][1] = start2;
                Point oPoint = ps1.getPoint(start1);
                Point sPoint = ps2.getPoint(start2);
                if(!oPoint.samePosition(sPoint)) {
                    int newSyncho[] = findSyncro(syncroRange, ps1,ps2,  start1,start2);
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

    /**
     * search in original and sosie (two traces) the conditionalDivergence variable. a exception is thrown if the two traces are not the same at the call level
     *
     * @param syncroRange
     * @return the set of conditionalDivergence variables
     */
    public Set<Diff> findDiff(int syncroRange) throws Exception {
        int startOriginal = -1;
        int startSosie = -1;
        int bound = Math.min(original.size(), sosie.size());
        int[][] divergence = new int[bound][2];
        int i = 0;
        Set<Diff> var = new HashSet<Diff>();
        while(startOriginal < bound - 1 && startSosie < bound -1 ) {
            startOriginal++;
            startSosie++;
            divergence[i][0] = startOriginal;
            divergence[i][1] = startSosie;
            i++;
            Point oPoint = original.getPoint(startOriginal);
            Point sPoint = sosie.getPoint(startSosie);
            if(oPoint.samePosition(sPoint)) {
                if(!oPoint.sameValue(sPoint)) {
                    for(Diff dVar : oPoint.getDiff(sPoint))
                        if(!containsExcludeVar(dVar)) {
                            dVar.setPositionInOriginal(startOriginal);
                            dVar.setPositionInSosie(startSosie);
                            dVar.setPointSosie(sPoint);
                            dVar.setDivergence(divergence);
                            var.add(dVar);
                        }
                }
            }
            else {
                int newSyncho[] = findSyncro(syncroRange,original,sosie, startOriginal,startSosie);
                if(newSyncho == null) {
                    nbDivergence++;
                    startOriginal = bound;
                    startSosie = bound;
//                    throw new Exception("call trace "+original.getName()+ " and "+sosie.getName()+" no syncro");
                }
                else {
                    startOriginal = newSyncho[0];
                    startSosie = newSyncho[1];
                }
            }

        }
        return var;
    }


    protected int[] findSyncro(int syncroRange, AbstractPointSequence ps1, AbstractPointSequence ps2, int iOriginal, int iSosie) {
        if(iSosie <= iOriginal)
            return findSyncroP(syncroRange, ps1, ps2, iOriginal, iSosie);
        else {
            int[] tmp = findSyncroP(syncroRange, ps2, ps1, iSosie, iOriginal);
            if(tmp == null)
                return null;
            return new int[]{tmp[1],tmp[0]};
        }
    }

    protected int[] findSyncroP(int syncroRange, AbstractPointSequence ps1, AbstractPointSequence ps2, int iOriginal, int iSosie){
        for(int i = iOriginal; (i < syncroRange + iOriginal) && (i < ps1.size()); i++) {
            for(int j = iSosie; (j < syncroRange + iSosie) && (j < ps2.size()); j++) {
                Point oPoint = ps1.getPoint(i);
                Point sPoint = ps2.getPoint(j);
                if(oPoint.samePosition(sPoint))
                    return new int[]{i,j};
            }
        }
        return null;
    }

    protected boolean containsExcludeVar(Diff var) {
        for (Diff excludeVar : diff)
            if (excludeVar.toString().equals(var.toString()))
                return true;
        return false;
    }

    public void setDiff(Collection<Diff> set) {
        diff.addAll(set);
    }

    public static void reset() {
        nbDivergence = 0;
    }

    public static int getDivergence() {
        return nbDivergence;
    }
}