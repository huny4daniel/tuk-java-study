package pro0914.practice;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("초 단위로 정수 값을 입력하시오: ");
        int time = scanner.nextInt();
        if (time < 0) {
            System.out.println("값을 잘못 입력하였습니다.");
            scanner.close();
            
            return;
        }

        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60 / 60) % 24;
        int days = (time / 60 / 60) / 24;

        System.out.print(time + "초는 ");
        if (days > 0) {
            System.out.print(days + "일, ");
        }
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.println(second + "초입니다.");
        
        scanner.close();
    }
}
