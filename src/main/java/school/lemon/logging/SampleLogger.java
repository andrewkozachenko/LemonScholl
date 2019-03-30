package school.lemon.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SampleLogger {
    private static Logger log =  Logger.getLogger(SampleLogger.class.getName());

    public static void logMethod(){
        log.info("Start some method");
        System.out.println("Some work");
        log.info("End some method");
    }

    private static void logException(){
        try{
            throw new Exception("Sample exception");
        } catch (Exception e){
            log.log(Level.SEVERE, "Exception: ", e);
        }

    }

    private static void logFineLevel(){
        log.fine("some minor, debug message");
        if(log.isLoggable(Level.FINE)){
            log.fine("SOme strange mesage");
        }
    }

    public static void main(String[] args) {
        logMethod();
        logException();
        logFineLevel();
    }
}
