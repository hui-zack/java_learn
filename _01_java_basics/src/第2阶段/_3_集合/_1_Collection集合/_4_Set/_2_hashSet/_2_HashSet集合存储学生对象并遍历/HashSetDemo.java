package 第2阶段._3_集合._1_Collection集合._4_Set._2_hashSet._2_HashSet集合存储学生对象并遍历;

import java.util.HashSet;

//需求: 创建一个存储学生对象的集合, 存储多个学生对象, 使用程序实现再控制台遍历该集合
//      要求学生对象的成员变量值相同, 就认为是同一个对象(再学生类中重写hashCode()和equals()方法)
/*
思路:
    (1)定义学生类(重写hashCode()和equals()方法)
    (2)创建HashSet集合
    (3)创建学生对象
    (4)把学生添加到集合
    (5)遍历集合(增强for)

*/
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("张辉", 22);
        Student s2 = new Student("曹飞雨", 22);
        Student s3 = new Student("吴楠", 22);
        Student s4 = new Student("张辉", 22);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //增强for循环遍历集合
        for (Student s : hs) {
            System.out.println(s);
        }

    }
}
