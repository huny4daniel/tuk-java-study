package pro1103.practice;

import java.io.*;
import java.util.Scanner;

public class BinaryCopyEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일 경로를 입력하세요>>");
        File src = new File(scanner.nextLine());
        System.out.print("복사할 파일 경로를 입력하세요>>");
        File dest = new File(scanner.nextLine());

        int c;
        try {
            long start = System.currentTimeMillis();
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            while ((c = fi.read()) != -1) {
                fo.write((byte) c);
            }
            fi.close();
            fo.close();
            long end = System.currentTimeMillis();

            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
            System.out.println("복사한 크기 : " + dest.length() + "바이트, 소요 시간 : " + (end - start) + "ms");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
        scanner.close();
    }
}
