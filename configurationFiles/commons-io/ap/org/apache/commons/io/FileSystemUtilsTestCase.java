package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import org.junit.Test;

/** 
 * This is used to test FileSystemUtils.
 * 
 * @version $Id$
 */
public class FileSystemUtilsTestCase extends FileBasedTestCase {
    public FileSystemUtilsTestCase(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
    }

    @Override
    protected void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void testGetFreeSpace_String_add1307() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_add1307");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("foo");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3045() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3045");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("foo")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3046() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3046");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= -1) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3047() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3047");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("foo")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3048() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3048");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= -1)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3049() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3049");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "foo" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3050() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3050");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "foo" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3051() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3051");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "foo" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3052() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3052");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("foo")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3053() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3053");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= -1) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3054() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3054");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("foo")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3055() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3055");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 1)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3056() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3056");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("foo")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3057() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3057");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 1)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3058() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3058");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "foo" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3059() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3059");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "foo" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3060() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3060");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "foo" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3061() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3061");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "foo" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3062() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3062");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "foo" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3063() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3063");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = false;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3065() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3065");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("foo")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3066() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3066");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= -1) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3067() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3067");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = true;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3068() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3068");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3069() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3069");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("foo");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3070() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3070");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("foo");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3071() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3071");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3072() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3072");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("foo");
            long kb = FileSystemUtils.freeSpaceKb("");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpace_String_literalMutation3073() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation3073");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "/" };
            } else {
                cmd = new String[]{ "df" , "/" };
            }
            Process proc = java.lang.Runtime.getRuntime().exec(cmd);
            boolean kilobyteBlock = true;
            BufferedReader r = null;
            try {
                r = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                String line = r.readLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2480,line);
                if ((line.indexOf("512")) >= 0) {
                    kilobyteBlock = false;
                } 
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(r);
            }
            @SuppressWarnings(value = "deprecation")
            long free = FileSystemUtils.freeSpace("/");
            long kb = FileSystemUtils.freeSpaceKb("/");
            if (kilobyteBlock) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2481,free);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2482,kb);
            } else {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2483,(free / 2.0));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2484,kb);
            }
        } else {
            @SuppressWarnings(value = "deprecation")
            long bytes = FileSystemUtils.freeSpace("");
            long kb = FileSystemUtils.freeSpaceKb("foo");
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2485,(((double)(bytes)) / 1024));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2486,kb);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_NullPath_add1273() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_add1273");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, -1);
            fsu.freeSpaceOS(null, 1, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_NullPath_add1274() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_add1274");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 2, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation2805() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation2805");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation2806() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation2806");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation2808() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation2808");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 2, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation2809() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation2809");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation2810() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation2810");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, 0);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_InitError_add1271() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_add1271");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, -1);
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_InitError_add1272() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_add1272");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("foo", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation2796() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation2796");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation2797() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation2797");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation2798() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation2798");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation2799() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation2799");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("foo", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation2800() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation2800");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 2, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation2801() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation2801");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation2802() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation2802");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, 2);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_Other_add1275() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_add1275");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -1);
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_Other_add1276() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_add1276");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("foo", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation2812() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation2812");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation2813() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation2813");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation2814() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation2814");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 0);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation2815() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation2815");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("foo", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation2816() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation2816");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation2817() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation2817");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation2818() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation2818");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, 0);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_Windows_add1278() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Windows_add1278");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceWindows(String path, long timeout) throws IOException {
                return 12345L;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2452,fsu,2451,fsu.freeSpaceOS("", 1, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,(12345L / 1024));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,fsu,2454,fsu.freeSpaceOS("", 1, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Windows() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Windows");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceWindows(String path, long timeout) throws IOException {
                return 12344L;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2452,fsu,2451,fsu.freeSpaceOS("", 1, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,(12345L / 1024));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,fsu,2454,fsu.freeSpaceOS("", 1, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_Windows_remove992() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Windows_remove992");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceWindows(String path, long timeout) throws IOException {
                return 12345L;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2452,fsu,2451,fsu.freeSpaceOS("", 1, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,(12345L / 1024));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,fsu,2454,fsu.freeSpaceOS("", 1, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_Unix_add1277() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_add1277");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 12345L : 54321;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Unix() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 12346L : 54321;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Unix_literalMutation2820() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_literalMutation2820");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 12345L : 54320;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_Unix_remove991() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_remove991");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 12345L : 54321;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes");
        String lines = "foo" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3005() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3005");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3006() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3006");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("foo" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3007() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3007");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("foo" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3008() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3008");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("foo" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3009() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3009");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("foo" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3010() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3010");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3011() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3011");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("foo" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3012() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3012");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("foo" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3013() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3013");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3014() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3014");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3015() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation3015");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath");
        String lines = "foo" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2963() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2963");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2964() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2964");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("foo" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2965() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2965");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("foo" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2966() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2966");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("foo" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2967() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2967");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("foo" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2968() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2968");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2969() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2969");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("foo" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2970() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2970");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("foo" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2971() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2971");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2972() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2972");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2973() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2973");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation2974() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation2974");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse");
        String lines = "foo" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation2992() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation2992");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation2993() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation2993");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("foo" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation2994() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation2994");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("foo" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation2995() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation2995");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("foo" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation2996() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation2996");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("foo" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation2997() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation2997");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation2998() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation2998");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("foo" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation2999() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation2999");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("foo" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation3000() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation3000");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation3001() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation3001");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation3002() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation3002");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation3003() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation3003");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive");
        String lines = "foo" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3017() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3017");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3018() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3018");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("foo" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3019() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3019");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("foo" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3020() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3020");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("foo" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3021() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3021");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("foo" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3022() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3022");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3023() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3023");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("foo" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3024() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3024");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("foo" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3025() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3025");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3026() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3026");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3027() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3027");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation3028() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation3028");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted");
        String lines = "foo" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3030() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3030");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3031() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3031");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("foo" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3032() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3032");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("foo" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3033() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3033");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("foo" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3034() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3034");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("foo" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3035() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3035");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3036() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3036");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("foo" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3037() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3037");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("foo" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3038() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3038");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3039() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3039");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3040() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3040");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation3041() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation3041");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceWindows_String_EmptyResponse_add1304() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_add1304");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse");
        String lines = "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation2976() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation2976");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation2977() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation2977");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("foo", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation2978() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation2978");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_add1303() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_add1303");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse");
        String lines = "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation2959() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation2959");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation2960() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation2960");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("foo", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation2961() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation2961");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", 2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceWindows_String_InvalidTextResponse_add1305() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_add1305");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse");
        String lines = "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation2980() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation2980");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation2981() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation2981");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("foo", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation2982() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation2982");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_add1306() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_add1306");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse");
        String lines = "foo" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2984() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2984");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2985() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2985");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("foo" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2986() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2986");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("foo" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2987() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2987");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "foo")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2988() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2988");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2989() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2989");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("foo", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2990() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation2990");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyPath_add1279() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_add1279");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyPath_add1280() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_add1280");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyPath_add1281() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_add1281");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyPath_add1282() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_add1282");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath");
        String lines = "foo" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2823() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2823");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2824() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2824");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2825() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2825");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("foo", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2826() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2826");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2827() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2827");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2828() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2828");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 0);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2829() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2829");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2830() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2830");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2831() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2831");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2832() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2832");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 0);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2833() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2833");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2834() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2834");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2835() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2835");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2836() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2836");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 0);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2837() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2837");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2838() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2838");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2839() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2839");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation2840() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation2840");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, 0);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseLinux() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseLinux");
        String lines = "foo" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,fsu,2468,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation2956() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation2956");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,fsu,2468,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation2957() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation2957");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,fsu,2468,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseFreeBSD() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseFreeBSD");
        String lines = "foo" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,fsu,2460,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation2944() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation2944");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,fsu,2460,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation2945() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation2945");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,fsu,2460,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbLinux");
        String lines = "foo" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,fsu,2464,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation2950() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation2950");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,fsu,2464,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation2951() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation2951");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,fsu,2464,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD");
        String lines = "foo" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,fsu,2462,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation2947() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation2947");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,fsu,2462,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation2948() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation2948");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,fsu,2462,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbSolaris");
        String lines = "foo" + "/dev/dsk/x0x0x0x0    1350955  815754  481163    63%";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,fsu,2466,fsu.freeSpaceUnix("/dev/dsk/x0x0x0x0", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation2953() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation2953");
        String lines = "Filesystem            kbytes    used   avail capacity  Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,fsu,2466,fsu.freeSpaceUnix("/dev/dsk/x0x0x0x0", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation2954() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation2954");
        String lines = "Filesystem            kbytes    used   avail capacity  Mounted on\n" + "/dev/dsk/x0x0x0x0    1350955  815754  481163    63%";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,fsu,2466,fsu.freeSpaceUnix("/dev/dsk/x0x0x0x0", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse");
        String lines = "foo" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponse_literalMutation2936() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse_literalMutation2936");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("foo" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponse_literalMutation2937() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse_literalMutation2937");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "foo");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponse_literalMutation2938() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse_literalMutation2938");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb");
        String lines = "foo" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation2940() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation2940");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("foo" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation2941() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation2941");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "foo");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation2942() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation2942");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyResponse_add1283() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_add1283");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyResponse_add1284() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_add1284");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyResponse_add1285() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_add1285");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyResponse_add1286() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_add1286");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse");
        String lines = "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2842() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2842");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2843() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2843");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("foo", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2844() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2844");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2845() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2845");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2846() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2846");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 0);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2847() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2847");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2848() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2848");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2849() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2849");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2850() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2850");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 0);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2851() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2851");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2852() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2852");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2853() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2853");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2854() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2854");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2855() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2855");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2856() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2856");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2857() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2857");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2858() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation2858");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse1_add1287() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_add1287");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse1_add1288() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_add1288");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse1_add1289() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_add1289");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse1_add1290() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_add1290");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1");
        String lines = "foo" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2860() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2860");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2861() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2861");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2862() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2862");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("foo", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2863() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2863");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2864() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2864");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2865() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2865");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2866() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2866");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2867() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2867");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2868() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2868");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2869() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2869");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2870() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2870");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2871() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2871");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2872() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2872");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2873() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2873");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 0);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2874() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2874");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2875() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2875");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2876() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2876");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2877() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation2877");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse2_add1291() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_add1291");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse2_add1292() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_add1292");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse2_add1293() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_add1293");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse2_add1294() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_add1294");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2");
        String lines = "foo" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2879() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2879");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2880() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2880");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2881() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2881");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("foo", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2882() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2882");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2883() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2883");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2884() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2884");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 0);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2885() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2885");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2886() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2886");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2887() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2887");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2888() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2888");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 0);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2889() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2889");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2890() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2890");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2891() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2891");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2892() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2892");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2893() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2893");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2894() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2894");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2895() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2895");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2896() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation2896");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse3_add1295() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_add1295");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse3_add1296() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_add1296");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse3_add1297() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_add1297");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse3_add1298() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_add1298");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3");
        String lines = "foo" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2898() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2898");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2899() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2899");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2900() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2900");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("foo", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2901() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2901");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2902() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2902");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2903() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2903");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2904() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2904");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2905() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2905");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2906() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2906");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2907() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2907");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 0);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2908() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2908");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2909() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2909");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2910() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2910");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2911() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2911");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2912() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2912");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2913() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2913");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2914() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2914");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2915() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation2915");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse4_add1299() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_add1299");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse4_add1300() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_add1300");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse4_add1301() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_add1301");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_InvalidResponse4_add1302() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_add1302");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4");
        String lines = "foo" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2917() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2917");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2918() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2918");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2919() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2919");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("foo", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2920() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2920");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2921() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2921");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2922() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2922");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 0);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2923() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2923");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2924() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2924");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2925() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2925");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2926() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2926");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 0);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2927() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2927");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2928() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2928");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2929() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2929");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2930() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2930");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2931() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2931");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2932() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2932");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2933() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2933");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2934() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation2934");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class MockFileSystemUtils extends FileSystemUtils {
        private final int exitCode;

        private final byte[] bytes;

        private final String cmd;

        public MockFileSystemUtils(int exitCode ,String lines) {
            this(exitCode, lines, null);
        }

        public MockFileSystemUtils(int exitCode ,String lines ,String cmd) {
            this.exitCode = exitCode;
            this.bytes = lines.getBytes();
            this.cmd = cmd;
        }

        @Override
        Process openProcess(String[] params) {
            if ((cmd) != null) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2445,cmd);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2446,params[((params.length) - 1)]);
            } 
            return new Process() {
                @Override
                public InputStream getErrorStream() {
                    return null;
                }

                @Override
                public InputStream getInputStream() {
                    return new ByteArrayInputStream(bytes);
                }

                @Override
                public OutputStream getOutputStream() {
                    return null;
                }

                @Override
                public int waitFor() throws InterruptedException {
                    return exitCode;
                }

                @Override
                public int exitValue() {
                    return exitCode;
                }

                @Override
                public void destroy() {
                }
            };
        }
    }
}

