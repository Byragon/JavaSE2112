package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素会影响集合操作的相关方法
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(7,8));
        /*
            集合重写了toString方法，格式为：
            [元素1.toString(),元素2.toString,元素3.toString(),...]
         */
        System.out.println(c);
        Point p=new Point(2,2);
        boolean contains=c.contains(p);
        System.out.println("是否包含该元素"+contains);
        /*
            remove方法删除元素时也是删除与集合中equals比较为true的元素
            注：对list而言，由于可以存放重复元素，对这种情况仅仅会删除一次
         */
        c.remove(p);
        System.out.println(c);
    }
}
