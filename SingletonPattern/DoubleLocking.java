package Sample.LLD.SingletonPattern;

public class DoubleLocking {
    private static volatile DoubleLocking instance;

    private DoubleLocking(){

    }

    public DoubleLocking getInstance(){
        if(instance == null){
            synchronized(DoubleLocking.class){
                if(instance == null){
                    instance = new DoubleLocking();
                }
            }
        }

        return instance;
    }
    
}
