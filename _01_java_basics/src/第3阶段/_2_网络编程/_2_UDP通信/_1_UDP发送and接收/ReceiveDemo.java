package 第3阶段._2_网络编程._2_UDP通信._1_UDP发送and接收;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //接收端Socket对象
        DatagramSocket ds = new DatagramSocket(8999);

        //空数据报包
        byte[] bys = new byte[1024];
        DatagramPacket p = new DatagramPacket(bys, bys.length);

        //空数据报包接收数据
        ds.receive(p);


        //解析收据输出
        System.out.println(new String(p.getData(), 0, p.getLength()));
        /*
        p.getData()方法, 返回数据缓冲区中的字节数组
        */

        ds.close();

    }
}
