package pro1116.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyCodeEx extends JFrame {
    private JLabel la = new JLabel();

    public KeyCodeEx() {
        setTitle("Key Code 예제 : r:빨간색, g:초록색, y:노란색, b:파란색, 그 외:흰색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(450, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            Container contentPane = (Container) e.getSource();
            la.setText("허영훈이 " + KeyEvent.getKeyText(e.getKeyCode()) + "를 입력했습니다");

            switch (e.getKeyChar()) {
                case 'r':
                    contentPane.setBackground(Color.RED);
                    break;
                case 'g':
                    contentPane.setBackground(Color.GREEN);
                    break;
                case 'y':
                    contentPane.setBackground(Color.YELLOW);
                    break;
                case 'b':
                    contentPane.setBackground(Color.BLUE);
                    break;
                default:
                    contentPane.setBackground(Color.WHITE);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
