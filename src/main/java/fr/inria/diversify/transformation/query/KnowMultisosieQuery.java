package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.statistic.RunResults;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParserException;

import java.io.File;
import java.util.List;

/**
 * Query used to replay multisosie programs given in a RunResult.json format
 *
 * Created by marodrig on 23/06/2014.
 */
public class KnowMultisosieQuery extends TransformationQuery {

    //Current run result being replayed
    int currentRunResult = -1;

    public KnowMultisosieQuery(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public List<Transformation> query(int nb) {
        try {
            File folder = new File(getInputProgram().getPreviousTransformationsPath());
            File[] files = folder.listFiles();

            List<Transformation> result = null;

            while ( result == null && currentRunResult < files.length ) {
                currentRunResult++;
                String fileName = files[currentRunResult].getName();
                if ( fileName.substring(fileName.length() - 4).toLowerCase().equals("json") ) {
                    RunResults run = new RunResults();
                    run.loadFromFile(files[currentRunResult]);
                    if (run.isSosieRun()) {
                        result = run.parseTransformations(getInputProgram());
                    }
                }
            }

            if ( result ==  null ) {
                throw new TransformationParserException("Could not found any suitable run result");
            }

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
