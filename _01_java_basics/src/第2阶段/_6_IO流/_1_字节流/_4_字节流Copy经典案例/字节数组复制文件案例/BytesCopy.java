package 第2阶段._6_IO流._1_字节流._4_字节流Copy经典案例.字节数组复制文件案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BytesCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("LiBai.txt");
        FileOutputStream fos = new FileOutputStream("LiBai.txt");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();
    }
}
