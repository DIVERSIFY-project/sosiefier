package org.apache.commons.codec.digest;

import org.junit.Ignore;
import org.junit.Test;

public class Sha512CryptTest {
    @Test
    public void testSha512CryptStrings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptStrings");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,null,1391,org.apache.commons.codec.digest.Crypt.crypt("", "$6$foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,null,1393,org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$45678"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1396,null,1395,org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$45678$012"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1398,null,1397,org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$45678$012$456"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1400,null,1399,org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$1234567890123456"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1402,null,1401,org.apache.commons.codec.digest.Crypt.crypt("secret", "$6$1234567890123456789"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha512CryptBytes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptBytes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1382,null,1381,org.apache.commons.codec.digest.Crypt.crypt(new byte[0], "$6$foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1384,null,1383,org.apache.commons.codec.digest.Crypt.crypt("täst", "$6$./$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,null,1385,org.apache.commons.codec.digest.Crypt.crypt("täst".getBytes(org.apache.commons.codec.Charsets.ISO_8859_1), "$6$./$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha512CryptExplicitCall() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptExplicitCall");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes()),1387,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes()).matches("^\\$6\\$[a-zA-Z0-9./]{0,16}\\$.{1,}$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes(), null),1389,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes(), null).matches("^\\$6\\$[a-zA-Z0-9./]{0,16}\\$.{1,}$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testSha512CryptNullData() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptNullData");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(((byte[])(null)));
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(((byte[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testSha512CryptNullData_remove273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptNullData_remove273");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Ignore
    public void testSha512CryptNullSalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptNullSalt");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha2CryptRounds() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha2CryptRounds");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,null,1375,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "$5$rounds=50$abcd$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1378,null,1377,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "$5$rounds=1001$abcd$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1380,null,1379,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "$5$rounds=9999$abcd"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha2CryptWrongSalt_add289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha2CryptWrongSalt_add289");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "xx");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "xx");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSha2CryptWrongSalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha2CryptWrongSalt");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("foo".getBytes(org.apache.commons.codec.Charsets.UTF_8), "xx");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSha2CryptWrongSalt_literalMutation1425() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha2CryptWrongSalt_literalMutation1425");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha2CryptWrongSalt_remove272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha2CryptWrongSalt_remove272");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha512CryptWithEmptySalt_add291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptWithEmptySalt_add291");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes(), "");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes(), "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSha512CryptWithEmptySalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptWithEmptySalt");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("foo".getBytes(), "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSha512CryptWithEmptySalt_literalMutation1428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptWithEmptySalt_literalMutation1428");
        org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt("secret".getBytes(), "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha512CryptWithEmptySalt_remove274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha512CryptWithEmptySalt_remove274");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256LargetThanBlocksize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize");
        final byte[] buffer = new byte[200];
        java.util.Arrays.fill(buffer, 0, 200, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1374,null,1373,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(buffer, "$6$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha256LargetThanBlocksize_add288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_add288");
        final byte[] buffer = new byte[200];
        java.util.Arrays.fill(buffer, 0, 200, ((byte)('A')));
        java.util.Arrays.fill(buffer, 0, 200, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1374,null,1373,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(buffer, "$6$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256LargetThanBlocksize_literalMutation1420() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_literalMutation1420");
        final byte[] buffer = new byte[199];
        java.util.Arrays.fill(buffer, 0, 200, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1374,null,1373,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(buffer, "$6$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256LargetThanBlocksize_literalMutation1421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_literalMutation1421");
        final byte[] buffer = new byte[200];
        java.util.Arrays.fill(buffer, 1, 200, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1374,null,1373,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(buffer, "$6$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256LargetThanBlocksize_literalMutation1422() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_literalMutation1422");
        final byte[] buffer = new byte[200];
        java.util.Arrays.fill(buffer, 0, 199, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1374,null,1373,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(buffer, "$6$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha256LargetThanBlocksize_remove271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_remove271");
        final byte[] buffer = new byte[200];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1374,null,1373,org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(buffer, "$6$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

