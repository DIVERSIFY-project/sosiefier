package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;

import java.util.*;

/**
 * Super class for all transformation queries. The query is in charge of search transplantation points (pots) and
 * transformations to transplant
 * <p/>
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public abstract class TransformationQuery {




    /**
     * A class containing data and logic to help increase the speed of the search process of a previously found
     * transformation
     */
    protected class TransformationFoundRecord {
        //Transformation that incremented by this transformation.
        //A parent transformation of {1, 2, 3} is for example {1, 2}, {1, 3} or {2, 3}
        //Formally: Y is parent of X if Y subset of X
        private TransformationFoundRecord parent = null;

        //Transformation found just before this one
        //Used to have a linked list of previously built transformations.
        private TransformationFoundRecord previous = null;

        //Index of the transformations taken from the pool of transformations that conforms this multisosie
        ArrayList<Integer> transformation;

        private int incrementalSeries;

        //Known status of this transformation
        int status = AbstractTransformation.SOSIE;

        int myHashCode = 0;

        public TransformationFoundRecord(TransformationFoundRecord parent, TransformationFoundRecord previous, int status) {
            setParentAndPrevious(parent, previous);
            this.status = status;
        }

        public TransformationFoundRecord(Integer[] indexes, TransformationFoundRecord parent, TransformationFoundRecord previous) {
            transformation = new ArrayList<>(Arrays.asList(indexes));
            setParentAndPrevious(parent, previous);
        }

        public void setParentAndPrevious(TransformationFoundRecord parent, TransformationFoundRecord previous) {
            this.setPrevious(previous);
            this.setParent(parent);

        }

        @Override
        public boolean equals(Object p) {
            ArrayList<Integer> t = ((TransformationFoundRecord) p).transformation;
            if (t.size() != transformation.size()) return false;
            for (Integer ti : t) {
                if (!transformation.contains(ti)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            if (myHashCode == 0) {
                if (transformation == null) return 0;
                for (Integer i : transformation) {
                    myHashCode += i * 17;
                }
                myHashCode %= 5009;
            }

            return myHashCode;
        }

        public void setIncrementalSeries(int incrementalSeries) {
            if ( getParent() != null && getParent().getIncrementalSeries() != incrementalSeries ) {
                throw new RuntimeException("the series number mismatch!!");
            }
            this.incrementalSeries = incrementalSeries;
        }

        /**
         * Series number of the transformation found. A redundant data to help improve robustness.
         */
        public int getIncrementalSeries() {
            return incrementalSeries;
        }

        public TransformationFoundRecord getParent() {
            return parent;
        }

        public void setParent(TransformationFoundRecord parent) {
            this.parent = parent;
            if ( this.parent != null ) {
                this.incrementalSeries = this.parent.incrementalSeries;
            }
        }

        public TransformationFoundRecord getPrevious() {
            return previous;
        }

        public void setPrevious(TransformationFoundRecord previous) {
            this.previous = previous;
        }
    }

    /**
     * Status of the last transformation found. Querys may use this information to optimize further exploration of
     * the search space
     */
    private int lastTransformationStatus = AbstractTransformation.SOSIE;

    /**
     * Multipoint transformations may be (parent/child) related.
     *
     * The incremental series number helps to identify parents and childs obtained in different runs
     */
    protected int lastIncrementalSeries = 0;

    protected HashMap<Integer, HashSet<TransformationFoundRecord>> transformationFounds;

    protected String type;

    private InputProgram inputProgram;

    List<Transformation> transformations;

    /**
     * Status of the last transformation found. Querys may use this information to optimize further exploration of
     * the search space
     */
    public int getLastTransformationStatus() {
        return lastTransformationStatus;
    }

    public void setLastTransformationStatus(int lastTransformationStatus) {
        this.lastTransformationStatus = lastTransformationStatus;
    }

    /**
     * Multipoint transformations may be (parent/child) related.
     *
     * The incremental series number helps to identify parents and childs obtained in different runs
     */
    public int getLastIncrementalSeries() {
        return lastIncrementalSeries;
    }

    /*
    public void setLastIncrementalSeries(int lastIncrementalSeries) {
        this.lastIncrementalSeries = lastIncrementalSeries;
    }
    */


    public TransformationQuery(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
        transformationFounds = new HashMap<>();
    }

    public abstract void setType(String type);

    public Transformation buildTransformation() throws QueryException {
        return query(1).get(0);
    }


    //public void prepareForNextTransformationSize()

    /**
     * Search for at most nb transformations
     *
     * @param nb
     */
    public abstract List<Transformation> query(int nb) throws QueryException;

    /**
     * Performs the search for transformations
     *
     * @throws SeveralTriesUnsuccessful when several unsuccessful attempts have been made to get the transformations
     */
    public void query() {
        int max = 100;
        Exception[] causes = new Exception[max];
        int trials = 0;
        boolean failed = true;
        while (trials < max && failed)
            try {
                //The amount of transformations are given in the query by the InputProgram
                transformations = query(getInputProgram().getTransformationPerRun());
                failed = false;
            } catch (QueryException qe) {
                if ( qe.getReason().equals(QueryException.Reasons.UNABLE_TO_FIND_SOSIE_PARENT) ) {
                    //We cannot recover from this one. No use to try
                    causes[0] = qe;
                    trials = max + 1;
                }
            } catch (Exception e) {
                Log.warn("Unable to query: " + e.getMessage());
                causes[trials] = e;
                failed = true;
                trials++;
            }

        if (trials >= max) {
            throw new SeveralTriesUnsuccessful(causes);
        }
    }

    /**
     * Tells if a similar transformation has been already found
     *
     * @param tf   transformation found
     * @param size Size of transformation asked by the users.
     *             This size may vary from the actual size of the transformation
     * @return true if already found
     */
    protected boolean alreadyFound(int size, TransformationFoundRecord tf) {

        if (!transformationFounds.containsKey(size)) {
            HashSet<TransformationFoundRecord> h = new HashSet<>();
            h.add(tf);
            transformationFounds.put(size, h);
            return false;
        } else if (transformationFounds.get(size).contains(tf)) {
            return true;
        } else {
            transformationFounds.get(size).add(tf);
            return false;
        }
    }

    /**
     * Returns the list of found transformations a collection of transformations
     *
     * @return
     * @throws Exception
     */
    public Collection<Transformation> getMultiTransformations() {
        return transformations;
    }

    public Transformation getTransformation() throws QueryException {
        return query(1).get(0);
    }

    public InputProgram getInputProgram() {
        return inputProgram;
    }

}
