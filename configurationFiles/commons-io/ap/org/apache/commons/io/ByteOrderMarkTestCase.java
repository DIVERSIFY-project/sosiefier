package org.apache.commons.io;

import org.apache.commons.io.testtools.FileBasedTestCase;

/** 
 * Test for {@link ByteOrderMark}.
 * 
 * @version $Id$
 */
public class ByteOrderMarkTestCase extends FileBasedTestCase {
    private static final ByteOrderMark TEST_BOM_1 = new ByteOrderMark("test1" , 1);

    private static final ByteOrderMark TEST_BOM_2 = new ByteOrderMark("test2" , 1 , 2);

    private static final ByteOrderMark TEST_BOM_3 = new ByteOrderMark("test3" , 1 , 2 , 3);

    public ByteOrderMarkTestCase(String name) {
        super(name);
    }

    /** 
     * Test {@link ByteOrderMark#getCharsetName()}
     */
public void testCharsetName() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCharsetName");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1719,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.getCharsetName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2,1721,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.getCharsetName());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1723,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.getCharsetName());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that {@link ByteOrderMark#getCharsetName()} can be loaded as a {@link java.nio.charset.Charset} as advertised.
     */
public void testConstantCharsetNames() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstantCharsetNames");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,null,1725,java.nio.charset.Charset.forName(org.apache.commons.io.ByteOrderMark.UTF_8.getCharsetName()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,null,1727,java.nio.charset.Charset.forName(org.apache.commons.io.ByteOrderMark.UTF_16BE.getCharsetName()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,null,1729,java.nio.charset.Charset.forName(org.apache.commons.io.ByteOrderMark.UTF_16LE.getCharsetName()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,null,1731,java.nio.charset.Charset.forName(org.apache.commons.io.ByteOrderMark.UTF_32BE.getCharsetName()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,null,1733,java.nio.charset.Charset.forName(org.apache.commons.io.ByteOrderMark.UTF_32LE.getCharsetName()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link ByteOrderMark#length()}
     */
public void testLength() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLength");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1779,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1778,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.length());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1781,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2,1780,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.length());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1783,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1782,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link ByteOrderMark#get(int)}
     */
public void testGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGet");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1751,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2,1753,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2,1755,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1757,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1760,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1759,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1762,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1761,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.get(2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link ByteOrderMark#getBytes()}
     */
public void testGetBytes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetBytes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,null,1763,java.util.Arrays.equals(org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.getBytes(), new byte[]{ ((byte)(1)) }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1766,null,1765,java.util.Arrays.equals(org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.getBytes(), new byte[]{ ((byte)(1)) , ((byte)(2)) }));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,null,1767,java.util.Arrays.equals(org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.getBytes(), new byte[]{ ((byte)(1)) , ((byte)(2)) , ((byte)(3)) }));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link ByteOrderMark#equals(Object)}
     */
public void testEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1735,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.equals(org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2,1737,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.equals(org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1740,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1739,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.equals(org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1741,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.equals(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1743,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.equals(new org.apache.commons.io.ByteOrderMark("1a" , 2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1746,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1745,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.equals(new org.apache.commons.io.ByteOrderMark("1b" , 1 , 2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2,1747,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.equals(new org.apache.commons.io.ByteOrderMark("2" , 1 , 1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1749,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.equals(new org.apache.commons.io.ByteOrderMark("3" , 1 , 2 , 4)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link ByteOrderMark#hashCode()}
     */
public void testHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode");
        int bomClassHash = ByteOrderMark.class.hashCode();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,(bomClassHash + 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1770,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,(bomClassHash + 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2,1773,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,(bomClassHash + 6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1777,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1776,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors");
        try {
            new ByteOrderMark(null , 2 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2543() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2543");
        try {
            new ByteOrderMark(null , 1 , 3 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2544() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2544");
        try {
            new ByteOrderMark(null , 1 , 2 , 2);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2545() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2545");
        try {
            new ByteOrderMark(null , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("foo" , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2546() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2546");
        try {
            new ByteOrderMark(null , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 2 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2547() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2547");
        try {
            new ByteOrderMark(null , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 1 , 3 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2548() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2548");
        try {
            new ByteOrderMark(null , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 1 , 2 , 2);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2549() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2549");
        try {
            new ByteOrderMark(null , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("foo" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2551() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2551");
        try {
            new ByteOrderMark(null , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("foo" , new int[0]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test Erros
     */
public void testErrors_literalMutation2552() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrors_literalMutation2552");
        try {
            new ByteOrderMark(null , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("" , 1 , 2 , 3);
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("a" , ((int[])(null)));
        } catch (IllegalArgumentException e) {
        }
        try {
            new ByteOrderMark("b" , new int[-1]);
        } catch (IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test {@link ByteOrderMark#toString()}
     */
public void testToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1,1784,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_1.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1787,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2,1786,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_2.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1789,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3,1788,org.apache.commons.io.ByteOrderMarkTestCase.TEST_BOM_3.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

