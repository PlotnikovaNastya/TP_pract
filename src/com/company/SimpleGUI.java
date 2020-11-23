package com.company;
import java.awt.*;
import javax.swing.*;
public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Нажмите");
    private JTextField input_one = new JTextField("Привет", 5);
    private JTextField input_two = new JTextField("Мир!", 5);

    public SimpleGUI() {
        super("Простая программа");
        this.setBounds(100, 100, 200, 200);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(input_one);
        container.add(input_two);
        container.add(button);
    }
}
