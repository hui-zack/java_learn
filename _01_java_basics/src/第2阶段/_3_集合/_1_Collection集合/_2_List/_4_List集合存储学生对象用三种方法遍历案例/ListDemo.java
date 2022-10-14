package 第2阶段._3_集合._1_Collection集合._2_List._4_List集合存储学生对象用三种方法遍历案例;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//需求: 创建一个存储学生对象的集合, 存储三个学生对象, 使用程序实现在控制台遍历该集合(使用三种方式)
/*
思路:
    (1)定义学生类
    (2)创建List集合对象
    (3)创建学生对象
    (4)把学生添加到集合
    (5)遍历集合
        迭代器: 集合特有的遍历方式
        普通for: 带有索引的遍历方式
        增强for: 最方便的遍历方式
*/
public class ListDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张辉", 22);
        Student s2 = new Student("曹飞鱼", 22);
        Student s3 = new Student("吴楠", 21);

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器遍历:
        ListIterator<Student> lit = list.listIterator();
        while (lit.hasNext()) {
            Student s = lit.next();
            System.out.println(s);
        }

        System.out.println("------");
        //普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------");
        //增强for循环遍历
        for (Student s : list) {
            System.out.println(s);
        }



    }
}
