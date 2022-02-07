package String;

public class 字符串API_Split {
    public static void main(String[] args) {
        //Split劈开字符串：将一个字符串劈开为几个字符串
        //例如将“192.168.1.1”劈开为“192”“168”“1”“1”
        /**:使用
         * String[] arr=str.split(正则表达式)
         * 传入的参数正则表达式：用于找到劈开的位置，可以是一个字符.也可以是几个字符\.
         */
        String str="1,Tom,110,tom@baidu";
        String reg_1=",";//传入的正则表达式
        String[] ans1=str.split(reg_1);
        for(int i=0;i<ans1.length;i++){
            System.out.println(ans1[i]);
        }

        //升级难度
        String str1="1,    Tom, 110,tom@baidu";//逗号后有空格
        String reg_2=",\\s*";//*表示空格可以有多个，也可以没有
        String[] ans2_1=str.split(reg_1);
        for(int i=0;i<ans2_1.length;i++){//法一
            ans2_1[i].trim();
            System.out.println(ans2_1[i]);
        }
        String[] ans2=str.split(reg_2);
        for(int i=0;i<ans2.length;i++){//法二
            System.out.println(ans2[i]);
        }

        /**
         * 劈开IP地址
         */
        String ip="192.168.5.25";
        //String[] arr_3=ip.split(".");---一定要注意“.”需要转义
        String[] arr_3=ip.split("\\.");
        for (int i=0;i<arr_3.length;i++){
            System.out.println(arr_3[i]);
        }

        //劈开时候，会自动舍弃后面的空字符串
        String exp1="boo:and:foo";
        //“ oo      oo”



    }
}
