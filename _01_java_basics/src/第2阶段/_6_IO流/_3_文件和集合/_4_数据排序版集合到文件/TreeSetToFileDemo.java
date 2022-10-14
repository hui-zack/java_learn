package 第2阶段._6_IO流._3_文件和集合._4_数据排序版集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

//需求: 键盘录入5个学生信息(姓名, 语文成绩, 数学成绩, 英语成绩), 要求按照成绩总分从高到低写入文件
//  格式:姓名, 语文成绩, 数学成绩, 英语成绩 -->例如  林青霞, 98, 99, 100
/*
思路:
    (1) 定义学生类
    (2) 创建TreeSet集合, 通过比较器排序进行排序
    (3) 键盘录入学生数据
    (4) 创建学生对象, 把键盘录入的数据对应复制给学生对象的成员变量
    (5) 把学生对象添加到TreeSet集合
    (6) 创建字符缓冲输出流对象
    (7) 遍历集合得到每一个学生对象
    (8) 把学生对象的数据拼接成指定格式的字符串
    (9) 调用字符缓冲流对象的写数据方法
    (10) 释放资源
*/
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        //创建TreeSet集合, 并使用比较器从高到底排序
        TreeSet<Student> ts = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getChinese() - s1.getChinese();
                num = num == 0 ? s2.getMath() - s1.getMath() : num;
                num = num == 0 ? s2.getEnglish() - s1.getMath() : num;
                num = num == 0 ? s2.getName().compareTo(s1.getName()) : num;
                return num;
            }
        });

        //键盘录入学生信息, 并将学生类添加到treeSet集合
        System.out.print("请输入待录入的学生人数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("----第" + (i + 1) + "个学生----");
            System.out.print("姓名:");
            String name = sc.next();

            System.out.print("语文成绩:");
            int chinese = sc.nextInt();

            System.out.print("数学成绩:");
            int math = sc.nextInt();

            System.out.print("英语成绩:");
            int english = sc.nextInt();

            ts.add(new Student(name, chinese, math, english));
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("data\\score.txt"));
        StringBuilder sb = new StringBuilder();

        for (Student s : ts) {
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            bw.write(sb.toString());
            sb.setLength(0);
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
