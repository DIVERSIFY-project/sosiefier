package fr.inria.diversify.logger.transformationUsed;

import fr.inria.diversify.logger.logger.KeyWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * User: Simon
 * Date: 16/07/15
 * Time: 11:28
 */
public class TransformationUsed {


    public boolean transformationUsed(String directory) throws IOException {
        File dir = new File(directory);

        for(File file : dir.listFiles()) {
            if(file.isFile() && file.getName().startsWith("log")) {
               if(parseFile(file)) {
                   return true;
               }
            }
        }
        return false;
    }

    protected boolean parseFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();
        String logEntry = "";
        while (line != null) {
            line = br.readLine();
            logEntry = logEntry + line;
            if (logEntry.endsWith("$$")) {
                    if(logEntry.startsWith(KeyWord.logTransformation)){
                    return true;
                }
                logEntry = "";
            }
        }
        return false;
    }

}
