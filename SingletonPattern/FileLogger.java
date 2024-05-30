package Sample.LLD.SingletonPattern;

public class FileLogger  implements Logger {
    private static FileLogger instance;

    private FileLogger(){
    }

    public static FileLogger getInstance(){
        if(instance == null){
            synchronized(FileLogger.class){
                if(instance == null){
                    instance = new FileLogger();
                }
            }
        }
        return instance;
    }

    
    @Override
    public void log(String message){
        System.out.println(message);
    }

}
