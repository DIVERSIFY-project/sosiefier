package fr.inria.diversify.coverage;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by marodrig on 20/07/2014.
 */
public class TextTraceCoverageReportTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Test
    public void testCreateCoverage() throws Exception {
        TextTraceCoverageReport report = new TextTraceCoverageReport(getResourcePath("text-trace"));
        report.create();
        assertTrue(report.getMethodSignatures().size() > 0);


        int i = 0;
        for (String s : report.getMethodSignatures() ) {
            i++;
            System.out.println(i + " " + s);
        }
    }

}
