package library;

import library.books.*;
import library.members.*;
import library.transactions.*;

public class LibraryManagement {
    public static void main(String[] args) {
        
        Books book1 = new Books("Rich Dad Poor Dad", "Robert ");
        Books book2 = new Books("Ponniyin selvan", "Kalki");

        Member member1 = new Member("Bala", 1);
        Member member2 = new Member("Sivam", 2);

        Transaction transaction1 = new Transaction(book1, member1, "04/01/2024");
        Transaction transaction2 = new Transaction(book2, member2, "04/02/2024");

        BookList bookList = new BookList();
        MemberList memberList = new MemberList();
        TransactionList transactionList = new TransactionList();
        bookList.addBook(book1);
        bookList.addBook(book2);
        memberList.addMember(member1);
        memberList.addMember(member2);
        transactionList.addTransaction(transaction1);
        transactionList.addTransaction(transaction2);

    }
}

