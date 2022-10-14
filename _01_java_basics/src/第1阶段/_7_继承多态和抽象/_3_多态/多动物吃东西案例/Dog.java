package 第1阶段._7_继承多态和抽象._3_多态.多动物吃东西案例;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
