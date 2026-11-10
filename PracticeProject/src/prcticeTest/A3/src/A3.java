package prcticeTest.A3.src;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        System.out.print("영어 문장>> ");
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int num = 0, eng = 0, space = 0;

        for (int i = 0; i < line.length(); i++) {
            char target = line.charAt(i);

            if (Character.isDigit(target)) {
                num++;
            }
            else if (Character.isAlphabetic(target)) {
                eng++;
            }
            else {
                space++;
            }
        }
        System.out.println("숫자 " + num + "개, " + "영문자 " + eng + "개, " + "공백 " + space + "개");
        System.out.println(line.toLowerCase());

        sc.close();

        // 정수 문제 생략 -> 시간 부족 (채점 제외)
    }
}
