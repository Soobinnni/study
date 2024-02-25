package part5.second;

import java.util.Arrays;

public class BookArray {
    private final static int DEFULAT_CAPACITY=5;
    private Book[] books;
    private int size=0;

    public BookArray(){
        this.books = new Book[DEFULAT_CAPACITY];
    }

    public void add(Book book){
        if(size == books.length){
            enhanceCapcity();
        }
        books[size++] = book;
    }

    public Book get(int index){
        if(index < 0 || index >= books.length){
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return books[index];
    }

    public int getSize(){
        return this.size;
    }
    private void enhanceCapcity(){
        int newCapacity = size + 1;
        books = Arrays.copyOf(books, newCapacity);
    }

    @Override
    public String toString() {
        return "books=" + Arrays.toString(books) +
                ", size=" + size;
    }
}
