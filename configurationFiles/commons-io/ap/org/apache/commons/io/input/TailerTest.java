//package org.apache.commons.io.input;
//
//import java.util.concurrent.Executor;
//import java.io.File;
//import org.apache.commons.io.testtools.FileBasedTestCase;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//import java.io.RandomAccessFile;
//import java.util.concurrent.ScheduledThreadPoolExecutor;
//import org.junit.Test;
//import java.io.Writer;
//
///** 
// * Tests for {@link Tailer}.
// * 
// * @version $Id$
// */
//public class TailerTest extends FileBasedTestCase {
//    private Tailer tailer;
//
//    public TailerTest(String name) {
//        super(name);
//    }
//
//    @Override
//    protected void tearDown() throws Exception {
//        if ((tailer) != null) {
//            tailer.stop();
//            Thread.sleep(1000);
//        } 
//        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
//        Thread.sleep(1000);
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_add271() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_add271");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_add272() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_add272");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_add273() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_add273");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_add274() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_add274");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_add275() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_add275");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_add276() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_add276");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_add277() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_add277");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile");
//        long delay = 51;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation636() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation636");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "foo");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation637() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation637");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, -1);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation638() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation638");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , false);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation639() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation639");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 1 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation640() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation640");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 99999 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation641() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation641");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("foo");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation642() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation642");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("foo");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation643() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation643");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation644() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation644");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 0)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation645() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation645");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("foo")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testLongFile_literalMutation646() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_literalMutation646");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("foo" + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_remove129() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_remove129");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_remove130() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_remove130");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_remove131() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_remove131");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_remove132() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_remove132");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_remove133() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_remove133");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_remove134() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_remove134");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testLongFile_remove135() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongFile_remove135");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testLongFile.txt");
//        createFile(file, 0);
//        Writer writer = new FileWriter(file , true);
//        for (int i = 0 ; i < 100000 ; i++) {
//            writer.write("LineLineLineLineLineLineLineLineLineLine\n");
//        }
//        writer.write("SBTOURIST\n");
//        org.apache.commons.io.IOUtils.closeQuietly(writer);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false);
//        long start = System.currentTimeMillis();
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        System.out.println(("Elapsed: " + ((System.currentTimeMillis()) - start)));
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testBufferBreak_add260() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_add260");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testBufferBreak_add261() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_add261");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testBufferBreak_add262() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_add262");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testBufferBreak_add263() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_add263");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testBufferBreak() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak");
//        long delay = 49;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testBufferBreak_literalMutation617() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_literalMutation617");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "foo");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testBufferBreak_literalMutation618() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_literalMutation618");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 1);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testBufferBreak_literalMutation619() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_literalMutation619");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "foo");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testBufferBreak_literalMutation620() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_literalMutation620");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testBufferBreak_literalMutation621() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_literalMutation621");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 0);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testBufferBreak_literalMutation622() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_literalMutation622");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 2)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testBufferBreak_literalMutation623() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_literalMutation623");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("foo")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testBufferBreak_remove118() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_remove118");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testBufferBreak_remove119() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_remove119");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testBufferBreak_remove120() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_remove120");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        listener.clear();
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testBufferBreak_remove121() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBufferBreak_remove121");
//        long delay = 50;
//        File file = new File(FileBasedTestCase.getTestDirectory() , "testBufferBreak.txt");
//        createFile(file, 0);
//        writeString(file, "SBTOURIST\n");
//        TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delay , false , 1);
//        Thread thread = new Thread(tailer);
//        thread.start();
//        List<java.lang.String> lines = listener.getLines();
//        while ((lines.isEmpty()) || (!(lines.get(((lines.size()) - 1)).equals("SBTOURIST")))) {
//            lines = listener.getLines();
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add303() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add303");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add304() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add304");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add305() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add305");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add306() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add306");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add307() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add307");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add308() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add308");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add309() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add309");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add310() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add310");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add311() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add311");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_add312() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_add312");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof");
//        long delay = 49;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof_literalMutation673() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_literalMutation673");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "foo");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof_literalMutation674() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_literalMutation674");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, -1);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof_literalMutation675() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_literalMutation675");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof_literalMutation677() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_literalMutation677");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "foo");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof_literalMutation678() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_literalMutation678");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 1));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof_literalMutation679() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_literalMutation679");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, "foo");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof_literalMutation680() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_literalMutation680");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 1));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailerEof_literalMutation681() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_literalMutation681");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 1));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_remove161() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_remove161");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailerEof_remove162() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailerEof_remove162");
//        long delay = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer2-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        final Tailer tailer = new Tailer(file , listener , delay , false);
//        final Thread thread = new Thread(tailer);
//        FileWriter writer = null;
//        try {
//            writeString(file, "Line");
//            Thread.sleep((delay * 2));
//            List<java.lang.String> lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),931,lines,930,lines.size());
//            writeString(file, " one\n");
//            Thread.sleep((delay * 2));
//            lines = listener.getLines();
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,lines,932,lines.size());
//            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),935,lines,934,lines.get(0));
//            listener.clear();
//        } finally {
//            tailer.stop();
//            Thread.sleep((delay * 2));
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add285() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add285");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add286() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add286");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add287() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add287");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add288() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add288");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add289() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add289");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add290() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add290");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add291() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add291");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add292() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add292");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add293() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add293");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add294() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add294");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add295() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add295");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add296() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add296");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add297() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add297");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add298() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add298");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add299() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add299");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add300() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add300");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add301() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add301");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_add302() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_add302");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer");
//        long delayMillis = 49;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation659() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation659");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "foo");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation660() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation660");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 1);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation661() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation661");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("foo");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation662() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation662");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("foo");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation663() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation663");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , true , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation664() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation664");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "foo", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation665() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation665");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "foo");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation666() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation666");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 11;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation667() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation667");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "foo");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation668() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation668");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 1);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation669() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation669");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "foo");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testTailer_literalMutation671() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_literalMutation671");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "foo");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove143() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove143");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove144() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove144");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove145() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove145");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove146() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove146");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove147() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove147");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove148() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove148");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove149() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove149");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove150() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove150");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove151() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove151");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove152() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove152");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove153() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove153");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove154() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove154");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove155() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove155");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove156() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove156");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove157() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove157");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove158() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove158");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove159() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove159");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        write(file, "Line one", "Line two");
//        final long testDelayMillis = delayMillis * 10;
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testTailer_remove160() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTailer_remove160");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer1-test.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        String osname = System.getProperty("os.name");
//        boolean isWindows = osname.startsWith("Windows");
//        tailer = new Tailer(file , listener , delayMillis , false , isWindows);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),937,lines,936,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),939,lines,938,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),941,lines,940,lines.get(1));
//        listener.clear();
//        write(file, "Line three");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),943,lines,942,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),945,lines,944,lines.get(0));
//        listener.clear();
//        lines = org.apache.commons.io.FileUtils.readLines(file);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),947,lines,946,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),949,lines,948,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),951,lines,950,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),953,lines,952,lines.get(2));
//        file.delete();
//        boolean exists = file.exists();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),954,exists);
//        createFile(file, 0);
//        Thread.sleep(testDelayMillis);
//        write(file, "Line four");
//        Thread.sleep(testDelayMillis);
//        lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),956,lines,955,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),958,lines,957,lines.get(0));
//        listener.clear();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        write(file, "Line five");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),960,listener.getLines(),959,listener.getLines().size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),961,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),962,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),963,listener.notFound);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),964,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Override
//    protected void createFile(File file, long size) throws IOException {
//        super.createFile(file, size);
//        RandomAccessFile reader = null;
//        try {
//            while (reader == null) {
//                try {
//                    reader = new RandomAccessFile(file.getPath() , "r");
//                } catch (FileNotFoundException e) {
//                }
//                try {
//                    Thread.sleep(200L);
//                } catch (InterruptedException e) {
//                }
//            }
//        } finally {
//            org.apache.commons.io.IOUtils.closeQuietly(reader);
//        }
//    }
//
//    /** 
//     * Append some lines to a file
//     */
//private void write(File file, String... lines) throws Exception {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(file , true);
//            for (String line : lines) {
//                writer.write((line + "\n"));
//            }
//        } finally {
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//    }
//
//    /** 
//     * Append a string to a file
//     */
//private void writeString(File file, String... strings) throws Exception {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(file , true);
//            for (String string : strings) {
//                writer.write(string);
//            }
//        } finally {
//            org.apache.commons.io.IOUtils.closeQuietly(writer);
//        }
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFile_add278() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_add278");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        Thread.sleep(idle);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFile_add279() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_add279");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFile_add280() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_add280");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFile() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "foo");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFile_literalMutation648() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_literalMutation648");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 99;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFile_literalMutation649() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_literalMutation649");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 49;
//        tailer = Tailer.create(file, listener, delay, false);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFile_literalMutation650() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_literalMutation650");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFile_remove136() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_remove136");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFile_remove137() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_remove137");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        Thread.sleep(idle);
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFile_remove138() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFile_remove138");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),925,file,924,file.exists());
//        final TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = Tailer.create(file, listener, delay, false);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),926,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),928,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),929,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFileUsingExecutor_add281() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_add281");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFileUsingExecutor_add282() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_add282");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFileUsingExecutor_add283() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_add283");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFileUsingExecutor_add284() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_add284");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFileUsingExecutor() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "foo");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFileUsingExecutor_literalMutation653() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_literalMutation653");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 101;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFileUsingExecutor_literalMutation654() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_literalMutation654");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 49;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFileUsingExecutor_literalMutation655() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_literalMutation655");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testStopWithNoFileUsingExecutor_literalMutation656() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_literalMutation656");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(0);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFileUsingExecutor_remove139() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_remove139");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        Thread.sleep(idle);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFileUsingExecutor_remove140() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_remove140");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFileUsingExecutor_remove141() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_remove141");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        Thread.sleep(idle);
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testStopWithNoFileUsingExecutor_remove142() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStopWithNoFileUsingExecutor_remove142");
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "nosuchfile");
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),919,file,918,file.exists());
//        TestTailerListener listener = new TestTailerListener();
//        int delay = 100;
//        int idle = 50;
//        tailer = new Tailer(file , listener , delay , false);
//        Executor exec = new ScheduledThreadPoolExecutor(1);
//        exec.execute(tailer);
//        tailer.stop();
//        tailer = null;
//        Thread.sleep((delay + idle));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,listener.exception);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),921,listener.initialised);
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),922,((listener.notFound) > 0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),923,listener.rotated);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_add264() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_add264");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_add265() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_add265");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_add266() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_add266");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_add267() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_add267");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_add268() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_add268");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_add269() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_add269");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_add270() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_add270");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335");
//        long delayMillis = 49;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation625() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation625");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "foo");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation626() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation626");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 1);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation627() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation627");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation628() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation628");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "foo", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation629() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation629");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "foo", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation630() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation630");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "foo", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation631() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation631");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "foo", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation632() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation632");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "foo");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    public void testIO335_literalMutation633() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_literalMutation633");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 9;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_remove122() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_remove122");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_remove123() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_remove123");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_remove124() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_remove124");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_remove125() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_remove125");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_remove126() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_remove126");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_remove127() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_remove127");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        Thread.sleep(testDelayMillis);
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    @Test(timeout = 1000)
//    public void testIO335_remove128() throws Exception {
//        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIO335_remove128");
//        long delayMillis = 50;
//        final File file = new File(FileBasedTestCase.getTestDirectory() , "tailer-testio334.txt");
//        createFile(file, 0);
//        final TestTailerListener listener = new TestTailerListener();
//        tailer = new Tailer(file , listener , delayMillis , false);
//        final Thread thread = new Thread(tailer);
//        thread.start();
//        writeString(file, "CRLF\r\n", "LF\n", "CR\r", "CRCR\r\r", "trail");
//        final long testDelayMillis = delayMillis * 10;
//        List<java.lang.String> lines = listener.getLines();
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),909,lines,908,lines.size());
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),911,lines,910,lines.get(0));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),913,lines,912,lines.get(1));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),915,lines,914,lines.get(2));
//        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),917,lines,916,lines.get(3));
//        tailer.stop();
//        tailer = null;
//        thread.interrupt();
//        Thread.sleep(testDelayMillis);
//        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
//    }
//
//    /** 
//     * Test {@link TailerListener} implementation.
//     */
//private static class TestTailerListener implements TailerListener {
//        private final List<java.lang.String> lines = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.String>());
//
//        volatile Exception exception = null;
//
//        volatile int notFound = 0;
//
//        volatile int rotated = 0;
//
//        volatile int initialised = 0;
//
//        public void handle(String line) {
//            lines.add(line);
//        }
//
//        public List<java.lang.String> getLines() {
//            return lines;
//        }
//
//        public void clear() {
//            lines.clear();
//        }
//
//        public void handle(Exception e) {
//            exception = e;
//        }
//
//        public void init(Tailer tailer) {
//            (initialised)++;
//        }
//
//        public void fileNotFound() {
//            (notFound)++;
//        }
//
//        public void fileRotated() {
//            (rotated)++;
//        }
//    }
//}
//
