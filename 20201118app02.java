package Test.sy20201118;

import javax.swing.*;

public class App01 {

    private JPanel MyJPanel;
    private JLabel Label01;
    void Methon(){
        JFrame frame = new JFrame("App01");
        ImageIcon imageIcon = new ImageIcon("D:\\dgr.gif");
        frame.setContentPane(MyJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        Label01.setIcon(imageIcon);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new App01().Methon();
    }
}
