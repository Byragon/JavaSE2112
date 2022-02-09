package thread;

import java.util.Scanner;

public class SleepExsmpDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入倒计时时间：");
        int time=scan.nextInt();
        if(time>=0){
            for(int i=time;i>0;i--){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("时间结束！");
        }else{
            System.out.println("时间不能为负值");
        }
    }

}
