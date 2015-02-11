package org.apache.commons.codec.language.bm;

import org.junit.Test;

public class CacheSubSequencePerformanceTest {
    @Test(timeout = 1000)
    public void test_add74() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add74");
        final int times = 10000000;
        System.out.print("Test with String : ");
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_add75() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add75");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_add76() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add76");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_add77() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add77");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_add78() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add78");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_add79() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add79");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_add80() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add80");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_add81() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add81");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test");
        final int times = 10000001;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test_literalMutation160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation160");
        final int times = 10000000;
        System.out.print("foo");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test_literalMutation161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation161");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("foo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test_literalMutation162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation162");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("foo");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test_literalMutation163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation163");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("foo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test_literalMutation164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation164");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("foo");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test_literalMutation165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation165");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("foo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test_literalMutation166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation166");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("foo");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void test_literalMutation167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation167");
        final int times = 10000000;
        System.out.print("Test with String : ");
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("foo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_remove57() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove57");
        final int times = 10000000;
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_remove58() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove58");
        final int times = 10000000;
        System.out.print("Test with String : ");
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_remove59() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove59");
        final int times = 10000000;
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_remove60() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove60");
        final int times = 10000000;
        System.out.print("Test with String : ");
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_remove61() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove61");
        final int times = 10000000;
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_remove62() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove62");
        final int times = 10000000;
        System.out.print("Test with String : ");
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_remove63() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove63");
        final int times = 10000000;
        test("Angelo", times);
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void test_remove64() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove64");
        final int times = 10000000;
        System.out.print("Test with String : ");
        System.out.print("Test with StringBuilder : ");
        test(new java.lang.StringBuilder("Angelo"), times);
        System.out.print("Test with cached String : ");
        test(cacheSubSequence("Angelo"), times);
        System.out.print("Test with cached StringBuilder : ");
        test(cacheSubSequence(new java.lang.StringBuilder("Angelo")), times);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void test(final CharSequence input, final int times) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test");
        final long beginTime = System.currentTimeMillis();
        for (int i = 0 ; i < times ; i++) {
            test(input);
        }
        System.out.println((((System.currentTimeMillis()) - beginTime) + " millis"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void test_add83(final CharSequence input, final int times) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add83");
        final long beginTime = System.currentTimeMillis();
        for (int i = 0 ; i < times ; i++) {
            test(input);
            test(input);
        }
        System.out.println((((System.currentTimeMillis()) - beginTime) + " millis"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void test_add84(final CharSequence input, final int times) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add84");
        final long beginTime = System.currentTimeMillis();
        for (int i = 0 ; i < times ; i++) {
            test(input);
        }
        System.out.println((((System.currentTimeMillis()) - beginTime) + " millis"));
        System.out.println((((System.currentTimeMillis()) - beginTime) + " millis"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void test_literalMutation169(final CharSequence input, final int times) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation169");
        final long beginTime = System.currentTimeMillis();
        for (int i = 1 ; i < times ; i++) {
            test(input);
        }
        System.out.println((((System.currentTimeMillis()) - beginTime) + " millis"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void test_literalMutation170(final CharSequence input, final int times) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation170");
        final long beginTime = System.currentTimeMillis();
        for (int i = 0 ; i < times ; i++) {
            test(input);
        }
        System.out.println((((System.currentTimeMillis()) - beginTime) + "foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void test_remove66(final CharSequence input, final int times) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove66");
        final long beginTime = System.currentTimeMillis();
        for (int i = 0 ; i < times ; i++) {
        }
        System.out.println((((System.currentTimeMillis()) - beginTime) + " millis"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void test_remove67(final CharSequence input, final int times) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove67");
        final long beginTime = System.currentTimeMillis();
        for (int i = 0 ; i < times ; i++) {
            test(input);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void test(final CharSequence input) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test");
        for (int i = 0 ; i < (input.length()) ; i++) {
            for (int j = i ; j <= (input.length()) ; j++) {
                input.subSequence(i, j);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void test_add82(final CharSequence input) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_add82");
        for (int i = 0 ; i < (input.length()) ; i++) {
            for (int j = i ; j <= (input.length()) ; j++) {
                input.subSequence(i, j);
                input.subSequence(i, j);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void test_literalMutation168(final CharSequence input) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_literalMutation168");
        for (int i = 1 ; i < (input.length()) ; i++) {
            for (int j = i ; j <= (input.length()) ; j++) {
                input.subSequence(i, j);
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void test_remove65(final CharSequence input) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_remove65");
        for (int i = 0 ; i < (input.length()) ; i++) {
            for (int j = i ; j <= (input.length()) ; j++) {
            }
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private CharSequence cacheSubSequence(final CharSequence cached) {
        final CharSequence[][] cache = new CharSequence[cached.length()][cached.length()];
        return new CharSequence() {
            @Override
            public char charAt(final int index) {
                return cached.charAt(index);
            }

            @Override
            public int length() {
                return cached.length();
            }

            @Override
            public CharSequence subSequence(final int start, final int end) {
                if (start == end) {
                    return "";
                } 
                CharSequence res = cache[start][(end - 1)];
                if (res == null) {
                    res = cached.subSequence(start, end);
                    cache[start][(end - 1)] = res;
                } 
                return res;
            }
        };
    }
}

