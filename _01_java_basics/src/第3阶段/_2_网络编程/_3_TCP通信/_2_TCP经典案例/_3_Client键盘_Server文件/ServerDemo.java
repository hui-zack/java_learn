package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._3_Client键盘_Server文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8999);

        Socket s = ss.accept();
        //TCP输入流封装
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //文件输出流封装
        BufferedWriter bw = new BufferedWriter(new FileWriter("data\\TCP2.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        ss.close();
        bw.close();
    }
}
