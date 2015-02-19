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

    public void testGetFreeSpace_String_literalMutation4733() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4733");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("bar")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
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

    public void testGetFreeSpace_String_literalMutation4734() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4734");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 1) || ((osName.indexOf("aix")) >= 0)) {
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

    public void testGetFreeSpace_String_literalMutation4735() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4735");
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

    public void testGetFreeSpace_String_literalMutation4736() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4736");
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

    public void testGetFreeSpace_String_literalMutation4737() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4737");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("bar")) >= 0)) {
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

    public void testGetFreeSpace_String_literalMutation4738() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4738");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 1)) {
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

    public void testGetFreeSpace_String_literalMutation4739() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4739");
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

    public void testGetFreeSpace_String_literalMutation4740() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4740");
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

    public void testGetFreeSpace_String_literalMutation4741() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4741");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "bar" , "-P" , "/" };
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

    public void testGetFreeSpace_String_literalMutation4742() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4742");
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

    public void testGetFreeSpace_String_literalMutation4743() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4743");
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

    public void testGetFreeSpace_String_literalMutation4744() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4744");
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

    public void testGetFreeSpace_String_literalMutation4745() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4745");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 1) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
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

    public void testGetFreeSpace_String_literalMutation4746() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4746");
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

    public void testGetFreeSpace_String_literalMutation4747() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4747");
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

    public void testGetFreeSpace_String_literalMutation4748() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4748");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("bar")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
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

    public void testGetFreeSpace_String_literalMutation4749() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4749");
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

    public void testGetFreeSpace_String_literalMutation4750() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4750");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= -1)) || ((osName.indexOf("solaris")) >= 0)) {
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

    public void testGetFreeSpace_String_literalMutation4751() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4751");
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

    public void testGetFreeSpace_String_literalMutation4752() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4752");
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

    public void testGetFreeSpace_String_literalMutation4753() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4753");
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

    public void testGetFreeSpace_String_literalMutation4754() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4754");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= -1)) {
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

    public void testGetFreeSpace_String_literalMutation4755() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4755");
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

    public void testGetFreeSpace_String_literalMutation4756() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4756");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "bar" , "-P" , "/" };
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

    public void testGetFreeSpace_String_literalMutation4757() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4757");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "bar" , "/" };
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

    public void testGetFreeSpace_String_literalMutation4758() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4758");
        if ((File.separatorChar) == '/') {
            String[] cmd = null;
            String osName = java.lang.System.getProperty("os.name");
            osName = osName.toLowerCase(java.util.Locale.ENGLISH);
            if (((osName.indexOf("hp-ux")) >= 0) || ((osName.indexOf("aix")) >= 0)) {
                cmd = new String[]{ "df" , "-P" , "/" };
            } else if ((((osName.indexOf("sunos")) >= 0) || ((osName.indexOf("sun os")) >= 0)) || ((osName.indexOf("solaris")) >= 0)) {
                cmd = new String[]{ "/usr/xpg4/bin/df" , "-P" , "bar" };
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

    public void testGetFreeSpace_String_literalMutation4759() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4759");
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

    public void testGetFreeSpace_String_literalMutation4760() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4760");
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

    public void testGetFreeSpace_String_literalMutation4761() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4761");
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

    public void testGetFreeSpace_String_literalMutation4763() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4763");
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
                if ((line.indexOf("bar")) >= 0) {
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

    public void testGetFreeSpace_String_literalMutation4764() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4764");
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
                if ((line.indexOf("512")) >= 1) {
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

    public void testGetFreeSpace_String_literalMutation4765() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4765");
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

    public void testGetFreeSpace_String_literalMutation4766() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4766");
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

    public void testGetFreeSpace_String_literalMutation4767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4767");
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

    public void testGetFreeSpace_String_literalMutation4768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4768");
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

    public void testGetFreeSpace_String_literalMutation4769() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4769");
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
            long free = FileSystemUtils.freeSpace("bar");
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

    public void testGetFreeSpace_String_literalMutation4770() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4770");
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

    public void testGetFreeSpace_String_literalMutation4771() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4771");
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

    public void testGetFreeSpace_String_literalMutation4772() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4772");
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

    public void testGetFreeSpace_String_literalMutation4773() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpace_String_literalMutation4773");
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
            long kb = FileSystemUtils.freeSpaceKb("bar");
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
            fsu.freeSpaceOS(null, 1, false, 2);
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_NullPath_add1274() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_add1274");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, 2);
            fsu.freeSpaceOS(null, 1, true, 2);
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

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4368() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4368");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 0, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4369() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4369");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 0, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4370() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4370");
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

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4371() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4371");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, -2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4372() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4372");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 0);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4373() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4373");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 0);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4375() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4375");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 2, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4376() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4376");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 0, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4377() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4377");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 0, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4378() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4378");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4379() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4379");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, -2);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4380() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4380");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceOS(null, 1, true, 0);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_NullPath_literalMutation4381() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_NullPath_literalMutation4381");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS(null, 1, false, 2);
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
            fsu.freeSpaceOS("", 2, false, 2);
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 2, true, 2);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_InitError_add1272() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_add1272");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 2, true, 2);
            fsu.freeSpaceOS("", 2, true, 2);
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

    public void testGetFreeSpaceOS_String_InitError_literalMutation4351() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4351");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -2, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4352() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4352");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4353() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4353");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4354() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4354");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, true, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4355() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4355");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, -2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4356() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4356");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 0);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4357() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4357");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 0);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4358() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4358");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("bar", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4359() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4359");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -2, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4360() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4360");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4361() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4361");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4362() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4362");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 2, false, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4363() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4363");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 2, true, -2);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4364() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4364");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 2, true, 0);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_InitError_literalMutation4365() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_InitError_literalMutation4365");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 2, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 2, true, 0);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_Other_add1275() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_add1275");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, 2);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceOS_String_Other_add1276() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_add1276");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, 2);
            fsu.freeSpaceOS("", 0, true, 2);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("bar", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4383() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4383");
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

    public void testGetFreeSpaceOS_String_Other_literalMutation4384() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4384");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", -1, false, -1);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4385() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4385");
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

    public void testGetFreeSpaceOS_String_Other_literalMutation4386() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4386");
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

    public void testGetFreeSpaceOS_String_Other_literalMutation4387() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4387");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, -2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4388() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4388");
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

    public void testGetFreeSpaceOS_String_Other_literalMutation4389() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4389");
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

    public void testGetFreeSpaceOS_String_Other_literalMutation4390() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4390");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("bar", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4391() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4391");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4392() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4392");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", -1, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4393() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4393");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4394() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4394");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, false, -1);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4395() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4395");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, -2);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4396() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4396");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
        } catch (IllegalStateException ex) {
        }
        try {
            fsu.freeSpaceOS("", 0, true, 0);
        } catch (IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Other_literalMutation4397() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Other_literalMutation4397");
        FileSystemUtils fsu = new FileSystemUtils();
        try {
            fsu.freeSpaceOS("", 0, false, 2);
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
                return 12346L;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2452,fsu,2451,fsu.freeSpaceOS("", 1, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,(12345L / 1024));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,fsu,2454,fsu.freeSpaceOS("", 1, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Windows_literalMutation4407() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Windows_literalMutation4407");
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

    public void testGetFreeSpaceOS_String_Windows_literalMutation4408() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Windows_literalMutation4408");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceWindows(String path, long timeout) throws IOException {
                return 6172L;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2452,fsu,2451,fsu.freeSpaceOS("", 1, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2453,(12345L / 1024));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2455,fsu,2454,fsu.freeSpaceOS("", 1, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Windows_literalMutation4409() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Windows_literalMutation4409");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceWindows(String path, long timeout) throws IOException {
                return 24690L;
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

    public void testGetFreeSpaceOS_String_Unix_literalMutation4399() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_literalMutation4399");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 12344L : 54321;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Unix_literalMutation4400() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_literalMutation4400");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 6172L : 54321;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Unix_literalMutation4401() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_literalMutation4401");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 24690L : 54321;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Unix_literalMutation4402() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_literalMutation4402");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 12345L : 54322;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Unix_literalMutation4403() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_literalMutation4403");
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

    public void testGetFreeSpaceOS_String_Unix_literalMutation4404() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_literalMutation4404");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 12345L : 27160;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2448,fsu,2447,fsu.freeSpaceOS("", 2, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2450,fsu,2449,fsu.freeSpaceOS("", 2, true, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceOS_String_Unix_literalMutation4405() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceOS_String_Unix_literalMutation4405");
        FileSystemUtils fsu = new FileSystemUtils() {
            @Override
            protected long freeSpaceUnix(String path, boolean kb, boolean posix, long timeout) throws IOException {
                return kb ? 12345L : 108642;
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
        String lines = "bar" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4687() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4687");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4688() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4688");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("foo" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4689() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4689");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("bar" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4690() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4690");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("foo" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4691() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4691");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("bar" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4692() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4692");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4693() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4693");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("bar" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4694() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4694");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("foo" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4695() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4695");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4696() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4696");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4697() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4697");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4698() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4698");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2475,fsu,2474,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4699() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_ParseCommaFormatBytes_literalMutation4699");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)        180,260 bytes\n" + "              10 Dir(s)  41,411,551,232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
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

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4629() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4629");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4630() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4630");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("bar" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4631() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4631");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("bar" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4632() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4632");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("bar" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4633() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4633");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("bar" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4634() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4634");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4635() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4635");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("bar" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4636() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4636");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("foo" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4637() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4637");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("bar" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4638() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4638");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4639() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4639");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4640() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4640");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4641() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4641");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c ");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyPath_literalMutation4642() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyPath_literalMutation4642");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2471,fsu,2470,fsu.freeSpaceWindows("", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse");
        String lines = "bar" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4672() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4672");
        String lines = " Volume in drive C is HDD\n" + ("bar" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4673() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4673");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("bar" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4674() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4674");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("bar" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4675() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4675");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("bar" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4676() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4676");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("foo" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4677() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4677");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("bar" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4678() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4678");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("foo" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4679() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4679");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("bar" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4680() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4680");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4681() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4681");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4682() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4682");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4683() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4683");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4684() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4684");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NormalResponse_literalMutation4685() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NormalResponse_literalMutation4685");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2473,fsu,2472,fsu.freeSpaceWindows("C:", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive");
        String lines = "bar" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4701() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4701");
        String lines = " Volume in drive C is HDD\n" + ("bar" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4702() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4702");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("bar" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4703() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4703");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("bar" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4704() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4704");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("bar" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4705() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4705");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("bar" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4706() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4706");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4707() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4707");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("bar" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4708() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4708");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("bar" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4709() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4709");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4710() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4710");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "foo")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4711() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4711");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4712() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4712");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4713() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4713");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2477,fsu,2476,fsu.freeSpaceWindows("C:\\somedir", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_StripDrive_literalMutation4714() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_StripDrive_literalMutation4714");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "bar");
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

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4716() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4716");
        String lines = " Volume in drive C is HDD\n" + ("foo" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4717() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4717");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("bar" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4718() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4718");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("foo" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4719() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4719");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("bar" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4720() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4720");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("bar" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4721() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4721");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("foo" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4722() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4722");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("bar" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4723() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4723");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("bar" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4724() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4724");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("foo" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4725() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4725");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "bar")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4726() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4726");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4727() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4727");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4728() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4728");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "dir /a /-c \"C:\\somedir\"");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_quoted_literalMutation4729() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_quoted_literalMutation4729");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\Xxxx\n" + ("\n" + ("19/08/2005  22:43    <DIR>          .\n" + ("19/08/2005  22:43    <DIR>          ..\n" + ("11/08/2005  01:07                81 build.properties\n" + ("17/08/2005  21:44    <DIR>          Desktop\n" + ("               7 File(s)         180260 bytes\n" + "              10 Dir(s)     41411551232 bytes free")))))))));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines , "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2479,fsu,2478,fsu.freeSpaceWindows("\"C:\\somedir\"", -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceWindows_String_EmptyResponse_add1304() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_add1304");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", 2);
            fsu.freeSpaceWindows("C:", 2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse");
        String lines = "bar";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4644() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4644");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4645() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4645");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4646() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4646");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4647() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4647");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("foo", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4648() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4648");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4649() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4649");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4650() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyResponse_literalMutation4650");
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
            fsu.freeSpaceWindows("C:", 2);
            fsu.freeSpaceWindows("C:", 2);
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

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4621() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4621");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4622() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4622");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4623() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4623");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4624() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4624");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("foo", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4625() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4625");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4626() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4626");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4627() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_EmptyMultiLineResponse_literalMutation4627");
        String lines = "\n\n";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", 0);
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
            fsu.freeSpaceWindows("C:", 2);
            fsu.freeSpaceWindows("C:", 2);
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

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4652() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4652");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4653() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4653");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4654() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4654");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4655() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4655");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("bar", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4656() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4656");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4657() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4657");
        String lines = "BlueScreenOfDeath";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4658() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_InvalidTextResponse_literalMutation4658");
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
            fsu.freeSpaceWindows("C:", 2);
            fsu.freeSpaceWindows("C:", 2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse");
        String lines = "bar" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4660() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4660");
        String lines = " Volume in drive C is HDD\n" + ("bar" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4661() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4661");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("bar" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4662() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4662");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + ("bar" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4663() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4663");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "bar")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4664() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4664");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(2 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4665() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4665");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4666() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4666");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceWindows("C:", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4667() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4667");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("bar", -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4668() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4668");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4669() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4669");
        String lines = " Volume in drive C is HDD\n" + (" Volume Serial Number is XXXX-YYYY\n" + ("\n" + (" Directory of C:\\Documents and Settings\\empty" + "\n")));
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        try {
            fsu.freeSpaceWindows("C:", 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4670() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceWindows_String_NoSuchDirectoryResponse_literalMutation4670");
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
            fsu.freeSpaceUnix("", false, false, 2);
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, 2);
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
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, 2);
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
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, 2);
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
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, 2);
            fsu.freeSpaceUnix("", false, true, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4411() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4411");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "bar";
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4412() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4412");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4413() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4413");
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4414() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4414");
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4415() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4415");
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4416() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4416");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", true, false, -1);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4417() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4417");
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4418() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4418");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, -2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4419() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4419");
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4420() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4420");
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4421() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4421");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, false, -1);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4422() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4422");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, false, -1);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4423() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4423");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4424() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4424");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, -2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4425() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4425");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4426() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4426");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4427() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4427");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4428() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4428");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4429() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4429");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4430() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4430");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4431() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4431");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4432() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4432");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4433() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4433");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", false, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4434() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4434");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4435() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4435");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, false, -1);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4436() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4436");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, -2);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4437() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4437");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", false, true, 0);
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyPath_literalMutation4438() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyPath_literalMutation4438");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   1472504  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("", false, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, false, 2);
        } catch (IllegalArgumentException ex) {
        }
        try {
            fsu.freeSpaceUnix("", true, true, 2);
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
        String lines = "bar" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,fsu,2468,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation4616() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation4616");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,fsu,2468,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation4617() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation4617");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,fsu,2468,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation4618() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation4618");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2469,fsu,2468,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation4619() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseLinux_literalMutation4619");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
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

    public void testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation4596() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation4596");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,fsu,2460,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation4597() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation4597");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,fsu,2460,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation4598() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation4598");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,fsu,2460,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation4599() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseFreeBSD_literalMutation4599");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2461,fsu,2460,fsu.freeSpaceUnix("/", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbLinux");
        String lines = "bar" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,fsu,2464,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation4606() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation4606");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "bar";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,fsu,2464,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation4607() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation4607");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,fsu,2464,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation4608() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation4608");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2465,fsu,2464,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation4609() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbLinux_literalMutation4609");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "/dev/xxx                497944    308528    189416  62% /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
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

    public void testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation4601() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation4601");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "foo";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,fsu,2462,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation4602() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation4602");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,fsu,2462,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation4603() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation4603");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,fsu,2462,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation4604() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbFreeBSD_literalMutation4604");
        String lines = "Filesystem  1K-blocks      Used    Avail Capacity  Mounted on\n" + "/dev/xxxxxx    128990    102902    15770    87%    /";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2463,fsu,2462,fsu.freeSpaceUnix("/", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbSolaris");
        String lines = "bar" + "/dev/dsk/x0x0x0x0    1350955  815754  481163    63%";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,fsu,2466,fsu.freeSpaceUnix("/dev/dsk/x0x0x0x0", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation4611() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation4611");
        String lines = "Filesystem            kbytes    used   avail capacity  Mounted on\n" + "bar";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,fsu,2466,fsu.freeSpaceUnix("/dev/dsk/x0x0x0x0", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation4612() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation4612");
        String lines = "Filesystem            kbytes    used   avail capacity  Mounted on\n" + "/dev/dsk/x0x0x0x0    1350955  815754  481163    63%";
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,fsu,2466,fsu.freeSpaceUnix("/dev/dsk/x0x0x0x0", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation4613() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation4613");
        String lines = "Filesystem            kbytes    used   avail capacity  Mounted on\n" + "/dev/dsk/x0x0x0x0    1350955  815754  481163    63%";
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2467,fsu,2466,fsu.freeSpaceUnix("/dev/dsk/x0x0x0x0", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation4614() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_NormalResponseKbSolaris_literalMutation4614");
        String lines = "Filesystem            kbytes    used   avail capacity  Mounted on\n" + "/dev/dsk/x0x0x0x0    1350955  815754  481163    63%";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
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

    public void testGetFreeSpaceUnix_String_LongResponse_literalMutation4584() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse_literalMutation4584");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("foo" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponse_literalMutation4585() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse_literalMutation4585");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "bar");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponse_literalMutation4586() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse_literalMutation4586");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponse_literalMutation4587() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse_literalMutation4587");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponse_literalMutation4588() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponse_literalMutation4588");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2459,fsu,2458,fsu.freeSpaceUnix("/home/users/s", false, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4589() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4589");
        String lines = "bar" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4590() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4590");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("bar" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4591() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4591");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "bar");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4592() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4592");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4593() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4593");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(-1 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4594() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_LongResponseKb_literalMutation4594");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + ("xxx-yyyyyyy-zzz:/home/users/s\n" + "                      14428928  12956424   1472504  90% /home/users/s");
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2457,fsu,2456,fsu.freeSpaceUnix("/home/users/s", true, false, -1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetFreeSpaceUnix_String_EmptyResponse_add1283() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_add1283");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse");
        String lines = "bar";
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4440() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4440");
        String lines = "";
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4441() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4441");
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4442() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4442");
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4443() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4443");
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4444() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4444");
        String lines = "";
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4445() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4445");
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4446() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4446");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4447() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4447");
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4448() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4448");
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4449() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4449");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4450() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4450");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4451() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4451");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4452() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4452");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4453() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4453");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4454() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4454");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4455() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4455");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4456() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4456");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4457() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4457");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4458() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4458");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4459() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4459");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4460() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4460");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4461() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4461");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4462() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4462");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4463() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4463");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4464() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4464");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4465() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4465");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4466() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_EmptyResponse_literalMutation4466");
        String lines = "";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1");
        String lines = "bar" + "                      14428928  12956424       100";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4468() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4468");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "bar";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4469() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4469");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4470() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4470");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4471() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4471");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4472() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4472");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4473() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4473");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4474() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4474");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4475() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4475");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4476() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4476");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4477() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4477");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4478() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4478");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, false, -1);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4479() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4479");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4480() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4480");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4481() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4481");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4482() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4482");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4483() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4483");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4484() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4484");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4485() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4485");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4486() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4486");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4487() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4487");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4488() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4488");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4489() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4489");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4490() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4490");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("foo", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4491() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4491");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4492() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4492");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4493() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4493");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4494() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4494");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4495() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse1_literalMutation4495");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "                      14428928  12956424       100";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4497() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4497");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4498() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4498");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4499() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4499");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4500() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4500");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4501() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4501");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("bar", false, false, -1);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4502() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4502");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4503() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4503");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4504() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4504");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4505() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4505");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4506() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4506");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4507() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4507");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4508() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4508");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4509() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4509");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4510() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4510");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4511() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4511");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4512() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4512");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4513() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4513");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4514() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4514");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4515() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4515");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4516() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4516");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4517() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4517");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4518() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4518");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4519() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4519");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4520() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4520");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4521() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4521");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4522() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4522");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4523() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4523");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4524() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse2_literalMutation4524");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424   nnnnnnn  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3");
        String lines = "bar" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4526() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4526");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4527() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4527");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4528() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4528");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4529() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4529");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4530() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4530");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4531() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4531");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4532() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4532");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4533() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4533");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4534() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4534");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4535() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4535");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4536() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4536");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, false, -1);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4537() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4537");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4538() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4538");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4539() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4539");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4540() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4540");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4541() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4541");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4542() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4542");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4543() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4543");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4544() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4544");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4545() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4545");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4546() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4546");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4547() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4547");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4548() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4548");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4549() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4549");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4550() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4550");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4551() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4551");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4552() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4552");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4553() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse3_literalMutation4553");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx:/home/users/s     14428928  12956424        -1  90% /home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
            fsu.freeSpaceUnix("/home/users/s", true, true, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4555() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4555");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "bar";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4556() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4556");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4557() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4557");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4558() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4558");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4559() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4559");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("bar", false, false, -1);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4560() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4560");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4561() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4561");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4562() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4562");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, -2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4563() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4563");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4564() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4564");
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4565() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4565");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, false, -1);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4566() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4566");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4567() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4567");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4568() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4568");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4569() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4569");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4570() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4570");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4571() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4571");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", false, true, -1);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4572() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4572");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4573() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4573");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4574() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4574");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4575() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4575");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4576() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4576");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
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

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4577() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4577");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("bar", true, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4578() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4578");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4579() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4579");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, -1);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4580() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4580");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, -2);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4581() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4581");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, true, 0);
        } catch (IOException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4582() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetFreeSpaceUnix_String_InvalidResponse4_literalMutation4582");
        String lines = "Filesystem           1K-blocks      Used Available Use% Mounted on\n" + "xxx-yyyyyyy-zzz:/home/users/s";
        FileSystemUtils fsu = new MockFileSystemUtils(0 , lines);
        try {
            fsu.freeSpaceUnix("/home/users/s", false, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", true, false, 2);
        } catch (IOException ex) {
        }
        try {
            fsu.freeSpaceUnix("/home/users/s", false, true, 2);
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

