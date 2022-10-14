package 第1阶段._7_继承多态和抽象._4_抽象.抽象类作为形参和返回值;
//需求: 使用操作类中的useAnimal方法
public class AnimalDemo {
    public static void main(String[] args) {
        //目的: 测试抽象Animal类作为形参
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);
        /*
        执行流程:
            (1)useAnimal方法中的形参是(Animal a), 传入的是Cat c, 相当于执行了Animal a =new Cat c; 多态
            (2)cat 继承了 抽象Animal类, 并重写了eat(), 所以跑的是cat的eat()第一阶段.类和对象.方法
        */

        //目的: 测试抽象类作为返回值:
        AnimalOperator ao1 = new AnimalOperator();
        Animal a = ao1.getAnimal();
        a.eat();
        /*
        执行流程:
            (1)操作类的getAnimal方法, 执行了Animal的cat多态, 返回Animal类型的cat态对象
            (2)所以用 Animal a 接受后, a.eat()执行了cat的猫吃鱼方法
        */
    }
}
