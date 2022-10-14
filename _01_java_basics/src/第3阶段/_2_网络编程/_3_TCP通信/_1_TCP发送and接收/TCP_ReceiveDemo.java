package 第3阶段._2_网络编程._3_TCP通信._1_TCP发送and接收;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_ReceiveDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9776);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();

/*        byte[] bys = new byte[1024];
        int len;
        while ((len = is.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        */

        byte[] bys = new byte[1024];
        is.read(bys);
        int len = bys.length;
        System.out.println(new String(bys, 0, len));

        s.close();
        ss.close();
    }
}
