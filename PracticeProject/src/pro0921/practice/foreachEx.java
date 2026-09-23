package pro0921.practice;

public class foreachEx {
    enum Week {월, 화, 수, 목, 금, 토, 일}

    public static void main(String[] args) {
        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        double[] n = {1.1, 2.2, 3.3, 4.4, 5.5};
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};

        double sum = 0;
        for (double k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합은" + sum);

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (Week day : Week.values()) {
            System.out.print(day + "요일 ");
        }
        System.out.println();
    }
}
