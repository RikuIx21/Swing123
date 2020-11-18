package Test.sy20201118;

import javax.swing.*;

public class App01 {

    private JPanel MyJPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App01");
        frame.setContentPane(new App01().MyJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
