package org.apache.commons.codec.digest;

import org.junit.Test;

public class Sha256CryptTest {
    @Test
    public void testSha256CryptStrings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptStrings");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1353,null,1352,org.apache.commons.codec.digest.Crypt.crypt("", "$5$foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1355,null,1354,org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$45678"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1357,null,1356,org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$45678$012"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1359,null,1358,org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$45678$012$456"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1361,null,1360,org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$1234567890123456"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1363,null,1362,org.apache.commons.codec.digest.Crypt.crypt("secret", "$5$1234567890123456789"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256CryptBytes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptBytes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1343,null,1342,org.apache.commons.codec.digest.Crypt.crypt(new byte[0], "$5$foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1345,null,1344,org.apache.commons.codec.digest.Crypt.crypt("täst", "$5$./$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1347,null,1346,org.apache.commons.codec.digest.Crypt.crypt("täst".getBytes(org.apache.commons.codec.Charsets.ISO_8859_1), "$5$./$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha2CryptRounds() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha2CryptRounds");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,null,1366,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "$5$rounds=50$abcd$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1369,null,1368,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "$5$rounds=1001$abcd$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1371,null,1370,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(org.apache.commons.codec.Charsets.UTF_8), "$5$rounds=9999$abcd"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256CryptExplicitCall() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptExplicitCall");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1349,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes()),1348,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes()).matches("^\\$5\\$[a-zA-Z0-9./]{0,16}\\$.{1,}$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1351,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(), null),1350,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(), null).matches("^\\$5\\$[a-zA-Z0-9./]{0,16}\\$.{1,}$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testSha256CryptNullData() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptNullData");
        org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(((byte[])(null)));
        org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(((byte[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testSha256CryptNullData_remove268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptNullData_remove268");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha256CryptWithEmptySalt_add286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptWithEmptySalt_add286");
        org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(), "");
        org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(), "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSha256CryptWithEmptySalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptWithEmptySalt");
        org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("foo".getBytes(), "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSha256CryptWithEmptySalt_literalMutation1415() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptWithEmptySalt_literalMutation1415");
        org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt("secret".getBytes(), "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testSha256CryptWithEmptySalt_remove269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256CryptWithEmptySalt_remove269");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha256LargetThanBlocksize_add287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_add287");
        final byte[] buffer = new byte[200];
        java.util.Arrays.fill(buffer, 0, 200, ((byte)('A')));
        java.util.Arrays.fill(buffer, 0, 200, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,null,1364,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(buffer, "$5$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256LargetThanBlocksize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize");
        final byte[] buffer = new byte[201];
        java.util.Arrays.fill(buffer, 0, 200, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,null,1364,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(buffer, "$5$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256LargetThanBlocksize_literalMutation1417() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_literalMutation1417");
        final byte[] buffer = new byte[200];
        java.util.Arrays.fill(buffer, 1, 200, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,null,1364,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(buffer, "$5$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSha256LargetThanBlocksize_literalMutation1418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_literalMutation1418");
        final byte[] buffer = new byte[200];
        java.util.Arrays.fill(buffer, 0, 199, ((byte)('A')));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,null,1364,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(buffer, "$5$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSha256LargetThanBlocksize_remove270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSha256LargetThanBlocksize_remove270");
        final byte[] buffer = new byte[200];
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,null,1364,org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(buffer, "$5$abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

