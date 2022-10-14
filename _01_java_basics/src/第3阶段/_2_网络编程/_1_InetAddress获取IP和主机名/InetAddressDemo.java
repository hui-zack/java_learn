package 第3阶段._2_网络编程._1_InetAddress获取IP和主机名;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getByName("192.168.43.50");
        System.out.println(host.getHostAddress());
        System.out.println(host.getHostName());
    }
}
