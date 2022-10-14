package 第1阶段._7_继承多态和抽象._4_抽象.猫和狗抽象版案例;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        Cat c = (Cat)a;
        c.setName("月牙");
        c.setAge(2);
        System.out.println(c.getName() + " " +  c.getAge());
        c.eat();

        Animal b = new Dog();
        Dog d = (Dog)b;

        d.eat();
    }
}
