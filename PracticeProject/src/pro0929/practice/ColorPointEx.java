package pro0929.practice;

import java.util.Scanner;

class Point {
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("좌표: (" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print("색: " + color + ", ");
        showPoint();
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x, y 값을 입력하세요>> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Point p = new Point();
        p.set(x, y);
        p.showPoint();

        System.out.print("x, y, color 값을 입력하세요>> ");
        int cx = scanner.nextInt();
        int cy = scanner.nextInt();
        String color = scanner.next();

        ColorPoint cp = new ColorPoint();
        cp.set(cx, cy);
        cp.setColor(color);
        cp.showColorPoint();

        scanner.close();
    }
}
