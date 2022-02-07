package String;

public class RegDemo06 {
    public static void main(String[] args) {
        /**
         * 测试正则语法
         */
         String reg="Hello[1-6]";
         //被测试的字符串
        String s1="Hello1";
        String s2="Hello7";
        //测试
        System.out.println(s1.matches(reg));
        System.out.println(s2.matches(reg));

    }
}
