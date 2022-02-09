package thread;

public class JoinDemo {
    static  boolean isFinish=false;//为什么这么写，有一个大原因
    public static void main(String[] args) {
        //final boolean isFinish=false;
        Thread download=new Thread(){
            public void run(){
                System.out.println("down:开始下载图片...");
                for(int i=0;i<=100;i++){
                    System.out.println("down:"+i+"%");
                    try{
                        Thread.sleep(50);
                    }catch (InterruptedException e){

                    }
                }
                System.out.println("图片下载完毕！");
                isFinish=true;
            }
        };

        Thread show =new Thread(){
            public void run(){
                System.out.println("开始显示文字");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("show显示文字完毕！");
                //将show线程阻塞，直到download执行完毕(图片下载完成)
                try {
                    download.join(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("show开始显示图片...");
                if(!isFinish){
                    throw new RuntimeException("图片加载失败!");
                }
                System.out.println("show:图片显示完毕");
            }
        };

        download.start();
        show.start();


    }
}
