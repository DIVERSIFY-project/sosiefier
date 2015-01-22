package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/** 
 * Tests the NodeListIterator.
 */
public class NodeListIteratorTest extends AbstractIteratorTest<org.w3c.dom.Node> {
    private Node[] nodes;

    private boolean createIteratorWithStandardConstr = true;

    /** 
     * Constructor
     * 
     * @param testName
     */
public NodeListIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        createIteratorWithStandardConstr = true;
        final Node node1 = org.easymock.EasyMock.createMock(org.w3c.dom.Element.class);
        final Node node2 = org.easymock.EasyMock.createMock(org.w3c.dom.Element.class);
        final Node node3 = org.easymock.EasyMock.createMock(org.w3c.dom.Text.class);
        final Node node4 = org.easymock.EasyMock.createMock(org.w3c.dom.Element.class);
        nodes = new Node[]{ node1 , node2 , node3 , node4 };
        org.easymock.EasyMock.replay(node1);
        org.easymock.EasyMock.replay(node2);
        org.easymock.EasyMock.replay(node3);
        org.easymock.EasyMock.replay(node4);
    }

    @Override
    public Iterator<org.w3c.dom.Node> makeEmptyIterator() {
        final NodeList emptyNodeList = new NodeList() {
            public Node item(final int index) {
                throw new IndexOutOfBoundsException();
            }

            public int getLength() {
                return 0;
            }
        };
        if (createIteratorWithStandardConstr) {
            return new NodeListIterator(emptyNodeList);
        } else {
            final Node parentNode = org.easymock.EasyMock.createMock(Node.class);
            org.easymock.EasyMock.expect(parentNode.getChildNodes()).andStubReturn(emptyNodeList);
            org.easymock.EasyMock.replay(parentNode);
            return new NodeListIterator(parentNode);
        }
    }

    @Override
    public Iterator<org.w3c.dom.Node> makeObject() {
        final NodeList nodeList = new NodeList() {
            public Node item(final int index) {
                return nodes[index];
            }

            public int getLength() {
                return nodes.length;
            }
        };
        return new NodeListIterator(nodeList);
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    public void testNullConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullConstructor");
        try {
            new NodeListIterator(((Node)(null)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * tests the convenience Constructor with parameter type org.w3c.Node
     */
public void testEmptyIteratorWithNodeConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIteratorWithNodeConstructor");
        createIteratorWithStandardConstr = true;
        testEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * tests the convenience Constructor with parameter type org.w3c.Node
     */
public void testFullIteratorWithNodeConstructor() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullIteratorWithNodeConstructor");
        createIteratorWithStandardConstr = true;
        testFullIterator();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

