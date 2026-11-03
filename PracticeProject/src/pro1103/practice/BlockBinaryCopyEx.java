package pro1103.practice;

import java.io.*;
import java.util.Scanner;

public class BlockBinaryCopyEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일 경로를 입력하세요>>");
        File src = new File(scanner.nextLine());
        System.out.print("복사할 파일 경로를 입력하세요>>");
        File dest = new File(scanner.nextLine());
        System.out.print("버퍼 크기를 KB 단위로 입력하세요>>");
        int kb = scanner.nextInt();

        try {
            long start = System.currentTimeMillis();
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte[] buf = new byte[1024 * kb];
            int n;
            // 파일 크기가 버퍼 크기의 배수이면 마지막 read()가 -1을 리턴하므로 -1 검사로 종료
            while ((n = fi.read(buf)) != -1) { // n은 실제 읽은 바이트
                fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기
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
