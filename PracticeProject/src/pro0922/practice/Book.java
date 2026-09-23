package pro0922.practice;

public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book(String title) {
        this(title, "작자미상");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        String myName = "허영훈";

        Book myBook = new Book("자바 프로그래밍", myName);
        Book java = new Book("자바");

        myBook.show();
        java.show();
    }
}
