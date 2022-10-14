package 第2阶段._3_集合._1_Collection集合._1_Collection.Collection存储学生对象并遍历案例;
//需求: 创建一个存储学生对象的集合, 存储三个学生对象, 使用程序实现在控制台遍历该集合
/*
思路:
    (1) 定义学生类
    (2) 创建Collection集合对象
    (3) 创建学生对象
    (4) 把学生对象添加到集合
    (5) 遍历集合(迭代器方式)
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
