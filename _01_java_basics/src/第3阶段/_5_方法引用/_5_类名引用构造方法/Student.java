package 第3阶段._5_方法引用._5_类名引用构造方法;
/*
需求:
    定义一个类(Student), 里面有两个成员变量(name, age)
        并提供无参和有参构造方法, 里面定义一个抽象方法
    定义一个接口(StudentBuilder), 里面定义一个抽象方法
        Student build(String name, int age)
    定义一个测试类(StudentDemo), 在测试类中提供两个方法
        useStudentBuilder(StudentBuilder s)
        main, main中调用useStudentBuilder方法
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
