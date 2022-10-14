package 第2阶段._6_IO流._2_字符流._5_字符流Copy复制经典案例._1_字符流复制java文件;

import java.io.*;

//需求: 将一个java文件复制到桌面
/*
思路:
    根据数据源创建字符输入流对象
    根据目的地创建字符输出流对象
    读写数据, 复制文件
    释放资源
*/
public class Copy {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\user\\learn\\java\\java_basics\\src\\第二阶段\\IO流\\字节流\\OutputStream底层字节流\\字节流写数据异常标准处理\\tryCatchFinallyDemo.java"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\admin\\Desktop\\copy.java"), "GBK");


        int ch;
        while ((ch = isr.read()) != -1) {
            osw.write((char)ch);
        }

        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
            System.out.println(new String(chs, 0, len));
        }

        isr.close();
        osw.close();

    }
}
