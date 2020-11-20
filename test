import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class App1 {
    private JPanel MyJPanel = new JPanel();
    private JLabel Mouse = new JLabel();
    private JLabel background=new JLabel();
    private JLabel Scope=new JLabel();
    int Count = 0;
    public App1() {
        Mouse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Mouse.setBounds((int)(Math.random() * 300),(int)(Math.random() * 250),80,80);
                Count++;
                Scope.setText("Scope:"+String.valueOf(Count));
            }
        });
    }

    void go(){
        MyJPanel.setLayout(null);
        java.net.URL imgURL1 = App1.class.getResource("mouse1.gif");
        java.net.URL imgURL2 = App1.class.getResource("mousebackground.jpg");
        Mouse.setIcon(new ImageIcon(imgURL1));
        background.setIcon(new ImageIcon(imgURL2));


        Mouse.setBounds(100,100,110,110);
        background.setBounds(0,0,500,376);
        Scope.setBounds(50,-20,100,100);
        Scope.setText("Scope:"+String.valueOf(Count));

        Scope.setFont(new Font("Arial", Font.BOLD,20));
        Scope.setForeground(Color.blue);

        MyJPanel.add(Scope);
        MyJPanel.add(Mouse);
        MyJPanel.add(background);




        JFrame frame = new JFrame("App1");
        frame.setContentPane(MyJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(200,200,500,380);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App1().go();

    }
}
