package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //向文件demo.txt写入数据
        FileOutputStream fos=new FileOutputStream("demo.txt");
        String line="beep,beep,I'm sheep~beep,beep,I'm sheep~";
        byte[] data=line.getBytes(StandardCharsets.UTF_8);//将line转换成对应的byte数组
        fos.write(data);
        fos.write("比比爱慕西，比比买母系".getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");
        fos.close();
    }
}
