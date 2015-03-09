package org.apache.commons.io.monitor;

import java.io.File;
import java.io.FileFilter;
import org.apache.commons.io.filefilter.HiddenFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import junit.framework.TestCase;

/** 
 * {@link FileAlterationObserver} Test Case.
 */
public abstract class AbstractMonitorTestCase extends TestCase {
    /** 
     * File observer
     */
protected FileAlterationObserver observer;

    /** 
     * Listener which collects file changes
     */
protected CollectionFileListener listener;

    /** 
     * Test diretory name
     */
protected String testDirName = null;

    /** 
     * Directory for test files
     */
protected File testDir;

    /** 
     * Time in milliseconds to pause in tests
     */
protected long pauseTime = 100L;

    /** 
     * Construct a new test case.
     * 
     * @param name The name of the test
     */
public AbstractMonitorTestCase(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        testDir = new File(new File(".") , testDirName);
        if (testDir.exists()) {
            org.apache.commons.io.FileUtils.cleanDirectory(testDir);
        } else {
            testDir.mkdir();
        }
        IOFileFilter files = org.apache.commons.io.filefilter.FileFilterUtils.fileFileFilter();
        IOFileFilter javaSuffix = org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(".java");
        IOFileFilter fileFilter = org.apache.commons.io.filefilter.FileFilterUtils.and(files, javaSuffix);
        IOFileFilter directories = org.apache.commons.io.filefilter.FileFilterUtils.directoryFileFilter();
        IOFileFilter visible = HiddenFileFilter.VISIBLE;
        IOFileFilter dirFilter = org.apache.commons.io.filefilter.FileFilterUtils.and(directories, visible);
        IOFileFilter filter = org.apache.commons.io.filefilter.FileFilterUtils.or(dirFilter, fileFilter);
        createObserver(testDir, filter);
    }

    /** 
     * Create a {@link FileAlterationObserver}.
     * 
     * @param file The directory to observe
     * @param fileFilter The file filter to apply
     */
protected void createObserver(File file, FileFilter fileFilter) {
        observer = new FileAlterationObserver(file , fileFilter);
        observer.addListener(listener);
        observer.addListener(new org.apache.commons.io.monitor.FileAlterationListenerAdaptor());
        try {
            observer.initialize();
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),25,("Observer init() threw " + e));
        }
    }

    @Override
    protected void tearDown() throws Exception {
        org.apache.commons.io.FileUtils.deleteDirectory(testDir);
    }

    /** 
     * Check all the Collections are empty
     */
protected void checkCollectionsEmpty(String label) {
        checkCollectionSizes(("EMPTY-" + label), 0, 0, 0, 0, 0, 0);
    }

    /** 
     * Check all the Collections have the expected sizes.
     */
protected void checkCollectionSizes(String label, int dirCreate, int dirChange, int dirDelete, int fileCreate, int fileChange, int fileDelete) {
        label = ((((((((((((label + "[") + (listener.getCreatedDirectories().size())) + " ") + (listener.getChangedDirectories().size())) + " ") + (listener.getDeletedDirectories().size())) + " ") + (listener.getCreatedFiles().size())) + " ") + (listener.getChangedFiles().size())) + " ") + (listener.getDeletedFiles().size())) + "]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1,(label + ": No. of directories created"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2,dirCreate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4,listener.getCreatedDirectories(),3,listener.getCreatedDirectories().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5,(label + ": No. of directories changed"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6,dirChange);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8,listener.getChangedDirectories(),7,listener.getChangedDirectories().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),9,(label + ": No. of directories deleted"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),10,dirDelete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),12,listener.getDeletedDirectories(),11,listener.getDeletedDirectories().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),13,(label + ": No. of files created"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),14,fileCreate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),16,listener.getCreatedFiles(),15,listener.getCreatedFiles().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),17,(label + ": No. of files changed"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),18,fileChange);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),20,listener.getChangedFiles(),19,listener.getChangedFiles().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),21,(label + ": No. of files deleted"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),22,fileDelete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),24,listener.getDeletedFiles(),23,listener.getDeletedFiles().size());
    }

    /** 
     * Either creates a file if it doesn't exist or updates the last modified date/time
     * if it does.
     * 
     * @param file The file to touch
     * @return The file
     */
protected File touch(File file) {
        long lastModified = file.exists() ? file.lastModified() : 0;
        try {
            org.apache.commons.io.FileUtils.touch(file);
            file = new File(file.getParent() , file.getName());
            while (lastModified == (file.lastModified())) {
                sleepHandleInterruped(pauseTime);
                org.apache.commons.io.FileUtils.touch(file);
                file = new File(file.getParent() , file.getName());
            }
        } catch (Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),0,((("Touching " + file) + ": ") + e));
        }
        sleepHandleInterruped(pauseTime);
        return file;
    }

    /** 
     * Thread.sleep(timeInMilliseconds) - ignore InterruptedException
     */
protected void sleepHandleInterruped(long timeInMilliseconds) {
        try {
            java.lang.Thread.sleep(timeInMilliseconds);
        } catch (InterruptedException ie) {
        }
    }
}

