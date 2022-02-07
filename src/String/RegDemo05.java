package String;

public class RegDemo05 {
    public static void main(String[] args) {
        /*
        测试正则表达式
         */
        //定义正则表达式
        String rule="Hello World";
        //定义被检测的字符串
        String s1="HelLoKitty";
        String s2="Hello World";
        //检测s1是否符和规则
        boolean b1=s1.matches(rule);
        //检测s2是否符合规则
        boolean b2=s2.matches(rule);
        System.out.println(b1);
        System.out.println(b2);
    }
}


