import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

abstract class Shape {
    public Shape next;
    public Shape() {
        next = null;
    }

    abstract public void draw();
    abstract public double getArea();
}

class Circle extends Shape {
    int radius;

    Circle (int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle (Radius: " + radius + ")");
    }

    public double getArea() {
        return (3.14 * radius * radius);
    }
}

class Rect extends Shape {
    int width, height;

    Rect (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Rect (Width: " + width + ", " + "Height: " + height + ")");
    }

    public double getArea() {
        return width * height;
    }
}

public class ShapeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Shape[] shapes = new Shape[4];
        
        try {
            System.out.println("0. Exit 1. Circle 2. Rect");
            choice = sc.nextInt();
            sc.nextLine();
            
            int i = 0;
            while (i < 4 || choice != 0) {
                if (choice == 0) {
                    sc.close();
                    return;
                }

                switch (choice) {
                    case 1:
                        System.out.print("반지름>> ");
                        shapes[i] = new Circle(sc.nextInt());
                        break;
                    case 2:
                        System.out.print("너비x높이>> ");
                        StringTokenizer st = new StringTokenizer(sc.nextLine());
                        int w = Integer.parseInt(st.nextToken());
                        int h = Integer.parseInt(st.nextToken());
                        shapes[i] = new Rect(w, h);
                        break;
                }
                i++;
            }
            
            for (Shape shape : shapes) {
                shape.draw();
                shape.getArea();
            }
            sc.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("입력 값이 잘못되었습니다");
        }
        
    }
}
