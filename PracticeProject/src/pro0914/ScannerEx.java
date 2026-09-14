package pro0914;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 학번, 학년, 평점을 빈칸으로 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름은 " + name + ", ");

        String studentId = scanner.next();
        System.out.println("학번은 " + studentId + ", ");

        byte grade = scanner.nextByte();
        if (grade < 1 || grade > 4) {
            System.out.println("학년 입력이 잘못되었습니다.");

            scanner.close();
            return;
        }
        System.out.println("학년은 " + grade + "학년, ");

        double gpa = scanner.nextDouble();
        if (gpa < 0 || gpa > 4.5) {
            System.out.println("평점 입력이 잘못되었습니다.");

            scanner.close();
            return;
        }
        System.out.println("평점은 " + gpa + "입니다.");

        scanner.close();
    }
}
