package org.apache.commons.collections4.functors;

import org.junit.After;
import java.util.ArrayList;
import org.junit.Before;
import java.util.List;
import org.apache.commons.collections4.Predicate;

/** 
 * Base class for tests of predicates which delegate to other predicates when evaluating an object.  This class
 * provides methods to create and verify mock predicates to which to delegate.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractMockPredicateTest<T> {
    /** 
     * Mock predicates created by a single test case which need to be verified after the test completes.
     */
private List<org.apache.commons.collections4.Predicate<? super T>> mockPredicatesToVerify;

    /** 
     * The value to pass to mocks.
     */
private final T testValue;

    /** 
     * Creates a new <code>PredicateTestBase</code>.
     * 
     * @param testValue the value to pass to mock predicates.
     */
protected AbstractMockPredicateTest(final T testValue) {
        this.testValue = testValue;
    }

    /** 
     * Creates the list of predicates to verify.
     */
@Before
    public final void createVerifyList() {
        mockPredicatesToVerify = new ArrayList<org.apache.commons.collections4.Predicate<? super T>>();
    }

    /** 
     * Verifies all the mock predicates created for the test.
     */
@After
    public final void verifyPredicates() {
        for (final Predicate<? super T> predicate : mockPredicatesToVerify) {
            org.easymock.EasyMock.verify(predicate);
        }
    }

    /** 
     * Gets the value which will be passed to the mock predicates.
     * 
     * @return the test value.
     */
protected final T getTestValue() {
        return testValue;
    }

    /** 
     * Creates a single mock predicate.
     * 
     * @param returnValue the return value for the mock predicate, or null if the mock is not expected to be called.
     * @return a single mock predicate.
     */
@SuppressWarnings(value = { "unchecked" , "boxing" })
    protected final Predicate<T> createMockPredicate(final Boolean returnValue) {
        final Predicate<T> mockPredicate = org.easymock.EasyMock.createMock(Predicate.class);
        if (returnValue != null) {
            org.easymock.EasyMock.expect(mockPredicate.evaluate(testValue)).andReturn(returnValue);
        } 
        org.easymock.EasyMock.replay(mockPredicate);
        mockPredicatesToVerify.add(mockPredicate);
        return mockPredicate;
    }
}

