package prcticeTest.정답.C4;

public class ArgsSum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("인자가 없습니다");
            return;
        }
        double sum = 0.0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Double.parseDouble(args[i]);
                System.out.println("입력값: " + args[i]);
            } catch (NumberFormatException e) {
                System.out.println(args[i] + "는 숫자가 아니라 제외합니다");
            }
        }
        System.out.println("합계: " + sum);
    }
}
