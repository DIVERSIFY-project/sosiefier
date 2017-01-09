package fr.inria.diversify.log;

import fr.inria.diversify.logger.KeyWord;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 04/07/16
 * Time: 14:50
 */
public class MethodDeepParser extends LogParser<Map<String, List<Integer>>> {

    public MethodDeepParser() {
        result = new HashMap<>();
    }

    @Override
    public void readLogLine(String logLine) {
        if(logLine.startsWith(KeyWord.methodCallObservation)) {
            String[] spit = logLine.split(KeyWord.simpleSeparator);
            String method = ids.get(Integer.parseInt(spit[2]));
            Integer deep = Integer.parseInt(spit[1]);

            getMethodDeep(method).add(deep);
        }
    }

    protected List<Integer> getMethodDeep(String method) {
        if(!result.containsKey(method)) {
            result.put(method, new ArrayList<Integer>());
        }
        return result.get(method);
    }

    @Override
    public void init(File dir) throws IOException {

    }

    @Override
    public void newLogFile(File file) {

    }
}
