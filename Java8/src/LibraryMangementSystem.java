public class LibraryMangementSystem {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void login(){}
    public void register(){}
    public void logout(){}
}
class User{
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void verify(){}
    public void checkAccount(){}
    public static void get_book_info(){}

}
class Account{
    public int no_borrowed_books(){ return 0;}
    public int no_reserved_books(){ return 0;}
    public int no_returned_books(){return 0;}
    public int no_lost_books(){return 0;}
    public double fine_amount(){return 0;}
    public double calculate_fine(){return 0;}
}
class Book{
    private String title;
    private String author;
    private String ISBN;
    private String publication;
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public void showDuet(){}
    public void reservationStatus(){}
    public void feedback(){}
    public void bookRequest(){}
    public void renewInfo(){}
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
}
class Librarian{
    private String name;
    private String id;
    private String password;
    private String searchString;
    public void verifyLibrary(){}
    public void search(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSearchString() {
        return searchString;
    }
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
class LibraryDatabase{
    private int listOfBooks;

    public int getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(int listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    public void add(){}
    public void delete(){}
    public void update(){}
    public void display(){}
    public void search(){}

}

