package org.apache.commons.codec.digest;

import org.junit.Test;

public class Apr1CryptTest {
    @Test
    public void testApr1CryptStrings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptStrings");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1157,null,1156,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$TqI9WECO"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1159,null,1158,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("", "$apr1$foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1161,null,1160,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$1234"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1163,null,1162,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$1234$567"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1165,null,1164,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$1234$567$890"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1167,null,1166,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$1234567890123456"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1169,null,1168,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "$apr1$123456789012345678"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testApr1CryptBytes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptBytes");
        final byte[] keyBytes = new byte[]{ '!' , 'b' , 'c' , '.' };
        final String hash = org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(keyBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,hash);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,null,1142,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("!bc.", hash));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,null,1144,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(new byte[0], "$apr1$foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,null,1146,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("täst", "$apr1$./$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,null,1148,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("täst".getBytes(org.apache.commons.codec.Charsets.ISO_8859_1), "$apr1$./$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testApr1CryptExplicitCall() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptExplicitCall");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1151,null,1150,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "1234"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1153,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret".getBytes()),1152,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret".getBytes()).matches("^\\$apr1\\$[a-zA-Z0-9./]{0,8}\\$.{1,}$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1155,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret".getBytes(), null),1154,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret".getBytes(), null).matches("^\\$apr1\\$[a-zA-Z0-9./]{0,8}\\$.{1,}$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testApr1LongSalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1LongSalt");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1175,null,1174,org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret", "12345678901234567890"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testApr1CryptNullData() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptNullData");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(((byte[])(null)));
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(((byte[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testApr1CryptNullData_remove227() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptNullData_remove227");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testApr1CryptWithEmptySalt_add245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithEmptySalt_add245");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret".getBytes(), "");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret".getBytes(), "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApr1CryptWithEmptySalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithEmptySalt");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("foo".getBytes(), "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApr1CryptWithEmptySalt_literalMutation1355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithEmptySalt_literalMutation1355");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret".getBytes(), "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testApr1CryptWithEmptySalt_remove228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithEmptySalt_remove228");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testApr1CryptWithoutSalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithoutSalt");
        final String hash = org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1171,hash,1170,hash.matches("^\\$apr1\\$[a-zA-Z0-9\\./]{8}\\$[a-zA-Z0-9\\./]{22}$"));
        final String hash2 = org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1172,hash);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1173,hash2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testApr1CryptWithoutSalt_literalMutation1359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithoutSalt_literalMutation1359");
        final String hash = org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("secret");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1171,hash,1170,hash.matches("^\\$apr1\\$[a-zA-Z0-9\\./]{8}\\$[a-zA-Z0-9\\./]{22}$"));
        final String hash2 = org.apache.commons.codec.digest.Md5Crypt.apr1Crypt("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1172,hash);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1173,hash2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testApr1CryptWithInvalidSalt_add246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithInvalidSalt_add246");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(new byte[0], "!");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(new byte[0], "!");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApr1CryptWithInvalidSalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithInvalidSalt");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(new byte[-1], "!");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApr1CryptWithInvalidSalt_literalMutation1357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithInvalidSalt_literalMutation1357");
        org.apache.commons.codec.digest.Md5Crypt.apr1Crypt(new byte[0], "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testApr1CryptWithInvalidSalt_remove229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testApr1CryptWithInvalidSalt_remove229");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

