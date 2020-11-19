package lab;

public class Book {
    String name;
    String writer;
    String pubname;
    String pubdate;
    int price;
    double discnt;
    String bkimg;      // java.png

    //생성자

    public Book(){

    }

    public Book(String name, String writer, String pubname, String pubdate, int price, double discnt, String bkimg) {
        this.name = name;
        this.writer = writer;
        this.pubname = pubname;
        this.pubdate = pubdate;
        this.price = price;
        this.discnt = discnt;
        this.bkimg = bkimg;
    }
}
