package 第2阶段._6_IO流._2_字符流._1_InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//需求: 创建InputStreamReader对象, 使用InputStreamReader的两种read()方法读取文件
/*
字节流读数据的两种read()方法:
    int read():
       一次读取一个字节
    int read(char[] chs):
       一次读取一个字节数组
*/
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("data\\osw.txt"), "GBK");

        // int read() 一次读取一个字节
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }

        // int read() 一次读取一个字节数组
        // 上面的运行下面的就不运行了
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.println();
            System.out.print(new String(chs, 0, len));
        }

        isr.close();
    }
}
