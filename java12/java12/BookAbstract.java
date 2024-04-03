
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 abstract class Book {
    private  String title;
    private String ISBN;
    private String author;
    private String publication;
    private double price;
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
    abstract public void startLogin(List<Book> bookList);
}
class PrintBooks extends Book{
     public PrintBooks(String title,String ISBN,String author,String publication,double price){
         super(title,ISBN,author,publication,price);
     }
     public PrintBooks(){

     }
    public static void main(String[] args) {
    List<Book> bookList = new ArrayList<>(3);
    bookList.add(new PrintBooks("Repidex","9788122309485","R.K Gupta","Pustak Mahal",315));
    bookList.add(new PrintBooks("Rich Dad and poor dad","9780446677455"," Robert Kiyosaki and Sharon Lechter","Plata Publishing, LLC.",117));
    bookList.add(new PrintBooks("Atomic Habit","9783442178582","James Clear","Penguin Random House",205));
    PrintBooks printBooks = new PrintBooks();
    printBooks.startLogin(bookList);

    }
        public void startLogin(List<Book> bookList){
            System.out.println(" ------  Book Available ------ ");
            for (Book book : bookList) {
                System.out.print("Title: " + book.getTitle()+"    ");
                System.out.print("ISBN: " + book.getISBN()+"    ");
                System.out.print("Author: " + book.getAuthor()+"    ");
                System.out.print("Publication: " + book.getPublication()+"  ");
                System.out.print("Price: $" + book.getPrice());
                System.out.println();
                
            }
            Scanner in = new Scanner(System.in);
            try{
                System.out.println("Enter User Name (bala123) : ");
                String userName = in.nextLine();
                if(userName.equals("bala123")){
                    try{
                        System.out.println("Enter password (1234) : ");
                        String password = in.nextLine();
                        if(password.equals("1234")){
                            System.out.println("User Name password Matched  Sucessfully \n");
                            System.out.println("Enter ISBN number to update book details ");
                            try{
                                String isbn = in.nextLine();
                                for(Book book : bookList){
                                    if( isbn.equals(book.getISBN())){
                                        System.out.println("Enter Book Name : ");
                                        book.setTitle(in.nextLine());
                                        System.out.println("Enter Book Author : ");
                                        book.setAuthor(in.nextLine());
                                        System.out.println("Enter publication : ");
                                        book.setPublication(in.nextLine());
                                        System.out.println("Enter price : ");
                                        book.setPrice(in.nextDouble());
                                        in.nextLine();
                                        System.out.println("Enter ISBN number : ");
                                        book.setISBN(in.nextLine());
                                        System.out.println("\nBook details updated Sucesfully \n");
                                        startLogin(bookList);
                                    }
                                }
                                throw new Exception();
                            }catch(Exception e){
                                System.out.println("Given ISBN number not valid ");
                                startLogin(bookList);
                            }
                            

                        }else{
                            throw new Exception();
                        }
                    }catch(Exception e){
                        System.out.println("Incorrect password");
                        startLogin(bookList);
                    }
                   
            }else{
                throw new Exception();
            }

        }catch(Exception e){
            System.out.println("Incorrect User Name ");
            startLogin(bookList);
        }

}
}


