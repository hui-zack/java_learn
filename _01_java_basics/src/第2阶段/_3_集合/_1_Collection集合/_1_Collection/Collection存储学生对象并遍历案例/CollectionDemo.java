package 第2阶段._3_集合._1_Collection集合._1_Collection.Collection存储学生对象并遍历案例;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//需求: 创建一个存储学生对象的集合, 存储三个学生对象, 使用程序实现在控制台遍历该集合
/*
思路:
    (1) 定义学生类
    (2) 创建Collection集合对象
    (3) 创建学生对象
    (4) 把学生对象添加到集合
    (5) 遍历集合(迭代器方式)
*/
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();


        Student s1 = new Student("张辉", 16);
        Student s2 = new Student("曹飞雨", 16);
        Student s3 = new Student("吴楠", 15);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s1);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println(c);

   }
}
