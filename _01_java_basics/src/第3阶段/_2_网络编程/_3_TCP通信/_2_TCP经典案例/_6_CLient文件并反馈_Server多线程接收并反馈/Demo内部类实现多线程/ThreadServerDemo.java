package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._6_CLient文件并反馈_Server多线程接收并反馈.Demo内部类实现多线程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServerDemo {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8999);
        while (true) {
            Socket s = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                        File file = new File("data\\LiBai.txt");
                        int count = 1;
                        while (file.exists()) {
                            file = new File("data\\LiBai[" + count + "].txt");
                            count++;
                        }
                        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                        String line;
                        while ((line = br.readLine()) != null) {
                            bw.write(line);
                            bw.newLine();
                            bw.flush();
                        }

                        s.shutdownInput();

                        //给出反馈
                        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                        bwServer.write("server receive file successful");
                        bwServer.newLine();
                        bwServer.flush();

                        //反馈结束标识


                        //释放资源
                        s.close();
                        bw.close();
                        bwServer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
