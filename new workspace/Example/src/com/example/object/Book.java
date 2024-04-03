package com.example.object;

public class Book {
    public Book(){}
    public Book(String title, int price, String publisher, String author, int pageNum, String isbn){
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.author = author;
        this.pageNum = pageNum;
        this.isbn = isbn;
    }
    public Book(Book b){
        this(b.title, b.price, b.publisher, b.author, b.pageNum ,b.isbn);
    }

    private String title;
    private int price;
    private String publisher;
    private String author;
    private int pageNum;
    private String isbn;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    public void setPageNum(int pageNum){
        this.pageNum = pageNum;
    }

    public int getPageNum() {
        return pageNum;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString(){
        //String title, int price, String publisher, String author, int pageNum, String isbn
        return "title: "+title+" price: "+price+" publisher: "+publisher+" author: "+author+" pageNum: "+pageNum+" isbn: "+isbn;
    }
}
