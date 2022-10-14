package 第2阶段._6_IO流._1_字节流._2_OutputStream底层字节流._3_字节流写数据追加写入;

import java.io.FileOutputStream;
import java.io.IOException;

// 需求: 使用构造方法public FileOutputStream(String name, boolean append) 实现文件追加写入
public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fosAppend.txt", true);

        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());      // String.getBytes(), 字符串转换为字节数组, 详见三种write方法
            fos.write("\n".getBytes());
        }

        fos.close();



    }
}
