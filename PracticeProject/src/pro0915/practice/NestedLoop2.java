package pro0915.practice;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int j = 1; j < 10; j++) {
            for (int i = 2; i < 10; i++) {
                System.out.print(i + "*" + j + "=" + (i * j));
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
