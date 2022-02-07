package file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        //
        File dir=new File(".");
        /*
            boolean isFile()
            判断当前file是否为一个文件
         */
        if(dir.isDirectory()){//isDiectory()判断是否为一个目录
            File[] subs=dir.listFiles();
            System.out.println("有"+subs.length+"个子项");
            for(int i=0;i< subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
