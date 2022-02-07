package io;

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 提高每次读写的数据量减少实际读写的次数可以提高读写效率
 * 一组字节一组字节的读写称为：块读写形式
 * 单字节读写是：随机读写形式
 *
 * 使用块读写可以显著提高读写的速度
 *
 *
 */
public class CopyDemo2{
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("xxx");//从xxx文件中读数据
        FileOutputStream fos=new FileOutputStream("xxx_1");//往xxx_1中写数据
        byte[] data=new byte[10*1024];//10kb,表示一次复制的数据大小
        int len;

        long start = System.currentTimeMillis();
        while((len=fis.read(data))!=-1){//循环结束的条件，当read得到数据为-1时候，说明数据已经读取完毕了
            fos.write(data,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕！耗时"+(end-start)+"ms");
        fis.close();
        fos.close();

    }
}
