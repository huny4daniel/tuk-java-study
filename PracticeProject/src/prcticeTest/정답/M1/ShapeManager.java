import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return name + "(면적: " + getArea() + ")";
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        return getArea() == ((Circle) obj).getArea();
    }
}

class Rect extends Shape {
    private int width, height;

    public Rect(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rect)) {
            return false;
        }
        return getArea() == ((Rect) obj).getArea();
    }
}

public class ShapeManager {
    static Scanner scanner = new Scanner(System.in);

    static int readInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                int n = scanner.nextInt();
                scanner.nextLine();
                return n;
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                scanner.nextLine();
            }
        }
    }

    static int readPositive(String msg) {
        while (true) {
            int n = readInt(msg);
            if (n > 0) {
                return n;
            }
            System.out.println("양수를 입력하세요");
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        int count = 0;
        System.out.println("학번: 2025314032, 이름: 허영훈");
        while (true) {
            int choice = readInt("1. 추가 2. 전체 출력 3. 이름 검색 4. 면적 평균 5. 종료 >> ");
            switch (choice) {
                case 1:
                    if (count == shapes.length) {
                        System.out.println("가득 찼습니다");
                        break;
                    }
                    int kind = readInt("1. 원 2. 사각형 >> ");
                    if (kind != 1 && kind != 2) {
                        System.out.println("없는 종류입니다");
                        break;
                    }
                    System.out.print("이름>> ");
                    String name = scanner.nextLine();
                    Shape s;
                    if (kind == 1) {
                        s = new Circle(name, readPositive("반지름>> "));
                    } else {
                        int w = readPositive("너비>> ");
                        int h = readPositive("높이>> ");
                        s = new Rect(name, w, h);
                    }
                    boolean dup = false;
                    for (int i = 0; i < count; i++) {
                        if (shapes[i].equals(s)) {
                            dup = true;
                            break;
                        }
                    }
                    if (dup) {
                        System.out.println("같은 도형이 있습니다");
                    } else {
                        shapes[count] = s;
                        count++;
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("도형이 없습니다");
                    }
                    for (int i = 0; i < count; i++) {
                        System.out.println(shapes[i]);
                    }
                    break;
                case 3:
                    System.out.print("찾을 이름>> ");
                    String target = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (shapes[i].name.equals(target)) {
                            System.out.println(shapes[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println(target + "는 없습니다");
                    }
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("도형이 없습니다");
                        break;
                    }
                    double sum = 0;
                    for (int i = 0; i < count; i++) {
                        sum += shapes[i].getArea();
                    }
                    System.out.println("면적 평균: " + sum / count);
                    break;
                case 5:
                    System.out.println("종료합니다");
                    scanner.close();
                    return;
                default:
                    System.out.println("없는 메뉴입니다");
            }
        }
    }
}
