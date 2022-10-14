package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._3_Client键盘_Server文件;
//需求: TCP发送接收案例
/*
要求:
    客户端来自键盘输入,当输入886时退出,
    服务端保存到文件
 */
import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.99", 8999);

        //键盘输入封装
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //TCP输出封装
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //缓冲字符流发送键盘输入数据
        String line1;
        while ((line1 = br.readLine()) != null) {
            if (line1.equals("886")) {
                break;
            }
            bw.write(line1);
            bw.newLine();
            bw.flush();
        }

        s.close();
    }
}
