package binary;

public class 补码 {
    public static void main(String[] args) {
        /**
         * 负数的编码
         * 实验：输出-200到0的二进制编码--补码
         * 随机选取两个数，手动计算10进制数
         * 利用Java程序计算结果
         */
//        for(int i=-200;i<0;i++){
//            System.out.println(Integer.toBinaryString(i));
//        }

        /**
         * 验证补码的互补对称现象-n~n+1
         */
        System.out.println(Integer.toBinaryString(54));
        System.out.println(Integer.toBinaryString(-54));

        /**
         * 掩码运算
         */
        int n=0x179d5d9e;
        int m1=0xf;//4位掩码
        int m2=0x3f;//6位掩码
        int m3=0xff;//8位掩码
        int k1=n&m1;
        int k2=n&m2;
        int k3=n&m3;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(k1));
        System.out.println(Integer.toBinaryString(k2));
        System.out.println(Integer.toBinaryString(k3));


        //右移位运算
        int n1=0x67d78f6d;//对应二进制为：0110 0111 1101 0111 1000 1111 0110 1101
        int m=n>>>1;//0011 0011 1110 1011 1100 0111 1011 0110
        System.out.println("n1:"+Integer.toBinaryString(n1));
        System.out.println("m"+Integer.toBinaryString(m));

        /**
         * 利用上述把n1拆开为3个8位
         */
        int b1=(n1>>>24)&0xff;
        System.out.println("b1"+Integer.toBinaryString(b1));
        int b2=(n1>>>16)&0xff;
        System.out.println("b2"+Integer.toBinaryString(b2));
        int b3=(n1>>>8)&0xff;
        System.out.println("b3"+Integer.toBinaryString(b3));


        int a1=0xdd;//1101 1101
        System.out.println(Integer.toBinaryString(a1));
        int a2=0x9d00;//1001 1101 0000 0000
        System.out.println(Integer.toBinaryString(a2));
        int k=a1 | a2;
        System.out.println(Integer.toBinaryString(k));





    }
}
