package swing.in.minutes.lesson01;

import javax.swing.*;
import java.awt.*;

public class HelloFrame extends JFrame {

    public HelloFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 200));
        add(new JLabel("Hello World"));
        setResizable(false);
    }
}
