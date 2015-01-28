package org.apache.commons.collections4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.junit.Test;

/** 
 * Abstract test class for {@link java.lang.Object} methods and contracts.
 * <p/>
 * To use, simply extend this class, and implement
 * the {@link #makeObject()} method.
 * <p/>
 * If your {@link Object} fails one of these tests by design,
 * you may still use this base set of cases.  Simply override the
 * test case (method) your {@link Object} fails.
 * 
 * @version $Id$
 */
public abstract class AbstractObjectTest extends BulkTest {
    /** 
     * Current major release for Collections
     */
public static final int COLLECTIONS_MAJOR_VERSION = 4;

    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractObjectTest(final String testName) {
        super(testName);
    }

    /** 
     * Implement this method to return the object to test.
     * 
     * @return the object to test
     */
public abstract Object makeObject();

    /** 
     * Override this method if a subclass is testing an object
     * that cannot serialize an "empty" Collection.
     * (e.g. Comparators have no contents)
     * 
     * @return true
     */
public boolean supportsEmptyCollections() {
        return true;
    }

    /** 
     * Override this method if a subclass is testing an object
     * that cannot serialize a "full" Collection.
     * (e.g. Comparators have no contents)
     * 
     * @return true
     */
public boolean supportsFullCollections() {
        return true;
    }

    /** 
     * Is serialization testing supported.
     * Default is true.
     */
public boolean isTestSerialization() {
        return true;
    }

    /** 
     * Returns true to indicate that the collection supports equals() comparisons.
     * This implementation returns true;
     */
public boolean isEqualsCheckable() {
        return true;
    }

    public void testObjectEqualsSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectEqualsSelf");
        final Object obj = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6388,obj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNull");
        final Object obj = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6387,obj,6386,obj.equals(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectHashCodeEqualsSelfHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectHashCodeEqualsSelfHashCode");
        final Object obj = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6398,obj,6397,obj.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6398,obj,6397,obj.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectHashCodeEqualsContract() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectHashCodeEqualsContract");
        final Object obj1 = makeObject();
        if (obj1.equals(obj1)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,obj1,6389,obj1.hashCode());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6390,obj1,6389,obj1.hashCode());
        } 
        final Object obj2 = makeObject();
        if (obj1.equals(obj2)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6392,obj1,6391,obj1.hashCode());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6394,obj2,6393,obj2.hashCode());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6396,obj2,6395,obj2.equals(obj1));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    protected Object serializeDeserialize(final Object obj) throws Exception {
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(obj);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        final Object dest = in.readObject();
        in.close();
        return dest;
    }

    public void testSerializeDeserializeThenCompare() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare");
        final Object obj = makeObject();
        if ((obj instanceof Serializable) && (isTestSerialization())) {
            final Object dest = serializeDeserialize(obj);
            if (isEqualsCheckable()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6399,obj);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6400,dest);
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Sanity check method, makes sure that any Serializable
     * class can be serialized and de-serialized in memory,
     * using the handy makeObject() method
     * 
     * @throws IOException
     * @throws ClassNotFoundException
     */
@Test(timeout = 1000)
    public void testSimpleSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSimpleSerialization");
        final Object o = makeObject();
        if ((o instanceof Serializable) && (isTestSerialization())) {
            final byte[] objekt = writeExternalFormToBytes(((Serializable)(o)));
            readExternalFormFromBytes(objekt);
            readExternalFormFromBytes(objekt);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Sanity check method, makes sure that any Serializable
     * class can be serialized and de-serialized in memory,
     * using the handy makeObject() method
     * 
     * @throws IOException
     * @throws ClassNotFoundException
     */
@Test(timeout = 1000)
    public void testSimpleSerialization_remove1593() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSimpleSerialization_remove1593");
        final Object o = makeObject();
        if ((o instanceof Serializable) && (isTestSerialization())) {
            final byte[] objekt = writeExternalFormToBytes(((Serializable)(o)));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests serialization by comparing against a previously stored version in SVN.
     * If the test object is serializable, confirm that a canonical form exists.
     */
public void testCanonicalEmptyCollectionExists() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCanonicalEmptyCollectionExists");
        if (((supportsEmptyCollections()) && (isTestSerialization())) && (!(skipSerializedCanonicalTests()))) {
            final Object object = makeObject();
            if (object instanceof Serializable) {
                final String name = getCanonicalEmptyCollectionName(object);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6380,(("Canonical empty collection (" + name) + ") is not in SVN"));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6382,new java.io.File(name),6381,new java.io.File(name).exists());
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests serialization by comparing against a previously stored version in SVN.
     * If the test object is serializable, confirm that a canonical form exists.
     */
public void testCanonicalFullCollectionExists() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCanonicalFullCollectionExists");
        if (((supportsFullCollections()) && (isTestSerialization())) && (!(skipSerializedCanonicalTests()))) {
            final Object object = makeObject();
            if (object instanceof Serializable) {
                final String name = getCanonicalFullCollectionName(object);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6383,(("Canonical full collection (" + name) + ") is not in SVN"));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6385,new java.io.File(name),6384,new java.io.File(name).exists());
            } 
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Get the version of Collections that this object tries to
     * maintain serialization compatibility with. Defaults to 4, due to
     * the package change to collections4 introduced in version 4.
     * <p/>
     * This constant makes it possible for TestMap (and other subclasses,
     * if necessary) to automatically check SVN for a versionX copy of a
     * Serialized object, so we can make sure that compatibility is maintained.
     * See, for example, TestMap.getCanonicalFullMapName(Map map).
     * Subclasses can override this variable, indicating compatibility
     * with earlier Collections versions.
     * 
     * @return The version, or <code>null</code> if this object shouldn't be
     * tested for compatibility with previous versions.
     */
public String getCompatibilityVersion() {
        return "4";
    }

    protected String getCanonicalEmptyCollectionName(final Object object) {
        final StringBuilder retval = new StringBuilder();
        retval.append(BulkTest.TEST_DATA_PATH);
        String colName = object.getClass().getName();
        colName = colName.substring(((colName.lastIndexOf(".")) + 1), colName.length());
        retval.append(colName);
        retval.append(".emptyCollection.version");
        retval.append(getCompatibilityVersion());
        retval.append(".obj");
        return retval.toString();
    }

    protected String getCanonicalFullCollectionName(final Object object) {
        final StringBuilder retval = new StringBuilder();
        retval.append(BulkTest.TEST_DATA_PATH);
        String colName = object.getClass().getName();
        colName = colName.substring(((colName.lastIndexOf(".")) + 1), colName.length());
        retval.append(colName);
        retval.append(".fullCollection.version");
        retval.append(getCompatibilityVersion());
        retval.append(".obj");
        return retval.toString();
    }

    /** 
     * Write a Serializable or Externalizable object as
     * a file at the given path.  NOT USEFUL as part
     * of a unit test; this is just a utility method
     * for creating disk-based objects in SVN that can become
     * the basis for compatibility tests using
     * readExternalFormFromDisk(String path)
     * 
     * @param o    Object to serialize
     * @param path path to write the serialized Object
     * @throws IOException
     */
protected void writeExternalFormToDisk(final Serializable o, final String path) throws IOException {
        final FileOutputStream fileStream = new FileOutputStream(path);
        writeExternalFormToStream(o, fileStream);
    }

    /** 
     * Converts a Serializable or Externalizable object to
     * bytes.  Useful for in-memory tests of serialization
     * 
     * @param o Object to convert to bytes
     * @return serialized form of the Object
     * @throws IOException
     */
protected byte[] writeExternalFormToBytes(final Serializable o) throws IOException {
        final ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        writeExternalFormToStream(o, byteStream);
        return byteStream.toByteArray();
    }

    /** 
     * Reads a Serialized or Externalized Object from disk.
     * Useful for creating compatibility tests between
     * different SVN versions of the same class
     * 
     * @param path path to the serialized Object
     * @return the Object at the given path
     * @throws IOException
     * @throws ClassNotFoundException
     */
protected Object readExternalFormFromDisk(final String path) throws IOException, ClassNotFoundException {
        final FileInputStream stream = new FileInputStream(path);
        return readExternalFormFromStream(stream);
    }

    /** 
     * Read a Serialized or Externalized Object from bytes.
     * Useful for verifying serialization in memory.
     * 
     * @param b byte array containing a serialized Object
     * @return Object contained in the bytes
     * @throws IOException
     * @throws ClassNotFoundException
     */
protected Object readExternalFormFromBytes(final byte[] b) throws IOException, ClassNotFoundException {
        final ByteArrayInputStream stream = new ByteArrayInputStream(b);
        return readExternalFormFromStream(stream);
    }

    protected boolean skipSerializedCanonicalTests() {
        return java.lang.Boolean.getBoolean("org.apache.commons.collections:with-clover");
    }

    private Object readExternalFormFromStream(final InputStream stream) throws IOException, ClassNotFoundException {
        final ObjectInputStream oStream = new ObjectInputStream(stream);
        return oStream.readObject();
    }

    private void writeExternalFormToStream(final Serializable o, final OutputStream stream) throws IOException {
        final ObjectOutputStream oStream = new ObjectOutputStream(stream);
        oStream.writeObject(o);
    }
}

