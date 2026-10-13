package pro1013.practice;

import java.util.Scanner;

public class MathEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: 올림, 2: 내림, 3: 제곱근, 4: e의 지수승, 5: 반올림");
        System.out.print("선택>> ");
        int choice = scanner.nextInt();

        System.out.print("실수 값을 입력하세요>> ");
        double a = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(a + "의 올림은 " + Math.ceil(a) + "입니다");
                break;
            case 2:
                System.out.println(a + "의 내림은 " + Math.floor(a) + "입니다");
                break;
            case 3:
                System.out.println(a + "의 제곱근은 " + Math.sqrt(a) + "입니다");
                break;
            case 4:
                System.out.println("e의 " + a + "승은 " + Math.exp(a) + "입니다");
                break;
            case 5:
                System.out.println(a + "의 반올림은 " + Math.round(a) + "입니다");
                break;
        }

        scanner.close();
    }
}
