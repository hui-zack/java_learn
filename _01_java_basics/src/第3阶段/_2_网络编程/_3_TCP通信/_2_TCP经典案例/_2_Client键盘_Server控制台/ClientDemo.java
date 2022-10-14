package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._2_Client键盘_Server控制台;
//需求: Socket来自键盘输入, 输入886退出, ServerSocket输出到控制台

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.10.9.99", 8999);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            if(line.equals("886")){
                break;
            }

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        s.close();
    }
}
