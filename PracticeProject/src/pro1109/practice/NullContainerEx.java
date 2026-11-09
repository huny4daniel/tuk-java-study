package pro1109.practice;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        JLabel la = new JLabel("한국공학대학교");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        c.add(la);

        for (int i = 1; i <= 5; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i * 30, i * 20);
            b.setSize(50, 30);
            c.add(b);
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
