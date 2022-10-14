package 第1阶段._9_接口.运动员和教练案例;

public abstract class Player extends Person{
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void learn();
}
