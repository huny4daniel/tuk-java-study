package pro1019.practice;

import java.util.Scanner;
import java.util.Vector;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Point> v = new Vector<Point>();

        for (int i = 0; i < 3; i++) {
            System.out.print("x, y 값을 입력하세요>> ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            v.add(new Point(x, y));
        }

        for (int i = 0; i < v.size(); i++) {
            Point p = v.get(i);
            System.out.println(p);
        }

        v.remove(v.size() - 1);

        System.out.println("마지막 요소 삭제 후:");
        for (int i = 0; i < v.size(); i++) {
            Point p = v.get(i);
            System.out.println(p);
        }

        scanner.close();
    }
}
