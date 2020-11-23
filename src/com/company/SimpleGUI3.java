package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGUI3  extends JFrame {
    private JButton button = new JButton("Скрыть поле");
    private JLabel label = new JLabel("Введите число");
    private JTextField input = new JTextField("", 5);
    private JLabel nul = new JLabel("");

    public SimpleGUI3 () {
        super("Простая программа");
        this.setBounds(500, 500, 300, 150);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        input.setBackground(Color.RED);
        button.addActionListener(new ButtonEventListener ());
        container.add(button);
        container.add(nul);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            if(button.getText()=="Скрыть поле")
            {
                input.setVisible(false);
                button.setText("Показать поле");
            }
            else {
                button.setText("Скрыть поле");
                input.setVisible(true);
            }
        }
    }

}
