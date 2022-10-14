package 第2阶段._6_IO流._2_字符流._5_字符流Copy复制经典案例._2_FileReader和FileWriter复制java文件;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//需求: 使用FileReader和FileWriter把一个java文件复制到桌面
/*
思路:
    转化流的名字比较长, 而我们常见的操作都是按照本地默认编码实现
    为了简化代码, 轮换流提供了
*/
public class CopyDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\user\\learn\\java\\java_basics\\src\\第二阶段\\IO流\\字节流\\OutputStream底层字节流\\字节流写数据异常标准处理\\tryCatchFinallyDemo.java");
        FileWriter fw = new FileWriter("data\\LiBai.txt");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }
    }
}
