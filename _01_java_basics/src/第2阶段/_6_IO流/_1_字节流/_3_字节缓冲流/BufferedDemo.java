package 第2阶段._6_IO流._1_字节流._3_字节缓冲流;

import java.io.*;

//使用字节缓冲输入流和字节缓冲输出流, 复制LiBai.txt到桌面
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
/*
        FileInputStream fis = new FileInputStream("LiBai.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
*/
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("LiBai.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\admin\\Desktop\\诗仙李白.txt"));

        //字符数组复制
        byte[] bys = new byte[1024];

        int len;
        while ((len = bis.read(bys)) != -1){
            System.out.println(new String(bys, 0, len));
            bos.write(bys, 0, len);
        }

        bis.close();
        bos.close();

/*
        //单字节复制
        int by;
        while ((by = bis.read()) != -1) {
            System.out.println((char)by);
            bos.write(by);
        }

        bis.close();
        bos.close();
*/

    }
}
