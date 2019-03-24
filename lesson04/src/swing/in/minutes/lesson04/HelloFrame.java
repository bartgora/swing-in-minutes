package swing.in.minutes.lesson04;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloFrame extends JFrame {

    private JButton button;
    private JMenuBar menuBar;
    private JMenu mainMenu;
    private JMenuItem exitMenuItem;

    public HelloFrame() {
        initComponents();
        initListeners();
    }

    private void initComponents(){
        button = new JButton("Close");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 200));
        setResizable(false);
        setLayout(new BorderLayout());
        JPanel center = new JPanel();
        center.add(new JLabel("Hello World"), BorderLayout.CENTER);
        add(center);
        JPanel south = new JPanel();
        south.add(button);
        add(south, BorderLayout.SOUTH);
        menuBar = new JMenuBar();
        mainMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("Exit");
        mainMenu.add(exitMenuItem);
        menuBar.add(mainMenu);
        setJMenuBar(menuBar);
    }

    private void initListeners(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
            }
        });
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent e) {
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
