package pro1123.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ListChangeEx extends JFrame {
    private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear"};
    private ImageIcon[] images = {
            new ImageIcon("images/apple.jpg"),
            new ImageIcon("images/banana.jpg"),
            new ImageIcon("images/kiwi.jpg"),
            new ImageIcon("images/mango.jpg"),
            new ImageIcon("images/pear.jpg")};
    private JComboBox<String> strCombo = new JComboBox<String>(fruits);
    private Vector<String> v = new Vector<String>();
    private JList<String> fruitList = new JList<String>(v);
    private JLabel imgLabel = new JLabel();

    public ListChangeEx() {
        setTitle("리스트 변경 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(strCombo);

        fruitList.setVisibleRowCount(4);
        fruitList.setFixedCellWidth(100);
        c.add(new JScrollPane(fruitList));

        c.add(imgLabel);

        // JComboBox에 ActionListener 등록. 선택한 과일을 리스트에 추가하고 그림 출력
        strCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>) e.getSource();
                int index = cb.getSelectedIndex();
                v.add(fruits[index]);
                fruitList.setListData(v);
                imgLabel.setIcon(images[index]);
            }
        });

        setSize(400, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListChangeEx();
    }
}
