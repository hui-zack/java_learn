package 第1阶段._7_继承多态和抽象._3_多态.猫和狗多态版;

public class Dog extends Animal{
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
