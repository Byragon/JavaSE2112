package list;

import java.util.ArrayList;
import java.util.List;

/**
 *  List集合提供的方法：
 *  list subList(int start,int end)
 *  获取当前集合中指定范围的子集---含头不含尾
 */

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        //获取子集
        List<Integer> subList=list.subList(3,8);
        System.out.println("sub"+subList);

        System.out.println(subList);
        //将子集每个元素扩大10倍
        for(int i=0;i<subList.size();i++){
            int num=subList.get(i);
            num=subList.get(i)*10;
            subList.set(i,num);
        }
        System.out.println(subList);
        System.out.println(list);
    }

}
