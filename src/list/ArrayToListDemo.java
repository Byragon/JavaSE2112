package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  数组转换为List集合
 *  数组的工具类Arrays提供了一个静态的方法，asList，可以将一个数组转换为一个List集合
 *  转集合的时候，只能转换为List，set不允许重复，不太合理
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array={"1","2","3","4","5"};//创建一个数组
        System.out.println("Array:"+Arrays.toString(array));
        //将数组转换成列表的方法
        List <String> list=Arrays.asList(array);
        System.out.println("List:"+list);
        //对该集合的操作就是对原数组对应的操作
        list.set(1,"6");
        System.out.println("List:"+list);
        System.out.println("Array:"+Arrays.toString(array));

//        List<String> list2=new ArrayList<>();
//        list2.addAll(list);
//        System.out.println("list2:"+list2);
//        list2.add("7");
//        System.out.println("list2:"+list2);

        List<String> list2=new ArrayList<>(list);
        list2.add("7");
        System.out.println(list2);


    }
}
