package pro0915.practice;

public class ForSample {
    public static void main(String[] args) {

        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        int sum = 0;
        if (myId % 2 == 0) {
            for (int i = 2; i <= 20; i += 2) {
                sum += i;
                System.out.print(i);

                if (i < 20) {
                    System.out.print("+");
                }
            }
        }
        else {
            for (int i = 1; i <= 19; i += 2) {
                sum += i;
                System.out.print(i);

                if (i < 19) {
                    System.out.print("+");
                }
            }
        }

        System.out.print("=" + sum);
    }
}
