package pro1012.practice;

class Rect {
    int width;
    int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        Rect p = (Rect) obj;
        if (width == p.width && height == p.height) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class EqualsEx2 {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3);
        Rect b = new Rect(3, 2);
        Rect c = new Rect(3, 4);

        boolean found = false;

        if (a.equals(b)) {
            System.out.println("a is equal to b");
            found = true;
        }
        if (a.equals(c)) {
            System.out.println("a is equal to c");
            found = true;
        }
        if (b.equals(c)) {
            System.out.println("b is equal to c");
            found = true;
        }

        if (!found) {
            System.out.println("동일한 사각형이 없습니다");
        }
    }
}
