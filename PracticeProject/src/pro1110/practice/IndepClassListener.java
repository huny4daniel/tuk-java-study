package pro1110.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b.getText().equals("허영훈")) {
            b.setText("2025314032");
        }
        else {
            b.setText("허영훈");
        }
    }
}

public class IndepClassListener extends JFrame {
    public IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("허영훈");
        btn.addActionListener(new MyActionListener());
        c.add(btn);

        setSize(150, 50);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}
