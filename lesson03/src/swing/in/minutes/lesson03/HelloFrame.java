package swing.in.minutes.lesson03;

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
        setLayout(new BorderLayout());
        JPanel center = new JPanel();
        center.add(new JLabel("Hello World"), BorderLayout.CENTER);
        add(center);
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
            }
        });
    }

    private void close() {
        int option = JOptionPane.showConfirmDialog(this, "Are your sure?", "exiting....", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            dispose();
        }
    }
}
