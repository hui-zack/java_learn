package 第2阶段._6_IO流._5_特殊操作流._1_标准输入输出流.System_In和System_Out;
//需求: 使用标准输入输出流实现类似Scanner的键盘输入功能
/*
标准输入流分析
    InputStream in = System.in;         //是一个字节流(二级超类)
    new InputStreamReader(System.in)    //转换为字符流
    new BufferedReader(new InputStreamReader(System.in));  //缓冲字符流
标准输出流分析
    PrintStream out = System.out;       //System.out本质是一个字节输出流
*/

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //实现Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个整数: ");
        String s = br.readLine();


        //System.out的本质是一个字节输出流
        PrintStream ps = System.out;
        ps.println(s);



    }
}
