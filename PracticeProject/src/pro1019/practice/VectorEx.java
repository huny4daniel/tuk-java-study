package pro1019.practice;

import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Integer> v = new Vector<Integer>();

        System.out.println("정수를 3개 입력하세요.");
        for (int i = 0; i < 3; i++) {
            System.out.print(">>");
            v.add(scanner.nextInt());
        }

        System.out.print("추가로 삽입할 정수를 입력하세요>>");
        int n4 = scanner.nextInt();
        v.add(2, n4);

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }

        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            int n = v.elementAt(i);
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);

        scanner.close();
    }
}
