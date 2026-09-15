package pro0914.practice;
import java.util.Scanner;

public class GradingSwitch {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요 (0 ~ 100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("입력이 잘못되었습니다.");
            
            scanner.close();
            return;
        }

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        char gAdd;
        if ((score % 10 - 5) >= 0) {
            gAdd = '+';
        } 
        else {
            gAdd = '0';
        }
        System.out.println("학점은 " + grade + gAdd + " 입니다.");

        scanner.close();
    }
}
