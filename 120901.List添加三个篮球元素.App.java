package Test.sy20201209;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_list=new ArrayList<>();
    //构造方法
    public App() {
        ImageIcon icon = new ImageIcon("src\\Test\\sy20201209\\img\\ball.png");

//        label_list.add()

        label_list.add(new JLabel());
        label_list.add(new JLabel());
        label_list.add(new JLabel());

        label_list.get(0).setIcon(icon);
        label_list.get(1).setIcon(icon);
        label_list.get(2).setIcon(icon);

        label_list.get(0).setText("这是第一个List元素");
        label_list.get(0).setBounds(100,100,200,80);

        label_list.get(1).setText("这是第2个List元素");
        label_list.get(1).setBounds(100,200,200,80);

        label_list.get(2).setText("这是第3个List元素");
        label_list.get(2).setBounds(100,300,200,80);

        for (int i = 0; i < label_list.size(); i++) {
            myPanel.add(label_list.get(i));
        }
    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new App().go();
    }
}
