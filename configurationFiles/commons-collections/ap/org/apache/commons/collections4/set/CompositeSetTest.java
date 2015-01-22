package org.apache.commons.collections4.set;

import java.util.HashSet;
import java.util.Set;

/** 
 * Extension of {@link AbstractSetTest} for exercising the
 * {@link CompositeSet} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class CompositeSetTest<E> extends AbstractSetTest<E> {
    public CompositeSetTest(final String name) {
        super(name);
    }

    @Override
    public CompositeSet<E> makeObject() {
        final HashSet<E> contained = new HashSet<E>();
        final CompositeSet<E> set = new CompositeSet<E>(contained);
        set.setMutator(new org.apache.commons.collections4.set.EmptySetMutator<E>(contained));
        return set;
    }

    @SuppressWarnings(value = "unchecked")
    public Set<E> buildOne() {
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("1")));
        set.add(((E)("2")));
        return set;
    }

    @SuppressWarnings(value = "unchecked")
    public Set<E> buildTwo() {
        final HashSet<E> set = new HashSet<E>();
        set.add(((E)("3")));
        set.add(((E)("4")));
        return set;
    }

    @SuppressWarnings(value = "unchecked")
    public void testContains() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContains");
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ buildOne() , buildTwo() });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6140,set,6139,set.contains("1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveUnderlying() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveUnderlying");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        one.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6146,set,6145,set.contains("1"));
        two.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,set,6147,set.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveUnderlying_literalMutation1815() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveUnderlying_literalMutation1815");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        one.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6146,set,6145,set.contains("1"));
        two.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,set,6147,set.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveUnderlying_literalMutation1816() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveUnderlying_literalMutation1816");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        one.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6146,set,6145,set.contains("1"));
        two.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6148,set,6147,set.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        set.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,one,6141,one.contains("1"));
        set.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,one,6143,one.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation1811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation1811");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        set.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,one,6141,one.contains("1"));
        set.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,one,6143,one.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation1812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation1812");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        set.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,one,6141,one.contains("1"));
        set.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,one,6143,one.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveComposited_literalMutation1813() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveComposited_literalMutation1813");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        set.remove("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6142,one,6141,one.contains("1"));
        set.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6144,one,6143,one.contains("3"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFailedCollisionResolution() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailedCollisionResolution");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        set.setMutator(new CompositeSet.SetMutator<E>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeSet<E> comp, final Set<E> existing, final Set<E> added, final java.util.Collection<E> intersects) {
            }

            public boolean add(final CompositeSet<E> composite, final java.util.List<java.util.Set<E>> collections, final E obj) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(final CompositeSet<E> composite, final java.util.List<java.util.Set<E>> collections, final java.util.Collection<? extends E> coll) {
                throw new UnsupportedOperationException();
            }
        });
        final HashSet<E> three = new HashSet<E>();
        three.add(((E)("1")));
        try {
            set.addComposited(three);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFailedCollisionResolution_literalMutation1809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailedCollisionResolution_literalMutation1809");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        set.setMutator(new CompositeSet.SetMutator<E>() {
            private static final long serialVersionUID = 0L;

            public void resolveCollision(final CompositeSet<E> comp, final Set<E> existing, final Set<E> added, final java.util.Collection<E> intersects) {
            }

            public boolean add(final CompositeSet<E> composite, final java.util.List<java.util.Set<E>> collections, final E obj) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(final CompositeSet<E> composite, final java.util.List<java.util.Set<E>> collections, final java.util.Collection<? extends E> coll) {
                throw new UnsupportedOperationException();
            }
        });
        final HashSet<E> three = new HashSet<E>();
        three.add(((E)("1")));
        try {
            set.addComposited(three);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFailedCollisionResolution_literalMutation1810() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFailedCollisionResolution_literalMutation1810");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>(new Set[]{ one , two });
        set.setMutator(new CompositeSet.SetMutator<E>() {
            private static final long serialVersionUID = 1L;

            public void resolveCollision(final CompositeSet<E> comp, final Set<E> existing, final Set<E> added, final java.util.Collection<E> intersects) {
            }

            public boolean add(final CompositeSet<E> composite, final java.util.List<java.util.Set<E>> collections, final E obj) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(final CompositeSet<E> composite, final java.util.List<java.util.Set<E>> collections, final java.util.Collection<? extends E> coll) {
                throw new UnsupportedOperationException();
            }
        });
        final HashSet<E> three = new HashSet<E>();
        three.add(((E)("foo")));
        try {
            set.addComposited(three);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>();
        set.addComposited(one, two);
        final CompositeSet<E> set2 = new CompositeSet<E>(buildOne());
        set2.addComposited(buildTwo());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.equals(set2));
        final HashSet<E> set3 = new HashSet<E>();
        set3.add(((E)("1")));
        set3.add(((E)("2")));
        set3.add(((E)("3")));
        final HashSet<E> set4 = new HashSet<E>();
        set4.add(((E)("4")));
        final CompositeSet<E> set5 = new CompositeSet<E>(set3);
        set5.addComposited(set4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6138,set,6137,set.equals(set5));
        try {
            set.addComposited(set3);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited_literalMutation1797() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited_literalMutation1797");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>();
        set.addComposited(one, two);
        final CompositeSet<E> set2 = new CompositeSet<E>(buildOne());
        set2.addComposited(buildTwo());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.equals(set2));
        final HashSet<E> set3 = new HashSet<E>();
        set3.add(((E)("1")));
        set3.add(((E)("2")));
        set3.add(((E)("3")));
        final HashSet<E> set4 = new HashSet<E>();
        set4.add(((E)("4")));
        final CompositeSet<E> set5 = new CompositeSet<E>(set3);
        set5.addComposited(set4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6138,set,6137,set.equals(set5));
        try {
            set.addComposited(set3);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited_literalMutation1798() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited_literalMutation1798");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>();
        set.addComposited(one, two);
        final CompositeSet<E> set2 = new CompositeSet<E>(buildOne());
        set2.addComposited(buildTwo());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.equals(set2));
        final HashSet<E> set3 = new HashSet<E>();
        set3.add(((E)("foo")));
        set3.add(((E)("2")));
        set3.add(((E)("3")));
        final HashSet<E> set4 = new HashSet<E>();
        set4.add(((E)("4")));
        final CompositeSet<E> set5 = new CompositeSet<E>(set3);
        set5.addComposited(set4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6138,set,6137,set.equals(set5));
        try {
            set.addComposited(set3);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited_literalMutation1799() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited_literalMutation1799");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>();
        set.addComposited(one, two);
        final CompositeSet<E> set2 = new CompositeSet<E>(buildOne());
        set2.addComposited(buildTwo());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.equals(set2));
        final HashSet<E> set3 = new HashSet<E>();
        set3.add(((E)("1")));
        set3.add(((E)("foo")));
        set3.add(((E)("3")));
        final HashSet<E> set4 = new HashSet<E>();
        set4.add(((E)("4")));
        final CompositeSet<E> set5 = new CompositeSet<E>(set3);
        set5.addComposited(set4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6138,set,6137,set.equals(set5));
        try {
            set.addComposited(set3);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited_literalMutation1800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited_literalMutation1800");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>();
        set.addComposited(one, two);
        final CompositeSet<E> set2 = new CompositeSet<E>(buildOne());
        set2.addComposited(buildTwo());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.equals(set2));
        final HashSet<E> set3 = new HashSet<E>();
        set3.add(((E)("1")));
        set3.add(((E)("2")));
        set3.add(((E)("foo")));
        final HashSet<E> set4 = new HashSet<E>();
        set4.add(((E)("4")));
        final CompositeSet<E> set5 = new CompositeSet<E>(set3);
        set5.addComposited(set4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6138,set,6137,set.equals(set5));
        try {
            set.addComposited(set3);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddComposited_literalMutation1801() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddComposited_literalMutation1801");
        final Set<E> one = buildOne();
        final Set<E> two = buildTwo();
        final CompositeSet<E> set = new CompositeSet<E>();
        set.addComposited(one, two);
        final CompositeSet<E> set2 = new CompositeSet<E>(buildOne());
        set2.addComposited(buildTwo());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6136,set,6135,set.equals(set2));
        final HashSet<E> set3 = new HashSet<E>();
        set3.add(((E)("1")));
        set3.add(((E)("2")));
        set3.add(((E)("3")));
        final HashSet<E> set4 = new HashSet<E>();
        set4.add(((E)("foo")));
        final CompositeSet<E> set5 = new CompositeSet<E>(set3);
        set5.addComposited(set4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6138,set,6137,set.equals(set5));
        try {
            set.addComposited(set3);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddCompositedCollision() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddCompositedCollision");
        final HashSet<E> set1 = new HashSet<E>();
        set1.add(((E)("1")));
        set1.add(((E)("2")));
        set1.add(((E)("3")));
        final HashSet<E> set2 = new HashSet<E>();
        set2.add(((E)("4")));
        final CompositeSet<E> set3 = new CompositeSet<E>(set1);
        try {
            set3.addComposited(set1, buildOne());
        } catch (final UnsupportedOperationException ex) {
        }
        try {
            set3.addComposited(set1, buildOne(), buildTwo());
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddCompositedCollision_literalMutation1803() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddCompositedCollision_literalMutation1803");
        final HashSet<E> set1 = new HashSet<E>();
        set1.add(((E)("foo")));
        set1.add(((E)("2")));
        set1.add(((E)("3")));
        final HashSet<E> set2 = new HashSet<E>();
        set2.add(((E)("4")));
        final CompositeSet<E> set3 = new CompositeSet<E>(set1);
        try {
            set3.addComposited(set1, buildOne());
        } catch (final UnsupportedOperationException ex) {
        }
        try {
            set3.addComposited(set1, buildOne(), buildTwo());
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddCompositedCollision_literalMutation1804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddCompositedCollision_literalMutation1804");
        final HashSet<E> set1 = new HashSet<E>();
        set1.add(((E)("1")));
        set1.add(((E)("foo")));
        set1.add(((E)("3")));
        final HashSet<E> set2 = new HashSet<E>();
        set2.add(((E)("4")));
        final CompositeSet<E> set3 = new CompositeSet<E>(set1);
        try {
            set3.addComposited(set1, buildOne());
        } catch (final UnsupportedOperationException ex) {
        }
        try {
            set3.addComposited(set1, buildOne(), buildTwo());
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddCompositedCollision_literalMutation1805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddCompositedCollision_literalMutation1805");
        final HashSet<E> set1 = new HashSet<E>();
        set1.add(((E)("1")));
        set1.add(((E)("2")));
        set1.add(((E)("foo")));
        final HashSet<E> set2 = new HashSet<E>();
        set2.add(((E)("4")));
        final CompositeSet<E> set3 = new CompositeSet<E>(set1);
        try {
            set3.addComposited(set1, buildOne());
        } catch (final UnsupportedOperationException ex) {
        }
        try {
            set3.addComposited(set1, buildOne(), buildTwo());
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testAddCompositedCollision_literalMutation1806() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddCompositedCollision_literalMutation1806");
        final HashSet<E> set1 = new HashSet<E>();
        set1.add(((E)("1")));
        set1.add(((E)("2")));
        set1.add(((E)("3")));
        final HashSet<E> set2 = new HashSet<E>();
        set2.add(((E)("foo")));
        final CompositeSet<E> set3 = new CompositeSet<E>(set1);
        try {
            set3.addComposited(set1, buildOne());
        } catch (final UnsupportedOperationException ex) {
        }
        try {
            set3.addComposited(set1, buildOne(), buildTwo());
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

