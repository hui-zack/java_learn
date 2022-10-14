package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._5_Client文件并反馈_Server文件并反馈.缓冲字符流实现;
//需求: Client读取文件发送到Server,  Server接收后保存为文件并给出接收成功的反馈
/*
要求:
    封装为缓冲字符流
*/
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket( 9776);
        Socket s = ss.accept();

        //接收数据写入文件
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("data\\LiBaiCopy.txt"));

        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出数据接收成功反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("Server receive data successful");
        bwServer.newLine();
        bwServer.flush();
        //输出结束标记
        s.shutdownOutput();

        //释放资源
        ss.close();
        bw.close();
        bwServer.close();

    }
}
