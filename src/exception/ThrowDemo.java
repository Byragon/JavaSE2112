package exception;

/**
 * 该案例用来解释throw和throws
 * 需要配合使用
 * 只有runtimeexception可以单独使用throw
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p=new Person();
        //方法处设置抛异常判断，在这里调用时候需要执行异常以放意外情况
        /*
            当我们调用一个含有throws声明异常抛出的方法时候，编译器要求我们必须处理该异常，否则编译不通过
         */
        try {
            p.setAge(1000);//典型的满足语法但是不满足业务要求
            System.out.println("此人年龄："+p.getAge());
        } catch (Exception e) {
            System.out.println();
        }

    }
}
