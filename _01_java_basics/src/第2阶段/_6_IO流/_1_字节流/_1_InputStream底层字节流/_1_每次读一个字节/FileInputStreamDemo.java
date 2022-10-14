package 第2阶段._6_IO流._1_字节流._1_InputStream底层字节流._1_每次读一个字节;
//需求: 使用字节输入流单字节读取fos.txt文件
/*
字节输入流标准单字节读取流程:
    int by;
    while ((by = fis.read()) != -1){    //-1表示无内容   fis.read()下次执行时,自动读取下一个字符
        System.out.print((char)by);
    }
*/
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo  {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        //单字节循环读取
        int by;
        while ((by = fis.read()) != -1){    //-1表示无内容   fis.read()下次执行时,自动读取下一个字符
            System.out.print((char)by);     //控制台单字节转码, 打印不出中文(除非保存为文件)
        }

        fis.close();
    }


    public static void allRight(){      //自己写的IO异常处理标准流程
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("fos.txt");     //读取不了汉字, 因为汉字是两个字节
            int by;
            while ((by = fis.read()) != -1) {
                System.out.print((char)by);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
