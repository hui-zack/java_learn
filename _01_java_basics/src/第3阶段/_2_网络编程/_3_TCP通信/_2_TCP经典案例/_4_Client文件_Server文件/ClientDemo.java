package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._4_Client文件_Server文件;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10000);

        BufferedReader br = new BufferedReader(new FileReader("data\\LiBai.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));



        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        System.out.println("send end");
        s.close();
        br.close();
    }
}
