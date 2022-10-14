package 第2阶段._6_IO流._5_特殊操作流._3_序列化对象和重构对象._2_对象反序列化流;

import 第2阶段._6_IO流._5_特殊操作流._3_序列化对象和重构对象._1_对象序列化流.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//需求: 使用ObjectInputStream创建对象反序列化对象, 读取ObjectOutputStream先前存储的, 包含有Student实例化对象信息的Student.txt文件
/*
构造方法:
    ObjectInputStream(InputStream in):
        创建一个指定InputStream的ObjectInputStream对象
反序列化对象的方法:
    Object readObject():
        从ObjectInputStream读取一个对象

*/
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data\\Student.txt"));

        Student s = (Student) ois.readObject();        //这里可能有ClassNotFoundException异常, 需要抛出
        System.out.println(s.getName() + " " + s.getAge());

    }
}
