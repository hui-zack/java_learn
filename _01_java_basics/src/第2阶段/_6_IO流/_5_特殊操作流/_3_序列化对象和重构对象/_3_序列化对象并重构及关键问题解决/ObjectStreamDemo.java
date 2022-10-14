package 第2阶段._6_IO流._5_特殊操作流._3_序列化对象和重构对象._3_序列化对象并重构及关键问题解决;

import java.io.*;

// 需求: 编写对象序列化方法writeObject(), 对象重构方法readObject(), 并按要求解决序列化和重构中的三个关键问题
/*
(1) 序列化一个对象后, 如果修改了对象的类文件, 读取对象将会抛出InvalidClassException异常
    InvalidClassException:
        若待读取的对象所属类被修改,导致serialVersionUID改变, 将抛出该异常
        若待读取的对象所属的类没有无参构造方法, 将抛出该异常
        若待读取的对象所属该类具有未知的数据类型, 将抛出该异常
(2) 待序列化类加一个变量serialVersionIUD, 赋予固定值将不会触发InvalidClassException异常
        private static final long serialVersionUID = 42L;
            必须是Static final long 修饰的变量, 建议private
(3) 使用transient关键字修饰不准备参与序列化的变量, 使其不参与序列化
        格式为: private transient int age;
        transient只能修饰变量;
        被修饰的变量统一存储值为0, 0.0, null等
*/
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writeObject();
        readObject();
    }

    public static void writeObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data\\Student.txt"));
        Student s = new Student("张辉", 22);
        oos.writeObject(s);
        oos.close();
    }

    public static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data\\Student.txt"));
        Student s = (Student) ois.readObject();
        System.out.println(s);
    }
}
