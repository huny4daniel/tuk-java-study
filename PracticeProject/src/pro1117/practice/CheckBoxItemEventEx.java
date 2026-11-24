package pro1117.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class CheckBoxItemEventEx extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3];
    private String[] names = {"사과", "배", "체리"};
    private int[] prices;
    private JLabel sumLabel;

    public CheckBoxItemEventEx(int[] prices) {
        this.prices = prices;

        setTitle("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel(names[0] + " " + prices[0] + "원, "
                + names[1] + " " + prices[1] + "원, "
                + names[2] + " " + prices[2] + "원"));

        MyItemListener listener = new MyItemListener();
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener);
        }

        sumLabel = new JLabel("현재 0 원 입니다.");
        c.add(sumLabel);

        setSize(250, 200);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        private int sum = 0;

        @Override
        public void itemStateChanged(ItemEvent e) {
            for (int i = 0; i < fruits.length; i++) {
                if (e.getItem() == fruits[i]) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        sum += prices[i];
                    }
                    else {
                        sum -= prices[i];
                    }
                }
            }
            sumLabel.setText("현재 " + sum + "원 입니다.");
        }
    }

    public static void main(String[] args) {
        String[] names = {"사과", "배", "체리"};
        int[] prices = new int[names.length];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "의 가격을 입력하세요>>");
            prices[i] = scanner.nextInt();
        }
        scanner.close();

        new CheckBoxItemEventEx(prices);
    }
}
