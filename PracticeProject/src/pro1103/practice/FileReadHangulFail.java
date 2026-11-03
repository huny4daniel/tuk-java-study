package pro1103.practice;

import java.io.*;
import java.util.Scanner;

public class FileReadHangulFail {
    // 지정한 문자 집합으로 파일을 읽어 출력
    public static void readWith(String path, String charset) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(path);
            in = new InputStreamReader(fin, charset);
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("읽을 한글 텍스트 파일 경로를 입력하세요>>");
        String path = scanner.nextLine();

        System.out.println("--- 잘못된 문자 집합(US-ASCII)으로 읽은 결과 ---");
        readWith(path, "US-ASCII");

        System.out.println("--- 올바른 문자 집합(MS949)으로 읽은 결과 ---");
        readWith(path, "MS949");

        scanner.close();
    }
}
