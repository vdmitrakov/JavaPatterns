package basepatterns.creational.singleton;

/**
 * Created by vladimir on 24.05.17.
 */
public class ProgramLogger {
    private static  ProgramLogger programLogger;
    private static String logFile = "This is a log file.\n\n";

    public static synchronized ProgramLogger getProgramLogger()    {
        if (programLogger == null){
            programLogger = new ProgramLogger();
    }
        return programLogger;
    }

    public ProgramLogger() {
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";

    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
