package 第3阶段._2_网络编程._3_TCP通信._1_TCP发送and接收;
//需求: 使用TCP发送数据

/*
思路:
    (1) 创建客户端的Socket对象
    (2) 获取输出流, 写数据
    (3) 释放资源
*/
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCP_SendDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.229", 9776);

        OutputStream os = s.getOutputStream();
        os.write("TCP 我来了!!".getBytes());

        s.close();
    }
}
