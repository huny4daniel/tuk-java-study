package pro1006.practice;

import java.util.Scanner;

public class UsingOverride {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape start = null, last = null, obj;

        for (int i = 0; i < 4; i++) {
            int choice;
            while (true) {
                System.out.println("1. Line 2. Circle 3. Rect");
                System.out.print("선택>> ");
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                }
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }

            switch (choice) {
                case 1:
                    obj = new Line();
                    break;
                case 2:
                    obj = new Circle();
                    break;
                default:
                    obj = new Rect();
                    break;
            }

            if (start == null) {
                start = obj;
                last = obj;
            }
            else {
                last.next = obj;
                last = obj;
            }
        }

        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }

        scanner.close();
    }
}
