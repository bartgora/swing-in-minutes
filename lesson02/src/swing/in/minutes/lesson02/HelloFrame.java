package swing.in.minutes.lesson02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {

    private JButton button;

    public HelloFrame() {
        button = new JButton("Close");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 200));
        setResizable(false);
        JPanel center = new JPanel();
        center.add(new JLabel("Hello World"), BorderLayout.CENTER);
        add(center);
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
