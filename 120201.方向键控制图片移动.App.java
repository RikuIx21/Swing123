package Test.sy20201202;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_background = new JLabel();
    JLabel plane = new JLabel();
    int X = 512;
    int Y = 720;

    //构造方法
    public App() {
        //监听事件
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println("进入1");

                if (e.getKeyCode() == e.VK_UP) {
                    plane.setLocation(plane.getX(), plane.getY() - 60);
                } else if (e.getKeyCode() == e.VK_DOWN) {
                    plane.setLocation(plane.getX(), plane.getY() + 60);
                } else if (e.getKeyCode() == e.VK_LEFT) {
                    plane.setLocation(plane.getX() - 60, plane.getY());
                } else if (e.getKeyCode() == e.VK_RIGHT) {
                    plane.setLocation(plane.getX() + 60, plane.getY());
                }
        }
    });
}

    //显示窗体方法
    void go() {
        //背景
        label_background.setBounds(0, 0, 512, 720);
//        java.net.URL imgURL1 = App.class.getResource("src\\Test\\sy20201202\\img\\background.png");
        label_background.setIcon(new ImageIcon("src\\Test\\sy20201202\\img\\background.png"));

        //飞机
        plane.setIcon(new ImageIcon("src\\Test\\sy20201202\\img\\plane4.png"));
        plane.setBounds(100, 200, 100, 100);

        //添加到面板
        myPanel.add(plane);
        myPanel.add(label_background);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("打飞机游戏");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 512, 720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);

    }

    public static void main(String[] args) {
        new App().go();
    }
}

