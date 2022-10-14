package 第1阶段._5_类和对象._1_定义和使用;
// 需求: 使用Student中的类变量和类方法

public class StudentDemo {
    public static void main(String[] args) {
        //实例化对象
        Student s1 = new Student();
        //使用类变量
        s1.name = "林青霞";
        s1.age = 20;
        System.out.println(s1.name + ", " + s1.age);
        //使用类方法
        s1.study();
        s1.doHomework();
    }

}
