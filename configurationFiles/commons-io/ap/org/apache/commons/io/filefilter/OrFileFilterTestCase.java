package org.apache.commons.io.filefilter;

import java.util.ArrayList;
import java.util.List;

public class OrFileFilterTestCase extends ConditionalFileFilterAbstractTestCase {
    private static final String DEFAULT_WORKING_PATH = "./OrFileFilterTestCase/";

    private static final String WORKING_PATH_NAME_PROPERTY_KEY = (OrFileFilterTestCase.class.getName()) + ".workingDirectory";

    private List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> testFilters;

    private List<boolean[]> testTrueResults;

    private List<boolean[]> testFalseResults;

    private List<java.lang.Boolean> testFileResults;

    private List<java.lang.Boolean> testFilenameResults;

    public OrFileFilterTestCase(final String name) {
        super(name);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        setUpTestFilters();
    }

    @Override
    protected IOFileFilter buildFilterUsingAdd(final List<org.apache.commons.io.filefilter.IOFileFilter> filters) {
        OrFileFilter filter = new OrFileFilter();
        for (int i = 0 ; i < (filters.size()) ; i++) {
            filter.addFileFilter(filters.get(i));
        }
        return filter;
    }

    @Override
    protected IOFileFilter buildFilterUsingConstructor(final List<org.apache.commons.io.filefilter.IOFileFilter> filters) {
        return new OrFileFilter(filters);
    }

    @Override
    protected ConditionalFileFilter getConditionalFileFilter() {
        return new OrFileFilter();
    }

    @Override
    protected String getDefaultWorkingPath() {
        return DEFAULT_WORKING_PATH;
    }

    @Override
    protected List<boolean[]> getFalseResults() {
        return this.testFalseResults;
    }

    @Override
    protected List<java.lang.Boolean> getFileResults() {
        return this.testFileResults;
    }

    @Override
    protected List<java.lang.Boolean> getFilenameResults() {
        return this.testFilenameResults;
    }

    @Override
    protected List<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>> getTestFilters() {
        return this.testFilters;
    }

    @Override
    protected List<boolean[]> getTrueResults() {
        return this.testTrueResults;
    }

    @Override
    protected String getWorkingPathNamePropertyKey() {
        return WORKING_PATH_NAME_PROPERTY_KEY;
    }

    private void setUpTestFilters() {
        this.testFilters = new ArrayList<java.util.List<org.apache.commons.io.filefilter.IOFileFilter>>();
        this.testTrueResults = new ArrayList<boolean[]>();
        this.testFalseResults = new ArrayList<boolean[]>();
        this.testFileResults = new ArrayList<java.lang.Boolean>();
        this.testFilenameResults = new ArrayList<java.lang.Boolean>();
        {
            testFilters.add(0, null);
            testTrueResults.add(0, null);
            testFalseResults.add(0, null);
            testFileResults.add(0, null);
            testFilenameResults.add(0, null);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(trueFilters[1]);
            filters.add(trueFilters[2]);
            filters.add(trueFilters[3]);
            boolean[] trueResults = new boolean[]{ true , false , false };
            boolean[] falseResults = new boolean[]{ false , false , false };
            testFilters.add(1, filters);
            testTrueResults.add(1, trueResults);
            testFalseResults.add(1, falseResults);
            testFileResults.add(1, Boolean.TRUE);
            testFilenameResults.add(1, Boolean.TRUE);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(falseFilters[1]);
            filters.add(trueFilters[1]);
            filters.add(trueFilters[2]);
            filters.add(trueFilters[3]);
            filters.add(falseFilters[2]);
            filters.add(falseFilters[3]);
            boolean[] trueResults = new boolean[]{ true , false , false };
            boolean[] falseResults = new boolean[]{ true , false , false };
            testFilters.add(2, filters);
            testTrueResults.add(2, trueResults);
            testFalseResults.add(2, falseResults);
            testFileResults.add(2, Boolean.TRUE);
            testFilenameResults.add(2, Boolean.TRUE);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(trueFilters[1]);
            filters.add(falseFilters[1]);
            filters.add(trueFilters[2]);
            filters.add(trueFilters[3]);
            filters.add(falseFilters[2]);
            filters.add(falseFilters[3]);
            boolean[] trueResults = new boolean[]{ true , false , false };
            boolean[] falseResults = new boolean[]{ false , false , false };
            testFilters.add(3, filters);
            testTrueResults.add(3, trueResults);
            testFalseResults.add(3, falseResults);
            testFileResults.add(3, Boolean.TRUE);
            testFilenameResults.add(3, Boolean.TRUE);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(trueFilters[1]);
            filters.add(trueFilters[2]);
            filters.add(falseFilters[1]);
            filters.add(trueFilters[3]);
            filters.add(falseFilters[2]);
            filters.add(falseFilters[3]);
            boolean[] trueResults = new boolean[]{ true , false , false };
            boolean[] falseResults = new boolean[]{ false , false , false };
            testFilters.add(4, filters);
            testTrueResults.add(4, trueResults);
            testFalseResults.add(4, falseResults);
            testFileResults.add(4, Boolean.TRUE);
            testFilenameResults.add(4, Boolean.TRUE);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(falseFilters[1]);
            filters.add(trueFilters[1]);
            filters.add(falseFilters[2]);
            filters.add(falseFilters[3]);
            filters.add(trueFilters[2]);
            filters.add(trueFilters[3]);
            boolean[] trueResults = new boolean[]{ true , false , false };
            boolean[] falseResults = new boolean[]{ true , false , false };
            testFilters.add(5, filters);
            testTrueResults.add(5, trueResults);
            testFalseResults.add(5, falseResults);
            testFileResults.add(5, Boolean.TRUE);
            testFilenameResults.add(5, Boolean.TRUE);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(trueFilters[1]);
            filters.add(falseFilters[1]);
            filters.add(falseFilters[2]);
            filters.add(trueFilters[2]);
            filters.add(trueFilters[3]);
            filters.add(falseFilters[3]);
            boolean[] trueResults = new boolean[]{ true , false , false };
            boolean[] falseResults = new boolean[]{ false , false , false };
            testFilters.add(6, filters);
            testTrueResults.add(6, trueResults);
            testFalseResults.add(6, falseResults);
            testFileResults.add(6, Boolean.TRUE);
            testFilenameResults.add(6, Boolean.TRUE);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(falseFilters[1]);
            filters.add(falseFilters[2]);
            filters.add(trueFilters[1]);
            filters.add(falseFilters[3]);
            filters.add(trueFilters[2]);
            filters.add(trueFilters[3]);
            boolean[] trueResults = new boolean[]{ true , false , false };
            boolean[] falseResults = new boolean[]{ true , true , false };
            testFilters.add(7, filters);
            testTrueResults.add(7, trueResults);
            testFalseResults.add(7, falseResults);
            testFileResults.add(7, Boolean.TRUE);
            testFilenameResults.add(7, Boolean.TRUE);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(trueFilters[1]);
            filters.add(trueFilters[2]);
            filters.add(trueFilters[3]);
            filters.add(falseFilters[1]);
            boolean[] trueResults = new boolean[]{ true , false , false };
            boolean[] falseResults = new boolean[]{ false , false , false };
            testFilters.add(8, filters);
            testTrueResults.add(8, trueResults);
            testFalseResults.add(8, falseResults);
            testFileResults.add(8, Boolean.TRUE);
            testFilenameResults.add(8, Boolean.TRUE);
        }
        {
            List<org.apache.commons.io.filefilter.IOFileFilter> filters = new ArrayList<org.apache.commons.io.filefilter.IOFileFilter>();
            filters.add(falseFilters[1]);
            filters.add(falseFilters[2]);
            filters.add(falseFilters[3]);
            boolean[] trueResults = new boolean[]{ false , false , false };
            boolean[] falseResults = new boolean[]{ true , true , true };
            testFilters.add(9, filters);
            testTrueResults.add(9, trueResults);
            testFalseResults.add(9, falseResults);
            testFileResults.add(9, Boolean.FALSE);
            testFilenameResults.add(9, Boolean.FALSE);
        }
    }
}

