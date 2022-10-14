package 第1阶段._7_继承多态和抽象._2_继承.猫和狗案例;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat("月牙", 3);
        System.out.println(c.getName() + " " + c.getAge() + "岁");
        c.catchMouse();

        Dog d = new Dog("小不点", 3);
        System.out.println(d.getName() + " " + d.getAge() + "岁");
        d.lookHouse();
    }
}
