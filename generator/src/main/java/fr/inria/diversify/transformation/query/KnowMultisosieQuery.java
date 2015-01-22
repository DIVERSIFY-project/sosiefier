package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.statistic.RunResults;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParserException;

import java.io.File;
import java.util.List;

/**
 * Query used to replay multisosie programs given in a RunResult.json format
 * <p/>
 * Created by marodrig on 23/06/2014.
 */
public class KnowMultisosieQuery extends TransformationQuery {

    //Current run result being replayed
    //int currentRunResult = -1;
    int currentRunResult = 0;

    File[] files = null;

    public KnowMultisosieQuery(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public Transformation query() throws QueryException {
        return null;
    }

    @Override
    public List<Transformation> query(int nb) {
        try {
            File folder = new File(getInputProgram().getPreviousTransformationsPath());

            if (files == null) {
                if (folder.isDirectory()) {
                    files = folder.listFiles();
                } else {
                    files = new File[1];
                    files[0] = folder;
                }
            }

            List<Transformation> result = null;

            while (result == null && currentRunResult < files.length) {

                String fileName = files[currentRunResult].getName();
                if (fileName.substring(fileName.length() - 4).toLowerCase().equals("json")) {
                    RunResults run = new RunResults();
                    run.loadFromFile(files[currentRunResult]);
                    //if (run.isSosieRun()) {
                    result = run.parseTransformations(getInputProgram());
                    //}
                }

                currentRunResult++;
                if (currentRunResult >= files.length) {
                    currentRunResult = 0;
                }
            }

            if (result == null) {
                throw new TransformationParserException("Could not found any suitable run result");
            }

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
