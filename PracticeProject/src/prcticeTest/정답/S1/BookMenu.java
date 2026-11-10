package prcticeTest.정답.S1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] titles = new String[3];
        int count = 0;

        System.out.println("학번: 2025314032, 이름: 허영훈");
        while (true) {
            System.out.println("1. 추가 2. 출력 3. 개수 5. 종료");
            System.out.print(">> ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                scanner.next();
                continue;
            }
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (count == titles.length) {
                        System.out.println("가득 찼습니다");
                        break;
                    }
                    System.out.print("제목>> ");
                    titles[count] = scanner.nextLine();
                    count++;
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + titles[i]);
                    }
                    break;
                case 3:
                    System.out.println("저장된 책: " + count + "권");
                    break;
                case 5:
                    System.out.println("종료합니다");
                    scanner.close();
                    return;
                default:
                    System.out.println("없는 메뉴입니다");
            }
        }
    }
}
