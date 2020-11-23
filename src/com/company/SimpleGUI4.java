package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI4 extends JFrame {
    private JButton button = new JButton("Отобразить");
    private JTextField input = new JTextField("Привет", 5);

    public SimpleGUI4 () {
        super("Простая программа");
        this.setBounds(700, 700, 200, 200);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(input);
        container.add(button);
        button.addActionListener(new SimpleGUI4.ButtonEventListener());
    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            if(input.getText().length()!=0)
            {
                JOptionPane.showMessageDialog(null, input.getText(), "Результат", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}