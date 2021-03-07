package Subtask2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button{

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    public void render() {
        onClick();
        frame.getContentPane().add(panel);
        panel.add(button);
        frame.setSize(500, 500);
        frame.setVisible(true);
        onClick();
    }

    public void onClick() {
        button = new JButton("Button");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
