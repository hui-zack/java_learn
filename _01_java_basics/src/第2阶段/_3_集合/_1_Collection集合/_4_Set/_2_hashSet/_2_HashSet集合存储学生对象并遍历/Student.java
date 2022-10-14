package 第2阶段._3_集合._1_Collection集合._4_Set._2_hashSet._2_HashSet集合存储学生对象并遍历;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
