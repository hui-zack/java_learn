package 第2阶段._3_集合._1_Collection集合._3_ArrayList和LinkedList._2_ArrayLIst储存学生对象三种方式遍历案例;

import java.util.ArrayList;
import java.util.ListIterator;

//需求: 创建一个存储学生对象的集合, 存储三个学生对象, 使用程序实现在控制台遍历该集合(使用三种方式)
/*
思路:
    (1)定义学生类
    (2)创建ArrayList集合对象
    (3)创建学生对象
    (4)把学生添加到集合
    (5)遍历集合
        迭代器: 集合特有的遍历方式
        普通for: 带有索引的遍历方式
        增强for: 最方便的遍历方式
*/
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();

        Student s1 = new Student("张辉", 22);
        Student s2 = new Student("曹飞雨", 22);
        Student s3 = new Student("吴楠", 21);

        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);

        //迭代器遍历
        ListIterator<Student> lit = stuList.listIterator();
        while (lit.hasNext()) {
            Student s = lit.next();
            System.out.println(s);
        }

        //for循环遍历
        System.out.println();
        for (int i = 0; i < stuList.size(); i++) {
            Student s = stuList.get(i);
            System.out.println(s);
        }

        //增强for循环遍历
        System.out.println();
        for (Student s : stuList) {
            System.out.println(s);
        }
    }
}
