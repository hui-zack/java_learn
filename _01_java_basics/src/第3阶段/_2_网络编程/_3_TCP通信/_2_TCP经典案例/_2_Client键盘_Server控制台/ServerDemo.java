package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._2_Client键盘_Server控制台;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8999);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line;
        while ((line = br.readLine()) !=null){
            System.out.println(line);
        }

        ss.close();
    }
}
