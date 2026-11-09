package pro1109.practice;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx(int hGap, int vGap) {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT, hGap, vGap));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수평 간격을 입력하세요>>");
        int hGap = scanner.nextInt();
        System.out.print("수직 간격을 입력하세요>>");
        int vGap = scanner.nextInt();
        scanner.close();

        new FlowLayoutEx(hGap, vGap);
    }
}
