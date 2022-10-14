package 第1阶段._7_继承多态和抽象._4_抽象.动物和猫狗_抽象类多态;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        Cat c = (Cat)a; //这里c类继承a类, 可以强转
        c.eat();


        Animal b = new Dog();
        b.eat();
    }
}
