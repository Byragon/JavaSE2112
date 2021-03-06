package io;
/**
 * 流 Java标准的io操作
 * 使用流我们可以以同一种方式读写一切设备
 *
 * Java将流按照读写功能分为：
 * 输入流：用于从外界读取数据到程序中（负责读操作）
 * 输出流：用于将数据从程序中写出到外界（负责写操作）
 *
 * java.io.InputStream是所有字节输入流的超类
 * java.io.OutputStream是所有字节输出流的超类
 * 他们规定了所有流都必须具备的读或者写操作。因此无论读写什么设备的流，读写方法都是一致的
 *
 * Java将流分为节点流和处理流两大类：
 * 节点流：又称低级流，是实际连接程序和另一端的“管道”，负责实际读或者写的流。
 * 读写操作一定是建立在节点流的基础上进行的。
 *
 * 处理流：又称高级流，不能独立存在，必须连接在其他流上。目的是当数据流经当前处理流时可以对数据进行某种加工处理的操作，简化我们对数据的相关操作
 *
 * 文件流：
 * 文件流是一对低级流，用于读写文件。
 *
 * 文件流和RandomAccessFile都是用来读写文件数据的，虽然读写方法定义都相同（read,write方法）但是底层实际的读写形式完全不同
 * 文件流是基于java标准IO对文件进行数据读写的，而流的读写形式为【顺序读写】
 * 即：读或写操作只能顺序向后，不可以回退。
 * RAF是基于指针的随机读写形式，可以操作指针对文件任意位置进行读写。
 * 所以文件流做不到对文件任意位置编辑操作，但是基于流连接可以轻松完成RAF不容易办到的事
 *
 * 流连接：使用流读写的时候，串联若干的高级流，并最终串联到某一个低级流对某设备进行读写操作的过程。
 * 流连接也是io的精髓。
 * @author Byragon
 *
 */
public class FOSDemo {

}
