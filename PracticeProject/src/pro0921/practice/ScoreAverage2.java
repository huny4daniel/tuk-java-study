package pro0921.practice;

public class ScoreAverage2 {
    public static void main(String[] args) {
        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        double score[][] = {{3.3, 3.4},
                            {3.5, 3.6},
                            {3.7, 4.0},
                            {4.1, 4.2}};

        double sum = 0;
        for (int year = 0; year < score.length; year++) {
            System.out.print((year + 1) + "학년 평점: ");
            for (int term = 0; term < score[year].length; term++) {
                sum += score[year][term];
                System.out.print(score[year][term]);
                if (term < score[year].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        int n = score.length;
        int m = score[0].length;
        System.out.println();
        System.out.println("4년 전체 평점 평균은 " + sum / (n * m));
    }
}
