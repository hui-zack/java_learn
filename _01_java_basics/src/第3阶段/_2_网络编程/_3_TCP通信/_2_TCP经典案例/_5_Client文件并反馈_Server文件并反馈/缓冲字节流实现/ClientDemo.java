package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._5_Client文件并反馈_Server文件并反馈.缓冲字节流实现;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

//需求: Client读取文件发送到Server,  Server接收后保存为文件并给出接收成功的反馈
/*
要求:
    封装为缓冲字节流实现
*/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.238", 9776);

        //从文件读取数据并发送至客户端
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data\\test_image_1.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
            bos.flush();
        }
        //数据发送输出流结束提示符
        s.shutdownOutput();

        //接受Server反馈
        BufferedInputStream bisClient = new BufferedInputStream(s.getInputStream());
        System.out.println(new String(bys, 0, bisClient.read(bys)));
        //接受反馈结束标记
        s.shutdownInput();


        //释放资源
        s.close();
        bis.close();
        bisClient.close();
    }
}
