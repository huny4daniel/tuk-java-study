import java.util.Scanner;
import java.util.StringTokenizer;

public class DateToken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("날짜(YYYY/MM/DD, 종료는 exit)>> ");
            String date = scanner.nextLine();
            if (date.equals("exit")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(date, "/");
            if (st.countTokens() != 3) {
                System.out.println("형식이 잘못되었습니다");
                continue;
            }
            try {
                int year = Integer.parseInt(st.nextToken());
                int month = Integer.parseInt(st.nextToken());
                int day = Integer.parseInt(st.nextToken());
                if (month < 1 || month > 12 || day < 1 || day > 31) {
                    System.out.println("범위가 잘못되었습니다");
                    continue;
                }
                System.out.println(year + "년 " + month + "월 " + day + "일");
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닙니다");
            }
        }
        System.out.println("종료합니다");
        scanner.close();
    }
}
