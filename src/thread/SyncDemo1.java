package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源，由于线程切换实际不确定，导致操作顺序出现混乱而引起
 * 各种逻辑错误。
 * 临界资源:操作该资源的完整过程同一时刻只能由单线程进行。
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        Table table=new Table();
        Thread t1=new Thread(){
            public void run(){
                while(true){
                    int bean= table.getBeens();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };

        Thread t2=new Thread(){
            public void run(){
                while(true){
                    int bean=table.getBeens();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };

        t1.start();
        t2.start();
    }
}
class Table{
    private int beans=20;
    /*
       当一个方法使用关键字synchronized后，该方法成为同步方法，即:
       多个线程不能同时执行这个方法。
       将多线程并发操作改为同步有先后顺序的排队执行可以有效解决并发安全问题。
    */
    public synchronized int getBeens(){
        if(beans==0){
            throw new RuntimeException("没有豆子了");
        }
        Thread.yield();
        return beans--;
    }
}
