import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("언어 목록>> ");
        String l = sc.nextLine();
        String t = l.trim();
        
        System.out.println("원본 길이: " + l.length());
        System.out.println("공백 제거 길이: " + t.length());

        String langs[] = t.split(",");
        System.out.println("개수: " + langs.length);

        for (int i = 0; i < langs.length; i++) {
            System.out.println((i + 1) + ". " + langs[i]);
        }
        System.out.println("Java 포함: " + t.contains("Java"));
        System.out.println(t.replace("C++", "C#"));

        System.out.println(t.substring(langs[0].length() + 1)); // 주의
        System.out.println("첫 글자: " + t.charAt(0)); // 주의

        sc.close();
    }
}
