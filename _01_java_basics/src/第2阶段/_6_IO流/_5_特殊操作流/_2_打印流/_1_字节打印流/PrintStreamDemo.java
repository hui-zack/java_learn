package 第2阶段._6_IO流._5_特殊操作流._2_打印流._1_字节打印流;
//需求: 使用PrintStream(String fileName)创建字节打印流对象, 并使用其父类的write()方法和特有的print()方法

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("data\\打印流.txt");

        ps.write(97);
        ps.write("\n".getBytes());
        
    }
}
