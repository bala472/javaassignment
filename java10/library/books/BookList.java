package library.books;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Books> books;

    public BookList() {
        this.books = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
    }

    public void removeBook(Books book) {
        books.remove(book);
    }

    public Books findBookByTitle(String title) {
        for (Books book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }

        }
        return null;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
