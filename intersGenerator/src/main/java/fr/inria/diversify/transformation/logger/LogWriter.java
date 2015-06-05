package fr.inria.diversify.transformation.logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class LogWriter {

    private static PrintWriter fileWriter;


    public static void writeLog() {

        fileWriter.close();
    }

    public static  void out(String string, boolean error) {
        try {
            PrintWriter writer = getWriter();

            if(error) {
                writer.write("ERROR: ");
            } else {
                writer.write("INFO: ");
            }
            writer.write(string + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static  void out(String string) {
        try {
            PrintWriter writer = getWriter();


            writer.write(string + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected static PrintWriter getWriter() throws FileNotFoundException {
        if(fileWriter == null) {
            ShutdownHookLog shutdownHook = new ShutdownHookLog();
            Runtime.getRuntime().addShutdownHook(shutdownHook);
            fileWriter = new PrintWriter("logTransformation.csv");

        }
        return fileWriter;
    }

}
