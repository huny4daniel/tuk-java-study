import java.util.Scanner;

public class StringDrill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("언어 목록>> ");
        String line = scanner.nextLine();
        
        String t = line.trim();
        System.out.println("원본 길이: " + line.length());
        System.out.println("공백 제거 길이: " + t.length());
        String[] langs = t.split(",");
        System.out.println("개수: " + langs.length);
        for (int i = 0; i < langs.length; i++) {
            System.out.println((i + 1) + ". " + langs[i]);
        }
        System.out.println("Java 포함: " + t.contains("Java"));
        System.out.println(t.replace("C++", "C#"));
        System.out.println(t.substring(langs[0].length() + 1));
        System.out.println("첫 글자: " + t.charAt(0));
        scanner.close();
    }
}
