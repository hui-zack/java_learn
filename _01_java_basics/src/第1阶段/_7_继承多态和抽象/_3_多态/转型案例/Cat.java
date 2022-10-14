package 第1阶段._7_继承多态和抽象._3_多态.转型案例;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫玩游戏");
    }
}
