package Sample.LLD.SingletonPattern;

public class LazyInitialization {
    private LazyInitialization instance = null;

    private LazyInitialization(){

    }

    public LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
    
}
