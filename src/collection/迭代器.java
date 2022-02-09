package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection层面上不支持随机访问操作(根据指定的位置获取对应元素)。
 * 但是集合支持遍历操作，我们可以通过遍历最终拿到每一个元素。
 *                     die
 * 集合提供了统一的遍历方式:迭代器模式
 * 对应方法:
 * Iterator iterator()
 * 该方法会返回一个用于遍历当前集合元素的迭代器
 *
 * java.util.Iterator是迭代器接口，定义了迭代器遍历集合的基本操作，所有的集合都提供
 * 了一个用于遍历自身元素的迭代器实现类，我们无需记住他们的名字，用多态的思想将他们统一
 * 看做是Iterator即可。迭代器遍历集合遵循的步骤:问->取->删。其中删除不是必须操作。
 *
 */
public class 迭代器 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("one");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        //获取迭代器
        Iterator it = c.iterator();
        /*
            boolean hasNext()
            判断集合是否还有下个元素可以遍历，迭代器的起始位置可以理解是集合第一个元素位置之前，
            因此第一次调用hasNext()就是判断集合是否有第一个元素
            E next() ：返回值！！！注意是Object，接受的话是需要进行转型的
            获取集合的下一个元素，后去后迭代器的位置会向后移动一个位置
         */
        while(it.hasNext()){
            String e=(String)it .next();
            if(e.equals("#")){
                it.remove();
            }
        }
        System.out.println(c);
        /*
            迭代器提供了remove方法可以将本次通过next方法获取的元素从集合中删除
         */





    }

}
