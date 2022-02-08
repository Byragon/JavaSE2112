package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PWdemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("pw2.txt");
        //BufferedWriter bw=new BufferedWriter(fos);不能跨流连接pw--bw--osw--fos--file
        //缓冲输出流(是一个高级流，且是一个字符流)块写数据加速的方法
        OutputStreamWriter osw=new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw=new BufferedWriter(osw);
        PrintWriter pw=new PrintWriter(bw,true);//autoFulsh，当执行println时候，即时刷新。执行print的时候


        //完成简易记事本的应用：控制台控制字符按行写入文件，单独输入exit时候退出
        Scanner scan=new Scanner(System.in);
        while(true){
            String line=scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
            //pw.flush();//即时刷新
        }
        pw.close();


    }
}
