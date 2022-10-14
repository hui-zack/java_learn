package 第2阶段._6_IO流._5_特殊操作流._2_打印流._3_打印流复制文件;

import java.io.*;

//需求: 使用打印流复制文件到桌面
/*
要求:
    使用字节打印流复制文件到桌面
    使用字符打印流复制文件到桌面

*/
public class CopyFileDemo {
    public static void main(String[] args) throws IOException{
        //使用缓冲字符流复制文件到桌面
        BufferedReader br = new BufferedReader(new FileReader("data\\LiBai.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\LiBai.txt"));


        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();

        //使用字节打印流复制文件到桌面
        BufferedReader br1 = new BufferedReader(new FileReader("data\\LiBai.txt"));
        PrintWriter bw1 = new PrintWriter(new FileWriter("C:\\Users\\admin\\Desktop\\LiBai.txt"), true);

        String line1;
        while ((line1 = br1.readLine()) != null){
            bw1.println(line1);
        }

        br1.close();
        bw1.close();

    }
}
