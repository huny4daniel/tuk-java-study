package prcticeTest.정답.C2;

import java.util.Scanner;

abstract class Calculator {
    public abstract int add(int a, int b);

    public abstract int subtract(int a, int b);

    public abstract double average(int[] a);
}

public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int n : a) {
            sum += n;
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator c = new GoodCalc();
        System.out.print("정수 개수>> ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("1 이상을 입력하세요");
            scanner.close();
            return;
        }
        int[] arr = new int[n];
        System.out.print("정수 " + n + "개>> ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("평균: " + c.average(arr));
        if (n >= 2) {
            System.out.println("앞 두 수의 합: " + c.add(arr[0], arr[1]));
            System.out.println("앞 두 수의 차: " + c.subtract(arr[0], arr[1]));
        }
        scanner.close();
    }
}
