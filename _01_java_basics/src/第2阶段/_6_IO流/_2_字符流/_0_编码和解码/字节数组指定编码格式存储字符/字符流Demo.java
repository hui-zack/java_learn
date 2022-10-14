package 第2阶段._6_IO流._2_字符流._0_编码和解码.字节数组指定编码格式存储字符;

import java.io.IOException;
import java.util.Arrays;

//需求:
public class 字符流Demo {
    public static void main(String[] args) throws IOException {
        String s = "汉字";

        byte[] bys = s.getBytes("UTF-8");   //获取字符串的底层字节数组

        System.out.println(Arrays.toString(bys));
    }
}
