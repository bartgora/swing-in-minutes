package swing.in.minutes.lesson02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {

    private JButton button;

    public HelloFrame() {
        button = new JButton("Close");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 200));
        setResizable(false);
        setLocationRelativeTo(null);
        JPanel center = new JPanel();
        center.add(new JLabel("Hello World"), BorderLayout.CENTER);
        add(center);
        JPanel bottom = new JPanel();
        bottom.add(button);
        add(bottom, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
