package pro0919.practice;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
    public static void main(String[] args) {
        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("양수 3개를 입력하세요");
        int[] numbers = new int[3];
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("양수를 입력하세요");
                    i--;
                    continue;
                }

                numbers[i] = n;
                sum += n;
            }
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scanner.next();
                i--;
                continue;
            }
        }

        System.out.println("입력한 양수: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println("합은 " + sum);
        scanner.close();
    }
}
