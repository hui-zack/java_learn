package 第2阶段._6_IO流._2_字符流._0_编码和解码.String的编码和解码;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//需求: 创建一个字符串"中国", 使用GBK编码存储和解码打印
/*
编码:
    byte[] getBytes():
        使用平台默认的字符集编码表将String编码为字节, 存储到返回的字节数组中
    byte[] getBytes(String charsetName):
        使用指定的字符集和编码表将String编码为字节, 存储到返回的字节数组中
解码:
    String(byte[] bytes):
        使用平台默认的字符集和编码表, 解码指定的字节数组来构建新的String
    String(byte[] bytes):
        使用指定的字符集和编码表, 将字节数组解码为新的String
*/
public class GBKDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";

        //编码
        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));

        //解码
        System.out.println(new String(bys, "GBK"));

    }
}
