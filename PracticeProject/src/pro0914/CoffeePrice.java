package pro0914;
import java.util.Scanner;

public class CoffeePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("무슨 커피를 드릴까요?: ");
        System.out.println("1. 에스프레소 2. 카푸치노 3. 카페라떼 4. 아메리카노");
        int order = scanner.nextInt();

        String menu = "";
        int price = 0;

        switch (order) {
            case 1:
                menu = "에스프레소";
                price = 3000;
                break;
            case 2:
                menu = "카푸치노";
                price = 4000;
                break;
            case 3:
                menu = "카페라떼";
                price = 4500;
                break;
            case 4:
                menu = "아메리카노";
                price = 2500;
                break;
            default:
                System.out.println("잘못 입력하였습니다.");
                break;
        }
        if (price != 0) {
            System.out.println(menu + "는 " + price + "원입니다.");
        }

        scanner.close();
    }
}
