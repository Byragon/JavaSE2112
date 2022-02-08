package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * 子类重写超类含有throws声明异常抛出的方法时对throws的重写规则
 */
public class ThrowsDemo {
    //父类方法
    public void dosome()throws IOException, AWTException{
    }
}


//子类继承ThrowsDemo
class SubClass extends ThrowsDemo{
    //重写时候抛出所有父类方法所抛出的异常
//    public void dosome() throws IOException,AWTException{
//
//    }

    //允许重写时候抛出部分 父类异常
    //public void dosome() throws IOException{}

    //允许重写的时候不抛出任何 父类异常
    //public void dosome(){}

    //允许重写时候抛出 父类异常的子类型异常
    //public void dosome() throws FileNotFoundException {}

    //不允许继承父类的时候，抛出父类所没有的异常
    //public void dosome() throws SQLException{}

    //不允许重写方法时候，抛出父类异常的超类型异常
    //public void dosome() throws Exception{}
}
