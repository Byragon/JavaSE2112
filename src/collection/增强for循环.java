package collection;
/**
 *
 */
public class 增强for循环 {
    public static void main(String[] args) {
        String[] array={"one","two","three"};
        for(int i=0;i< array.length;i++){
            String s=(String)array[i];
            System.out.println(s);
        }

        for(String s:array){
            System.out.println(s);
        }
    }
}
