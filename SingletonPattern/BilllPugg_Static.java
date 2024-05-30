package Sample.LLD.SingletonPattern;

public class BilllPugg_Static {
    private BilllPugg_Static(){

    }

    private static class Singleton {
        private static final BilllPugg_Static instance = new BilllPugg_Static();
    }

    public BilllPugg_Static getInstance(){
        return Singleton.instance;
    }
    
}
