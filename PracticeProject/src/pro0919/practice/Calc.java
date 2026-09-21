package pro0919.practice;

public class Calc {
    public static void main(String[] args) {
        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        double sum = 0.0;

        System.out.print("입력된 값:");
        for (int i = 0; i < args.length; i++) {
            System.out.print(" " + args[i]);
            sum += Double.parseDouble(args[i]);
        }
        System.out.println();

        System.out.println("합계 :" + sum);
    }
}
