package org.apache.commons.io;

import org.apache.commons.io.output.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * @version $Id$
 */
public class HexDumpTest extends TestCase {
    /** 
     * Creates new HexDumpTest
     * 
     * @param name
     */
public HexDumpTest(String name) {
        super(name);
    }

    private char toHex(int n) {
        char[] hexChars = new char[]{ '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , 'A' , 'B' , 'C' , 'D' , 'E' , 'F' };
        return hexChars[(n % 16)];
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1739() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1739");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1740() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1740");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1741() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1741");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1742() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1742");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1743() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1743");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1744() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1744");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1745() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1745");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1746() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1746");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1747() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1747");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1748() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1748");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_add1749() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_add1749");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump");
        byte[] testArray = new byte[255];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3973() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3973");
        byte[] testArray = new byte[256];
        for (int j = 1 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3974() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3974");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 257 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3975() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3975");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -1, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3976() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3976");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 1);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3977() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3977");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[17 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3978() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3978");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (72 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3979() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3979");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 1 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3980() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3980");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 15 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3981() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3981");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (74 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3990() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3990");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 1 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3991() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3991");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 15 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3993() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3993");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = -1 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3994() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3994");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 17 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3995() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3995");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 15) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3996() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3996");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 1, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3997() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3997");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = -1 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3998() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3998");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435455, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation3999() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation3999");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, -1);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4000() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4000");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[15 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4001() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4001");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (74 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4002() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4002");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = -1 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4003() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4003");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 17 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4004() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4004");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (74 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4013() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4013");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = -1 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4014() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4014");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 17 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4016() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4016");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = -1 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4017() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4017");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 17 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4018() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4018");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 15) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4019() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4019");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), -1, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4020() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4020");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = -1 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4021() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4021");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777215, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4022() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4022");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 1);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4023() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4023");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[17 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4024() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4024");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (74 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4025() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4025");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 1 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4026() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4026");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 15 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4027() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4027");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (74 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4036() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4036");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 1 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4037() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4037");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 17 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4039() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4039");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = -1 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4040() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4040");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 17 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4041() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4041");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 17) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4042() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4042");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), -1, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4043() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4043");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = -1 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4044() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4044");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435457, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4045() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4045");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 130);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4046() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4046");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(9 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4047() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4047");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (72 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4048() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4048");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 2];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4049() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4049");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = -1 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4050() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4050");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 7 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4051() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4051");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (74 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4058() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4058");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 7))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4061() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4061");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = -1 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4062() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4062");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 17 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4063() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4063");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (130 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4064() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4064");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 17)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4065() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4065");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 257) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4066() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4066");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 17))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4070() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4070");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 1 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4071() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4071");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 17 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4072() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4072");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (128 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4073() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4073");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 17)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4074() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4074");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 255) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4075() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4075");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 1, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4076() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4076");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = -1 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4077() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4077");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435457, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4078() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4078");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), 2);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4079() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4079");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435457, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4080() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4080");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435457, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
public void testDump_literalMutation4082() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_literalMutation4082");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 1);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_remove1332() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_remove1332");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_remove1333() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_remove1333");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_remove1334() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_remove1334");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_remove1335() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_remove1335");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_remove1336() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_remove1336");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_remove1337() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_remove1337");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_remove1338() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_remove1338");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * test dump method
     * 
     * @exception IOException
     */
@Test(timeout = 1000)
    public void testDump_remove1339() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDump_remove1339");
        byte[] testArray = new byte[256];
        for (int j = 0 ; j < 256 ; j++) {
            testArray[j] = ((byte)(j));
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 0, stream, 0);
        byte[] outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        byte[] actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5040,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5041,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5042,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5043,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5044,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5045,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5046,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5047,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5048,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5049,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, -16777216, stream, 0);
        outputArray = new byte[16 * (73 + (HexDump.EOL.length()))];
        for (int j = 0 ; j < 16 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('F'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex(j)));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toHex(j)));
                outputArray[offset++] = ((byte)(toHex(k)));
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                outputArray[offset++] = ((byte)(toAscii(((j * 16) + k))));
            }
            java.lang.System.arraycopy(HexDump.EOL.getBytes(), 0, outputArray, offset, HexDump.EOL.getBytes().length);
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5050,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5051,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5052,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5053,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5054,actualOutput[j]);
        }
        stream = new ByteArrayOutputStream();
        HexDump.dump(testArray, 268435456, stream, 129);
        outputArray = new byte[(8 * (73 + (HexDump.EOL.length()))) - 1];
        for (int j = 0 ; j < 8 ; j++) {
            int offset = (73 + (HexDump.EOL.length())) * j;
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)('0'));
            outputArray[offset++] = ((byte)(toHex((j + 8))));
            outputArray[offset++] = ((byte)('1'));
            outputArray[offset++] = ((byte)(' '));
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toHex((index / 16))));
                    outputArray[offset++] = ((byte)(toHex(index)));
                } else {
                    outputArray[offset++] = ((byte)(' '));
                    outputArray[offset++] = ((byte)(' '));
                }
                outputArray[offset++] = ((byte)(' '));
            }
            for (int k = 0 ; k < 16 ; k++) {
                int index = (129 + (j * 16)) + k;
                if (index < 256) {
                    outputArray[offset++] = ((byte)(toAscii(index)));
                } 
            }
        }
        actualOutput = stream.toByteArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5055,outputArray.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5056,actualOutput.length);
        for (int j = 0 ; j < (outputArray.length) ; j++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5057,(("array[ " + j) + "] mismatch"));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5058,outputArray[j]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5059,actualOutput[j]);
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), -1);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, new ByteArrayOutputStream(), testArray.length);
        } catch (ArrayIndexOutOfBoundsException ignored_exception) {
        }
        try {
            HexDump.dump(testArray, 268435456, null, 0);
        } catch (IllegalArgumentException ignored_exception) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private char toAscii(int c) {
        char rval = '.';
        if ((c >= 32) && (c <= 126)) {
            rval = ((char)(c));
        } 
        return rval;
    }
}

