package fr.inria.diversify.coverage;

import fr.inria.diversify.util.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class XMLCoverageReportTest {

    @Test
    public void testCreation() throws IOException {
        File coverageFile = new File(XMLCoverageReportTest.class.getClassLoader().getResource("coverage.xml").getFile());
        assertTrue(coverageFile.exists() && coverageFile.isFile());

        XMLCoverageReport report = new XMLCoverageReport(coverageFile);
        report.create();
        assertTrue(report.report.size() != 0);
    }

}