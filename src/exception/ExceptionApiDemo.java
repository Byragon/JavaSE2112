package exception;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        try{
            String str="abc";
            System.out.println(Integer.parseInt(str));
        }catch (Exception e){
            //该方法用来在控制台输出异常的堆栈信息，便于程序员debug
            e.printStackTrace();//提示报错

            String message=e.getMessage();//获取错误信息
            System.out.println(message);
        }
    }
}
