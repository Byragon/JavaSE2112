package Socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    //构造器

    /**
     * java.net.Socket套接字
     * Socket封装了TCP协议的通讯细节，我们可以使用他和远端计算机建立TCP连接，并且基于一堆流的IO
     * 操作完成和远端计算机的数据交换
     */

    private Socket socket;

    /**
     * 初始化客户端
     */
    public Client(){
        try {
            /*
                实例化Socket时需要传入两个参数:
                参数1:远端计算机的地址信息
                参数2:远端计算机打开的服务端口
                上述构造器实例化的过程就是与远端计算机建立链接的过程，如果成功建立链接
                则实例化成功，否则构造器会抛出异常。
                我们通过远端计算机地址(IP)可以找到网络上的远端计算机，通过服务端口可以
                链接上运行在该计算机上的服务端应用程序(就是这个程序开打的该端口等待我们
                链接的。)
             */
            System.out.println("正在连接服务器");
            socket =new Socket("localhost",8088);
            System.out.println("服务器建立连接成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 客户端开始工作的方法
     */
    public void start()  {

        Scanner scan=new Scanner(System.in);
        try {
            //启动一个线程来读取服务端发送过来的消息
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            //将读取服务端消息的线程设置为守护线程
            //这样以来，当我们停止给服务端发送消息(主线程结束,进程没有其他用户线程或者)
            //那么守护线程就会被杀死
            t.setDaemon(true);
            t.start();

            OutputStream out=socket.getOutputStream();
            OutputStreamWriter osw=new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw=new BufferedWriter(osw);
            PrintWriter pw=new PrintWriter(bw,true);

            while(true){
                System.out.println(":");
                String line=scan.nextLine();
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();//与远端计算机断开连接，执行TCP挥手操作
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 该线程负责读取服务端口发来的消息
     */
    private class ServerHandler implements Runnable{
        public void run(){

            try {
                //通过socket获取输入流读取服务端发送过来的消息
                InputStream in=socket.getInputStream();
                InputStreamReader isr=new InputStreamReader(in,StandardCharsets.UTF_8);
                BufferedReader br=new BufferedReader(isr);

                String line;
                while((line=br.readLine())!=null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                /*
                    这里不输出错误信息了 当远端计算机异常断开的时候会出现异常，可以不输出错误信息
                 */
            }

        }
    }



    public static void main(String[] args) throws IOException {
        Client client=new Client();
        client.start();
    }

}
