package 第1阶段._7_继承多态和抽象._3_多态.转型案例;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        Cat c = (Cat)a;
        c.blood();
        c.eat();
        a.eat();


    }
}
