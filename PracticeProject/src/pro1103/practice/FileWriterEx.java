package pro1103.practice;

import java.io.*;
import java.util.*;

public class FileWriterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("저장할 파일 경로를 입력하세요>>");
        String path = scanner.nextLine();

        FileWriter fout = null;
        int lineCount = 0;
        try {
            fout = new FileWriter(path);
            System.out.println("저장할 내용을 입력하세요. (빈 줄 입력 시 종료)");
            while (true) {
                String line = scanner.nextLine();
                if (line.length() == 0) {
                    break;
                }
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0, 2);
                lineCount++;
            }
            fout.close();
            System.out.println(path + "에 " + lineCount + "줄을 저장하였습니다.");

            // 저장된 파일을 다시 읽어 확인
            System.out.println("--- 저장된 파일 내용 ---");
            FileReader fin = new FileReader(path);
            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
