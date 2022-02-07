package object;

public class Demo {
    public static void main(String[] args) {
        /*
            第一个常被子类重新的Object中的方法是toString
            重写他的原因通常是：
            1.输出对象信息更加准确
            2.连接字符串时候内容更加有意义
         */
        Point p=new Point(1,2);
        /*
            输出一个对象时候，实际上输出的是该对象tostring返回的字符串
            Object定义了toString方法，目的是将当前对象转换为字符串，而返回的字符串格式为：类名@地址
            在输出上来讲，这个字符串对开发帮助不大。因此要重写子类的toString方法
         */
        System.out.println(p);  //object.Point@6e8dacdf
        String line="这个对象是："+p;//当做字符串连接的时候，会自动调用其toString方法转换为字符串之后再进行连接
        System.out.println(p.toString());   //object.Point@6e8dacdf

        /*
            测试Object的equals方法
            另一个经常被重写的方法equals
            作用是判定两个对象的内容是否相等
            当子类不重写toString方法的时候，Object内部中的equals方法还是==比较，因此不重写就无意义
         */
        Point p2=new Point(1,2);
        System.out.println(p==p2);
        System.out.println(p.equals(p2));

        /*
            Java提供的类大多数都重写过了toStirng和equals方法
            只有我们自己定义的类使用时候需要自行重写这两个方法
            例如String，他的toString方法和equals方法已经重写过了
         */

    }
}
