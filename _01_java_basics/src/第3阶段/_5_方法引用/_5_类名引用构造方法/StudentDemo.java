package 第3阶段._5_方法引用._5_类名引用构造方法;
/*
需求:
    定义一个类(Student), 里面有两个成员变量(name, age)
        并提供无参和有参构造方法, 里面定义一个抽象方法
    定义一个接口(StudentBuilder), 里面定义一个抽象方法
        Student build(String name, int age)
    定义一个测试类(StudentDemo), 在测试类中提供两个方法
        useStudentBuilder(StudentBuilder sb)
        main, main中调用useStudentBuilder方法
*/
public class StudentDemo {
    public static void main(String[] args) {
        //Lambda表达式实现StudentBuilder接口
        Student s1 = useStudentBuilder((name, age) -> new Student(name, age));

        //类名引用StudentDemo实现StudentBuilder接口
        Student s2 = useStudentBuilder(Student::new);

        System.out.println(s1.toString() + s1.hashCode() + "\n" + s2.toString() + s2.hashCode());

    }
    private static Student useStudentBuilder(StudentBuilder sb) {
        return sb.build("张辉", 22);
    }
}
