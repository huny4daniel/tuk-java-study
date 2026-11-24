package pro1123.practice;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FrameAssign extends JFrame {
    private String[] text = {"EAST", "WEST", "SOUTH"};
    private JRadioButton[] radio = new JRadioButton[3];
    private JButton[] btn = new JButton[3];
    private JSlider[] sl = new JSlider[3];
    private int selected = 2;

    public FrameAssign() {
        setTitle("슬라이더와 ChangeEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(Color.GRAY);
        ButtonGroup g = new ButtonGroup();
        for (int i = 0; i < radio.length; i++) {
            radio[i] = new JRadioButton(text[i]);
            g.add(radio[i]);
            radioPanel.add(radio[i]);
            radio[i].addItemListener(new MyItemListener());
        }
        radio[2].setSelected(true);
        c.add(radioPanel, BorderLayout.NORTH);

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton(text[i]);
        }
        c.add(btn[0], BorderLayout.EAST);
        c.add(btn[1], BorderLayout.WEST);
        c.add(btn[2], BorderLayout.SOUTH);

        JPanel sliderPanel = new JPanel();
        for (int i = 0; i < sl.length; i++) {
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
            sl[i].setPaintLabels(true);
            sl[i].setPaintTicks(true);
            sl[i].setPaintTrack(true);
            sl[i].setMajorTickSpacing(50);
            sl[i].setMinorTickSpacing(10);
            sl[i].addChangeListener(new MyChangeListener());
            sliderPanel.add(sl[i]);
        }
        sl[0].setForeground(Color.RED);
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);
        c.add(sliderPanel, BorderLayout.CENTER);

        setSize(380, 250);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.DESELECTED) {
                return;
            }
            for (int i = 0; i < radio.length; i++) {
                if (radio[i].isSelected()) {
                    selected = i;
                }
            }
        }
    }

    class MyChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int r = sl[0].getValue();
            int g = sl[1].getValue();
            int b = sl[2].getValue();
            btn[selected].setBackground(new Color(r, g, b));
        }
    }

    public static void main(String[] args) {
        new FrameAssign();
    }
}
