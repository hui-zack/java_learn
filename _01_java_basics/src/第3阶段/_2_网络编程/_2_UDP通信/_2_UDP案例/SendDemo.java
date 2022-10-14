package 第3阶段._2_网络编程._2_UDP通信._2_UDP案例;
//需求: 使用UDP发送并接收数据,
/*
要求:
    发送的数据来自键盘录入, 知道输入的数据是886, 发送的数据结束
    接收端使用while循环, 一直接收数据
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //发送端
        DatagramSocket ds = new DatagramSocket();

        //标准输入流实现Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //缓冲区读取输入流readline
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("886")){
                break;
            }

            //实数据包
            byte[] bys = line.getBytes();
            DatagramPacket p = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.0.101"), 8999);

            //发送数据包
            ds.send(p);
        }

        ds.close();
    }
}
