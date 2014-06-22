package fr.inria.diversify.statistic;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by marcel on 22/06/14.
 */
public class SessionResultTest {

    private SessionResults createSession() {
        RunResults r1 = new RunResults();
        RunResults r2 = new RunResults();
        RunResults r3 = new RunResults();
        r1.setStatus(-2);
        r2.setStatus(0);
        r3.setStatus(-1);

        SessionResults session = new SessionResults();
        session.addRunResults(r1);
        session.addRunResults(r2);
        session.addRunResults(r3);
        return session;
    }

    @Test
    public void testToAndFromFile() throws Exception {

        SessionResults session = createSession();

        session.saveReport("report.txt");

        File f = new File("report.txt");
        Assert.assertTrue(f.exists());
    }

    @Test
    public void testAdd() throws Exception {
        SessionResults session = createSession();
        Assert.assertEquals(session.getSosieCount(), 1);
        Assert.assertEquals(session.getCompileFailedCount(), 1);
        Assert.assertEquals(session.getTestFailedCount(), 1);
    }

}
