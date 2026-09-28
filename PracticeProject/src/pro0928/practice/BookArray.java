package pro0928.practice;

import java.util.Scanner;

class Book {
    String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book[] book = new Book[3];
        Scanner scanner = new Scanner(System.in);

        book[0] = new Book("명품 자바 프로그래밍", "황기태");

        for (int i = 1; i < book.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book[i] = new Book(title, author);
        }

        for (int i = 0; i < book.length; i++) {
            System.out.println("저자: " + book[i].author + ", 제목: " + book[i].title);
        }

        scanner.close();
    }
}
