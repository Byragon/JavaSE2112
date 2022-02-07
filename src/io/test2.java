package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 实现简易记事本文件
 * 程序启动后，要求将控制台输出的每一行字符都写入到文件note.txt中
 * 仅仅当控制台输出exit时候，程序推出
 */
public class test2 {
    /*
        思路：循环从控制台获取数据
        先判断输入是否为exit
            不为exit，解析输入
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("note.txt");

    }


}
