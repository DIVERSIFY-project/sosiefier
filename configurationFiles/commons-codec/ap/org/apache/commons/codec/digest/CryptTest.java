package org.apache.commons.codec.digest;

import org.junit.Test;

public class CryptTest {
    @Test
    public void testDefaultCryptVariant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultCryptVariant");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1185,org.apache.commons.codec.digest.Crypt.crypt("secret"),1184,org.apache.commons.codec.digest.Crypt.crypt("secret").startsWith("$6$"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1187,org.apache.commons.codec.digest.Crypt.crypt("secret", null),1186,org.apache.commons.codec.digest.Crypt.crypt("secret", null).startsWith("$6$"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCryptWithBytes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCryptWithBytes");
        final byte[] keyBytes = new byte[]{ 'b' , 'y' , 't' , 'e' };
        final String hash = org.apache.commons.codec.digest.Crypt.crypt(keyBytes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1181,hash);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1183,null,1182,org.apache.commons.codec.digest.Crypt.crypt("byte", hash));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An empty string as salt is invalid.
     * 
     * The C and Perl implementations return an empty string, PHP threads it
     * as NULL. Our implementation should throw an Exception as any resulting
     * hash would not be verifyable with other implementations of crypt().
     */
@Test(expected = IllegalArgumentException.class)
    public void testCryptWithEmptySalt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCryptWithEmptySalt");
        org.apache.commons.codec.digest.Crypt.crypt("secret", "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An empty string as salt is invalid.
     * 
     * The C and Perl implementations return an empty string, PHP threads it
     * as NULL. Our implementation should throw an Exception as any resulting
     * hash would not be verifyable with other implementations of crypt().
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testCryptWithEmptySalt_add249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCryptWithEmptySalt_add249");
        org.apache.commons.codec.digest.Crypt.crypt("secret", "");
        org.apache.commons.codec.digest.Crypt.crypt("secret", "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An empty string as salt is invalid.
     * 
     * The C and Perl implementations return an empty string, PHP threads it
     * as NULL. Our implementation should throw an Exception as any resulting
     * hash would not be verifyable with other implementations of crypt().
     */
@Test(expected = IllegalArgumentException.class)
    public void testCrypt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCrypt");
        org.apache.commons.codec.digest.Crypt.crypt("foo", "");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An empty string as salt is invalid.
     * 
     * The C and Perl implementations return an empty string, PHP threads it
     * as NULL. Our implementation should throw an Exception as any resulting
     * hash would not be verifyable with other implementations of crypt().
     */
@Test(expected = IllegalArgumentException.class)
    public void testCryptWithEmptySalt_literalMutation1374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCryptWithEmptySalt_literalMutation1374");
        org.apache.commons.codec.digest.Crypt.crypt("secret", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An empty string as salt is invalid.
     * 
     * The C and Perl implementations return an empty string, PHP threads it
     * as NULL. Our implementation should throw an Exception as any resulting
     * hash would not be verifyable with other implementations of crypt().
     */
@Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void testCryptWithEmptySalt_remove232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCryptWithEmptySalt_remove232");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

