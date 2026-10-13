package pro1013.practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("날짜를 입력하시오 (YYYY/MM/DD 형태)");
        String date = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(date, "/");
        String year = st.nextToken();
        String month = st.nextToken();
        String day = st.nextToken();

        System.out.println(year + "년 " + month + "월 " + day + "일");

        scanner.close();
    }
}
