public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger initialized.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
public class Main {
    public static void main(String[] args) {

        Logger log1 = Logger.getInstance();
        log1.log("First log message");

        Logger log2 = Logger.getInstance();
        log2.log("Second log message");

        if (log1 == log2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances! Singleton failed.");
        }
    }
}
