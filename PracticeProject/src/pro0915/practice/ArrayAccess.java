package pro0915.practice;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[5];

        int max = 0;
        int min = 100;
        int minIndex = 0;

        System.out.println("0 ~ 100 사이의 값 5개를 입력하세요.");

        int i = 0;
        while (i < 5) {
            int n = scanner.nextInt();

            if (n < 0 || n > 100) {
                continue;
            }

            intArray[i] = n;

            if (intArray[i] > max) {
                max = intArray[i];
            }

            if (intArray[i] < min) {
                min = intArray[i];
                minIndex = i + 1;
            }

            i++;
        }

        System.out.println("가장 큰 수는 " + max + "입니다.");
        System.out.println("가장 작은 수는 " + min + "이고, " + minIndex + "번째로 입력한 수입니다.");

        scanner.close();
    }
}
