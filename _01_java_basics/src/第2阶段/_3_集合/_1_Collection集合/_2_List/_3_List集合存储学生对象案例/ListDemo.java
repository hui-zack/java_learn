package 第2阶段._3_集合._1_Collection集合._2_List._3_List集合存储学生对象案例;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//需求: 创建一个存储学生对象的集合, 存储三个学生对象, 使用程序实现在控制台遍历该集合
/*
思路:
    (1)定义学生类
    (2)创建List集合
    (3)创建学生对象
    (4)把学生对象添加到接好
    (5)遍历集合(迭代器遍历, for循环遍历)

*/
public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student("张辉", 22);
        Student s2 = new Student("曹飞雨", 22);
        Student s3 = new Student("吴楠", 21);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }

        System.out.println("------");

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s);
        }

    }
}
