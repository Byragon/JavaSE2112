package thread;
/**
 * sleep方法要求必须处理中断异常。
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中，此时该线程的interrupt()方法被调用时
 * 会立即中断该睡眠阻塞，并抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {

        Thread lin = new Thread() {
              public void run() {
                    System.out.println("刚刚美容完，睡一会");
                    try {
                        Thread.sleep(50000);
                    } catch (InterruptedException e) {
                        System.out.println("干嘛呢干嘛呢伽马！");
                    }
                    System.out.println("睡醒了");

              }
        };
        lin.start();

        Thread huang=new Thread(){
            public void run(){
                System.out.println("黄：大锤80，小锤40，开始砸钱");
                for(int i=0;i<5;i++){
                    System.out.println("黄：80");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("哐当！");
                System.out.println("大哥搞定！");
                //lin.interrupt();//调用lin的中断睡眠阻塞
            }
        };
        huang.start();
    }
}
