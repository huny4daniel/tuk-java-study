import java.util.InputMismatchException;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        System.out.println("학번: 2025314032, 이름: 허영훈");

        Scanner sc = new Scanner(System.in);
        
        String[] books = new String[3];
        int count = 0;
        
        while (true) {
            try {
                int selectMenu;
                
                System.out.println("1. 추가 2. 출력 3. 개수 5. 종료");
                System.out.print(">> ");
    
                selectMenu = sc.nextInt();
                sc.nextLine(); // 주의
    
                if (selectMenu == 5) {
                    System.out.println("종료합니다");
                    sc.close();
                    return;
                }

                switch (selectMenu) {
                    case 1:
                        if (count >= books.length) {
                            System.out.println("가득 찼습니다");
                        } 
                        else {
                            System.out.print("제목>> ");
                            books[count] = sc.nextLine();
                            count++;
                        }
                        break;

                    case 2:
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + books[i]);
                        }
                        break;

                    case 3:
                        System.out.println("저장된 책: " + count + "권");
                        break;

                    default:
                        System.out.println("없는 메뉴입니다");
                        break;
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                sc.next(); // 주의
            }
        }

    }
}
