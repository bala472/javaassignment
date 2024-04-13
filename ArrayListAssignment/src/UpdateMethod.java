import java.util.ArrayList;
import java.util.Arrays;

class UpdateMethod extends  ArrayListOfBooks {
    public static void main(String[] args) {
        addBookOnBookList("The Alchemist", "Poulo", 150.50);
        addBookOnBookList("Rich Dad Poor Dad", "Robert", 200.00);
        addBookOnBookList("Atomic Habit", "James", 250.00);
        System.out.printf("%-40s %-40s %-8s%n", "BooK Name", "Author", "Price");
        for (Book book : BookList) {
            System.out.printf("%-40s %-40s %-8s%n", book.getBookName(), book.getAuthor(), book.getPrice());
        }

        System.out.println("\nAter Update (Changed 'Atomic Habits' to 'Harry Potter')\n");
        updateBook("Atomic Habit","Harry Potter","J K Rowling",300);
        System.out.printf("%-40s %-40s %-8s%n", "BooK Name", "Author", "Price");
        for (Book book : BookList) {
            System.out.printf("%-40s %-40s %-8s%n", book.getBookName(), book.getAuthor(), book.getPrice());
        }

    }
    public static void updateBook(String oldBookName,String newBookName,String newAuthor,double newPrice){
        for(Book book:BookList){
            if(oldBookName.equals(book.getBookName())){
                book.setBookName(newBookName);
                book.setAuthor(newAuthor);
                book.setPrice(newPrice);
            }
        }
    }
}
