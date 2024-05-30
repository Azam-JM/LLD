package Sample.LLD.DesignPatterns.FactoryPattern;

public class DocumentFactory {
    public Document getDocument(String documentType){
        if(documentType == null){
            return null;
        }
        if(documentType.equalsIgnoreCase("docx")){
            return new Docx();
        }
        if(documentType.equalsIgnoreCase("pdf")){
            return new Pdf();
        }
        if(documentType.equalsIgnoreCase("word")){
            return new Word();
        }

        return null;
    }
    
}
