package Sample.LLD.SingletonPattern;

public class TestSingleton {
    public static void main(String[] args) {
        Logger logger = FileLogger.getInstance();
        logger.log("Welcome to Singleton Patterns");

        Logger logger1 = FileLogger.getInstance();
        logger1.log("Welcome to Singleton Patterns");

        System.out.println(logger == logger1);
    }
    
}
