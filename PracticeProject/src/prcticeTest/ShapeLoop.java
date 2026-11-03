import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Line extends Shape {
    @Override
    void draw() {
        System.out.println("Line");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle");
    }
}

class Rect extends Shape {
    @Override
    void draw() {
        System.out.println("Rect");
    }
}

public class ShapeLoop {
    public static void main(String[] args) {
        System.out.println("학번: 0000000000, 이름: 홍길동");

        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[4];
        int count = 0;

        // 저장에 성공한 횟수가 4가 되면 반복 종료
        while (count < shapes.length) {
            System.out.print("1. Line 2. Circle 3. Rect 0. 중단 >> ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                sc.next(); // 잘못 입력된 값 버리기
                continue;
            }

            // switch 안의 break로는 while을 빠져나갈 수 없으므로 먼저 처리
            if (choice == 0) {
                System.out.println("입력을 중단합니다");
                break;
            }

            switch (choice) {
                case 1:
                    shapes[count] = new Line();
                    count++;
                    break;
                case 2:
                    shapes[count] = new Circle();
                    count++;
                    break;
                case 3:
                    shapes[count] = new Rect();
                    count++;
                    break;
                default:
                    System.out.println("없는 메뉴입니다");
            }
        }

        // 0으로 일찍 멈추면 빈 칸이 남으므로 count까지만 출력
        System.out.println("저장된 도형: " + count + "개");
        for (int i = 0; i < count; i++) {
            shapes[i].draw();
        }

        sc.close();
    }
}
