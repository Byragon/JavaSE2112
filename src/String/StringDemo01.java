package String;
/**
 * 测试字符串的连接性能
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String str="";
        long t1=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            str=str+"A";
        }
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
