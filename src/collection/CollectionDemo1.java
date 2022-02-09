package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JAVA集合框架
 * 集合和数组一样，可以保存一组元素，但是集合将元素的操作都封装成了方法，操作简便。
 * 并且集合提供了多种不同的实现供我们使用。
 *
 * java.util.Collection是所有集合的顶级接口，里面定义了所有集合都必须具备的功能方法
 * 集合有两类常用的子类:
 * java.util.List:可重复的集合，且有序。通常我们称它为"线性表"
 * java.util.Set:不可重复的集合。
 * 上述两个都是接口，而元素是否重复取绝于元素自身的equals方法，即:Set集合中不会存在
 * 两个元素equals比较为true的情况。
 *
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        //集合只能存放引用类型
        Collection c=new ArrayList();//不用指定长度

        /*
            1、boolean add(E e)返回值
            向当前元素添加一个元素，如果该元素成功添加则返回true，错误则返回false
         */
        c.add("one");
        c.add("two");
        c.add("three");

        System.out.println(c);
        //c.add(123)会自动触发自动装箱特性

        /*
            2、size,如果装超过integer.maxsize,则一直返回maxsize
         */
        int size=c.size();

        /*
            3、boolean isEmpty()
            判断当前集合是否为空集，当size为0时，返回true
         */
        boolean isEmpty=c.isEmpty();
        System.out.println("是否为空集"+isEmpty);

        /*
            4、clear方法

         */

    }
}
