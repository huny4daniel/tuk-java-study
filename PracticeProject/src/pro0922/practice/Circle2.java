package pro0922.practice;

public class Circle2 {
    int radius;
    String name;

    public Circle2() {
        radius = 1;
        name = "";
    }

    public Circle2(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        Circle2 pizza = new Circle2(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle2 me = new Circle2(32, myName);
        area = me.getArea();
        System.out.println(me.name + "의 면적은 " + area);
    }
}
