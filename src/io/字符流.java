package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * java IO将流按照读写单位划分为字节流和字符流
 * java.io.InputStream和OutputStream是所有字节输入和输出流的超类，读写最小单位是字节
 * 而
 * 常见的一对字符流实现类：java.io.InputStreamReader 和 OutputStreamWriter
 * 实际应用中：
 */
public class 字符流 {
    public static void main(String[] args) throws IOException {
        //向osw.txt中写入文本数据
        FileOutputStream fos=new FileOutputStream("osw.txt");
        //双流连接：将字符流链接到字节流
        OutputStreamWriter osw=new OutputStreamWriter(fos,StandardCharsets.UTF_8);

//        String line="情人总分分合合，可是我们却越爱越深";
//        byte[] data=line.getBytes(StandardCharsets.UTF_8);
//        fos.write(data);

        //字符输出流示例：
        osw.write("情人总分分合合，可是我们却越爱越深");
        osw.write("认识你，让我们幸福如愿");
        System.out.println("写出完毕");
        osw.close();

    }
}
