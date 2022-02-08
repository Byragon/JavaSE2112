package exception;
/**
 * 语法：
 */
public class TryCatchDemo {
    public static void main(String[] args) {

        System.out.println("程序开始了");
        //这里会出现空指针异常，虚拟机会实例化空指针异常实例 并在这里抛出
        try {
            String str = "12333";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
            System.out.println("!!!上面有句子发生异常，该句不执行");
        }catch (StringIndexOutOfBoundsException|NullPointerException e){
            System.out.println("出现了字符串或者下标越界异常");
        }catch (Exception e){
            System.out.println("反正就是出了个错！");
        }

        System.out.println("程序结束了");
    }
}
