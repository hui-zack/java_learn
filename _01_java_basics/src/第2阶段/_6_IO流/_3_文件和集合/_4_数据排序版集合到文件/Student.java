package 第2阶段._6_IO流._3_文件和集合._4_数据排序版集合到文件;
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
    (9) 调用字符缓冲流对象的数据些方法
    (10) 释放资源
*/


public class Student {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        int sum = this.getChinese() + this.getMath() + this.getEnglish();
        return sum;
    }
}
