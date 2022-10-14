package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._5_Client文件并反馈_Server文件并反馈.缓冲字节流实现;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//需求: Client读取文件发送到Server,  Server接收后保存为文件并给出接收成功的反馈
/*
要求:
    封装为缓冲字节流实现
*/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9776);
        Socket s = ss.accept();

        //接受数据并保存为文件
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test_image_123.jpg"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) > 0) {
            System.out.println(new String(bys, 0,len));
            bos.write(bys, 0, len);
            bos.flush();
        }

        //接受结束
        s.shutdownInput();

        //给出成功接受反馈
        BufferedOutputStream bosServer = new BufferedOutputStream(s.getOutputStream());
        bosServer.write("Server receive data successful!".getBytes());
        bosServer.flush();
        System.out.println("11");
        //反馈结束
        s.shutdownOutput();

        //释放资源
        ss.close();
        bos.close();
        bosServer.close();

    }
}
