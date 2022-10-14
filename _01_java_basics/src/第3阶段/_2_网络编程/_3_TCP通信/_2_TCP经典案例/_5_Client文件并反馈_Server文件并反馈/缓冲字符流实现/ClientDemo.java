package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._5_Client文件并反馈_Server文件并反馈.缓冲字符流实现;
//需求: Client读取文件发送到Server,  Server接收后保存为文件并给出接收成功的反馈
/*
要求:
    封装为缓冲字符流
*/
import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.191", 8999);

        //读取文件发送至Server
        BufferedReader br = new BufferedReader(new FileReader("data\\LiBai.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //数据输出结束标记
        s.shutdownOutput();

        //接收Server反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        line = brClient.readLine();
        System.out.println(line);

    }
}
