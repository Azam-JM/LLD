package Sample.LLD.SingletonPattern;

public class EagerInitialiazation {

    private static final EagerInitialiazation instance = new EagerInitialiazation();

    private EagerInitialiazation(){

    }
    
    public EagerInitialiazation getInstance(){
        return instance;
    }
}
