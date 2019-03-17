package swing.in.minutes.lesson03;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UIManager.put("OptionPane.yesButtonText", "Tak");
                UIManager.put("OptionPane.noButtonText", "Nie");
                JFrame hello = new HelloFrame();
                hello.setVisible(true);
            }
        });
    }
}
