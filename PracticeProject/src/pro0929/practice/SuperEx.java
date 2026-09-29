package pro0929.practice;

import java.util.Scanner;

class Point2 {
    private int x, y;

    public Point2() {
        this.x = this.y = 0;
    }

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("좌표: (" + x + ", " + y + ")");
    }
}

class ColorPoint2 extends Point2 {
    private String color;

    public ColorPoint2(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print("색: " + color + ", ");
        showPoint();
    }
}

public class SuperEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("좌표와 색을 입력하세요>> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String color = scanner.next();

        ColorPoint2 cp = new ColorPoint2(x, y, color);
        cp.showColorPoint();

        scanner.close();
    }
}
