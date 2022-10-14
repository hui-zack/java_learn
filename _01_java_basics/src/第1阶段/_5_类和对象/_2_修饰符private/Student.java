package 第1阶段._5_类和对象._2_修饰符private;
//需求: 学生类

public class Student {
    //类变量
    String name;
    private int age;

    //类方法
    public void setAge(int a) {
        if (a > 120 || a < 0 ) {
            System.out.println("年龄错误");
        } else {
            age = a;
        }
    }
    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ", " + age);
    }
}
