package pro0922.practice;

public class Circle {
    int radius;
    String name;

    public Circle() { }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle me = new Circle();
        me.radius = 32;
        me.name = myName;
        area = me.getArea();
        System.out.println(me.name + "의 면적은 " + area);
    }
}
