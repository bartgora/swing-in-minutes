package swing.in.miutes.lesson01;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame hello = new HelloFrame();
                hello.setVisible(true);
            }
        });
    }
}
