package fr.inria.diversify.sosie.logger.processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by marodrig on 27/06/2014.
 */
public abstract class AbstractLogginInstrumenter <E extends CtElement> extends AbstractProcessor<E> {
    protected static Map<String, String> idMap = new HashMap();
    protected static Map<CtExecutable, Integer> count = new HashMap();

    protected boolean useCompactLog = false;

    public boolean getUseCompactLog() {
        return useCompactLog;
    }

    public void setUseCompactLog(boolean logClassFullName) {
        this.useCompactLog = logClassFullName;
    }

    protected String getLogName() {
        String packName = "fr.inria.diversify.sosie.logger.";
        return packName + (useCompactLog ? "BinLogWriter" : "LogWriter" );
    }

    protected CtClass<?> getClass(CtElement stmt) {
        return stmt.getParent(CtClass.class);
    }

    protected CtExecutable<?> getMethod(CtElement stmt) {
        CtExecutable<?> ret = stmt.getParent(CtMethod.class);
        if (ret == null)
            ret = stmt.getParent(CtConstructor.class);
        return ret;
    }

    protected String idFor(String string) {
        if (!idMap.containsKey(string))
            idMap.put(string, idMap.size() + "");

        return idMap.get(string);
    }


    public static void writeIdFile(String dir) throws IOException {
        File file = new File(dir + "/log");
        file.mkdirs();
        FileWriter fw = new FileWriter(file.getAbsoluteFile() + "/id");

        for (String s : idMap.keySet())
            fw.write(idMap.get(s) + " " + s + "\n");

        fw.close();
    }

    protected int getCount(CtElement stmt) {
        CtExecutable parent = stmt.getParent(CtExecutable.class);
        if (count.containsKey(parent))
            count.put(parent, count.get(parent) + 1);
        else
            count.put(parent, 0);
        return count.get(parent);
    }
}
