package Sample.LLD.DesignPatterns.FactoryPattern;

public class Pdf implements Document {
    @Override
    public void generate(){
        System.out.println("PDF document generated");
    }
}
