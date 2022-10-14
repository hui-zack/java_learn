package 第2阶段._6_IO流._2_字符流._4_缓冲字符流.缓冲字符流读写文件;
// 需求: 使用缓存字符流BufferedReader和BufferedWriter读写文件


import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("data\\LiBai.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("LiBai.txt"));

        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1){
            bw.write(chs, 0, len);
            System.out.println(new String(chs, 0, len));
        }

        br.close();
        bw.close();
    }
}
