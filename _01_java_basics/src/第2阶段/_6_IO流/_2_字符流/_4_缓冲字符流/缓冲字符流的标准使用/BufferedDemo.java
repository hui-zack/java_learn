package 第2阶段._6_IO流._2_字符流._4_缓冲字符流.缓冲字符流的标准使用;

import java.io.*;

//需求: 使用字符缓冲流的特有功能, 完成字符缓冲流读写数据
/*
字符缓冲流的特有功能:
    BufferedWriter:
        void newLine(): 相当于换行符, 根据操作系统自动添加系统
    BufferedReader:
        public String readLine():
            一次读一行数据, 但不包含换行符等终止字符
            若到达流的结尾, 返回null
*/
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        //写数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("data\\bw.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("hello java" + i);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        //读数据
        BufferedReader br = new BufferedReader(new FileReader("data\\bw.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
