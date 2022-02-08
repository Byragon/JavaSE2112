package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试Java的自动关闭流的特性
 * JDK7之后，java推出了自动关闭特性。
 * 使得我们在源代码中异常处理机制在IO应用中得到了简化。
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("fos.dat")){
            fos.write(1);
        }catch(IOException e){
            System.out.println("发生IO错误，已经捕获");
        }
    }

}
