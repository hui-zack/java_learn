package 第1阶段._7_继承多态和抽象._3_多态.猫和狗多态版;


public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("狸花猫");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        System.out.println(a);

        a = new Cat("狸花猫", 6);
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
        System.out.println(a);

    }
}
