package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //在不创建新集合的前提下，将集合元素反转
        //[five four three siz one]
        List<String > list1=new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        System.out.println(list1);

        int start=0,end=list1.size()-1;
        int middle=(start+end)/2;

        for(;start<=middle;start++,end--){
            String old1=list1.get(start);
            String old2=list1.get(end);
            list1.set(start,old2);
            list1.set(end,old1);
        }
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);

        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        //获取集合中第三个元素
        /*
            E get(int index)
            获取指定下标处对应的元素
         */
        String str = list.get(2);//与数组获取元素功能一致 String str = arr[2];
        System.out.println(str);
        //List也可以通过循环下标的方式遍历
        for(int i=0;i<list.size();i++){
            str = list.get(i);
            System.out.println(str);
        }

        /*
            E set(int index,E e)
            将给定元素设置到指定位置上，返回值为该位置原来的元素
            替换元素操作
         */
        //[one,six,three,four,five]
        String old = list.set(1,"six");//将第二个位置原来的two返回
        System.out.println(list);
        System.out.println(old);

        //在不创建新集合的前提下，将集合元素翻转
        for(int i=0;i<list.size()/2;i++){//i:0
//            //获取正数位置上的元素
//            String e = list.get(i);//one
//            //将正数位置上的元素来替换倒数位置上的元素
//            e = list.set(list.size()-1-i,e);//five
//            //将原倒数位置上的元素设置到正数位置上
//            list.set(i,e);
            list.set(i,list.set(list.size()-1-i,list.get(i)));
        }
        // 0    1         3    4
        //[five,six,three,four,one]
        System.out.println(list);

        Collections.reverse(list);//翻转集合

        System.out.println(list);


    }
}
