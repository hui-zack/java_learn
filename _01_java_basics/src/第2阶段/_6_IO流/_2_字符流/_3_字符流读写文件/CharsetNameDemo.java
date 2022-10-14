package 第2阶段._6_IO流._2_字符流._3_字符流读写文件;
// 需求:

import java.io.*;

public class CharsetNameDemo {
    public static void main(String[] args) throws IOException {

        //字符串写入
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("osw1.txt"));
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("osw2.txt"), "GBK");

        osw1.write("张辉");
        osw2.write("张辉");

        osw1.close();
        osw2.close();

        //字符串读取
        InputStreamReader osr1 = new InputStreamReader(new FileInputStream("osw1.txt"));
        InputStreamReader osr2 = new InputStreamReader(new FileInputStream("osw2.txt"), "GBK");

        //一次读一个字节数组
        char[] chs = new char[1024];
        int len;
        while ((len = osr2.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        System.out.println("\n----------");

        //一次读一个字节
        int ch;
        while ((ch = osr1.read()) != -1) {
            System.out.print((char)ch);
        }



    }
}
