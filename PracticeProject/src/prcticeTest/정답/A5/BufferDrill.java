import java.util.Scanner;

public class BufferDrill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("This");
        sb.append(" is pencil");
        System.out.println(sb);
        sb.insert(7, " my");
        System.out.println(sb);
        sb.replace(8, 10, "your");
        System.out.println(sb);
        sb.delete(8, 13);
        System.out.println(sb);
        sb.setLength(4);
        System.out.println(sb);

        System.out.print("단어>> ");
        String word = scanner.next();
        sb.insert(0, word + " ");
        sb.append("!");
        System.out.println(sb);
        scanner.close();
    }
}
