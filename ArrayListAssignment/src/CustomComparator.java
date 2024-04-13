import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class CustomComparator implements Comparator<Book> {
    
    public int compare(Book one, Book two){
        return Integer.compare((int)one.price,(int)two.price);
    }

}

class Book {
    String bookName;
    double price;
    Book(String bookName,double price){
        this.bookName=bookName;
        this.price = price;
    }
    
    
    
}
class ImplementBookComparator{
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Ponniyin Selvan",2000));
        bookList.add(new Book("Atomic Habits",100));
        bookList.add(new Book("Bagavat geeta", 500));
        bookList.add(new Book("Psychology of Money", 1850));
        for(Book k : bookList){
            System.out.println("BookName : "+k.bookName +" Price : "+ k.price);
        }
        Collections.sort(bookList, new CustomComparator());
        System.out.println("\nAfter sorting using CustomComparator class\n");
        for(Book k : bookList){
            System.out.println("BookName : "+k.bookName +" Price : "+ k.price);
        }
    }
}

