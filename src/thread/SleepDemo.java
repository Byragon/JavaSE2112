package thread;

/**
 * 线程提供了一个静态方法
 * static void sleep(long ms)
 * 当一个线程调用sleep后就会进入阻塞状态指定的毫秒
 * 超时后线程后自动回到RUNNABLE状态
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束了");
    }
}
