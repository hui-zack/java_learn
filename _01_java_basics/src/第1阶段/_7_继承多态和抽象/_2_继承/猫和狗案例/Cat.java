package 第1阶段._7_继承多态和抽象._2_继承.猫和狗案例;
/*
思路:
(1)定义动物类
    成员变量: 姓名, 年龄
    构造方法: 无参, 带参
(2)定义猫类:
    构造方法: 无参, 带参
    成员方法: 抓老鼠()
(3)定义狗类:
    构造方法: 无参, 带参
    成员方法: 看门()
(4)定义测试类(AnimalDemo), 写测试代码
*/

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public static void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
