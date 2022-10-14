package 第2阶段._6_IO流._2_字符流._5_字符流Copy复制经典案例._3_缓冲字符流复制文件;

import java.io.*;

//需求: 使用缓冲字符流复制java文件
public class BufferedCopyDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data\\LiBai.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("LiBai.txt"));

        int len;
        char[] chs = new char[1024];
        while ((len = br.read(chs)) != -1){
            bw.write(chs, 0, len);
            System.out.println(new String(chs, 0, len));
        }
        br.close();
        bw.close();
    }
}
