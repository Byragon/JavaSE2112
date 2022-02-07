package String;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        /*
        测试StringBuilder的连接性能
         */
        StringBuilder buf=new StringBuilder();
        long t1=System.currentTimeMillis();
        for (int i=0;i<50000;i++){
            buf.append("A");
        }
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
