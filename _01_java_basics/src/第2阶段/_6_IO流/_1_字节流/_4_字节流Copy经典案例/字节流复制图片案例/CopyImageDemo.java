package 第2阶段._6_IO流._1_字节流._4_字节流Copy经典案例.字节流复制图片案例;
//需求: 使用字节流复制图片, 一次复制一个字节数组(该种方法同样可复制视频)
/*
思路:
    (1) 根据数据源创建字节输入流对象
    (2) 根据目的地创建字节输出流对象
    (3) 读写数据, 复制图片(一次读取一个字节数组, 一次写入一个字节数组)
    (4) 释放资源
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        //字节输入流对象
        FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\space\\imgData\\6786876.png");
        //字节输出流对象
        FileOutputStream fos = new FileOutputStream("image.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys)) !=  -1) {
            fos.write(bys, 0, len);
        }

        fis.close();
        fos.close();
    }
}
