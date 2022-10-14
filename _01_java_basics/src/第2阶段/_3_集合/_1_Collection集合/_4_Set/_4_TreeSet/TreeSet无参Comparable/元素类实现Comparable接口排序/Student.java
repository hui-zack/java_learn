package 第2阶段._3_集合._1_Collection集合._4_Set._4_TreeSet.TreeSet无参Comparable.元素类实现Comparable接口排序;
//需求: 存储学生对象并遍历, 创建TreeSet集合使用带参构造方法
//     要求: 按照年龄从小到大排序, 年龄相同时, 按照姓名的字母顺序排序

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
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }

}
