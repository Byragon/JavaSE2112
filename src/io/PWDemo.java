package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 *  java.io.BufferedWriter和BufferedReader
 *  缓冲字符流内部维持一个数组，可以块读写文本数据来进行读写性能的提升
 *
 *
 *
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw=new PrintWriter("./pw.txt","UTF-8");//当编码结束后
        pw.println("123");
        pw.println("23234");

        System.out.println("写出完毕");
        pw.close();
    }




}
