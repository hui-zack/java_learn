package 第2阶段._6_IO流._5_特殊操作流._4_properties集合._3_Properties结合IO流存储读取键值对;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//需求: 创建Properties对象, 使用加载字符流的store(Writer Writer)方法, 和load(Reader reader)方法存储和读取键值对
/*
Properties结合IO流方法:
    Properties结合字节流:
        Void load(InputStream in):
            从字节输入流中读取属性列表(键值对列表)
        Void Store(OutputStream out, String comments):
            将字节输出流OutputStream加载到Properties流中, 以适合load(InputStream in)方法读取的格式写入输出字节流
    Properties结合字符流:
        void load(Reader reader):
            从字符输入流中读取属性列表(键值对列表)
        void store(Writer writer, String comments):
            将字符输出流Writer加载到Properties流中, 以适合load(Writer writer)方法读取的格式写入字符输出流

*/
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.setProperty("张辉", "24");
        prop.setProperty("曹飞雨", "23");
        prop.setProperty("吴楠", "23");

        FileWriter fw = new FileWriter("data\\prop.txt", true);

        prop.store(fw, "Student message");       //集合数据存储到文件, 字符串为标识

        fw.write("#aa");


        prop.load(new FileReader("data\\Prop.txt"));                  //文件解析到集合
        System.out.println(prop.toString());

        prop.clone();
    }
}
