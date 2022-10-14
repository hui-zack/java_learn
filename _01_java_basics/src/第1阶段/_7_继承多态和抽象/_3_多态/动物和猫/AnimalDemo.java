package 第1阶段._7_继承多态和抽象._3_多态.动物和猫;
//多态动物的猫状态
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();       //这样的现象我们称之为多态

        System.out.println(a.age);

        a.eat();

    }
}
