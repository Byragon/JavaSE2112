package object;

import java.io.File;

/**
 * file文件
 * java.io.File类
 */
public class FileDemo {
    public static void main(String[] args) {
        //访问当前目录下的demo.txt文件
        File file=new File("./demo.txt");
        //String name=file.getName();
        String name=file.getName();
        System.out.println("名字："+name);
        long length=file.length();
        System.out.println(length);
    }
}
