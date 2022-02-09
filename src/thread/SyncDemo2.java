package thread;

public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop1=new Shop();
        Shop shop2=new Shop();
        Thread t1=new Thread(){
            public void run(){
                shop1.buy();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                shop2.buy();
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    public  void buy(){
        try {
            Thread t=Thread.currentThread();//获取当前线程在执行buy方法
            System.out.println(t.getName()+"正在挑衣服");
            Thread.sleep(2000);

            /*

             */
            synchronized (this){
                System.out.println(t.getName()+":正在试衣服");
                Thread.sleep(4000);;
            }

            System.out.println(t.getName()+"走人");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}