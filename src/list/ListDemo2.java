package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        /*
            void add(int index,E e)
            将给定元素插入到指定位置
         */
        //[one ,two, three, six, four, five]
        list.add(3,"six");
        System.out.println(list);

    }
}
