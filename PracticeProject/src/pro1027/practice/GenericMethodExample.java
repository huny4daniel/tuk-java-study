package pro1027.practice;

import java.util.Scanner;

public class GenericMethodExample {
    public static <T> GStack<T> reverse(GStack<T> a) {
        GStack<T> s = new GStack<T>();
        while (!a.isEmpty()) {
            s.push(a.pop());
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GStack<Double> gs = new GStack<Double>();

        System.out.println("실수를 5개 입력하세요.");
        for (int i = 0; i < 5; i++) {
            System.out.print(">>");
            gs.push(Double.valueOf(scanner.nextDouble()));
        }

        gs = reverse(gs);

        System.out.println("reverse 후 스택에서 꺼낸 값");
        while (!gs.isEmpty()) {
            System.out.println(gs.pop());
        }

        scanner.close();
    }
}
