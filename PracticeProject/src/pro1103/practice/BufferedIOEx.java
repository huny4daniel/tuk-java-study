package pro1103.practice;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("버퍼 크기를 입력하세요>>");
        int bufSize = scanner.nextInt();
        scanner.nextLine(); // 남은 개행 문자 제거

        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("c:\\Temp\\test2.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out, bufSize);
            while ((c = fin.read()) != -1) {
                out.write(c);
            }

            // 버퍼가 가득 찰 때마다 출력되고, 남은 문자는 버퍼에 남아 있는 상태
            System.out.println();
            System.out.println("(엔터를 누르면 버퍼에 남은 문자를 출력합니다.)");
            scanner.nextLine();
            out.flush(); // 버퍼에 남아 있던 문자 모두 출력
            fin.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
