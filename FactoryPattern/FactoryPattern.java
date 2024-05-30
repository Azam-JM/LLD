package Sample.LLD.DesignPatterns.FactoryPattern;

public class FactoryPattern {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        Document document = documentFactory.getDocument("pdf");
        document.generate();

        Document document2 = documentFactory.getDocument("word");
        document2.generate();

        Document document3 = documentFactory.getDocument("docx");
        document3.generate();
    }
    
}
