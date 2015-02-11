package org.apache.commons.io.filefilter;

import java.util.ArrayList;
import java.io.File;
import java.util.List;
import org.junit.Test;

public abstract class ConditionalFileFilterAbstractTestCase extends IOFileFilterAbstractTestCase {
    private static final String TEST_FILE_NAME_PREFIX = "TestFile";

    private static final String TEST_FILE_TYPE = ".tst";

    protected IOFileFilterAbstractTestCase.TesterTrueFileFilter[] trueFilters;

    protected IOFileFilterAbstractTestCase.TesterFalseFileFilter[] falseFilters;

    private File file;

    private File workingPath;

    public ConditionalFileFilterAbstractTestCase(final String name) {
        super(name);
    }

    @Override
    public void setUp() throws Exception {
        this.workingPath = determineWorkingDirectoryPath(getWorkingPathNamePropertyKey(), getDefaultWorkingPath());
        this.file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        this.trueFilters = new IOFileFilterAbstractTestCase.TesterTrueFileFilter[4];
        this.falseFilters = new IOFileFilterAbstractTestCase.TesterFalseFileFilter[4];
        this.trueFilters[1] = new IOFileFilterAbstractTestCase.TesterTrueFileFilter();
        this.trueFilters[2] = new IOFileFilterAbstractTestCase.TesterTrueFileFilter();
        this.trueFilters[3] = new IOFileFilterAbstractTestCase.TesterTrueFileFilter();
        this.falseFilters[1] = new IOFileFilterAbstractTestCase.TesterFalseFileFilter();
        this.falseFilters[2] = new IOFileFilterAbstractTestCase.TesterFalseFileFilter();
        this.falseFilters[3] = new IOFileFilterAbstractTestCase.TesterFalseFileFilter();
    }

    @Test(timeout = 1000)
    public void testAdd_add537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add537");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_add538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add538");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_add539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add539");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_add540() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add540");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_add541() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add541");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = -1 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_remove387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove387");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_remove388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove388");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_remove389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove389");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_remove390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove390");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fileFilter.addFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdd_remove391() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove391");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1138,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1140,fileFilter.getFileFilters(),1139,fileFilter.getFileFilters().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,fileFilter.getFileFilters(),1142,fileFilter.getFileFilters().size());
        }
        for (IOFileFilter filter : fileFilter.getFileFilters()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,filters,1144,filters.contains(filter));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,filters,1146,filters.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,fileFilter.getFileFilters(),1148,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add564");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add565");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add566");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add567");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add568");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 1 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove414() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove414");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove415() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove415");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove416() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove416");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove417() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove417");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fileFilter.removeFileFilter(filters.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove418");
        List<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilterAbstractTestCase.TesterTrueFileFilter>();
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        filters.add(new IOFileFilterAbstractTestCase.TesterTrueFileFilter());
        for (int i = 0 ; i < (filters.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1150,!(fileFilter.getFileFilters().contains(filters.get(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1152,fileFilter.getFileFilters(),1151,fileFilter.getFileFilters().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNoFilters_add562() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters_add562");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        assertFileFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        assertFileFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        assertFilenameFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNoFilters_add563() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters_add563");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        assertFileFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        assertFilenameFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        assertFilenameFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoFilters() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 2) + (TEST_FILE_TYPE)));
        assertFileFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        assertFilenameFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoFilters_literalMutation1538() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters_literalMutation1538");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        assertFileFiltering(0, ((IOFileFilter)(fileFilter)), file, false);
        assertFilenameFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoFilters_literalMutation1539() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters_literalMutation1539");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        assertFileFiltering(1, ((IOFileFilter)(fileFilter)), file, true);
        assertFilenameFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoFilters_literalMutation1540() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters_literalMutation1540");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        assertFileFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        assertFilenameFiltering(0, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNoFilters_literalMutation1541() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters_literalMutation1541");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        assertFileFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        assertFilenameFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNoFilters_remove412() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters_remove412");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        assertFilenameFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNoFilters_remove413() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoFilters_remove413");
        ConditionalFileFilter fileFilter = getConditionalFileFilter();
        File file = new File(this.workingPath , (((TEST_FILE_NAME_PREFIX) + 1) + (TEST_FILE_TYPE)));
        assertFileFiltering(1, ((IOFileFilter)(fileFilter)), file, false);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add552() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add552");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add553() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add553");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add554() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add554");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add555() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add555");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add556() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add556");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add557() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add557");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add558() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add558");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add559() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add559");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add560() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add560");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_add561() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_add561");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFilterBuiltUsingConstructor() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 0 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove402() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove402");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove403() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove403");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove404() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove404");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove405() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove405");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove406() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove406");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove407() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove407");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove408() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove408");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove409() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove409");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove410() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove410");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingConstructor_remove411() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingConstructor_remove411");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingConstructor(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add542() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add542");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add543() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add543");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add544() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add544");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add545() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add545");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add546() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add546");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add547() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add547");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add548() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add548");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add549() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add549");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add550() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add550");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_add551() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_add551");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFilterBuiltUsingAdd() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 0 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove392() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove392");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove393() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove393");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove394() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove394");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove395() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove395");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove396() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove396");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove397() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove397");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove398() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove398");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove399() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove399");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove400() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove400");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilterBuiltUsingAdd_remove401() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilterBuiltUsingAdd_remove401");
        List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters = getTestFilters();
        List<boolean[]> testTrueResults = getTrueResults();
        List<boolean[]> testFalseResults = getFalseResults();
        List<java.lang.Boolean> testFileResults = getFileResults();
        List<java.lang.Boolean> testFilenameResults = getFilenameResults();
        for (int i = 1 ; i < (testFilters.size()) ; i++) {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = testFilters.get(i);
            boolean[] trueResults = testTrueResults.get(i);
            boolean[] falseResults = testFalseResults.get(i);
            boolean fileResults = testFileResults.get(i).booleanValue();
            boolean filenameResults = testFilenameResults.get(i).booleanValue();
            IOFileFilter filter = buildFilterUsingAdd(filters);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFileFiltering(i, filter, this.file, fileResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            resetTrueFilters(this.trueFilters);
            resetFalseFilters(this.falseFilters);
            assertFilenameFiltering(i, filter, this.file, filenameResults);
            assertTrueFiltersInvoked(i, trueFilters, trueResults);
            assertFalseFiltersInvoked(i, falseFilters, falseResults);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    protected abstract ConditionalFileFilter getConditionalFileFilter();

    protected abstract IOFileFilter buildFilterUsingAdd(List<org.apache.commons.io.filefilter.IOFileFilter> filters);

    protected abstract IOFileFilter buildFilterUsingConstructor(List<org.apache.commons.io.filefilter.IOFileFilter> filters);

    protected abstract List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> getTestFilters();

    protected abstract List<boolean[]> getTrueResults();

    protected abstract List<boolean[]> getFalseResults();

    protected abstract List<java.lang.Boolean> getFileResults();

    protected abstract List<java.lang.Boolean> getFilenameResults();

    protected abstract String getWorkingPathNamePropertyKey();

    protected abstract String getDefaultWorkingPath();
}

