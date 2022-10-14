package 第2阶段._3_集合._1_Collection集合._2_List._3_List集合存储学生对象案例;
//需求: 创建一个存储学生对象的集合, 存储三个学生对象, 使用程序实现在控制台遍历该集合
/*
思路:
    (1)定义学生类
    (2)创建List集合
    (3)创建学生对象
    (4)把学生对象添加到接好
    (5)遍历集合(迭代器遍历, for循环遍历)

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
