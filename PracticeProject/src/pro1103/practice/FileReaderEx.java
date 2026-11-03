package pro1103.practice;

import java.io.*;
import java.util.Scanner;

public class FileReaderEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("읽을 텍스트 파일 경로를 입력하세요>>");
        String path = scanner.nextLine();

        FileReader fin = null;
        try {
            fin = new FileReader(path);
            int c;
            int count = 0;
            while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기
                System.out.print((char) c);
                count++;
            }
            System.out.println();
            System.out.println("총 " + count + "개의 문자를 읽었습니다.");
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println(path + " 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
