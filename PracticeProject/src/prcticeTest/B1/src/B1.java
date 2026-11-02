import java.util.Scanner;

class Point {
    int x, y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point (x:" + x + ", " + "y:" + y + ")";
    }

    public boolean equals(Object obj) {
        // 수정: 1단계 - Point가 아니면 비교할 좌표가 없으므로 false
        if (!(obj instanceof Point)) {
            return false;
        }

        // 수정: 2단계 - Object 타입으로는 x, y를 못 쓰므로 Point로 형변환
        Point p = (Point) obj;

        // 수정: 3단계 - 내 x와 상대 x, 내 y와 상대 y가 모두 같으면 true
        return x == p.x && y == p.y;
    }
}

class Rect {
    int width, height;

    Rect() {
    }

    Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        // 수정: 1단계 - Rect가 아니면 false
        if (!(obj instanceof Rect)) {
            return false;
        }

        // 수정: 2단계 - Rect로 형변환
        Rect r = (Rect) obj;

        // 수정: 3단계 - 너비끼리, 높이끼리 모두 같으면 true
        return width == r.width && height == r.height;
    }
}

public class B1 {
    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);

        System.out.println(a.toString());
        System.out.println(b.toString() + "입니다.");

        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(문자열): " + a.equals("cd"));

        Scanner sc = new Scanner(System.in);

        Rect[] rect = new Rect[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 너비 높이>> ");
            rect[i] = new Rect(sc.nextInt(), sc.nextInt());
        }

        boolean[] same = {false, false, false};
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rect[i].equals(rect[j])) {
                    same[i] = true;
                    same[j] = true;
                }
            }
        }

        if (same[0] || same[1]) {
            if (same[0] == same[1] == same[2]) {
                System.out.println("1번과 2번과 3번이 같습니다");
            } 
            else if (same[0] == same[1]) {
                System.out.println("1번과 2번이 같습니다");
            }
            else if (same[0] == same[2]) {
                System.out.println("1번과 3번이 같습니다");
            }
            else {
                System.out.println("2번과 3번이 같습니다");
            }
        } 
        else {
            System.out.println("동일한 사각형이 없습니다");
        }
    }
}