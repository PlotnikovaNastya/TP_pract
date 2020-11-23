package com.company;
import javax.swing.*;
import java.awt.*;
public class SimpleGUI2 extends JFrame {
    private JButton button = new JButton("Все готово");
    private JLabel label = new JLabel("Введите имя");
    private JTextField input = new JTextField("Джон Сноу", 5);
    private JCheckBox check = new JCheckBox("Согласны?", false);

    public SimpleGUI2 () {
        super("Простая программа");
        this.setBounds(300, 300, 300, 150);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        container.add(button);
        container.add(check);
    }
}
