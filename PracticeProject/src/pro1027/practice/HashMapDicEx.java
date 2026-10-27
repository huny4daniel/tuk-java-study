package pro1027.practice;

import java.util.*;

public class HashMapDicEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("영어 단어와 한글 단어 3쌍을 입력하세요.");
        while (dic.size() < 3) {
            System.out.print((dic.size() + 1) + "번째 영어 단어>>");
            String eng = scanner.next();
            if (dic.containsKey(eng)) {
                System.out.println(eng + "는 이미 있는 단어 입니다. 다시 입력하세요.");
                continue;
            }

            System.out.print(eng + "의 한글 단어>>");
            String kor = scanner.next();
            dic.put(eng, kor);
        }

        while (true) {
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();
            if (eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            String kor = dic.get(eng);
            if (kor == null) {
                System.out.println(eng + "는 없는 단어 입니다.");
            } else {
                System.out.println(kor);
            }
        }
        scanner.close();
    }
}
