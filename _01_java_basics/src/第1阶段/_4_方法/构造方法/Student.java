package 第1阶段._4_方法.构造方法;
//需求: 书写构造方法
/*
* 实例化对象时, 会自动执行构造方法
* 可定义多个构造方法,
* */
public class Student {
    String name;
    int age;

    //构造方法
    public Student() {}     //无参构造方法, 在实例化对象时初始化类变量
    public Student(String name) {
        this.name = name;
    }
    public Student(int age) {
        this.age = age;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //
    public void show() {
        System.out.println(name + ":" + age);
    }
}
