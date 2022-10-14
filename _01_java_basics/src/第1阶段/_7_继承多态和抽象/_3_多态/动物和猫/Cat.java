package 第1阶段._7_继承多态和抽象._3_多态.动物和猫;

public class Cat extends Animal{
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫做迷藏");
    }
}
