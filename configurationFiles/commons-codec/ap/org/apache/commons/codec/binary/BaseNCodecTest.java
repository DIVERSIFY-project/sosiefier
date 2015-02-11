package org.apache.commons.codec.binary;

import org.junit.Before;
import org.junit.Test;

public class BaseNCodecTest {
    BaseNCodec codec;

    @Before
    public void setUp() {
        codec = new BaseNCodec(0, 0, 0, 0) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final Context context) {
            }
        };
    }

    @Test
    public void testBaseNCodec() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBaseNCodec");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,codec);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsWhiteSpace() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsWhiteSpace");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2292,null,2291,org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(((byte)(' '))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2294,null,2293,org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(((byte)('\n'))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2296,null,2295,org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(((byte)('\r'))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2298,null,2297,org.apache.commons.codec.binary.BaseNCodec.isWhiteSpace(((byte)('\t'))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsInAlphabetByte() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsInAlphabetByte");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2264,codec,2263,codec.isInAlphabet(((byte)(0))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2266,codec,2265,codec.isInAlphabet(((byte)('a'))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2268,codec,2267,codec.isInAlphabet(((byte)('O'))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2270,codec,2269,codec.isInAlphabet(((byte)('K'))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsInAlphabetByteArrayBoolean() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsInAlphabetByteArrayBoolean");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2272,codec,2271,codec.isInAlphabet(new byte[]{  }, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2274,codec,2273,codec.isInAlphabet(new byte[]{ 'O' }, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2276,codec,2275,codec.isInAlphabet(new byte[]{ 'O' , ' ' }, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2278,codec,2277,codec.isInAlphabet(new byte[]{ ' ' }, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2280,codec,2279,codec.isInAlphabet(new byte[]{  }, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2282,codec,2281,codec.isInAlphabet(new byte[]{ 'O' }, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2284,codec,2283,codec.isInAlphabet(new byte[]{ 'O' , ' ' }, true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2286,codec,2285,codec.isInAlphabet(new byte[]{ ' ' }, true));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testIsInAlphabetString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsInAlphabetString");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2288,codec,2287,codec.isInAlphabet("OK"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2290,codec,2289,codec.isInAlphabet("O=K= \t\n\r"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testContainsAlphabetOrPad() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsAlphabetOrPad");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,codec,2251,codec.containsAlphabetOrPad(null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,codec,2253,codec.containsAlphabetOrPad(new byte[]{  }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,codec,2255,codec.containsAlphabetOrPad("OK".getBytes()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,codec,2257,codec.containsAlphabetOrPad("OK ".getBytes()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,codec,2259,codec.containsAlphabetOrPad("ok ".getBytes()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,codec,2261,codec.containsAlphabetOrPad(new byte[]{ codec.pad }));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testProvidePaddingByte_add482() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testProvidePaddingByte_add482");
        codec = new BaseNCodec(0, 0, 0, 0, ((byte)(37))) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final Context context) {
            }
        };
        byte actualPaddingByte = codec.pad;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,actualPaddingByte);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testProvidePaddingByte() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testProvidePaddingByte");
        codec = new BaseNCodec(-1, 0, 0, 0, ((byte)(37))) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final Context context) {
            }
        };
        byte actualPaddingByte = codec.pad;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,actualPaddingByte);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testProvidePaddingByte_literalMutation1950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testProvidePaddingByte_literalMutation1950");
        codec = new BaseNCodec(0, 1, 0, 0, ((byte)(37))) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final Context context) {
            }
        };
        byte actualPaddingByte = codec.pad;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,actualPaddingByte);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testProvidePaddingByte_literalMutation1951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testProvidePaddingByte_literalMutation1951");
        codec = new BaseNCodec(0, 0, 1, 0, ((byte)(37))) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final Context context) {
            }
        };
        byte actualPaddingByte = codec.pad;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,actualPaddingByte);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testProvidePaddingByte_literalMutation1952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testProvidePaddingByte_literalMutation1952");
        codec = new BaseNCodec(0, 0, 0, -1, ((byte)(37))) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final Context context) {
            }
        };
        byte actualPaddingByte = codec.pad;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,actualPaddingByte);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testProvidePaddingByte_literalMutation1953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testProvidePaddingByte_literalMutation1953");
        codec = new BaseNCodec(0, 0, 0, 0, ((byte)(36))) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final Context context) {
            }
        };
        byte actualPaddingByte = codec.pad;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,actualPaddingByte);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testProvidePaddingByte_remove435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testProvidePaddingByte_remove435");
        codec = new BaseNCodec(0, 0, 0, 0, ((byte)(37))) {
            @Override
            protected boolean isInAlphabet(final byte b) {
                return (b == 'O') || (b == 'K');
            }

            @Override
            void encode(final byte[] pArray, final int i, final int length, final Context context) {
            }

            @Override
            void decode(final byte[] pArray, final int i, final int length, final Context context) {
            }
        };
        byte actualPaddingByte = codec.pad;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,actualPaddingByte);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

