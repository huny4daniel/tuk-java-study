package pro1117.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComponentEx extends JFrame {
    public JComponentEx() {
        super("JComponent의 공통 메소드 예제");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Blue/Pink Button");
        JButton b2 = new JButton(" Disabled Button ");
        JButton b3 = new JButton("width, height");

        b1.setBackground(Color.PINK); // 배경색 설정
        b1.setForeground(Color.BLUE); // 글자색 설정
        b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20픽셀 폰트 설정
        b2.setEnabled(false); // 버튼 비활성화
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();
                frame.setTitle(b.getWidth() + "," + b.getHeight()); // 타이틀에 버튼 크기 출력
            }
        });

        c.add(b1);
        c.add(b2);
        c.add(b3); // 컨텐트팬에 버튼 부착

        setSize(260, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComponentEx();
    }
}
