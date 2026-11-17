package pro1116.practice;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class InputDisplayEx extends JFrame {
    private JLabel nameInfo = new JLabel("이름:", SwingConstants.CENTER);
    private JLabel deptInfo = new JLabel("학과:", SwingConstants.CENTER);
    private JTextField nameField = new JTextField();
    private JTextField deptField = new JTextField();

    public InputDisplayEx() {
        setTitle("입력 값 표시 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel c = new JPanel(new BorderLayout());
        c.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(c);

        // 상단, 하단: 입력 값 표시
        setColoredLabel(nameInfo);
        setColoredLabel(deptInfo);
        c.add(nameInfo, BorderLayout.NORTH);
        c.add(deptInfo, BorderLayout.SOUTH);

        // 좌측: 세로 글자
        JLabel side = new JLabel("<html>입<br>력<br>창</html>", SwingConstants.CENTER);
        side.setPreferredSize(new Dimension(40, 0));
        setColoredLabel(side);
        c.add(side, BorderLayout.WEST);

        // 중앙: 입력 부분 (바탕색 적용 안 함)
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        inputPanel.add(new JLabel("이름", SwingConstants.CENTER));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("학과", SwingConstants.CENTER));
        inputPanel.add(deptField);

        JButton okBtn = new JButton("확인");
        JButton cancelBtn = new JButton("취소");
        okBtn.addActionListener(new MyActionListener());
        cancelBtn.addActionListener(new MyActionListener());
        inputPanel.add(okBtn);
        inputPanel.add(cancelBtn);
        c.add(inputPanel, BorderLayout.CENTER);

        setSize(350, 280);
        setVisible(true);
    }

    private void setColoredLabel(JLabel la) {
        la.setOpaque(true);
        la.setBackground(Color.YELLOW);
        la.setBorder(new LineBorder(Color.BLACK));
        la.setPreferredSize(new Dimension(la.getPreferredSize().width, 30));
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("확인")) {
                nameInfo.setText("이름: " + nameField.getText());
                deptInfo.setText("학과: " + deptField.getText());
            }
            else {
                nameField.setText("");
                deptField.setText("");
                nameInfo.setText("이름:");
                deptInfo.setText("학과:");
            }
        }
    }

    public static void main(String[] args) {
        new InputDisplayEx();
    }
}
