package pro1103.practice;

import java.io.*;
import java.util.Scanner;

public class TextCopyEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일 경로를 입력하세요>>");
        File src = new File(scanner.nextLine()); // 원본 파일 경로명
        System.out.print("복사할 파일 경로를 입력하세요>>");
        File dest = new File(scanner.nextLine()); // 복사 파일 경로명

        int c;
        int count = 0;
        try {
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);
            while ((c = fr.read()) != -1) { // 문자 하나 읽고
                fw.write((char) c); // 문자 하나 쓰고
                count++;
            }
            fr.close();
            fw.close();
            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
            System.out.println("복사한 문자 수 : " + count);
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
        scanner.close();
    }
}
