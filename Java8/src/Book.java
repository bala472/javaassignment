import java.util.ArrayList;
import java.util.List;
class Book {
    private  String title;
    private String ISBN;
    private String author;
    private String publication;
    private double price;
  //  private List<Book> bookList = new ArrayList<>();
    Book(String title,String ISBN,String author,String publication,double price){
        this.title = title;
        this.ISBN = ISBN;
        this.author=author;
        this.publication=publication;
        this.price = price;
    }
    Book(){

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
class PrintBooks{
    public static void main(String[] args) {
    List<Book> bookList = new ArrayList<>(3);
    bookList.add(new Book("Repidex","9788122309485","R.K Gupta","Pustak Mahal",315));
    bookList.add(new Book("Rich Dad and poor dad","9780446677455"," Robert Kiyosaki and Sharon Lechter","Plata Publishing, LLC.",117));
    bookList.add(new Book("Atomic Habit","9783442178582","James Clear","Penguin Random House",205));
        for (Book book : bookList) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication: " + book.getPublication());
            System.out.println("Price: $" + book.getPrice());
            System.out.println();
        }
   /* List<Integer> temp = new ArrayList<>();
    temp.add(3);
    temp.add(2453);
    temp.add(434);
    System.out.println(temp);*/
    }
}