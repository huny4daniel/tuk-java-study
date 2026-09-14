package pro0914;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 개의 정수를 입력하시오: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + "과 " + b + "의 차는 " + ((a > b) ? (a - b) : (b - a)) + "입니다.");

        scanner.close();
    }
}