import java.util.Calendar;
import java.util.Scanner;

public class CalendarDrill {
    static String dayName(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.SUNDAY: return "일요일";
            case Calendar.MONDAY: return "월요일";
            case Calendar.TUESDAY: return "화요일";
            case Calendar.WEDNESDAY: return "수요일";
            case Calendar.THURSDAY: return "목요일";
            case Calendar.FRIDAY: return "금요일";
            default: return "토요일";
        }
    }

    static void print(String msg, Calendar cal) {
        String ampm = (cal.get(Calendar.AM_PM) == Calendar.AM) ? "오전" : "오후";
        System.out.println(msg + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
                + cal.get(Calendar.DAY_OF_MONTH) + "일 " + dayName(cal.get(Calendar.DAY_OF_WEEK)) + " " + ampm);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("현재: ", Calendar.getInstance());
        System.out.print("연 월 일>> ");
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        Calendar exam = Calendar.getInstance();
        exam.clear();
        exam.set(y, m - 1, d);
        exam.set(Calendar.HOUR_OF_DAY, 14);
        print("입력: ", exam);
        scanner.close();
    }
}
