package list;

import java.util.*;

/**
 * 集合的排序
 * 集合的工具类java.util.Collections 提供了一个静态的方法sort可以进行自然排序
 */
public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Random rand=new Random();
        for(int i=0;i<10;i++){
            list.add(rand.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

}
