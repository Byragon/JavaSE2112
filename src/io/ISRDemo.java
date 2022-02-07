package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 使用转换流测试读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {

        //将osw.txt中所有的内容读取出来并输出到控制台中
        FileInputStream fis=new FileInputStream("osw.txt");//文件流
        InputStreamReader isr=new InputStreamReader(fis, StandardCharsets.UTF_8); //字符流

        char[] s=new char[fis.available()];
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }


        //isr.read()返回一个int值，该int值本身是一个char字符值，但是如果为-1表示读取到末尾了
        int d;
        while((d=isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();








    }
}
