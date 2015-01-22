package fr.inria.diversify.oldTests.sosie.logger;

import fr.inria.diversify.sosie.logger.LogWriter;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.Assert.assertEquals;

/**
 * A test to solve the multi-threading problem of code instrumentation
 * <p/>
 * Created by marodrig on 29/09/2014.
 */
public class LogWriterTest {

    private static int THREAD_COUNT = 10;

    @Test
    public void testMultiThreadingLog_AllOK() throws InterruptedException, ExecutionException {

        final boolean runTimeErrors = false;

        LogWriter.writeTestStart(Thread.currentThread(), "testMultiThreadingLog");

        final Callable<Boolean> logCall = new Callable<Boolean>() {
            public Boolean call() throws Exception {
                try {
                    LogWriter.writeSourcePositionCall("1");
                    LogWriter.writeAssert(0, Thread.currentThread(), "the.class", "theMethod", null);
                    return false;
                } catch (Exception e) {
                    return true;
                }
            }
        };

        final ExecutorService service = Executors.newFixedThreadPool(THREAD_COUNT);
        final List<Callable<Boolean>> tasks = Collections.nCopies(THREAD_COUNT, logCall);
        final List<Future<Boolean>> results = service.invokeAll(tasks);

        for (final Future<Boolean> future : results) {
            assertEquals(false, future.get());
        }

        LogWriter.writeTestFinish();
    }

}
