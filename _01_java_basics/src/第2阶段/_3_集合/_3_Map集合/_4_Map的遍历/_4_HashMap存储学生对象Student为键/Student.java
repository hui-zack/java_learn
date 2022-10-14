package 第2阶段._3_集合._3_Map集合._4_Map的遍历._4_HashMap存储学生对象Student为键;
//需求: 创建一个HashMap集合, 键是学生对象, 值是居住地, 创建多个兼职对元素, 并遍历
/*
思路:
    (1) 定义学生类, 重写hashCode()和equals()方法
    (2) 创建HashMap集合对象
    (3) 创建学生对象
    (4) 把学生添加到集合
    (5) 遍历集合:
        keySet遍历
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
