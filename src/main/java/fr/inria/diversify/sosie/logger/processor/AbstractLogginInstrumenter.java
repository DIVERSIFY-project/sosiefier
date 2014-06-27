package fr.inria.diversify.sosie.logger.processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtElement;

/**
 * Created by marodrig on 27/06/2014.
 */
public abstract class AbstractLogginInstrumenter <E extends CtElement> extends AbstractProcessor<E> {

    protected boolean useCompactLog = false;

    public boolean getUseCompactLog() {
        return useCompactLog;
    }

    public void setUseCompactLog(boolean logClassFullName) {
        this.useCompactLog = logClassFullName;
    }

    protected String getLogName() {
        String packName = "fr.inria.diversify.sosie.logger";
        return packName + (useCompactLog ? "BinLogWriter" : "LogWriter" );
    }
}
