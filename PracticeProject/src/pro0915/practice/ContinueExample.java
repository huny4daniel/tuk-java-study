package pro0915.practice;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("양수를 5개 입력하세요. ");

        int sum = 0;
        int count = 0;
        while (count < 5) {
            int n = scanner.nextInt();

            if (n <= 0) {
                continue;
            }
            else {
                sum += n;
                count++;
            }
        }

        System.out.println("양수의 합은 " + sum);

        scanner.close();
    }
}
