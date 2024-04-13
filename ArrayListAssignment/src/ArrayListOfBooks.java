import java.util.ArrayList;
import java.util.Arrays;

class ArrayListOfBooks {
    public static void main(String[] args) {
        addBookOnBookList("The Alchemist","Poulo",150.50);
        addBookOnBookList("Rich Dad Poor Dad","Robert",200.00);
        addBookOnBookList("Atomic Habit","James",250.00);
        System.out.printf("%-40s %-40s %-8s%n","BooK Name","Author","Price");
        for(Book book:BookList){
            System.out.printf("%-40s %-40s %-8s%n",book.getBookName(),book.getAuthor(),book.getPrice());
        }



    }
    static ArrayList<Book> BookList = new ArrayList<>();
    public static void addBookOnBookList(String bookName,String author,double price){
        Book book = new Book();
        book.setBookName(bookName);
        book.setAuthor(author);
        book.setPrice(price);
        BookList.add(book);
    }

}
class Book{
    private String bookName;
    private String author;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}