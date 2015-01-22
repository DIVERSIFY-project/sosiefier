package fr.inria.diversify.oldTests.coverage;

import fr.inria.diversify.coverage.BinaryTraceCoverageReport;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by marodrig on 18/07/2014.
 */
public class BinaryTraceCoverageReportTest {


    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Test
    @Ignore
    public void testCreateCoverage() throws Exception {
        BinaryTraceCoverageReport report = new BinaryTraceCoverageReport(getResourcePath("tracebinarylog.log"));
        report.create();
        assertTrue(report.getMethodSignatures().size() > 0);
    }

}
