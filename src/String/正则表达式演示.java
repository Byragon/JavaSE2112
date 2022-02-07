package String;

public class 正则表达式演示 {
    public static void main(String[] args) {
        //测试[]
        String reg0_1="\\d[0-255]";



        //测试\\w{n,m}
        String reg="\\w{8,}";//表示至少有8个英数_，最多不限制
        System.out.println("asdffggjidgdhig".matches(reg));
        System.out.println("asbfdj".matches(reg));
        System.out.println("______________".matches(reg));

        //测试\s
        String reg1="Hello\\s+World";
        System.out.println("Hello World!".matches(reg1));//false:!
        System.out.println("Hello    World".matches(reg1));//true:中间任意空格都可以

        //特殊字符转义
        //String reg3="www\.baidu\.com";---不合法
        // \.  \[  \?  \*  \+  \\ 凡是表示特殊含义的字符都需要转义
        //例如如果.不加\，则表示普通字符.而不是表示任意字符
        String reg3="www\\.baidu\\.com";//需要进行转义
        System.out.println("www.baidu.com".matches(reg3));
        System.out.println("www-baidu-com".matches(reg3));

        //检查正确的IPV4地址
        String reg4="\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        String reg4_1="\\d[0-255]\\.\\d[0-255]\\.\\d[0-255]\\.\\d[0-255]";//如何表示0-255这一范围呢
        System.out.println("192.168.1.1:"+"192.168.1.1".matches(reg4));
        System.out.println("192.168.1.1:"+"192.168.1.1".matches(reg4_1));

        //5.分组：将一组规则作为整体进行处理，例如上述的正则
        String reg5_1="\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        String reg5_2_1="\\(\\d{1,3}\\.\\)";
        String reg5_2_2="\\(\\d{1,3}\\.\\)\\{3}\\d{1,3}";//用括号表示一个整体，后接{3}表示重复三遍


    }
}
