public class Test {
    public static void main(String[] args) {
        while (true){
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("x坐标："+x +" "+"y坐标:"+y);

        }
    }
}
