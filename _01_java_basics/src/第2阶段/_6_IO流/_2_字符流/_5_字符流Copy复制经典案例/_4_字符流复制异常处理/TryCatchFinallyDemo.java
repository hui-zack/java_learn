package 第2阶段._6_IO流._2_字符流._5_字符流Copy复制经典案例._4_字符流复制异常处理;

import java.io.*;

//需求: 编写复制文件异常的 -> 标准处理方法, JDK7, 和JDK9的异常处理方法
/*
    standard() --> 文件复制异常的标准处理流程
    JDK7       --> 自动释放资源 无需throws  推荐
    JDK9       --> 自动释放资源 需要throws
*/
public class TryCatchFinallyDemo {
    public static void main(String[] args) {


    }

    public void JDK9() throws IOException {     //自动释放资源
        BufferedWriter bw = new BufferedWriter(new FileWriter("data\\LiBai.txt"));
        BufferedReader br = new BufferedReader(new FileReader("Libai.txt"));
        try (br; bw) {
            char[] chs = new char[1024];
            int len;
            while ((len = br.read(chs)) != -1) {
                bw.write(chs, 0, len);
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void JDK7() {                        //自动释放资源
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("data\\LiBai.txt"));
            BufferedReader br = new BufferedReader(new FileReader("Libai.txt"));) {
            char[] chs = new char[1024];
            int len;
            while ((len = br.read(chs)) != -1) {
                bw.write(chs, 0, len);
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void standard(){
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            bw = new BufferedWriter(new FileWriter("data\\LiBai.txt"));
            br = new BufferedReader(new FileReader("Libai.txt"));
            char[] chs = new char[1024];
            int len;
            while ((len = br.read(chs)) != -1) {
                bw.write(chs, 0, len);
                bw.flush();
            }
        } catch (IOException e) {       //处理IO异常
            e.printStackTrace();
        } finally {
            if (bw != null) {           //处理空指针异常
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    br.close();         //处理IO异常
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
