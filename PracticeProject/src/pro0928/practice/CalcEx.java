package pro0928.practice;

import java.util.Scanner;

class Calc {
    public static int diff(int a, int b) {
        return (a > b) ? (a - b) : (b - a);
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a > b) ? b : a;
    }
}

public class CalcEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Diff, 2. Max, 3. Min");
        System.out.print("선택>> ");
        int choice = scanner.nextInt();

        System.out.print("두 개의 정수를 입력하세요>> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Diff는 " + Calc.diff(a, b) + " 입니다");
                break;
            case 2:
                System.out.println("Max는 " + Calc.max(a, b) + " 입니다");
                break;
            case 3:
                System.out.println("Min는 " + Calc.min(a, b) + " 입니다");
                break;
        }

        scanner.close();
    }
}
