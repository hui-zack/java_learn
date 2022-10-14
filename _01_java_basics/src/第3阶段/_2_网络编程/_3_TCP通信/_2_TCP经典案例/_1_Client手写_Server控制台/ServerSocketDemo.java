package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._1_Client手写_Server控制台;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//需求: 客户端发送数据, 服务端接收数据, 若客户端接收数据成功, 反馈"数据已经收到"
/*
注意:
    Socket类中若使用while循环读取数据, 无法发送或接收反馈, 原因未知
*/
public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        //客户端接收数据
        ServerSocket ss = new ServerSocket(8999);
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        is.read(bys);

        System.out.println(new String(bys, 0, bys.length));


        //服务端给出反馈
        OutputStream os = s.getOutputStream();
        os.write("Server has get data".getBytes());
        //释放资源
        ss.close();
        s.close();


    }
}
