abstract class Document{
    String fileName;
    String fileFormat;
    public Document(String name,String type){
        this.fileName=name;
        this.fileFormat=type;
    }
    public abstract void open();
    public abstract void close();
    public void save(){
        System.out.println(fileName+" saved sucesfully");
    }
}
class PDF extends Document{
    PDF(String filename){
        super(filename,"pdf");
    }
    @Override
    public void open() {
        System.out.println(fileName+"."+fileFormat+" (PDF) opened Now");
    }
    @Override
    public void close() {
        System.out.println(fileName+"."+fileFormat+" (PDF) closed sucessfully");
    }
}
class TextDocument extends Document{
    TextDocument(String filename){
        super(filename,"txt");
    }
    public void open() {
        System.out.println(fileName+"."+fileFormat+" (TextDocument) opened Now ");
    }
    @Override
    public void close() {
        System.out.println(fileName+"."+fileFormat+" (TextDocument) closed sucessfully");
    }
}
class ImageDocument extends Document{
    ImageDocument(String filename){
        super(filename,"jpg");
    }


    @Override
    public void open() {
        System.out.println(fileName+"."+fileFormat+" (Image) opened Now ");
    }

    @Override
    public void close() {
        System.out.println(fileName+"."+fileFormat+" (TextDocument) closed sucessfully");
    }
}
class PrintDocument{
    public static void main(String[] args) {
       TextDocument textDocument = new TextDocument("MyDetails");
       PDF pdf = new PDF("Resume");
       ImageDocument imageDocument = new ImageDocument("MyPhoto");
       textDocument.open();
       textDocument.close();
       pdf.open();
       imageDocument.open();
       pdf.close();
       imageDocument.close();
    }
}
