package 第2阶段._6_IO流._1_字节流._4_字节流Copy经典案例.四种方式复制视频案例;


import java.io.*;

//需求: 四种方式实现复制视频, 并记录每种方式复制所用的时间
/*
    (1) 基本字节流一次读写一个字节           965ms
    (2) 基本字节流一次读写一个字节数组        2ms
    (3) 字节缓冲流一次读写一个字节           12ms
    (4) 字节缓冲流一次读写一个字节数组        2ms

*/
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        String inputDir = "C:\\Users\\admin\\Desktop\\space\\11.jpg";

        method1(inputDir, "C:\\Users\\admin\\Desktop\\output1.jpg");
        method2(inputDir, "C:\\Users\\admin\\Desktop\\output2.jpg");
        method3(inputDir, "C:\\Users\\admin\\Desktop\\output3.jpg");
        method4(inputDir, "C:\\Users\\admin\\Desktop\\output4.jpg");


    }
    //基本字节流一次读写一个字节
    public static void method1(String input, String output) throws IOException {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output);

        int by;

        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fis.close();
        fos.close();
        long endTime = System.currentTimeMillis();
        System.out.println("耗时: " + (endTime - startTime) + "ms");
    }
    //基本字节流一次读写一个字节数组
    public static void method2(String input, String output) throws IOException {
        long startTime = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output);

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fis.close();
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("耗时: " + (endTime - startTime) + "ms");
    }

    //字节缓冲流一次读写一个字节
    public static void method3(String input, String output) throws IOException {
        long startTime = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bis.close();
        bos.close();

        long endTime = System.currentTimeMillis();

        System.out.println("耗时: " + (endTime - startTime) + "ms");
    }

    //字节缓冲流一次读写一个字节数组
    public static void method4(String input, String output) throws IOException {
        long startTime = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bis.close();
        bos.close();

        long endTime = System.currentTimeMillis();

        System.out.println("耗时: " + (endTime - startTime) + "ms");
    }

}
