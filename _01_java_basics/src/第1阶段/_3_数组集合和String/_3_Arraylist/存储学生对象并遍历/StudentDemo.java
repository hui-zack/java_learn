package 第1阶段._3_数组集合和String._3_Arraylist.存储学生对象并遍历;

import java.util.ArrayList;
import java.util.Scanner;

// 需求:创建一个存储学生对象的集合, 存储3个学生对象, 使用程序在控制台遍历该集合
//      学生的姓名和年龄来自于键盘输入
/*
*思路:
*   1.定义学生类, 为了键盘录入方便, 将学生类的成员变量都定义为String类型
*   2.创建集合对象
*   3.键盘录入学生对象所需的数据
*   4.创建学生对象, 把键盘录入的数据赋值给学生对象的成员变量
*   5.在集合中添加学生对象
*   6.遍历集合, 使用通用遍历格式
*
* */
public class StudentDemo {
    public static void main(String[] args) {
        //2.创建集合对象
        ArrayList<Student> array = new ArrayList<>();
        //使用三次方法

        for (int i=0; i<3; i++) {
            addStudent(array);
        }

        //遍历该集合
        for (int i = 0; i<3; i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + ","+ s.getAge());
        }

    }
    //功能, 键盘添加学生信息
    //参数: 集合(元素为Student) 返回值:void
    public static void addStudent(ArrayList<Student> array) {
        //3.键盘录入学生对象所需的数据,
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        //创建学生对象, 把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();  //学生对象
        s.setName(name);
        s.setage(age);

        //在集合中添加学生对象
        array.add(s);
    }




}
