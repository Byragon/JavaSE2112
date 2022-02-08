package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常机制在IO操作中的应用
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("fos.dat");
            fos.write(1);
        } catch (IOException e) {
            System.out.println("出错了！在这里解决了！");
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null){//避免空指针的异常
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
