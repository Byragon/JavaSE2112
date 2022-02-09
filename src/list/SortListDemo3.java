package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("苍老师");
        list.add("小泽老师");
        list.add("伊利小傻子");
        System.out.println(list);
        //定义一个比较器，按照字多字少排序
        Collections.sort(list,((o1, o2) -> o1.length()-o2.length()));
        Collections.sort(list,(Comparator.comparingInt(String::length)));//易懂模式

        //!!!!!!!
//       for(int i=0;i<list.size();i++){
//            for(int j=i;j<list.size();j++){
//                String str1=list.get(j);
//                String str2=list.get(j+1);
//                if(str1.length()>str2.length()){
//                    list.set(j, list.set(j+1,str1));//进行交换
//                }
//            }
//        }
//
        System.out.println(list);
    }
}
