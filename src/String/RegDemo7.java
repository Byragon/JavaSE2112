package String;

public class RegDemo7 {
    public static void main(String[] args) {
        /**
         * 测试用户名规则，由6个单词字符组成
         * -\在Java字符串中需要进行转义
         */
        String reg="\\w{6}";
        System.out.println(reg);

        System.out.println("Jerry1".matches(reg));
        System.out.println("Jerr-y".matches(reg));
        System.out.println("andy".matches(reg));

        //定义 被检查的字符串
    }
}
