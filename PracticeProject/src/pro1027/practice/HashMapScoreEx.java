package pro1027.practice;

import java.util.*;

public class HashMapScoreEx {
    public static void main(String[] args) {
        HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("5명의 이름과 점수를 입력하세요.");
        while (javaScore.size() < 5) {
            System.out.print((javaScore.size() + 1) + "번째 이름>>");
            String name = scanner.next();
            if (javaScore.containsKey(name)) {
                System.out.println(name + "는 이미 입력된 이름입니다. 다시 입력하세요.");
                continue;
            }

            System.out.print(name + "의 점수>>");
            int score = scanner.nextInt();
            javaScore.put(name, score);
        }

        System.out.println("HashMap의 요소 개수 :" + javaScore.size());

        Set<String> keys = javaScore.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();
            int score = javaScore.get(name);
            System.out.println(name + " : " + score);
        }

        scanner.close();
    }
}
