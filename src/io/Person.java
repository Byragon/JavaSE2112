package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的序列化和反序列化操作
 * 对象序列化：将一个java对象按照其结构转换为一组字节的过程
 * 目的：如何将对象通过IO流进行传输
 */
public class Person implements Serializable {
    /*
        当一个类实现了可序列化接口的时，最好显示的定义下面的属性：serialVersionUID
        即：序列化版本号
        当对象输出流在进行对象对象序列化时，会查看是否有显示的定义版本号，如果没有则会根据当前类的版本号计算版本号
        （当前类（这里是person）的结构只要没有发生变化，那么无论何时序列化版本号始终不会变化，只要改变过，那么序列化版本号一定会发生改变）
        并将该版本号保存在序列化后的字节中。

        重点：
        当使用对象输入流反序列化时，对象输入流会检查要反序列化的对象和其对应的类（比如我们反序列化一个之前的Person对象）的版本号是否一致，如果
        不一致，就会抛出异常：java.io.InvalidClassException
        比如OOSDemo序列化一个Person对象并写入文件person.obj之后，我们在person上添加一个新的属性salary，此时person类发生了变化，那么再使用OISDemo
        反序列化person.obj文件中之前序列化的对象时，就会发生异常InvalidClassException（因为Person类改变了结构，版本号就不一致了）
        那如何解决呢？

        如果后期修改了类结构，又希望原来的对象还可以进行反序列化，则需要显示的定义出来序列化版本号
        这样一来，当一个对象序列化后，当前类结构改变后，只要版本号不改变，那么之前的对象仍然可以进行反序列化。
        此时对象输入流会采取兼容方式，即：能还原的属性都会进行还原，没有属性的则采用默认值
     */
    static final long serialVersionUID=1L;

    private String name;
    private int age;//
    private String gender;//性别
    private  transient String[] otherInfo;
//    private int salary;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
