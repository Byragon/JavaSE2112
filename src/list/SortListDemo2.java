package list;

import collection.Point;

import java.util.*;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<>();
        list.add(new Point(1,2));//传入Point对象
        list.add(new Point(2,3));//传入Point对象
        list.add(new Point(4,5));//传入Point对象
        list.add(new Point(6,7));//传入Point对象
        list.add(new Point(8,9));//传入Point对象
        list.add(new Point(10,11));//传入Point对象
        System.out.println(list);

        //Collections.sort(list);
        //匿名内部类形式创建一个比较器
//        Comparator<Point> compare=new Comparator<Point>() {
//            @Override
//            /**
//             * 实现比较器接口后必须重写方法compare
//             * 该方法用来定义参数o1和o2比较大小的规则
//             * 返回值用来表示o1和o2的大小规则：
//             * 返回值>0表示o1>o2
//             * 返回值<0表示o1<o2
//             * 返回值=0表示o1=o2
//             */
//            public int compare(Point o1,Point o2) {
//                int len1=o1.getX()* o1.getX()+o1.getY()*o1.getY();
//                int len2=o2.getX()* o2.getX()+o2.getY()*o2.getY();
//                return len1-len2;
//            }
//        };

        //简化一：
//        Collections.sort(list, new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                int len1=o1.getX()* o1.getX()+o1.getY()*o1.getY();
//                int len2=o2.getX()* o2.getX()+o2.getY()*o2.getY();
//                return len1-len2;
//            }
//        });//回调模式

        //简化二：
        Collections.sort(list,((o1, o2) -> o1.getX()* o1.getX()+ o1.getY()*o1.getY()-
                o2.getX()*o2.getX()-o2.getY()*o2.getY()));


        System.out.println(list);
    }
}
