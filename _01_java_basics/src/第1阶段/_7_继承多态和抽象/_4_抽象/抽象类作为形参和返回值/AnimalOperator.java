package 第1阶段._7_继承多态和抽象._4_抽象.抽象类作为形参和返回值;

public class AnimalOperator {
    //抽象类名作为形参
    public void useAnimal(Animal a) {
        a.eat();
    }

    //抽象类名作为返回值
    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }

}
