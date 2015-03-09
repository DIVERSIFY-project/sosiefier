package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.FunctorException;
import java.io.IOException;
import org.junit.Test;

public class CatchAndRethrowClosureTest extends AbstractClosureTest {
    private static <T>Closure<T> generateIOExceptionClosure() {
        return new CatchAndRethrowClosure<T>() {
            @Override
            protected void executeAndThrow(final T input) throws IOException {
                throw new IOException();
            }
        };
    }

    private static <T>Closure<T> generateNullPointerExceptionClosure() {
        return new CatchAndRethrowClosure<T>() {
            @Override
            protected void executeAndThrow(final T input) {
                throw new NullPointerException();
            }
        };
    }

    private static <T>Closure<T> generateNoExceptionClosure() {
        return new CatchAndRethrowClosure<T>() {
            @Override
            protected void executeAndThrow(final T input) {
            }
        };
    }

    @Override
    protected <T>Closure<T> generateClosure() {
        return CatchAndRethrowClosureTest.generateNoExceptionClosure();
    }

    @Test(timeout = 1000)
    public void testThrowingClosure_add1225() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowingClosure_add1225");
        Closure<java.lang.Integer> closure = CatchAndRethrowClosureTest.generateNoExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateIOExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4442,((ex.getCause()) instanceof java.io.IOException));
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateNullPointerExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4443,(ex instanceof java.lang.NullPointerException));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testThrowingClosure_add1226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowingClosure_add1226");
        Closure<java.lang.Integer> closure = CatchAndRethrowClosureTest.generateNoExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateIOExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4442,((ex.getCause()) instanceof java.io.IOException));
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateNullPointerExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4443,(ex instanceof java.lang.NullPointerException));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testThrowingClosure_add1227() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowingClosure_add1227");
        Closure<java.lang.Integer> closure = CatchAndRethrowClosureTest.generateNoExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateIOExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4442,((ex.getCause()) instanceof java.io.IOException));
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateNullPointerExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4443,(ex instanceof java.lang.NullPointerException));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testThrowingClosure() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowingClosure");
        Closure<java.lang.Integer> closure = CatchAndRethrowClosureTest.generateNoExceptionClosure();
        try {
            closure.execute(Integer.valueOf(1));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateIOExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4442,((ex.getCause()) instanceof java.io.IOException));
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateNullPointerExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4443,(ex instanceof java.lang.NullPointerException));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testThrowingClosure_literalMutation1176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowingClosure_literalMutation1176");
        Closure<java.lang.Integer> closure = CatchAndRethrowClosureTest.generateNoExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateIOExceptionClosure();
        try {
            closure.execute(Integer.valueOf(-1));
        } catch (final FunctorException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4442,((ex.getCause()) instanceof java.io.IOException));
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateNullPointerExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4443,(ex instanceof java.lang.NullPointerException));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testThrowingClosure_literalMutation1177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThrowingClosure_literalMutation1177");
        Closure<java.lang.Integer> closure = CatchAndRethrowClosureTest.generateNoExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateIOExceptionClosure();
        try {
            closure.execute(Integer.valueOf(0));
        } catch (final FunctorException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4442,((ex.getCause()) instanceof java.io.IOException));
        } catch (final RuntimeException ex) {
        }
        closure = CatchAndRethrowClosureTest.generateNullPointerExceptionClosure();
        try {
            closure.execute(Integer.valueOf(1));
        } catch (final FunctorException ex) {
        } catch (final RuntimeException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4443,(ex instanceof java.lang.NullPointerException));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

