package Sample.LLD.DesignPatterns.FactoryPattern;

public class Docx implements Document {
    @Override
    public void generate() {
        System.out.println("Docs document is generated");
    }
}
