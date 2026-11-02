import java.util.Scanner;
import java.util.StringTokenizer;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        
        while (true) {
            try {
                System.out.print("날짜(YYYY/MM/DD, 종료는 exit)>> ");
                // st = new StringTokenizer(sc.nextLine(), "/");
                String line = sc.nextLine(); // 수정: 입력을 변수에 먼저 저장

                if (line.equals("exit")) {
                    System.out.println("종료합니다");
                    return;
                }

                st = new StringTokenizer(line, "/"); // 수정: exit 확인이 끝난 뒤에 토크나이저 생성

                if (st.countTokens() != 3) {
                    System.out.println("형식이 잘못되었습니다");
                    continue;
                }

                int year = Integer.parseInt(st.nextToken());
                int month = Integer.parseInt(st.nextToken());
                int day = Integer.parseInt(st.nextToken());
                
                if (month < 1 || month > 12 || day < 1 || day > 31) {
                    System.out.println("범위가 잘못되었습니다");
                }
                else {
                    System.out.println(year + "년 " + month + "월 " + day + "일");
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("숫자가 아닙니다");
            }
        }
    }
}
