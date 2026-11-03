package pro1103.practice;

import java.io.*;
import java.util.Scanner;

public class FileReadHangulSuccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("읽을 한글 텍스트 파일 경로를 입력하세요>>");
        String path = scanner.nextLine();
        System.out.print("문자 집합을 입력하세요(MS949, UTF-8 등)>>");
        String charset = scanner.nextLine();

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
        } catch (UnsupportedEncodingException e) {
            System.out.println(charset + "는 지원하지 않는 문자 집합입니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
