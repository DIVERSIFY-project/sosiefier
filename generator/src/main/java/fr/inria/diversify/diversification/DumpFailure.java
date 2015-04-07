package fr.inria.diversify.diversification;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: Simon
 * Date: 11/03/15
 * Time: 11:17
 */
public class DumpFailure extends SinglePointDiversify {
    List<Integer> failures;

    public DumpFailure(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        super(inputConfiguration, projectDir, srcDir);
        failures = new ArrayList<>();
    }


    @Override
    public void run(int n) throws Exception {
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                Transformation trans = transQuery.query();
                run(trans);
                failures.add(trans.getFailures().size());
            }
        } else {
            while (transQuery.hasNextTransformation()) {
                Transformation trans = transQuery.query();
                run(trans);
                failures.add(trans.getFailures().size());
            }
        }
    }

    public void run(Collection<Transformation> trans) throws Exception {
        for(Transformation transformation: trans) {
            run(transformation);
            failures.add(transformation.getFailures().size());
        }
        Log.info("session result: {}", sessionResults);
    }


    public String printResult(String output) {
        Log.info("session result: {}", sessionResults);
        mkDirResult(output);
        String fileName = output  + "_failure.csv";
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            for(Integer nb : failures) {

                out.write(nb+"\n");;
            }
            out.close();

        } catch (Exception e) {
            Log.error("error in Builder.printResult", e);
        }
        Log.info("failure mean: {}",((double)failures.stream()
                .mapToInt(i -> i).sum()) /((double)failures.size()));
               ;
        return null;
    }
}
