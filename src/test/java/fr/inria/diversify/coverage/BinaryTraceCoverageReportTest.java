package fr.inria.diversify.coverage;

import fr.inria.diversify.TestingContext;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by marodrig on 18/07/2014.
 */
public class BinaryTraceCoverageReportTest {


    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Test
    public void testCoverage() throws Exception {

        TestingContext.createInputProgram(getResourcePath("easymock-light-3.2"));
        TestingContext.loadTransformations(getResourcePath("easymock-sosies.json"));

        BinaryTraceCoverageReport report = new BinaryTraceCoverageReport(getResourcePath("tracebinarylog.log"));
        report.create();
        assertEquals(1, report.codeFragmentCoverage(TestingContext.getInputProgram().getCodeFragments().get(0)));
    }


}
