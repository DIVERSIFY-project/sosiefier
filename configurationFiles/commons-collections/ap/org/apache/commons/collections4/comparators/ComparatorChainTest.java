package org.apache.commons.collections4.comparators;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.io.Serializable;
import org.junit.Test;

/** 
 * Tests for ComparatorChain.
 * 
 * @version $Id$
 */
public class ComparatorChainTest extends AbstractComparatorTest<org.apache.commons.collections4.comparators.ComparatorChainTest.PseudoRow> {
    public ComparatorChainTest(final String testName) {
        super(testName);
    }

    @Override
    public Comparator<PseudoRow> makeObject() {
        final ComparatorChain<PseudoRow> chain = new ComparatorChain<PseudoRow>(new ColumnComparator(0));
        chain.addComparator(new ColumnComparator(1), true);
        chain.addComparator(new ColumnComparator(2), false);
        return chain;
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @Test(timeout = 1000)
    public void testNoopComparatorChain_add1268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoopComparatorChain_add1268");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(6);
        chain.addComparator(new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.Integer>());
        chain.addComparator(new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.Integer>());
        final int correctValue = i1.compareTo(i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4500,((chain.compare(i1, i2)) == correctValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNoopComparatorChain() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoopComparatorChain");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        final Integer i1 = Integer.valueOf(3);
        final Integer i2 = Integer.valueOf(6);
        chain.addComparator(new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.Integer>());
        final int correctValue = i1.compareTo(i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4500,((chain.compare(i1, i2)) == correctValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testNoopComparatorChain_literalMutation1222() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoopComparatorChain_literalMutation1222");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(5);
        chain.addComparator(new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.Integer>());
        final int correctValue = i1.compareTo(i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4500,((chain.compare(i1, i2)) == correctValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNoopComparatorChain_remove938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNoopComparatorChain_remove938");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(6);
        final int correctValue = i1.compareTo(i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4500,((chain.compare(i1, i2)) == correctValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadNoopComparatorChain_add1264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNoopComparatorChain_add1264");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(6);
        try {
            chain.compare(i1, i2);
            chain.compare(i1, i2);
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBadNoopComparatorChain() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNoopComparatorChain");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        final Integer i1 = Integer.valueOf(5);
        final Integer i2 = Integer.valueOf(6);
        try {
            chain.compare(i1, i2);
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBadNoopComparatorChain_literalMutation1214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadNoopComparatorChain_literalMutation1214");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(5);
        try {
            chain.compare(i1, i2);
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListComparatorChain_add1267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListComparatorChain_add1267");
        final List<java.util.Comparator<java.lang.Integer>> list = new LinkedList<java.util.Comparator<java.lang.Integer>>();
        list.add(new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.Integer>());
        list.add(new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.Integer>());
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>(list);
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(6);
        final int correctValue = i1.compareTo(i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4499,((chain.compare(i1, i2)) == correctValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testListComparatorChain() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListComparatorChain");
        final List<java.util.Comparator<java.lang.Integer>> list = new LinkedList<java.util.Comparator<java.lang.Integer>>();
        list.add(new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.Integer>());
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>(list);
        final Integer i1 = Integer.valueOf(5);
        final Integer i2 = Integer.valueOf(6);
        final int correctValue = i1.compareTo(i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4499,((chain.compare(i1, i2)) == correctValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testListComparatorChain_literalMutation1220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListComparatorChain_literalMutation1220");
        final List<java.util.Comparator<java.lang.Integer>> list = new LinkedList<java.util.Comparator<java.lang.Integer>>();
        list.add(new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.Integer>());
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>(list);
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(5);
        final int correctValue = i1.compareTo(i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4499,((chain.compare(i1, i2)) == correctValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListComparatorChain_remove937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListComparatorChain_remove937");
        final List<java.util.Comparator<java.lang.Integer>> list = new LinkedList<java.util.Comparator<java.lang.Integer>>();
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>(list);
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(6);
        final int correctValue = i1.compareTo(i2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4499,((chain.compare(i1, i2)) == correctValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadListComparatorChain_add1263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadListComparatorChain_add1263");
        final List<java.util.Comparator<java.lang.Integer>> list = new LinkedList<java.util.Comparator<java.lang.Integer>>();
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>(list);
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(6);
        try {
            chain.compare(i1, i2);
            chain.compare(i1, i2);
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBadListComparatorChain() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadListComparatorChain");
        final List<java.util.Comparator<java.lang.Integer>> list = new LinkedList<java.util.Comparator<java.lang.Integer>>();
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>(list);
        final Integer i1 = Integer.valueOf(5);
        final Integer i2 = Integer.valueOf(6);
        try {
            chain.compare(i1, i2);
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testBadListComparatorChain_literalMutation1212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadListComparatorChain_literalMutation1212");
        final List<java.util.Comparator<java.lang.Integer>> list = new LinkedList<java.util.Comparator<java.lang.Integer>>();
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>(list);
        final Integer i1 = Integer.valueOf(4);
        final Integer i2 = Integer.valueOf(7);
        try {
            chain.compare(i1, i2);
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComparatorChainOnMinvaluedCompatator_add1265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorChainOnMinvaluedCompatator_add1265");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        chain.addComparator(new Comparator<java.lang.Integer>() {
            public int compare(final Integer a, final Integer b) {
                final int result = a.compareTo(b);
                if (result < 0) {
                    return Integer.MIN_VALUE;
                } 
                if (result > 0) {
                    return Integer.MAX_VALUE;
                } 
                return 0;
            }
        }, true);
        chain.addComparator(new Comparator<java.lang.Integer>() {
            public int compare(final Integer a, final Integer b) {
                final int result = a.compareTo(b);
                if (result < 0) {
                    return Integer.MIN_VALUE;
                } 
                if (result > 0) {
                    return Integer.MAX_VALUE;
                } 
                return 0;
            }
        }, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4496,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(5))) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,((chain.compare(java.lang.Integer.valueOf(5), java.lang.Integer.valueOf(4))) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4498,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(4))) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComparatorChainOnMinvaluedCompatator_add1266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorChainOnMinvaluedCompatator_add1266");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        chain.addComparator(new Comparator<java.lang.Integer>() {
            public int compare(final Integer a, final Integer b) {
                final int result = a.compareTo(b);
                if (result < 0) {
                    return Integer.MIN_VALUE;
                } 
                if (result > 0) {
                    return Integer.MAX_VALUE;
                } 
                return 0;
            }
        }, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4496,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(5))) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,((chain.compare(java.lang.Integer.valueOf(5), java.lang.Integer.valueOf(4))) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4498,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(4))) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorChainOnMinvaluedCompatator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorChainOnMinvaluedCompatator");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        chain.addComparator(new Comparator<java.lang.Integer>() {
            public int compare(final Integer a, final Integer b) {
                final int result = a.compareTo(b);
                if (result < -1) {
                    return Integer.MIN_VALUE;
                } 
                if (result > 0) {
                    return Integer.MAX_VALUE;
                } 
                return 0;
            }
        }, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4496,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(5))) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,((chain.compare(java.lang.Integer.valueOf(5), java.lang.Integer.valueOf(4))) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4498,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(4))) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorChainOnMinvaluedCompatator_literalMutation1216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorChainOnMinvaluedCompatator_literalMutation1216");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        chain.addComparator(new Comparator<java.lang.Integer>() {
            public int compare(final Integer a, final Integer b) {
                final int result = a.compareTo(b);
                if (result < 0) {
                    return Integer.MIN_VALUE;
                } 
                if (result > -1) {
                    return Integer.MAX_VALUE;
                } 
                return 0;
            }
        }, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4496,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(5))) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,((chain.compare(java.lang.Integer.valueOf(5), java.lang.Integer.valueOf(4))) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4498,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(4))) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorChainOnMinvaluedCompatator_literalMutation1217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorChainOnMinvaluedCompatator_literalMutation1217");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        chain.addComparator(new Comparator<java.lang.Integer>() {
            public int compare(final Integer a, final Integer b) {
                final int result = a.compareTo(b);
                if (result < 0) {
                    return Integer.MIN_VALUE;
                } 
                if (result > 0) {
                    return Integer.MAX_VALUE;
                } 
                return -1;
            }
        }, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4496,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(5))) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,((chain.compare(java.lang.Integer.valueOf(5), java.lang.Integer.valueOf(4))) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4498,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(4))) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testComparatorChainOnMinvaluedCompatator_literalMutation1218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorChainOnMinvaluedCompatator_literalMutation1218");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        chain.addComparator(new Comparator<java.lang.Integer>() {
            public int compare(final Integer a, final Integer b) {
                final int result = a.compareTo(b);
                if (result < 0) {
                    return Integer.MIN_VALUE;
                } 
                if (result > 0) {
                    return Integer.MAX_VALUE;
                } 
                return 0;
            }
        }, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4496,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(5))) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,((chain.compare(java.lang.Integer.valueOf(5), java.lang.Integer.valueOf(4))) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4498,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(4))) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComparatorChainOnMinvaluedCompatator_remove935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorChainOnMinvaluedCompatator_remove935");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4496,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(5))) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,((chain.compare(java.lang.Integer.valueOf(5), java.lang.Integer.valueOf(4))) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4498,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(4))) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComparatorChainOnMinvaluedCompatator_remove936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparatorChainOnMinvaluedCompatator_remove936");
        final ComparatorChain<java.lang.Integer> chain = new ComparatorChain<java.lang.Integer>();
        chain.addComparator(new Comparator<java.lang.Integer>() {
            public int compare(final Integer a, final Integer b) {
                final int result = a.compareTo(b);
                if (result < 0) {
                    return Integer.MIN_VALUE;
                } 
                if (result > 0) {
                    return Integer.MAX_VALUE;
                } 
                return 0;
            }
        }, true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4496,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(5))) > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4497,((chain.compare(java.lang.Integer.valueOf(5), java.lang.Integer.valueOf(4))) < 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4498,((chain.compare(java.lang.Integer.valueOf(4), java.lang.Integer.valueOf(4))) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public List<PseudoRow> getComparableObjectsOrdered() {
        final List<PseudoRow> list = new LinkedList<PseudoRow>();
        list.add(new PseudoRow(1 , 2 , 3));
        list.add(new PseudoRow(2 , 3 , 5));
        list.add(new PseudoRow(2 , 2 , 4));
        list.add(new PseudoRow(2 , 2 , 8));
        list.add(new PseudoRow(3 , 1 , 0));
        list.add(new PseudoRow(4 , 4 , 4));
        list.add(new PseudoRow(4 , 4 , 7));
        return list;
    }

    public static class PseudoRow implements Serializable {
        /** 
         * Generated serial version ID.
         */
private static final long serialVersionUID = 8085570439751032499L;

        public int[] cols = new int[3];

        public PseudoRow(final int col1 ,final int col2 ,final int col3) {
            cols[0] = col1;
            cols[1] = col2;
            cols[2] = col3;
        }

        public int getColumn(final int colIndex) {
            return cols[colIndex];
        }

        @Override
        public String toString() {
            final StringBuilder buf = new StringBuilder();
            buf.append("[");
            buf.append(cols[0]);
            buf.append(",");
            buf.append(cols[1]);
            buf.append(",");
            buf.append(cols[2]);
            buf.append("]");
            return buf.toString();
        }

        @Override
        public boolean equals(final Object o) {
            if (!(o instanceof PseudoRow)) {
                return false;
            } 
            final PseudoRow row = ((PseudoRow)(o));
            if ((getColumn(0)) != (row.getColumn(0))) {
                return false;
            } 
            if ((getColumn(1)) != (row.getColumn(1))) {
                return false;
            } 
            if ((getColumn(2)) != (row.getColumn(2))) {
                return false;
            } 
            return true;
        }
    }

    public static class ColumnComparator implements Serializable , Comparator<PseudoRow> {
        private static final long serialVersionUID = -2284880866328872105L;

        protected int colIndex = 0;

        public ColumnComparator(final int colIndex) {
            this.colIndex = colIndex;
        }

        public int compare(final PseudoRow o1, final PseudoRow o2) {
            final int col1 = o1.getColumn(colIndex);
            final int col2 = o2.getColumn(colIndex);
            if (col1 > col2) {
                return 1;
            } 
            if (col1 < col2) {
                return -1;
            } 
            return 0;
        }

        @Override
        public int hashCode() {
            return colIndex;
        }

        @Override
        public boolean equals(final Object that) {
            return (that instanceof ColumnComparator) && ((colIndex) == (((ColumnComparator)(that)).colIndex));
        }
    }
}

