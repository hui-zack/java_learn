package 第2阶段._6_IO流._2_字符流._2_OutputStreamWriter.OutputStreamWriter的五种write方法;
//需求: 使用OutputStream创建字符流对象, 并使用五种write()方法写入数据
/*
构造方法:
    OutputStreamWriter(OutputStream out)
        创建一个使用默认字符编码的OutputStreamWriter对象
物种Write方法:
    void write(int c):
            写一个字符
    void write(char[] chs):
        写一个字符数组
    void write(char[] chs, int off, int len):
        写一个字符数组的一部分
    void write(String str):
        写一个字符串
    void write(String str, int off, int len):
        写一个字符串的一部分

*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("data\\osw.txt", true), "GBK");

        //void write(int c)
        osw.write(97);
        osw.flush();

        //void write(char[] chs):


        //void write(char[] chs):
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
        osw.write(chs);
        //void write(char[] chs, int off, int len):
        osw.write(chs, 0, chs.length);

        //void write(String str):
        osw.write("张辉");

        //void write(String str, int off, int len):
        osw.write("我要当黑客", 0, 5);

        osw.close();
    }
}
