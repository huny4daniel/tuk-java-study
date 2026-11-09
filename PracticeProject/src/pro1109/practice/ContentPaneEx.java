package pro1109.practice;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.CYAN);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("IT경영전공"));
        contentPane.add(new JButton("2025314032"));
        contentPane.add(new JButton("허영훈"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
