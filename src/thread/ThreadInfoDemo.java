package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main=Thread.currentThread();
        String name=main.getName();
        System.out.println("名字"+name);

        long id=main.getId();//获取线程的唯一标识
        System.out.println("id"+id);

        int priority=main.getPriority();//获取线程优先级
        System.out.println("priority:"+priority);

        boolean isAlive=main.isAlive();//线程是否还活着

        boolean isDaemon=main.isDaemon();//线程是否为守护线程
        boolean isInterrupted=main.isInterrupted();//线程是否被中断

        System.out.println("是否活着:"+isAlive);
        System.out.println("是否为守护进程:"+isDaemon);
        System.out.println("是否被中断:"+isInterrupted);


    }
}
