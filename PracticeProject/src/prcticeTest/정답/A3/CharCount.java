package prcticeTest.정답.A3;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("영어 문장>> ");
        String s = scanner.nextLine();
        int digit = 0, alpha = 0, space = 0;
        String lower = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digit++;
            } else if (Character.isAlphabetic(c)) {
                alpha++;
            } else if (c == ' ') {
                space++;
            }
            lower += Character.toLowerCase(c);
        }
        System.out.println("숫자 " + digit + "개, 영문자 " + alpha + "개, 공백 " + space + "개");
        System.out.println(lower);

        System.out.print("정수>> ");
        String text = scanner.nextLine();
        try {
            int n = Integer.parseInt(text);
            System.out.println("16진수: " + Integer.toHexString(n));
            System.out.println("2진수: " + Integer.toBinaryString(n));
            System.out.println("1의 개수: " + Integer.bitCount(n));
        } catch (NumberFormatException e) {
            System.out.println(text + "는 정수로 변환할 수 없습니다");
        }
        scanner.close();
    }
}
