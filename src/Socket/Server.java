package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 聊天室服务端
 */
public class Server {
    /**
     * java.net.ServerSocket
     * ServerSocket是运行在服务端的，它的主要工作:
     * 1:打开服务端口(客户端就是通过这个端口与服务端建立链接)
     * 2:监听该服务端口，一旦一个客户端链接，则会返回一个Socket实例，并通过这个
     *   Socket实例与链接的客户端进行交互
     *
     * 如果我们将Socket比喻为"电话"，那么ServerSocket相当于是"总机"。
     *
     */
    private ServerSocket server;

    //该数组用于存放所有客户端的输出流，用于广播消息给所有的客户端
    private Collection<PrintWriter> allOut=new ArrayList<PrintWriter>();
    Iterator it=allOut.iterator();


    /**
     * 构造方法，初始化socket
     */
    public Server(){
        try {
            /*
                实例化ServerSocket的同时需要指定打开的服务端口，客户端就是通过该
                端口建立链接的。
                如果该端口已经被操作系统其他程序占用了，那么这里会抛出异常:
                java.net.BindException:address already in use
                         绑定异常        地址    已经     被占用了
             */
            System.out.println("正在启动服务端");
            server =new ServerSocket(8088);
            System.out.println("服务端口绑定成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start(){
        try {
            while(true){
                System.out.println("等待客户端连接：");
                Socket socket=server.accept();//相当于一次接听电话的过程
                System.out.println("一个客户端连接了");

                Runnable handler=new ClientHandler(socket);
                Thread t=new Thread(handler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建新进程
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//与此进程连接的客户端的地址信息
        //构造方法！调用者可传递socket参数赋给属性socket
        public ClientHandler(Socket socket){
            this.socket=socket;
            //通过socket获取远端计算机的地址信息
            host=socket.getInetAddress().getHostAddress();
        }
        public void run(){
            PrintWriter pw=null;
            try {
                     /*
                        通过Socket的方法:
                        InputStream getInputStream()
                        获取一个字节输入流，可以读取来自远端计算机发送过来的字节数据
                     */
                //这里的socket是本类的属性
                InputStream in=socket.getInputStream();
                InputStreamReader isr=new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br=new BufferedReader(isr);

                //通过socket获取输出流，用于给客户端发送消息
                OutputStream out=socket.getOutputStream();
                OutputStreamWriter osw=new OutputStreamWriter(out,StandardCharsets.UTF_8);
                BufferedWriter bw=new BufferedWriter(osw);
                pw=new PrintWriter(bw,true);//自动行刷新

                //将该客户端的输出流存入共享数组allout中

                //为了使得sychronized成功生效，需要括号里是一个对象
                //synchronized (this) {:不行，因为this是ClientHandler。不同线程是不同的ClientHandler任务

                //synchronized (allOut) {
                /*
                    通常情况下，同步监视器对象选取的就是多个线程并发操作的临界资源。这里临界资源
                    就是数组allOut。但是这里之所以不可以是因为同步块中有对该数组扩容的操作，这
                    会导致allOut对象发生了变化，其他需要同步执行该代码块看到的就不再是之前的allOut
                    导致同步失效
                 */


                //这样最好！
                synchronized (Server.this){//Server.this外部类对象
//                    //1对allOut扩容
//                    allOut= Arrays.copyOf(allOut,allOut.length+1);
//                    //将pw存入共享数组的最后一个位置
//                    allOut[allOut.length-1]=pw;
                    allOut.add(pw);
                }


                //广播通知所有客户端用户上线了
                sendMessage(host+"上线了，当前在线人数："+allOut.size());


                String line;
            /*
                服务端在读取客户端消息这里，如果客户端没有调用socket.close()与服务端正常断开连接(例如客户端直接被杀掉了进程等操作)
                那么服务端这里会抛出一个异常：SocketException:Connection reset
                这是由于客户端非正常操作导致的，服务端无法通过逻辑避免该异常的产生
             */
                while((line=br.readLine())!=null){
                    System.out.println(host+"说:"+line);
                    //将消息回复给客户端
                    sendMessage(host+"说："+line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {

                //为了使得xxx
                synchronized (Server.this){
                    //当客户端主动断掉之后，服务端数组应该删除掉对应的客户端输出流pw，具体做法如下

                    while(it.hasNext()){
                        PrintWriter e=(PrintWriter) it.next();
                        if(pw.equals(e)){
                            it.remove();
                        }
                    }
//                    for(int i=0;i<allOut.length;i++){
//                        if(allOut[i]==pw){
//                            allOut[i]=allOut[allOut.length-1];
//                        }
//                        break;
//                    }
                }

//                //数组缩容
//                allOut=Arrays.copyOf(allOut,allOut.length-1);
                sendMessage(host+"下线了，当前在线人数："+allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        /**
         * 广播消息给所有客户端
         */
        private  void sendMessage(String message){
            //这里为什么要加锁？防止遍历过程中对象被删除，allOut[i].println不存在，报空指针异常
            synchronized (Server.this){
//                for(int i=0;i<allOut.length;i++){
//                    allOut[i].println(message);
//                }
                for(PrintWriter i:allOut){
                    System.out.println(i);
                }
            }
        }


    }

    public static void main(String[] args) {
        Server server=new Server();
        server.start();
    }


}

