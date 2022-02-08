package io;

import java.io.*;
/**
 * 缓冲字符输入流:java.io.BufferedReader
 * 1:块读文本数据加速
 * 2:可以按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前程序的源代码输出到控制台上

        //下面进行流连接，从fis基本流开始
        FileInputStream fis=new FileInputStream("./src/io/BRDemo.java");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);

        /*
            缓冲字符输入流提供的读取一行字符串的方法:
            String readLine()
            该方法会连续读取若干字符，到换行符为止，然后将换行符之前的内容以一个字符串形式返回。
            注意:返回的字符串中不含有最后的换行符。
            如果单独读取了空行(此行内容只有一个换行符，比如当前源代码中的第二行就是空行)，
            那么会返回一个空字符串。
            当方法返回值为null时，表示流读取到了末尾。
         */
//        String line=br.readLine();//读取到末尾才会返回null
//        System.out.println(line);
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();


    }
}
