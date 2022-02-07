package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中符合过滤条件的所有子项
 * 重载的listFiles方法：
 * File[] listFiles(FileFilter filter)
 * 该方法要求传入一个文件过滤器，然后仅将满足过滤器要求的所有子项进行返回
 *
 * 注：filter：过滤器
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {

        /**
         * 匿名内部类,因为过滤器对象只创建一次
         */
        FileFilter fileFilter=new FileFilter() {
            @Override
            public boolean accept(File file) {
                String name=file.getName();
                return name.contains("o");
            }
        };

        File dir=new File(".");
        File[] subs=dir.listFiles(fileFilter);//传入过滤器
        System.out.println("共有子项："+subs.length+"个" );
        for(int i=0;i<subs.length;i++){
            System.out.println(subs[i].getName());
        }

    }
}


