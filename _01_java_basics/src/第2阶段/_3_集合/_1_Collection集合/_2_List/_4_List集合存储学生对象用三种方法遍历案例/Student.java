package 第2阶段._3_集合._1_Collection集合._2_List._4_List集合存储学生对象用三种方法遍历案例;
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
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
