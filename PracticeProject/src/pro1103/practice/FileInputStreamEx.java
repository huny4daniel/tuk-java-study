package pro1103.practice;

import java.io.*;

public class FileInputStreamEx {
    public static void main(String[] args) {
        File file = new File("c:\\Temp\\test.out");
        byte b[] = new byte[(int) file.length()]; // 파일 크기만큼 byte 배열 생성
        try {
            FileInputStream fin = new FileInputStream(file);
            int n = 0, c;
            while ((c = fin.read()) != -1) {
                b[n] = (byte) c;
                n++;
            }
            System.out.println(file.getPath() + "에서 읽은 " + n + "바이트 배열을 출력합니다.");
            int sum = 0;
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
                sum += b[i];
            }
            System.out.println();
            System.out.println("읽은 값의 합 : " + sum);
            fin.close();
        } catch (IOException e) {
            System.out.println(file.getPath() + "에서 읽지 못했습니다. 경로명을 체크해보세요");
        }
    }
}
