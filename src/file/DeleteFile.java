package file;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File dir=new File("demo");
        /*
            删除目录的时候必须是一个空目录才可以删除
         */
        if(dir.exists()){
            dir.delete();
            System.out.println("该目录已经删除");
        }else{
            System.out.println("该目录不存在！");
        }
    }

}
