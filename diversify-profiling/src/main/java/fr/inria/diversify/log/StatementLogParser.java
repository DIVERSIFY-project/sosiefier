package fr.inria.diversify.log;

import fr.inria.diversify.logger.KeyWord;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 30/06/16
 * Time: 14:31
 */
public class StatementLogParser extends LogParser<Map<String, Integer>> {

    public StatementLogParser() {
        result = new HashMap<>();
    }

    @Override
    public void readLogLine(String logLine) {
        if(logLine.startsWith(KeyWord.statementLog + KeyWord.simpleSeparator)) {
            String split[] = logLine.split(KeyWord.simpleSeparator);

            String stmt = ids.get(Integer.parseInt(split[1]));
            Integer count = Integer.parseInt(split[2]);

            if(!result.containsKey(stmt)) {
                result.put(stmt, 0);
            }
            result.put(stmt, result.get(stmt) + count);
        }
    }

    @Override
    public void init(File dir) throws IOException {

    }

    @Override
    public void newLogFile(File file) {

    }
}
