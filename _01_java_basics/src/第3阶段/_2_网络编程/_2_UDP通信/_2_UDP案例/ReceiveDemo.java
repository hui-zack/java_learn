package 第3阶段._2_网络编程._2_UDP通信._2_UDP案例;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8999);

        while (true) {
            //空数据包
            byte[] bys = new byte[1024];
            DatagramPacket p = new DatagramPacket(bys, bys.length);

            //接收数据包
            ds.receive(p);
            System.out.println(new String(p.getData(), 0, p.getLength()));
        }
    }
}
