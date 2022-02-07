package file;

import java.io.File;

/**
 * 删除目录或者文件
 */
public class Test {
    public static void main(String[] args) {
        File dir=new File("./a");
        delete(dir);
    }

    /**
     * 以下功能有误，只实现了删除所有的文件，但目录没有删除
     * ps：删除目录只有目录为空才能删除
     * @param file
     */
//    public static void delete(File file){
//        if(file.isFile()){
//            file.delete();
//            return;
//        }
//        if(file.isDirectory()){
//            File[] subs=file.listFiles();
//            for(int i=0;i<subs.length;i++){
//                File sub=subs[i];//从目录中获取一个子项
//                //递归
//                delete(sub);
//            }
//        }
//    }

     /**
      *
      */
     public static void delete(File file){

     }

}
