package org.apache.commons.io.output;

import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.IOException;
import org.junit.Test;
import java.nio.charset.UnsupportedCharsetException;
import java.io.Writer;

/** 
 * Tests that files really lock, although no writing is done as
 * the locking is tested only on construction.
 * 
 * @version $Id$
 */
public class LockableFileWriterTest extends FileBasedTestCase {
    private File file;

    private File lockDir;

    private File lockFile;

    private File altLockDir;

    private File altLockFile;

    public LockableFileWriterTest(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        file = new File(FileBasedTestCase.getTestDirectory() , "testlockfile");
        lockDir = new File(java.lang.System.getProperty("java.io.tmpdir"));
        lockFile = new File(lockDir , ((file.getName()) + ".lck"));
        altLockDir = FileBasedTestCase.getTestDirectory();
        altLockFile = new File(altLockDir , ((file.getName()) + ".lck"));
    }

    @Override
    public void tearDown() {
        file.delete();
        lockFile.delete();
        altLockFile.delete();
    }

    @Test(timeout = 1000)
    public void testFileLocked() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileLocked");
        LockableFileWriter lfw1 = null;
        LockableFileWriter lfw2 = null;
        LockableFileWriter lfw3 = null;
        try {
            lfw1 = new LockableFileWriter(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,file,1562,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,lockFile,1564,lockFile.exists());
            try {
                lfw2 = new LockableFileWriter(file);
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,msg,1566,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,file,1568,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,lockFile,1570,lockFile.exists());
            }
            try {
                lfw3 = new LockableFileWriter(file);
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,msg,1572,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,file,1574,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,lockFile,1576,lockFile.exists());
            }
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
            org.apache.commons.io.IOUtils.closeQuietly(lfw3);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,file,1578,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1581,lockFile,1580,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileLocked_add1044() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileLocked_add1044");
        LockableFileWriter lfw1 = null;
        LockableFileWriter lfw2 = null;
        LockableFileWriter lfw3 = null;
        try {
            lfw1 = new LockableFileWriter(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,file,1562,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,lockFile,1564,lockFile.exists());
            try {
                lfw2 = new LockableFileWriter(file);
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,msg,1566,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,file,1568,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,lockFile,1570,lockFile.exists());
            }
            try {
                lfw3 = new LockableFileWriter(file);
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,msg,1572,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,file,1574,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,lockFile,1576,lockFile.exists());
            }
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
            org.apache.commons.io.IOUtils.closeQuietly(lfw3);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,file,1578,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1581,lockFile,1580,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileLocked_add1045() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileLocked_add1045");
        LockableFileWriter lfw1 = null;
        LockableFileWriter lfw2 = null;
        LockableFileWriter lfw3 = null;
        try {
            lfw1 = new LockableFileWriter(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,file,1562,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1565,lockFile,1564,lockFile.exists());
            try {
                lfw2 = new LockableFileWriter(file);
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,msg,1566,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,file,1568,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1571,lockFile,1570,lockFile.exists());
            }
            try {
                lfw3 = new LockableFileWriter(file);
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1573,msg,1572,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1575,file,1574,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1577,lockFile,1576,lockFile.exists());
            }
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
            org.apache.commons.io.IOUtils.closeQuietly(lfw3);
            org.apache.commons.io.IOUtils.closeQuietly(lfw3);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1579,file,1578,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1581,lockFile,1580,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAlternateLockDir_add1037() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAlternateLockDir_add1037");
        LockableFileWriter lfw1 = null;
        LockableFileWriter lfw2 = null;
        try {
            lfw1 = new LockableFileWriter(file , true , altLockDir.getAbsolutePath());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,file,1516,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,altLockFile,1518,altLockFile.exists());
            try {
                lfw2 = new LockableFileWriter(file , true , altLockDir.getAbsolutePath());
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,msg,1520,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,file,1522,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,altLockFile,1524,altLockFile.exists());
            }
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,file,1526,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,altLockFile,1528,altLockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAlternateLockDir_add1038() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAlternateLockDir_add1038");
        LockableFileWriter lfw1 = null;
        LockableFileWriter lfw2 = null;
        try {
            lfw1 = new LockableFileWriter(file , true , altLockDir.getAbsolutePath());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,file,1516,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,altLockFile,1518,altLockFile.exists());
            try {
                lfw2 = new LockableFileWriter(file , true , altLockDir.getAbsolutePath());
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,msg,1520,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,file,1522,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,altLockFile,1524,altLockFile.exists());
            }
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,file,1526,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,altLockFile,1528,altLockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAlternateLockDir() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAlternateLockDir");
        LockableFileWriter lfw1 = null;
        LockableFileWriter lfw2 = null;
        try {
            lfw1 = new LockableFileWriter(file , false , altLockDir.getAbsolutePath());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,file,1516,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,altLockFile,1518,altLockFile.exists());
            try {
                lfw2 = new LockableFileWriter(file , true , altLockDir.getAbsolutePath());
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,msg,1520,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,file,1522,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,altLockFile,1524,altLockFile.exists());
            }
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,file,1526,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,altLockFile,1528,altLockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAlternateLockDir_literalMutation2377() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAlternateLockDir_literalMutation2377");
        LockableFileWriter lfw1 = null;
        LockableFileWriter lfw2 = null;
        try {
            lfw1 = new LockableFileWriter(file , true , altLockDir.getAbsolutePath());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,file,1516,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,altLockFile,1518,altLockFile.exists());
            try {
                lfw2 = new LockableFileWriter(file , true , altLockDir.getAbsolutePath());
            } catch (IOException ioe) {
                String msg = ioe.getMessage();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,msg,1520,msg.startsWith("Can\'t write file, lock "));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,file,1522,file.exists());
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,altLockFile,1524,altLockFile.exists());
            }
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1527,file,1526,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,altLockFile,1528,altLockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileNotLocked() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileNotLocked");
        LockableFileWriter lfw1 = null;
        try {
            lfw1 = new LockableFileWriter(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1583,file,1582,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1585,lockFile,1584,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1587,file,1586,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1589,lockFile,1588,lockFile.exists());
        LockableFileWriter lfw2 = null;
        try {
            lfw2 = new LockableFileWriter(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1591,file,1590,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1593,lockFile,1592,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,file,1594,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,lockFile,1596,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFileNotLocked_add1047() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFileNotLocked_add1047");
        LockableFileWriter lfw1 = null;
        try {
            lfw1 = new LockableFileWriter(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1583,file,1582,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1585,lockFile,1584,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw1);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1587,file,1586,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1589,lockFile,1588,lockFile.exists());
        LockableFileWriter lfw2 = null;
        try {
            lfw2 = new LockableFileWriter(file);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1591,file,1590,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1593,lockFile,1592,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
            org.apache.commons.io.IOUtils.closeQuietly(lfw2);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1595,file,1594,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1597,lockFile,1596,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructor_File_encoding_badEncoding() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_encoding_badEncoding");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(file , "BAD-ENCODE");
        } catch (UnsupportedCharsetException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,file,1538,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,lockFile,1540,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,file,1542,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,lockFile,1544,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructor_File_encoding_badEncoding_add1040() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_encoding_badEncoding_add1040");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(file , "BAD-ENCODE");
        } catch (UnsupportedCharsetException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,file,1538,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,lockFile,1540,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,file,1542,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,lockFile,1544,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructor_File_encoding_badEncoding_literalMutation2380() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_encoding_badEncoding_literalMutation2380");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(file , "foo");
        } catch (UnsupportedCharsetException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,file,1538,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1541,lockFile,1540,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1543,file,1542,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1545,lockFile,1544,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructor_File_directory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_directory");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(FileBasedTestCase.getTestDirectory());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,file,1530,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1533,lockFile,1532,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,file,1534,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,lockFile,1536,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructor_File_directory_add1039() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_directory_add1039");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(FileBasedTestCase.getTestDirectory());
        } catch (IOException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,file,1530,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1533,lockFile,1532,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,file,1534,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,lockFile,1536,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructor_File_nullFile() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_nullFile");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(((File)(null)));
        } catch (NullPointerException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,file,1546,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,lockFile,1548,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,file,1550,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,lockFile,1552,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructor_File_nullFile_add1041() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_File_nullFile_add1041");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(((File)(null)));
        } catch (NullPointerException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1547,file,1546,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1549,lockFile,1548,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1551,file,1550,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1553,lockFile,1552,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testConstructor_fileName_nullFile() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_fileName_nullFile");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(((String)(null)));
        } catch (NullPointerException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,file,1554,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,lockFile,1556,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,file,1558,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,lockFile,1560,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testConstructor_fileName_nullFile_add1042() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor_fileName_nullFile_add1042");
        Writer writer = null;
        try {
            writer = new LockableFileWriter(((String)(null)));
        } catch (NullPointerException ex) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1555,file,1554,file.exists());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1557,lockFile,1556,lockFile.exists());
        } finally {
            org.apache.commons.io.IOUtils.closeQuietly(writer);
            org.apache.commons.io.IOUtils.closeQuietly(writer);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1559,file,1558,file.exists());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,lockFile,1560,lockFile.exists());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

