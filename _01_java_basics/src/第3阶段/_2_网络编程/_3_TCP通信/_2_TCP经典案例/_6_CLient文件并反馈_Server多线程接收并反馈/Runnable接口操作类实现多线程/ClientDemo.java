package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._6_CLient文件并反馈_Server多线程接收并反馈.Runnable接口操作类实现多线程;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket s = new Socket("192.168.1.68", 9776);

            BufferedReader br = new BufferedReader(new FileReader("data\\LiBai.txt"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            s.shutdownOutput();


            //接收服务器反馈
            BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
            line = brClient.readLine();
            System.out.println(line);

            s.close();
            br.close();
            brClient.close();


            s.close();
            br.close();
            brClient.close();
        }
    }
}
