package org.apache.commons.io.filefilter;

import java.io.File;
import junit.framework.TestCase;

public abstract class IOFileFilterAbstractTestCase extends TestCase {
    /** 
     * Constructs a new instance of
     * <code>IOFileFilterAbstractTestCase</code>.
     */
public IOFileFilterAbstractTestCase(final String name) {
        super(name);
    }

    public boolean assertFileFiltering(final int testNumber, final IOFileFilter filter, final File file, final boolean expected) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1255,((((((("test " + testNumber) + " Filter(File) ") + (filter.getClass().getName())) + " not ") + expected) + " for ") + file));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1256,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1258,filter,1257,filter.accept(file));
        return true;
    }

    public boolean assertFilenameFiltering(final int testNumber, final IOFileFilter filter, final File file, final boolean expected) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1259,((((((("test " + testNumber) + " Filter(File, String) ") + (filter.getClass().getName())) + " not ") + expected) + " for ") + file));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1260,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1262,filter,1261,filter.accept(file.getParentFile(), file.getName()));
        return true;
    }

    public void assertFiltering(final int testNumber, final IOFileFilter filter, final File file, final boolean expected) throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1267,((((((("test " + testNumber) + " Filter(File) ") + (filter.getClass().getName())) + " not ") + expected) + " for ") + file));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1268,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1270,filter,1269,filter.accept(file));
        if ((file != null) && ((file.getParentFile()) != null)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1271,((((((("test " + testNumber) + " Filter(File, String) ") + (filter.getClass().getName())) + " not ") + expected) + " for ") + file));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1272,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1274,filter,1273,filter.accept(file.getParentFile(), file.getName()));
        } else if (file == null) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1275,(((((("test " + testNumber) + " Filter(File, String) ") + (filter.getClass().getName())) + " not ") + expected) + " for null"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1276,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1278,filter,1277,filter.accept(file));
        } 
    }

    public void assertTrueFiltersInvoked(final int testNumber, final TesterTrueFileFilter[] filters, final boolean[] invoked) {
        for (int i = 1 ; i < (filters.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1279,(((("test " + testNumber) + " filter ") + i) + " invoked"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1280,invoked[(i - 1)]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1282,filters[i],1281,filters[i].isInvoked());
        }
    }

    public void assertFalseFiltersInvoked(final int testNumber, final TesterFalseFileFilter[] filters, final boolean[] invoked) {
        for (int i = 1 ; i < (filters.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,(((("test " + testNumber) + " filter ") + i) + " invoked"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1264,invoked[(i - 1)]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1266,filters[i],1265,filters[i].isInvoked());
        }
    }

    public File determineWorkingDirectoryPath(final String key, final String defaultPath) {
        String workingPathName = java.lang.System.getProperty(key, defaultPath);
        return new File(workingPathName);
    }

    public void resetFalseFilters(TesterFalseFileFilter[] filters) {
        for (TesterFalseFileFilter filter : filters) {
            if (filter != null) {
                filter.reset();
            } 
        }
    }

    public void resetTrueFilters(TesterTrueFileFilter[] filters) {
        for (TesterTrueFileFilter filter : filters) {
            if (filter != null) {
                filter.reset();
            } 
        }
    }

    class TesterTrueFileFilter extends TrueFileFilter {
        private boolean invoked;

        @Override
        public boolean accept(File file) {
            setInvoked(true);
            return super.accept(file);
        }

        @Override
        public boolean accept(File file, String str) {
            setInvoked(true);
            return super.accept(file, str);
        }

        public boolean isInvoked() {
            return this.invoked;
        }

        public void setInvoked(boolean invoked) {
            this.invoked = invoked;
        }

        public void reset() {
            setInvoked(false);
        }
    }

    class TesterFalseFileFilter extends FalseFileFilter {
        private boolean invoked;

        @Override
        public boolean accept(File file) {
            setInvoked(true);
            return super.accept(file);
        }

        @Override
        public boolean accept(File file, String str) {
            setInvoked(true);
            return super.accept(file, str);
        }

        public boolean isInvoked() {
            return this.invoked;
        }

        public void setInvoked(boolean invoked) {
            this.invoked = invoked;
        }

        public void reset() {
            setInvoked(false);
        }
    }
}

