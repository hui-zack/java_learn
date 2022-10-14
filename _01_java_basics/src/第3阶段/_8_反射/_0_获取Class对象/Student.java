package 第3阶段._8_反射._0_获取Class对象;

public class Student {
    //成员变量 --> 1个私有, 一个默认, 一个公有
    private String name;
    int age;
    public String address;

    //构造方法 --> 一个私有, 一个默认, 两个公有
    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //成员方法 --> 一个私有, 四个公有

    private void show(String output) {
        System.out.println(output);
    }

    public void setName() {
        System.out.println("method");
    }

    public void method(String s) {
        System.out.println("method: " + s);
    }

    public String method(String s, int i) {
        return s + "," + i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
