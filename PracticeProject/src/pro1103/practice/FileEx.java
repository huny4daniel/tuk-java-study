package pro1103.practice;

import java.io.File;
import java.util.Scanner;

public class FileEx {
    public static void listDirectory(File dir) {
        System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");
        File[] subFiles = dir.listFiles();
        if (subFiles == null) {
            System.out.println("목록을 읽을 수 없습니다.");
            return;
        }

        int fileCount = 0, dirCount = 0;
        for (int i = 0; i < subFiles.length; i++) {
            File f = subFiles[i];
            long t = f.lastModified();
            if (f.isDirectory()) {
                System.out.print("[DIR] " + f.getName());
                dirCount++;
            } else {
                System.out.print(f.getName());
                fileCount++;
            }
            System.out.print("\t파일 크기: " + f.length());
            System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
        }
        System.out.println("파일 " + fileCount + "개, 디렉토리 " + dirCount + "개");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정보를 확인할 경로를 입력하세요>>");
        File f1 = new File(scanner.nextLine());
        if (!f1.exists()) {
            System.out.println(f1.getPath() + "은 존재하지 않습니다.");
            scanner.close();
            return;
        }
        System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());

        String res = "";
        if (f1.isFile()) {
            res = "파일";
        } else if (f1.isDirectory()) {
            res = "디렉토리";
        }
        System.out.println(f1.getPath() + "은 " + res + "입니다.");

        System.out.print("작업할 상위 디렉토리를 입력하세요>>");
        File parent = new File(scanner.nextLine());
        System.out.print("새로 만들 디렉토리 이름을 입력하세요>>");
        String oldName = scanner.nextLine();
        System.out.print("변경할 디렉토리 이름을 입력하세요>>");
        String newName = scanner.nextLine();

        File f2 = new File(parent, oldName);
        if (!f2.exists()) {
            f2.mkdir(); // 존재하지 않으면 디렉토리 생성
        }

        listDirectory(parent);
        if (f2.renameTo(new File(parent, newName))) {
            System.out.println(oldName + "을 " + newName + "으로 변경하였습니다.");
        } else {
            System.out.println("이름 변경에 실패하였습니다.");
        }
        listDirectory(parent);

        scanner.close();
    }
}
