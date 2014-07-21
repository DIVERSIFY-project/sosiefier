package fr.inria.diversify.coverage;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import static org.junit.Assert.assertNotNull;

/**
 * Created by marodrig on 21/07/2014.
 */
public class MultiCoverageReportTest {

    @Test
    public void multiTraceTestCreate() {
        ArrayList<File> f = new ArrayList<>();
        f.add(new File(""));
        f.add(new File(""));
        f.add(new File(""));
        MultiCoverageReport report = new MultiCoverageReport(f, false);
        assertNotNull(report);
    }

}
