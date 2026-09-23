package pro0922.practice;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("한 변의 길이를 입력하세요>> ");

        int side = scanner.nextInt();
        rect.width = side;
        rect.height = side;

        System.out.println("사각형의 면적은 " + rect.getArea());

        scanner.close();
    }
}
