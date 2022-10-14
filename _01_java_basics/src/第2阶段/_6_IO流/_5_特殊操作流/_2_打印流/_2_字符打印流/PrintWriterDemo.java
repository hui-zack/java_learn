package 第2阶段._6_IO流._5_特殊操作流._2_打印流._2_字符打印流;

import java.io.*;

//需求: 使用字符打印流PrintWriter的三个构造方法, 并使用其特有的Print()方法, Println()方法
/*
构造方法:
    PrintWriter(String fileName):
        使用指定的文件名创建一个新的PrintWriter
        无法自动执行刷新
    PrintWriter(Writer out, boolean autoFlush):
        使用Writer的子类创建一个新的PrintWriter
        可选择是否自动刷新 autoFlush选择为true
        autoFlush是一个boolean值:
            为真:
                println()  print()  format() 将自动刷新输出缓冲区
    PrintWriter(File file):

*/
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException{
        //PrintWriter(String fileName) 构造方法
        PrintWriter pw = new PrintWriter("data\\pw.txt");
        pw.println("hello\njava");
        pw.flush();
        pw.close();


        //PrintWriter(Writer out, boolean autoFlush) 构造方法
        PrintWriter pw1 = new PrintWriter(new FileWriter("data\\pw1.txt"), true);
        pw1.println("hello\njava");
        pw1.close();
        /*
            也可以这样创建PrintWriter对象:
                PrintWriter pw1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream("data\\pw1.txt")), true);
        */

        //PrintWriter(File file) 构造方法
        PrintWriter pw2 = new PrintWriter(new File("data\\fos.txt"));
        pw.println("hello\njava");
        pw.flush();
        pw.close();



    }
}
