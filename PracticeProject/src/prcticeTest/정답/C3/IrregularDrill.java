package prcticeTest.정답.C3;

import java.util.Scanner;

public class IrregularDrill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[4][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (i + 1) * 10 + (j + 1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                sum += a[i][j];
            }
            System.out.println("(합: " + sum + ")");
        }
        System.out.print("행 번호(0~3)>> ");
        int row = scanner.nextInt();
        try {
            System.out.println(row + "행의 길이: " + a[row].length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스가 범위를 벗어났습니다");
        }
        scanner.close();
    }
}
