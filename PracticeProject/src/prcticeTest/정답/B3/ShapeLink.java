import java.util.InputMismatchException;
import java.util.Scanner;

class Shape {
    public Shape next;

    public Shape() {
        next = null;
    }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

public class ShapeLink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape start = null, last = null;
        while (true) {
            System.out.print("1. Line 2. Circle 3. Rect 0. 끝 >> ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                scanner.next();
                continue;
            }
            if (choice == 0) {
                break;
            }
            Shape obj;
            if (choice == 1) {
                obj = new Line();
            } else if (choice == 2) {
                obj = new Circle();
            } else if (choice == 3) {
                obj = new Rect();
            } else {
                System.out.println("없는 메뉴입니다");
                continue;
            }
            if (start == null) {
                start = obj;
            } else {
                last.next = obj;
            }
            last = obj;
        }
        if (start == null) {
            System.out.println("도형이 없습니다");
        }
        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }
        scanner.close();
    }
}
