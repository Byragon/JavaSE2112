package thread;

/**
 * 静态方法锁
 * 如果我们在静态方法上使用synchronized，那么方法就一定具有同步效果
 *
 * 静态方法指定的锁对象为当前类的类对象，即class的实例。
 * JVM在加载一个类时会实例化一个class的实例与之对应，这个实例称为一个类的类对象。
 *
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Boo b1=new Boo();
        Boo b2=new Boo();
        Thread t1=new Thread(){
            public void run(){
                b1.dosome();
            }
        };

        Runnable r1=()->{
            b2.dosome();
        };
        Thread t2=new Thread(r1);

    }
}
class Boo{
    public static void dosome(){
        Thread t=Thread.currentThread();
        synchronized (Boo.class){
            System.out.println(t.getName()+"正在执行dosome方法");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName()+"执行dosome方法完毕");
        }

    }
}
