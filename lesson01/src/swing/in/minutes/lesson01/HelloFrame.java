package swing.in.minutes.lesson01;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.Dimension;

public class HelloFrame extends JFrame {


    public HelloFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 200));
        setLocationRelativeTo(null);
        add(new JLabel("Hello World"));

    }
}
