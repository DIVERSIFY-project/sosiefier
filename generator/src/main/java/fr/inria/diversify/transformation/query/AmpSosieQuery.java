package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.testamplification.ParseTransformationAndDiff;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParserException;
import org.json.JSONException;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 13/02/15.
 */
public class AmpSosieQuery extends TransformationQuery {
    protected List<Diff> diffs;
    protected Diff currentDiff;
    protected boolean removeAfterQuery = true;
    protected boolean shuffle = false;



    public AmpSosieQuery(InputProgram inputProgram) {
        super(inputProgram);

    }

    public void initDiff(String transformationDir, String filterFile) throws JSONException, IOException, TransformationParserException {
        ParseTransformationAndDiff parser = new ParseTransformationAndDiff(inputProgram);

        parser.parseDir(transformationDir);
        parser.loadFilter(filterFile);

        parser.applyFilter();

        diffs = parser.getDiffs().values().stream()
                .filter(diff -> diff.size() != 0)
                .collect(Collectors.toList());
    }

    @Override
    public Transformation query() throws QueryException {
        int index = 0;
        List<Diff> mostDifferentTransformation = mostDifferentTransformation();
        if(shuffle) {
            Random r = new Random();
            index = r.nextInt(mostDifferentTransformation.size());
        }
        Diff diff = mostDifferentTransformation.get(index);
        if(currentDiff == null) {
            currentDiff = diff;
        } else {
            currentDiff.merge(diff);
        }

        if(removeAfterQuery) {
            mostDifferentTransformation.remove(index);
        }
        return diff.getSosie();
    }

    protected List<Diff> mostDifferentTransformation() {
        if(currentDiff == null) {
            return diffs;
        } else {
            int size = currentDiff.size();
            return diffs.stream()
                    .filter(diff -> currentDiff.mergeSize(diff) > size)
                    .collect(Collectors.toList());
        }
    }

    public boolean hasNextTransformation() {
        return !diffs.isEmpty() && !mostDifferentTransformation().isEmpty();
    }

    public void currentTransformationEnd() {
        currentDiff = null;
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    public void setRemoveAfterQuery(boolean removeAfterQuery) {
        this.removeAfterQuery = removeAfterQuery;
    }

    public Diff getCurrentDiff() {
        return currentDiff;
    }
}
