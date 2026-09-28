package pro0928.practice;

import java.util.Scanner;

class CurrencyConverter {
    private static double rate;

    public static double toDollar(double won) {
        return won / rate;
    }

    public static double toKWR(double dollar) {
        return dollar * rate;
    }

    public static void setRate(double r) {
        rate = r;
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("환율(1달러)>> ");
        double rate = scanner.nextDouble();
        CurrencyConverter.setRate(rate);

        System.out.print("한화 금액>> ");
        double won = scanner.nextDouble();
        System.out.println(won + "원은 $" + CurrencyConverter.toDollar(won) + "입니다.");

        System.out.print("달러 금액>> ");
        double dollar = scanner.nextDouble();
        System.out.println("$" + dollar + "는 " + CurrencyConverter.toKWR(dollar) + "원입니다.");

        scanner.close();
    }
}
