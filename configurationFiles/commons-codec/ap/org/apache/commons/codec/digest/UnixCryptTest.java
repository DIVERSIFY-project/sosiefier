package org.apache.commons.codec.digest;

import org.junit.Test;

public class UnixCryptTest {
    @Test
    public void testCtor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCtor");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1403,new org.apache.commons.codec.digest.UnixCrypt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnixCryptStrings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptStrings");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1417,null,1416,org.apache.commons.codec.digest.Crypt.crypt("secret", "xx"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1419,null,1418,org.apache.commons.codec.digest.Crypt.crypt("", "12"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1421,null,1420,org.apache.commons.codec.digest.Crypt.crypt("secret", "12"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1423,null,1422,org.apache.commons.codec.digest.Crypt.crypt("secret", "12345678"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnixCryptBytes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptBytes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1405,null,1404,org.apache.commons.codec.digest.Crypt.crypt(new byte[0], "12"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1407,null,1406,org.apache.commons.codec.digest.Crypt.crypt("täst", "./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1409,null,1408,org.apache.commons.codec.digest.Crypt.crypt("täst".getBytes(org.apache.commons.codec.Charsets.ISO_8859_1), "./"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1411,null,1410,org.apache.commons.codec.digest.Crypt.crypt(new byte[]{ ((byte)(116)) , ((byte)(228)) , ((byte)(115)) , ((byte)(116)) }, "./"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Some salts are invalid for crypt(3) but not for unixCrypt().
     */
@Test
    public void testUnixCryptExplicitCall() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptExplicitCall");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1413,org.apache.commons.codec.digest.UnixCrypt.crypt("secret".getBytes()),1412,org.apache.commons.codec.digest.UnixCrypt.crypt("secret".getBytes()).matches("^[a-zA-Z0-9./]{13}$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1415,org.apache.commons.codec.digest.UnixCrypt.crypt("secret".getBytes(), null),1414,org.apache.commons.codec.digest.UnixCrypt.crypt("secret".getBytes(), null).matches("^[a-zA-Z0-9./]{13}$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Single character salts are illegal!
     * E.g. with glibc 2.13, crypt("secret", "x") = "xxZREZpkHZpkI" but
     * crypt("secret", "xx") = "xxWAum7tHdIUw" which makes it unverifyable.
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testUnixCryptWithHalfSalt_add295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithHalfSalt_add295");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "x");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "x");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Single character salts are illegal!
     * E.g. with glibc 2.13, crypt("secret", "x") = "xxZREZpkHZpkI" but
     * crypt("secret", "xx") = "xxWAum7tHdIUw" which makes it unverifyable.
     */
@Test(expected = IllegalArgumentException.class)
    public void testUnixCryptWithHalfSalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithHalfSalt");
        org.apache.commons.codec.digest.UnixCrypt.crypt("foo", "x");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Single character salts are illegal!
     * E.g. with glibc 2.13, crypt("secret", "x") = "xxZREZpkHZpkI" but
     * crypt("secret", "xx") = "xxWAum7tHdIUw" which makes it unverifyable.
     */
@Test(expected = IllegalArgumentException.class)
    public void testUnixCryptWithHalfSalt_literalMutation1435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithHalfSalt_literalMutation1435");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Single character salts are illegal!
     * E.g. with glibc 2.13, crypt("secret", "x") = "xxZREZpkHZpkI" but
     * crypt("secret", "xx") = "xxWAum7tHdIUw" which makes it unverifyable.
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testUnixCryptWithHalfSalt_remove278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithHalfSalt_remove278");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Unimplemented "$foo$" salt prefixes would be threated as UnixCrypt salt.
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testUnicCryptInvalidSalt_add292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicCryptInvalidSalt_add292");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "$a");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "$a");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Unimplemented "$foo$" salt prefixes would be threated as UnixCrypt salt.
     */
@Test(expected = IllegalArgumentException.class)
    public void testUnicCryptInvalidSalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicCryptInvalidSalt");
        org.apache.commons.codec.digest.UnixCrypt.crypt("foo", "$a");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Unimplemented "$foo$" salt prefixes would be threated as UnixCrypt salt.
     */
@Test(expected = IllegalArgumentException.class)
    public void testUnicCryptInvalidSalt_literalMutation1430() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicCryptInvalidSalt_literalMutation1430");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Unimplemented "$foo$" salt prefixes would be threated as UnixCrypt salt.
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testUnicCryptInvalidSalt_remove275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnicCryptInvalidSalt_remove275");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testUnixCryptNullData() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptNullData");
        org.apache.commons.codec.digest.UnixCrypt.crypt(((byte[])(null)));
        org.apache.commons.codec.digest.UnixCrypt.crypt(((byte[])(null)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testUnixCryptNullData_remove276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptNullData_remove276");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testUnixCryptWithEmptySalt_add294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithEmptySalt_add294");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnixCryptWithEmptySalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithEmptySalt");
        org.apache.commons.codec.digest.UnixCrypt.crypt("foo", "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnixCryptWithEmptySalt_literalMutation1433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithEmptySalt_literalMutation1433");
        org.apache.commons.codec.digest.UnixCrypt.crypt("secret", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testUnixCryptWithEmptySalt_remove277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithEmptySalt_remove277");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnixCryptWithoutSalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithoutSalt");
        final String hash = org.apache.commons.codec.digest.UnixCrypt.crypt("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1425,hash,1424,hash.matches("^[a-zA-Z0-9./]{13}$"));
        final String hash2 = org.apache.commons.codec.digest.UnixCrypt.crypt("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1426,hash);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1427,hash2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testUnixCryptWithoutSalt_literalMutation1437() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnixCryptWithoutSalt_literalMutation1437");
        final String hash = org.apache.commons.codec.digest.UnixCrypt.crypt("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1425,hash,1424,hash.matches("^[a-zA-Z0-9./]{13}$"));
        final String hash2 = org.apache.commons.codec.digest.UnixCrypt.crypt("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1426,hash);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1427,hash2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

