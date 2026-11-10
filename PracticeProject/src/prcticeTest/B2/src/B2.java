package prcticeTest.B2.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[4];
        System.out.println("1. Line 2. Circle 3. Rect");

        int choice;

        try {
            choice = sc.nextInt();    
        } 
        catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
            sc.next();
        }
        
    }
}

class Shape {
    void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    void draw() {
        System.out.println("Line");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}

class Rect extends Shape {
    void draw() {
        System.out.println("Rect");
    }
}
