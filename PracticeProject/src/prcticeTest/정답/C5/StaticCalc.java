package prcticeTest.정답.C5;

import java.util.Scanner;

class Calc {
    public static int diff(int a, int b) {
        return (a > b) ? a - b : b - a;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a > b) ? b : a;
    }
}

public class StaticCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Diff, 2. Max, 3. Min >> ");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > 3) {
            System.out.println("없는 메뉴입니다");
            scanner.close();
            return;
        }
        System.out.print("두 정수>> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Diff는 " + Calc.diff(a, b) + " 입니다");
                break;
            case 2:
                System.out.println("Max는 " + Calc.max(a, b) + " 입니다");
                break;
            default:
                System.out.println("Min은 " + Calc.min(a, b) + " 입니다");
        }
        scanner.close();
    }
}
