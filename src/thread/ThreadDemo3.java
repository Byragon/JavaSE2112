package thread;


/**
 * 使用匿名内部类完成两种线程的创建方式
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //直接继承Thread重写run方法的形式
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("你是谁啊?");
                }
            }
        };
        //实现Runnable接口重写run方法单独定义任务的形式
//        Runnable r2 = new Runnable(){
//            public void run(){
//                for(int i=0;i<1000;i++){
//                    System.out.println("我是查水表的!");
//                }
//            }
//        };

        Runnable r2 = ()->{
            for (int i=0;i<1000;i++){
                System.out.println("我是查水表的!");
            }
        };
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}