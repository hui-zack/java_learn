package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._1_Client手写_Server控制台;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//需求: 客户端发送数据, 服务端接收数据, 若客户端接收数据成功, 反馈"数据已经收到"
/*
注意:
    Socket类中若使用while循环读取数据, 无法发送或接收反馈, 因为:
        while ((len = is.read(bys)) != -1)中的-1是文件中的判断条件, 这里不行!!!!!
*/
public class SocketDemo {
    public static void main(String[] args) throws IOException {
        //客户端发送数据
        Socket s = new Socket("192.168.0.199", 8999);

        OutputStream os = s.getOutputStream();
        os.write("hello, TCP, 我来了!".getBytes());

        //客户端接收反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        is.read(bys);
        System.out.println(new String(bys, 0, bys.length));

/*      //经过验证, 反馈的数据
        while ((len = is.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
            System.out.println("111");
        }
*/
        //释放资源
        s.close();

    }
}
