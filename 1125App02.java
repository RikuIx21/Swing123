package Test.sy20201125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App02 {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App02() {
        label_txt.setText("魔镜魔镜谁是这个世界上最帅的人");
        label_txt.setBounds(100,20,256,100);
        myPanel.add(label_txt);
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.orange);
        textArea_A.setText("魔镜魔镜谁是这个世界上最帅的人");
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.yellow);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String text = textArea_A.getText();
                        if (text.equals("刘德华")) {
                            textArea_B.setText("回答正确");
                            textArea_B.setBackground(Color.green);
                            textArea_A.setSelectionEnd(0);
                        }else {
                            textArea_B.setText("回答错误");
                            textArea_B.setBackground(Color.red);
                        }

                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("墨镜");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App02().go();
    }
}
