package prcticeTest.정답.B2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Shape {
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

public class ShapeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[4];
        int i = 0;
        while (i < shapes.length) {
            System.out.print("1. Line 2. Circle 3. Rect >> ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                scanner.next();
                continue;
            }
            switch (choice) {
                case 1:
                    shapes[i] = new Line();
                    break;
                case 2:
                    shapes[i] = new Circle();
                    break;
                case 3:
                    shapes[i] = new Rect();
                    break;
                default:
                    System.out.println("없는 메뉴입니다");
                    continue;
            }
            i++;
        }
        int circles = 0;
        for (Shape s : shapes) {
            s.draw();
            if (s instanceof Circle) {
                circles++;
            }
        }
        System.out.println("Circle 개수: " + circles);
        scanner.close();
    }
}
