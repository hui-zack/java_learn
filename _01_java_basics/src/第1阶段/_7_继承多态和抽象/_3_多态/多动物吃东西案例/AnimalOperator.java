package 第1阶段._7_继承多态和抽象._3_多态.多动物吃东西案例;
/*
需求: 本类中的useAnimal(Animal a) 第一阶段.类和对象.方法, 当满足下面两个条件时, 可用来构成多态.
    (1)传入的是Animal子类的对象,
    (2)useAnimal中使用的方法已经被子类重写
例如: 参数为--> Cat c = new Cat()
    则实际传入: Animal c = new Cat()
*/

public class AnimalOperator {
    public void useAnimal(Animal a) {
        a.eat();
    }
}
