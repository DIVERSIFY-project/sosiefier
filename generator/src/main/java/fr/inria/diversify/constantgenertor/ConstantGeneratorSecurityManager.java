package fr.inria.diversify.constantgenertor;

import sun.reflect.CallerSensitive;
import sun.security.util.SecurityConstants;

import java.io.FileDescriptor;
import java.lang.reflect.Member;
import java.net.InetAddress;
import java.security.*;
import java.util.PropertyPermission;

/**
 * User: Simon
 * Date: 31/03/15
 * Time: 20:17
 */
public class ConstantGeneratorSecurityManager extends SecurityManager {

    public void checkExit(int status) {
        throw new SecurityException();
    }


    public void checkExec(String cmd) {
        throw new SecurityException();
    }

    public void checkRead(FileDescriptor fd) {
        throw new SecurityException();
    }

    public void checkRead(String file) {
        throw new SecurityException();
    }

    public void checkRead(String file, Object context) {
        throw new SecurityException();
    }

    public void checkWrite(FileDescriptor fd) {
        throw new SecurityException();
    }


    public void checkWrite(String file) {
        throw new SecurityException();
    }

    public void checkDelete(String file) {
        throw new SecurityException();
    }

    public void checkConnect(String host, int port) {
        throw new SecurityException();
    }


    public void checkConnect(String host, int port, Object context) {
        throw new SecurityException();
    }

    public void checkListen(int port) {
        throw new SecurityException();
    }

    public void checkAccept(String host, int port) {
        throw new SecurityException();
    }


    public void checkMulticast(InetAddress maddr) {
        throw new SecurityException();
    }


    @Deprecated
    public void checkMulticast(InetAddress maddr, byte ttl) {
        throw new SecurityException();
    }


    public void checkPropertiesAccess() {
        throw new SecurityException();
    }

    /**
     * Throws a <code>SecurityException</code> if the
     * calling thread is not allowed to access the system property with
     * the specified <code>key</code> name.
     * <p>
     * This method is used by the <code>getProperty</code> method of
     * class <code>System</code>.
     * <p>
     * This method calls <code>checkPermission</code> with the
     * <code>PropertyPermission(key, "read")</code> permission.
     * <p>
     * If you override this method, then you should make a call to
     * <code>super.checkPropertyAccess</code>
     * at the point the overridden method would normally throw an
     * exception.
     *
     * @param      key   a system property key.
     *
     * @exception  SecurityException  if the calling thread does not have
     *             permission to access the specified system property.
     * @exception  NullPointerException if the <code>key</code> argument is
     *             <code>null</code>.
     * @exception  IllegalArgumentException if <code>key</code> is empty.
     *
     * @see        java.lang.System#getProperty(java.lang.String)
     * @see        #checkPermission(java.security.Permission) checkPermission
     */
    public void checkPropertyAccess(String key) {
        checkPermission(new PropertyPermission(key,
                SecurityConstants.PROPERTY_READ_ACTION));
    }


    @Deprecated
    public boolean checkTopLevelWindow(Object window) {
        throw new SecurityException();
    }

    public void checkPrintJobAccess() {
        throw new SecurityException();
    }

    @Deprecated
    public void checkSystemClipboardAccess() {
        throw new SecurityException();
    }

    /**
     * Throws a <code>SecurityException</code> if the
     * calling thread is not allowed to access the AWT event queue.
     * <p>
     * This method calls <code>checkPermission</code> with the
     * <code>AWTPermission("accessEventQueue")</code> permission.
     * In the case of subset Profiles of Java SE that do not include the
     * {@code java.awt} package, {@code checkPermission} is instead called
     * to check the permission {@code java.security.AllPermission}.
     *
     * <p>
     * If you override this method, then you should make a call to
     * <code>super.checkAwtEventQueueAccess</code>
     * at the point the overridden method would normally throw an
     * exception.
     *
     * @since   JDK1.1
     * @exception  SecurityException  if the calling thread does not have
     *             permission to access the AWT event queue.
     * @deprecated The dependency on {@code AWTPermission} creates an
     *             impediment to future modularization of the Java platform.
     *             Users of this method should instead invoke
     *             {@link #checkPermission} directly.
     *             This method will be changed in a future release to check
     *             the permission {@code java.security.AllPermission}.
     * @see        #checkPermission(java.security.Permission) checkPermission
     */
    @Deprecated
    public void checkAwtEventQueueAccess() {
        Permission perm = SecurityConstants.AWT.CHECK_AWT_EVENTQUEUE_PERMISSION;
        if (perm == null) {
            perm = SecurityConstants.ALL_PERMISSION;
        }
        checkPermission(perm);
    }

    public void checkSetFactory() {
        throw new SecurityException();
    }

    /**
     * Throws a <code>SecurityException</code> if the
     * calling thread is not allowed to access members.
     * <p>
     * The default policy is to allow access to PUBLIC members, as well
     * as access to classes that have the same class loader as the caller.
     * In all other cases, this method calls <code>checkPermission</code>
     * with the <code>RuntimePermission("accessDeclaredMembers")
     * </code> permission.
     * <p>
     * If this method is overridden, then a call to
     * <code>super.checkMemberAccess</code> cannot be made,
     * as the default implementation of <code>checkMemberAccess</code>
     * relies on the code being checked being at a stack depth of
     * 4.
     *
     * @param clazz the class that reflection is to be performed on.
     *
     * @param which type of access, PUBLIC or DECLARED.
     *
     * @exception  SecurityException if the caller does not have
     *             permission to access members.
     * @exception  NullPointerException if the <code>clazz</code> argument is
     *             <code>null</code>.
     *
     * @deprecated This method relies on the caller being at a stack depth
     *             of 4 which is error-prone and cannot be enforced by the runtime.
     *             Users of this method should instead invoke {@link #checkPermission}
     *             directly.  This method will be changed in a future release
     *             to check the permission {@code java.security.AllPermission}.
     *
     * @see java.lang.reflect.Member
     * @since JDK1.1
     * @see        #checkPermission(java.security.Permission) checkPermission
     */
    @Deprecated
    @CallerSensitive
    public void checkMemberAccess(Class<?> clazz, int which) {
        if (clazz == null) {
            throw new NullPointerException("class can't be null");
        }
        if (which != Member.PUBLIC) {
            Class<?> stack[] = getClassContext();
            /*
             * stack depth of 4 should be the caller of one of the
             * methods in java.lang.Class that invoke checkMember
             * access. The stack should look like:
             *
             * someCaller                        [3]
             * java.lang.Class.someReflectionAPI [2]
             * java.lang.Class.checkMemberAccess [1]
             * SecurityManager.checkMemberAccess [0]
             *
             */
            if ((stack.length<4) ||
                    (stack[3].getClassLoader() != clazz.getClassLoader())) {
                checkPermission(SecurityConstants.CHECK_MEMBER_ACCESS_PERMISSION);
            }
        }
    }

    public void checkPermission(Permission perm) {
        //java.security.AccessController.checkPermission(perm);
    }
}
