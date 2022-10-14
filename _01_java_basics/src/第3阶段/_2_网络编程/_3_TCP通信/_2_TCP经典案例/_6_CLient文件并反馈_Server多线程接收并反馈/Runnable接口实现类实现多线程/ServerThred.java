package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._6_CLient文件并反馈_Server多线程接收并反馈.Runnable接口实现类实现多线程;

import java.io.*;
import java.net.Socket;

public class ServerThred implements Runnable {
    private Socket s;

    public ServerThred(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            //TCP输出流
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            //保存为本地不重名文件
            int count = 0;
            File file = new File("data\\LiBai.txt");
            while (file.exists()) {
                count++;
                file = new File("data\\LiBai[" + count + "].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //接收结束标记
            s.shutdownInput();

            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("Server receive data successful");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            s.close();
            bw.close();
            bwServer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
