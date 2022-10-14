package 第1阶段._7_继承多态和抽象._3_多态.动物和猫;
/*
多态:
    同一个对象, 在不同时刻表现出来的不同形态
多态的前提和体现(同时具备):
    (1)有继承/实现关系
    (2)有方法重写
    (3)有父类引用指向子类对象
*/

public class Animal {
    public int age = 40;

    public void eat() {
        System.out.println("动物吃东西");
    }
}
