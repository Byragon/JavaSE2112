package object;
/**
 * 包装类出现的原因是为了解决基本类型不能直接参与面向对象开发的情况，使基本类型可以以对象的形式存在。
 */
public class 包装类 {

    public final void test1(int a){

    }
    public final void test1(int a,int b){

    }

    public static void main(String[] args) {
        /*
            实验包装类的
         */
        int i=127;
//        Integer i1=new Integer(i);
//        Integer i2=new Integer(i);
        Integer i1=Integer.valueOf(i);
        Integer i2=Integer.valueOf(i);
        System.out.println(i1==i2);//若i1，i2是new出来的则是false，使用valueOf在一字节之内是true
        System.out.println(i1.equals(i2));//true

        /*
            包装类的方法
         */
        //1.查看int的最大值和最小值
        int max=Integer.MAX_VALUE;//2147483647
        int min=Integer.MIN_VALUE;//-2147483648

        short max_1=Short.MAX_VALUE;//32767
        double max_2=Double.MAX_VALUE;//1.7976931348623157E308

        //2.将字符串转换成数字parseInt
        //String line="a";//NumberFormatException
        //String line="123.123";////NumberFormatException
        String line="123";
        int d=Integer.parseInt(line);
        System.out.println(line);


        /*
            自动拆装箱：
         */
        int a =123;
        Integer i_1=a;
        //编译器自动将上述语句添加：Integer i_1=Integer.valueOf(a);将基本类型转换成

    }
}
