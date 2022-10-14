package 第2阶段._6_IO流._1_字节流._2_OutputStream底层字节流._4_字节流写数据异常标准处理;

import java.io.FileOutputStream;
import java.io.IOException;

//需求: 使用FileOutputDemo在文件fos.txt写数据, 并使用try...catch...finally处理IO异常
public class tryCatchFinallyDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;            //指针初始化为null, 这样
        try {                                   //try...catch...finally... 处理FileNotFoundException
            fos = new FileOutputStream("fos.txt");      //这里有文件未发现异常
            fos.write("hello".getBytes());                    //这里有IO异常
        } catch (IOException e){                //这里处理了两个异常, IOException是FileNotFoundException的子类,
            e.printStackTrace();                //打印异常详情, 但程序绕过try继续向下执行
        } finally {
            if (fos != null) {                               //fos指针非空时运行
                try {
                    fos.close();
                    /* 这里有三个异常
                          (1) 若11行fos文件不存在, 则new后不执行, fos便为空指针, 通过 if(fos != null)处理
                          (2) fos文件位发现异常
                          (3) close()方法的IO异常
                    */
                } catch (IOException e) {      //这里处理两个异常
                    e.printStackTrace();
                }
            }
        }
    }
}