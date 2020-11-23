package Kechen.kc20201123;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int x = (int) (Math.random() * 1920);
            int y = (int) (Math.random() * 1080);
            System.out.println("请输入一个数字：");
            int i = scan.nextInt();
            if (i==1){
                System.out.println("x坐标"+x+" "+"y坐标"+y); 
            }
        }
    }
}
