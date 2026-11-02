import java.util.InputMismatchException;
import java.util.Scanner;

interface PhoneInterface {
    final int TIMEOUT = 10000;

    void sendCall();

    default void printLogo() {
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
}

interface MP3Interface {
    void play();
}

class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자를 보냅니다");
    }

    @Override
    public void play() {
        System.out.println("음악을 연주합니다");
    }
}

public class PhoneMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        System.out.println("TIMEOUT: " + PhoneInterface.TIMEOUT);
        while (true) {
            System.out.print("1. 전화 2. 문자 3. 음악 4. 계산 0. 종료 >> ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 0:
                        scanner.close();
                        return;
                    case 1:
                        phone.sendCall();
                        break;
                    case 2:
                        phone.sendSMS();
                        break;
                    case 3:
                        phone.play();
                        break;
                    case 4:
                        System.out.print("두 정수>> ");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        System.out.println("합: " + phone.calculate(a, b));
                        break;
                    default:
                        System.out.println("없는 메뉴입니다");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닙니다");
                scanner.nextLine();
            }
        }
    }
}
