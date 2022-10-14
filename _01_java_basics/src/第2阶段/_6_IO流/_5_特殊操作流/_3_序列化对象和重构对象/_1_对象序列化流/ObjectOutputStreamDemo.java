package 第2阶段._6_IO流._5_特殊操作流._3_序列化对象和重构对象._1_对象序列化流;
// 需求: 使用对象序列化流, 将学生对象存储到文件中
/*
构造方法:
    ObjectOutputStream(OutputStream out):
        创建一个写入指定OutputStream的ObjectOutputStream对象
成员方法:
    void writeObject(Object obj):
        将指定的对象写入ObjectOutputStream
注意:
    一个对象想要被序列化, 该对象所属的类必须是实现了Serializable接口
*/


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //对象的序列化流创建对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data\\Student.txt"));

        Student s = new Student("张辉", 22);

        //writeObject(Object o)写入对象数据
        oos.writeObject(s);
    }

}
