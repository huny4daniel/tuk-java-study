package pro1006.practice;

import java.util.Scanner;

class Person {
    static void print() {
        System.out.print("Person ");
    }
}

class Student extends Person {
    static void print() {
        System.out.print("Student ");
    }
}

class Researcher extends Person {
    static void print() {
        System.out.print("Researcher ");
    }
}

class Professor extends Researcher {
    static void print() {
        System.out.print("Professor ");
    }
}

public class InstanceOfEx {
    static void print(Person p) {
        if (p instanceof Person) {
            Person.print();
        }
        if (p instanceof Student) {
            Student.print();
        }
        if (p instanceof Researcher) {
            Researcher.print();
        }
        if (p instanceof Professor) {
            Professor.print();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Person, 2. Student, 3. Researcher, 4. Professor");
        System.out.print("선택>> ");
        int choice = scanner.nextInt();

        Person p;
        switch (choice) {
            case 1:
                p = new Person();
                break;
            case 2:
                p = new Student();
                break;
            case 3:
                p = new Researcher();
                break;
            case 4:
                p = new Professor();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                scanner.close();
                return;
        }

        print(p);

        scanner.close();
    }
}
