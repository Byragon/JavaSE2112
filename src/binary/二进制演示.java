package binary;

public class 二进制演示 {
    /**
     * 查看二进制的2进制存储情况
     * Java编译时期，将数字编译成2进制，
     * 运行期间存储的是2进制数
     * 输出变量时候，Java利用api方法，将二进制转换为10进制字符串
     * 利用ValueOf方法进行转换:ValueOf的本质就是把底层二进制转换成人能看懂的十进制
     */
    public static void main(String[] args) {
        int n=50;//其实存储在内部是用二进制存储的，n=110010
        System.out.println(n);//输出的时候自动调用ValueOf方法再转换为十进制打印到屏幕上
        System.out.println(Integer.toBinaryString(50));//将110010原原本本输出出来
        for(int i=0;i<200;i++){
            System.out.println(Integer.toBinaryString(i));
        }
    }



}
