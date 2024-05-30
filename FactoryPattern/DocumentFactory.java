package Sample.LLD.DesignPatterns.FactoryPattern;

public class DocumentFactory {
    public Document getDocument(String documentType){
        Document document;
        if(documentType.equalsIgnoreCase("docx")){
            document = new Docx();
        } else if(documentType.equalsIgnoreCase("pdf")){
            document =  new Pdf();
        }else if(documentType.equalsIgnoreCase("word")){
            document = new Word();
        } else {
            document = null;
        }

        return document;
    }
    
}
