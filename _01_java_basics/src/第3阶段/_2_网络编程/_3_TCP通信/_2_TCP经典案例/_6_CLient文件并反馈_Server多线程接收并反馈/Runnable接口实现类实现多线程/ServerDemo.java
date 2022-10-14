package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._6_CLient文件并反馈_Server多线程接收并反馈.Runnable接口实现类实现多线程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8999);

        while (true) {
            Socket s = ss.accept();
            new Thread(new ServerThred(s)).start();
        }

    }
}
