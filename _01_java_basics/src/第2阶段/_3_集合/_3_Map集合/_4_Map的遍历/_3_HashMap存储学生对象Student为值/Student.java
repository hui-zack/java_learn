package 第2阶段._3_集合._3_Map集合._4_Map的遍历._3_HashMap存储学生对象Student为值;
//需求: 创建一个HashMap集合, 存储学生的学号和学生对象, 并遍历
/*
思路:
    (1) 定义学生类
    (2) 创建HashMap集合对象
    (3) 创建学生对象
    (4) 把学生的学号和学生对象添加到集合
    (5) 遍历集合:
        KeySet遍历
        entrySet遍历
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
