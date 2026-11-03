package pro1103.practice;

import java.io.*;
import java.util.Scanner;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("저장할 바이트 개수를 입력하세요>>");
        int size = scanner.nextInt();
        byte b[] = new byte[size];

        System.out.println("-128 ~ 127 사이의 정수 " + size + "개를 입력하세요.");
        for (int i = 0; i < b.length; i++) {
            System.out.print(">>");
            int n = scanner.nextInt();
            if (n < -128 || n > 127) {
                System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
                i--;
                continue;
            }
            b[i] = (byte) n;
        }

        try {
            FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
            for (int i = 0; i < b.length; i++) {
                fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
            }
            fout.close();
        } catch (IOException e) {
            System.out.println("c:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요");
            scanner.close();
            return;
        }
        System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
        scanner.close();
    }
}
