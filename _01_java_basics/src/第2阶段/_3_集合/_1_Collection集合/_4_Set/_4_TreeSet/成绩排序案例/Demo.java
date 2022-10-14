package 第2阶段._3_集合._1_Collection集合._4_Set._4_TreeSet.成绩排序案例;
// 需求: 用TreeSet集合存储多个学生信息(姓名, 语文成绩, 数学成绩), 并遍历该集合
//      要求:按照总分从高到低出现
/*
思路:
    1. 定义学生类
    2. 创建TreeSet集合对象, 通过比较器进行排序
    3. 创建学生对象
    4. 把学生对象添加到集合
    5. 遍历集合
*/

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        //Comparable实现比较
        /*
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("张辉", 89, 84);
        Student s2 = new Student("安晓峰", 76,75);
        Student s3 = new Student("曹飞雨", 87,89);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student s : ts) {
            System.out.println(s);
        }
        */

        //Comparator实现比较
        TreeSet<Student> ts1 = new TreeSet<>(new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getSum_score() - s2.getSum_score();
                int num2 = num == 0 ? s1.getChinese_score() - s2.getChinese_score() : num ;
                int num3 = num2 == 0? s1.getMath_score() - s2.getMath_score() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;

                return -num4;
            }
        });
        Student s4 = new Student("张辉", 89, 84);
        Student s5 = new Student("安晓峰", 76,75);
        Student s6 = new Student("曹飞雨", 87,89);

        ts1.add(s4);
        ts1.add(s5);
        ts1.add(s6);

        for (Student s : ts1) {
            System.out.println(s);
        }
    }
}
