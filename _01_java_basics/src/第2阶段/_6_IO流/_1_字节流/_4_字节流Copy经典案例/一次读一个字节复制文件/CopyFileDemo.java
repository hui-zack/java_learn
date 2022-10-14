package 第2阶段._6_IO流._1_字节流._4_字节流Copy经典案例.一次读一个字节复制文件;
//需求: 将Libai.txt内容复制到桌面
/*
思路:
    (1) 根据数据源创建字节输入流
    (2) 根据目的地创建字节输出流
    (3) 读写数据,复制文本文件(一次读取一个字节, 一次写入一个字节)
    (4) 释放资源
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\space\\11.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\output1.jpg");

        //单字节复制
        int by;
        while ((by = fis.read()) != -1){
            fos.write(by);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
