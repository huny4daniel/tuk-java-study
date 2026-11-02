import java.util.InputMismatchException;
import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1: 올림, 2: 내림, 3: 제곱근, 4: e의 지수승, 5: 반올림, 0: 종료");
            System.out.print(">> ");
            int choice = sc.nextInt();
            sc.nextLine();

            double target = 0;
            switch (choice) {
                case 1:
                    System.out.print("실수>> ");
                    target = sc.nextDouble();
                    System.out.println(target + "의 " + "올림은 " + Math.ceil(target) + "입니다");
                    break;
                case 2:
                    System.out.print("실수>> ");
                    target = sc.nextDouble();
                    System.out.println(target + "의 " + "내림은 " + Math.floor(target) + "입니다");
                    break;
                case 3:
                    System.out.print("실수>> ");
                    target = sc.nextDouble();

                    if (target < 0) {
                        System.out.println("음수의 제곱근은 구할 수 없습니다");
                        break;
                    }
                    else {
                        System.out.println(target + "의 " + "제곱근은 " + Math.sqrt(target) + "입니다");
                        break;
                    }
                case 4:
                    System.out.print("실수>> ");
                    target = sc.nextDouble();
                    System.out.println("e의 " + target + "승은 " + Math.exp(target) + "입니다");
                    break;
                case 5:
                    System.out.print("실수>> ");
                    target = sc.nextDouble();
                    System.out.println(target + "의 " + "반올림은 " + Math.round(target) + "입니다");
                    break;
                case 0:
                    System.out.println("종료합니다");
                    sc.close();
                    return;
                
                default:
                    System.out.println("없는 메뉴입니다");
                    break;
            }
            } 
            catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                sc.next();
            }
            
        }

    }
}
