package 第2阶段._6_IO流._1_字节流._2_OutputStream底层字节流._2_字节流写数据覆盖写入;

import java.io.FileOutputStream;
import java.io.IOException;

//需求: 使用构造方法Public FileOutputStream(String name) 实现文件覆盖写入

public class Demo {
    public static void main(String[] args) throws IOException {
        //覆盖写入
        FileOutputStream fos = new FileOutputStream("fos.txt");
        /*
        创建fos对象实际上执行了三步:
            (1) 调用系统功能创建了文件
            (2) 创建了字节输出流对象
            (3) 将字节输出流对象指向文件
        */

        fos.write(97);    //ASCII码 -> a

        fos.close();         //关闭文件输出流并释放与此相关联的任何系统资源

    }
}
