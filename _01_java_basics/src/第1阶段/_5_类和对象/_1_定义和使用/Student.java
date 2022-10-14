package 第1阶段._5_类和对象._1_定义和使用;
// 需求:定义一个学生类
/*
(1)
    类名: Student
    成员变量:name, age
    成员方法:study(), doHomework()
(2)
    定义一个学生测试类
    类名:StudentDemo  //因为要做测似, 因此有main方法
*/

public class Student {
    String name;
    int age;

    public void study() {
        System.out.println("好好学习, 天天向上");
    }
    public void doHomework() {
        System.out.println("键盘敲烂, 月薪过完");
    }
}
