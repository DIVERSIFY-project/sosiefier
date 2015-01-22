package org.apache.commons.collections4;

import junit.framework.Test;

/** 
 * Tests for TrieUtils factory methods.
 * 
 * @version $Id$
 */
public class TrieUtilsTest extends BulkTest {
    public TrieUtilsTest(final String name) {
        super(name);
    }

    public static Test suite() {
        return BulkTest.makeSuite(TrieUtilsTest.class);
    }

    public void testUnmodifiableTrie() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableTrie");
        Trie<java.lang.String, java.lang.Object> trie = org.apache.commons.collections4.TrieUtils.unmodifiableTrie(new org.apache.commons.collections4.trie.PatriciaTrie<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8517,(trie instanceof org.apache.commons.collections4.trie.UnmodifiableTrie));
        try {
            org.apache.commons.collections4.TrieUtils.unmodifiableTrie(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8518,trie);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8520,null,8519,org.apache.commons.collections4.TrieUtils.unmodifiableTrie(trie));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

