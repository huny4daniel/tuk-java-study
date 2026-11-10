package prcticeTest.정답.B1;

import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point (x:" + x + ", y:" + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return x == p.x && y == p.y;
    }
}

class Rect {
    int width, height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect r = (Rect) obj;
        return width == r.width && height == r.height;
    }
}

public class EqualsDrill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        System.out.println(a);
        System.out.println(a + "입니다.");
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(문자열): " + a.equals("Point"));

        Rect[] r = new Rect[3];
        for (int i = 0; i < r.length; i++) {
            System.out.print((i + 1) + "번째 너비 높이>> ");
            r[i] = new Rect(scanner.nextInt(), scanner.nextInt());
        }
        boolean found = false;
        for (int i = 0; i < r.length; i++) {
            for (int j = i + 1; j < r.length; j++) {
                if (r[i].equals(r[j])) {
                    System.out.println((i + 1) + "번과 " + (j + 1) + "번이 같습니다");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("동일한 사각형이 없습니다");
        }
        scanner.close();
    }
}
