import java.util.Calendar;
import java.util.Scanner;

class Student {
    String name;
    int score;
    String date;

    public Student(String name, int score) {
        this(name, score, "날짜 없음");
    }

    public Student(String name, int score, String date) {
        this.name = name;
        this.score = score;
        this.date = date;
    }

    public String getGrade() {
        char grade;
        char gAdd = (score == 100 || score % 10 >= 5) ? '+' : '0';
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                return "F";
        }
        return "" + grade + gAdd;
    }

    @Override
    public String toString() {
        return name + ": " + score + " (" + getGrade() + "), " + date;
    }
}

public class ScoreManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        int count = 0;

        System.out.println("학번: 2025314032, 이름: 허영훈");
        while (count < students.length) {
            System.out.print("이름/점수 또는 이름/점수/YYYY/MM/DD (종료는 exit)>> ");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break;
            }
            String[] p = line.split("/");
            if (p.length != 2 && p.length != 5) {
                System.out.println("형식이 잘못되었습니다");
                continue;
            }
            try {
                int score = Integer.parseInt(p[1]);
                if (score < 0 || score > 100) {
                    System.out.println("점수는 0~100입니다");
                    continue;
                }
                if (p.length == 2) {
                    students[count] = new Student(p[0], score);
                } else {
                    String date = Integer.parseInt(p[2]) + "년 " + Integer.parseInt(p[3]) + "월 "
                            + Integer.parseInt(p[4]) + "일";
                    students[count] = new Student(p[0], score, date);
                }
                count++;
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닙니다");
            }
        }

        if (count == 0) {
            System.out.println("입력된 학생이 없습니다");
        } else {
            int maxIdx = 0, minIdx = 0, sum = 0;
            for (int i = 0; i < count; i++) {
                System.out.println(students[i]);
                sum += students[i].score;
                if (students[i].score > students[maxIdx].score) {
                    maxIdx = i;
                }
                if (students[i].score < students[minIdx].score) {
                    minIdx = i;
                }
            }
            double avg = (double) sum / count;
            System.out.println("최고점: " + students[maxIdx].name + " (" + (maxIdx + 1) + "번째 입력)");
            System.out.println("최저점: " + students[minIdx].name + " (" + (minIdx + 1) + "번째 입력)");
            System.out.println("평균: " + avg + ", 올림: " + Math.ceil(avg) + ", 반올림: " + Math.round(avg));
        }

        Calendar now = Calendar.getInstance();
        System.out.println("작성일: " + now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH) + 1) + "월 "
                + now.get(Calendar.DAY_OF_MONTH) + "일");
        scanner.close();
    }
}
