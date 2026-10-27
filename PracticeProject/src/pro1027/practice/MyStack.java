package pro1027.practice;

import java.util.Scanner;

class GStack<T> {
    int tos;
    Object[] stck;

    public GStack() {
        tos = 0;
        stck = new Object[5];
    }

    public boolean isFull() {
        return tos == 5;
    }

    public boolean isEmpty() {
        return tos == 0;
    }

    public void push(T item) {
        if (isFull()) {
            return;
        }
        stck[tos] = item;
        tos++;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        tos--;
        return (T) stck[tos];
    }
}

public class MyStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GStack<String> stringStack = new GStack<String>();

        System.out.println("문자열을 입력하세요. (exit 입력 시 종료, 최대 5개)");
        while (!stringStack.isFull()) {
            System.out.print(">>");
            String s = scanner.next();
            if (s.equals("exit")) {
                break;
            }
            stringStack.push(s);
        }

        if (stringStack.isFull()) {
            System.out.println("스택이 가득 찼습니다.");
        }

        System.out.println("입력된 문자열을 역순으로 출력합니다.");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }

        scanner.close();
    }
}
