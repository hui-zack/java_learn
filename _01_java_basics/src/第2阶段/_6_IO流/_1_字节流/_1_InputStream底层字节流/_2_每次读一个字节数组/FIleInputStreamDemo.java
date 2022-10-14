package 第2阶段._6_IO流._1_字节流._1_InputStream底层字节流._2_每次读一个字节数组;

import java.io.FileInputStream;
import java.io.IOException;

//需求: 使用FileInputStream的read(byte b) 和 String的构造方法String(byte b, int offset, int length)
//      读取文件Libai.txt的内容

/*
字节输入流字节数组读数据标准流程:
    byte[] bys = new byte[1024];
    int len;
    while ((len = fis.read(bys)) != -1) {
        System.out.print(new String(bys, 0, len));
    }

    fis.close()
*/
public class FIleInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("LiBai.txt");

        //字节输入流字符数组读数据
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        fis.close();
    }
}
