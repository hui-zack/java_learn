package 第1阶段._7_继承多态和抽象._4_抽象.猫和狗抽象版案例;
/*
需求:
    定义动物类:
        成员变量: 姓名, 年龄
        构造方法: 无参, 带参
        成员方法: get/set方法, 吃饭();
    定义猫类: (继承动物类)
        构造方法: 无参, 带参
        成员方法: 重写吃饭() {...}
    定义狗类: (继承动物类)
        构造方法: 无参, 带参
        成员方法: 重写吃饭() {...}

*/
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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

    public abstract  void eat();
}
