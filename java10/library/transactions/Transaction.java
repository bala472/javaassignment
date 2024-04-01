package library.transactions;

import library.books.Books;
import library.members.Member;

public class Transaction {
    private Books book;
    private Member member;
    private String date;

    public Transaction(Books book, Member member, String date) {
        this.book = book;
        this.member = member;
        this.date = date;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

