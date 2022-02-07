package binary;

import java.util.ArrayList;

public class 二进制的运算 {
    public static void main(String[] args) {
        //分析以下语句
        String s1="123abc";

        String s3="123";
        String s4=s3+"abc";
        System.out.println(s4==s1);//false


        String s5="123"+"abc";
        System.out.println(s1==s5);//true

    }
}
