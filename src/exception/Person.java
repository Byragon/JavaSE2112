package exception;

/**
 * 该类用来测试异常类的抛出
 */
public class Person {
    private  int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        //在这里设置抛出异常
        if(age<0||age>100){
            throw new RuntimeException("年龄不合法！");
        }
        this.age = age;
    }






}
