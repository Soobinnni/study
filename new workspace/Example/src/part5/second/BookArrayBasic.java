package part5.second;

public class BookArrayBasic {
    public static void main(String[] args) {
        Book b1 = new Book("홍길동전", 1000, "한빛", "홍길동");
        Book b2 = new Book("심청전", 1300, "한빛", "심청");
        Book b3 = new Book("로미오와 줄리엣", 12000, "한빛", "셰익스피어");
        Book b4 = new Book("안녕자두야", 2350, "한빛", "몰라");

        BookArray books = new BookArray();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        for (int i=0;i<books.getSize();i++){
            System.out.println((i+1)+"번째 책 정보: "+books.get(i));
        }
        System.out.println(books);
    }
}
