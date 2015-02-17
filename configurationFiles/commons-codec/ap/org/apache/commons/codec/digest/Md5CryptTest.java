package org.apache.commons.codec.digest;

import org.junit.Test;

public class Md5CryptTest {
    @Test
    public void testCtor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCtor");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1317,new org.apache.commons.codec.digest.Md5Crypt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testMd5CryptStrings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptStrings");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1331,null,1330,org.apache.commons.codec.digest.Crypt.crypt("", "$1$foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1333,null,1332,org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$1234"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1335,null,1334,org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$1234$567"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1337,null,1336,org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$1234$567$890"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1339,null,1338,org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$1234567890123456"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1341,null,1340,org.apache.commons.codec.digest.Crypt.crypt("secret", "$1$123456789012345678"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testMd5CryptBytes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptBytes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,null,1318,org.apache.commons.codec.digest.Crypt.crypt(new byte[0], "$1$foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,null,1320,org.apache.commons.codec.digest.Crypt.crypt("täst", "$1$./$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1323,null,1322,org.apache.commons.codec.digest.Crypt.crypt("täst".getBytes(org.apache.commons.codec.Charsets.ISO_8859_1), "$1$./$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testMd5CryptExplicitCall() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptExplicitCall");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1325,org.apache.commons.codec.digest.Md5Crypt.md5Crypt("secret".getBytes()),1324,org.apache.commons.codec.digest.Md5Crypt.md5Crypt("secret".getBytes()).matches("^\\$1\\$[a-zA-Z0-9./]{0,8}\\$.{1,}$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1327,org.apache.commons.codec.digest.Md5Crypt.md5Crypt("secret".getBytes(), null),1326,org.apache.commons.codec.digest.Md5Crypt.md5Crypt("secret".getBytes(), null).matches("^\\$1\\$[a-zA-Z0-9./]{0,8}\\$.{1,}$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testMd5CryptLongInput() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptLongInput");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1329,null,1328,org.apache.commons.codec.digest.Crypt.crypt("12345678901234567890", "$1$1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testMd5CryptNullData() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptNullData");
        org.apache.commons.codec.digest.Md5Crypt.md5Crypt(((byte[])(null)));
        org.apache.commons.codec.digest.Md5Crypt.md5Crypt(((byte[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testMd5CryptNullData_remove266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptNullData_remove266");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testMd5CryptWithEmptySalt_add284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptWithEmptySalt_add284");
        org.apache.commons.codec.digest.Md5Crypt.md5Crypt("secret".getBytes(), "");
        org.apache.commons.codec.digest.Md5Crypt.md5Crypt("secret".getBytes(), "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMd5CryptWithEmptySalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptWithEmptySalt");
        org.apache.commons.codec.digest.Md5Crypt.md5Crypt("bar".getBytes(), "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMd5CryptWithEmptySalt_literalMutation1532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptWithEmptySalt_literalMutation1532");
        org.apache.commons.codec.digest.Md5Crypt.md5Crypt("secret".getBytes(), "bar");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testMd5CryptWithEmptySalt_remove267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMd5CryptWithEmptySalt_remove267");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

