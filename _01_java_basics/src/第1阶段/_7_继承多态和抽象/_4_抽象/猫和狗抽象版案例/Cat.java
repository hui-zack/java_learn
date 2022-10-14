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
public class Cat extends Animal{

    public Cat() {}
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
