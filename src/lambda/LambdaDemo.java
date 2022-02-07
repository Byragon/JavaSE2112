package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * lambda表达式  JDK8推出的特性
 * lambda可以更简短的方式创建匿名内部类
 *
 * 语法：
 * ([实际参数])->{
 * 	方法体
 * }
 *
 * 需要注意，使用lambda创建的匿名内部类所实现的接口只能有一个抽象方法。
 * @author Byragon
 *
 */
public class LambdaDemo {
    public static void main(String[] args) {
        /*
            这是匿名内部类的创建方式
         */
        FileFilter fileFilter=new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().contains("o");
            }
        };

        /*
            这是匿名内部类进行lambda简化后的匿名内部类
            忽略了接口名和方法名
            经过编译器后，编译器帮我们自动扩展成上面的版本
         */
        FileFilter filter1=(File file)->{
            return file.getName().contains("o");
        };

        /*
            精简版2--在lambda的基础上进一步简化
            1、File file可以精简为file,参数类型可以忽略
            2、当只有一个变量的时候 （File file）可以精简为file，()也可以省略
         */
        FileFilter fileFilter2=file->{
            return file.getName().contains("o");
        };

        /*
            精简版3--
            如果lambda中只有一句代码，{}也可以删除，
            如果仅含的一句代码是return语句，return需要删掉
         */
        FileFilter fileFilter3=file->file.getName().contains("o");


        /*
            结合起来，用数组接收
         */
        File dir=new File(".");
        File[] subs=dir.listFiles(f->f.getName().contains("o"));
        for (int i=0;i<subs.length;i++){
            System.out.println(subs[i].getName());
        }



    }
}
