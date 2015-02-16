package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 13/02/15.
 */
public class AmpSosieQuery extends TransformationQuery {
    protected List<Diff> diffs;
    protected Diff curentDiff;
    protected boolean removeAfterQuery = true;
    protected boolean shuffle = false;

    public AmpSosieQuery(InputProgram inputProgram) throws TransformationParserException, IOException, JSONException {
        super(inputProgram);
        parseDir(getInputProgram().getPreviousTransformationsPath());

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
        if(curentDiff == null) {
            curentDiff = diff;
        } else {
            curentDiff.merge(diff);
        }

        if(removeAfterQuery) {
            mostDifferentTransformation.remove(index);
        }
        return diff.getSosie();
    }

    protected List<Diff> mostDifferentTransformation() {
        if(curentDiff == null) {
            return diffs.stream()
                    .collect(Collectors.toList());
        } else {
            int size = curentDiff.size();
            return diffs.stream()
                    .filter(diff -> curentDiff.mergeSize(diff) > size)
                    .collect(Collectors.toList());
        }
    }

    public boolean hasNextTransformation() {
        return !diffs.isEmpty();
    }

    public void currentTransformationEnd() {
        curentDiff = null;
    }

    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    public void setRemoveAfterQuery(boolean removeAfterQuery) {
        this.removeAfterQuery = removeAfterQuery;
    }

    public void parseDir(String dirName) throws IOException, JSONException, TransformationParserException {
        diffs = new ArrayList<>();
        File dir = new File(dirName);

        for (File file : dir.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".json")) {
                try {
                    Diff diff = parseFile(file);
                    if(diff.size() != 0) {
                        diffs.add(diff);
                    }
                } catch (Exception e) {

                    Log.debug("{}", file);
                }
            }
        }
    }

    protected Diff parseFile(File file) throws IOException, JSONException, TransformationParserException {
        BufferedReader br = null;
        StringBuilder sb = null;
        try {
            br = new BufferedReader(new FileReader(file));
            sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
        } finally {
            if (br != null) br.close();
        }

        JSONObject object = new JSONObject(sb.toString());
        Diff diff = new Diff(object, inputProgram);

        return diff;
    }
}
