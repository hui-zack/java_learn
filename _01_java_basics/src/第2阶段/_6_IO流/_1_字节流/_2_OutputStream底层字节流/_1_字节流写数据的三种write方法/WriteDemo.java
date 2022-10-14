package 第2阶段._6_IO流._1_字节流._2_OutputStream底层字节流._1_字节流写数据的三种write方法;

import java.io.FileOutputStream;
import java.io.IOException;

//需求: 使用FileOutputStream的三种write方法, 将数据写入fos.txt文件
/*
    void write(int b):
        将指定的字节写入此文件输出流
    void write(byte[] b):
        将字节数组b写入字节输出流, 一次写一个字节数组
    void write(byte[] b, int off, int len):
        将字节数组下标off开始, 长度为len的数据写入字节输出流
*/
public class WriteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");


        byte[] byt = "abcde123 ".getBytes();

        //遍历字节数组
        for (Byte b : byt) {
            System.out.println(b);
        }
        fos.write(97);
        fos.write(byt);
        fos.write(byt, 1, byt.length - 1);

        fos.close();
    }
}
