package 第2阶段._3_集合._2_Collections工具类.ArrayList存储学生对象并排序案例.Comparable实现;
//需求: 创建一个ArrayList集合, 存储学生对象, 使用Collection对ArrayList进行排序
//      要求: 按照年龄大到小进行排序, 年龄相同时, 按住奥姓名的字母顺序进行排序
/*
    (1) 创建学生对象
    (2) 创建ArrayList对象
    (3) 创建集合对象
    (4) 把学生条件到集合
    (5) 使用Collections对ArrayList集合配许
    (6) 遍历集合
*/
public class Student implements Comparable<Student> {
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
    public int compareTo(Student s) {
        int num = this.age - s.age;
        num = num == 0 ? this.name.compareTo(s.name) : num;
        return num;
    }
}
