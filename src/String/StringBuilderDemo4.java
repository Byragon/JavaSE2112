package String;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        /*
        测试StringBuilder方法

         */
        StringBuilder buf=new StringBuilder();
        buf.append("A")
                .append("A")
                .append("A")
                .append("B")
                .insert(1,"C")
                .delete(2,4);//删除方法
        //一般情况下StringBuilder都需要转换为String
        //StringBuilder 提供了toString方法，可以将StringBuilder转换为String
        String str=buf.toString();
        System.out.println(str);
    }
}
