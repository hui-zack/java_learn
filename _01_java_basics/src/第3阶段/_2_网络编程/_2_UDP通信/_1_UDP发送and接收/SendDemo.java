package 第3阶段._2_网络编程._2_UDP通信._1_UDP发送and接收;
//需求: 使用UDP发送数据
import java.io.IOException;
import java.net.*;
/*
思路:
    (1) 创建发送端的Socket对象
    (2) 创建数据包对象
    (3) 调用DatagramSocket对象的send(DatagramPacket p)发动数据
    (4) 关闭发送端
*/
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端对象 --> Socket
        DatagramSocket ds = new DatagramSocket();


        //创建数据报包对象
        byte[] bys = "hello, UDP, 我来了".getBytes();
        DatagramPacket p = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.0.101"), 8999);

        //发送端send数据报包
        ds.send(p);

        //关闭发送端
        //ds.close();
    }
}
