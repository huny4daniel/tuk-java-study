import java.util.InputMismatchException;
import java.util.Scanner;

public class MathMenu {
    static String fmt(double v) {
        if (v == Math.floor(v)) {
            return String.valueOf((long) v);
        }
        return String.valueOf(v);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1: 올림, 2: 내림, 3: 제곱근, 4: e의 지수승, 5: 반올림, 0: 종료");
            System.out.print(">> ");
            int choice;
            double a;
            try {
                choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                }
                if (choice < 1 || choice > 5) {
                    System.out.println("없는 메뉴입니다");
                    continue;
                }
                System.out.print("실수>> ");
                a = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                scanner.next();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println(fmt(a) + "의 올림은 " + fmt(Math.ceil(a)) + "입니다");
                    break;
                case 2:
                    System.out.println(fmt(a) + "의 내림은 " + fmt(Math.floor(a)) + "입니다");
                    break;
                case 3:
                    if (a < 0) {
                        System.out.println("음수의 제곱근은 구할 수 없습니다");
                    } else {
                        System.out.println(fmt(a) + "의 제곱근은 " + fmt(Math.sqrt(a)) + "입니다");
                    }
                    break;
                case 4:
                    System.out.println("e의 " + fmt(a) + "승은 " + fmt(Math.exp(a)) + "입니다");
                    break;
                default:
                    System.out.println(fmt(a) + "의 반올림은 " + Math.round(a) + "입니다");
            }
        }
        System.out.println("종료합니다");
        scanner.close();
    }
}
