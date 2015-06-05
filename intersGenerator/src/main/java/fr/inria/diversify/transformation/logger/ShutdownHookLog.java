package fr.inria.diversify.transformation.logger;

public class ShutdownHookLog extends Thread {

    public void run() {
        LogWriter.writeLog();
    }
}
