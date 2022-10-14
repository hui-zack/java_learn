package 第1阶段._9_接口.猫和狗案例;
//需求:对猫和狗进行训练, 他们就可以跳高了, 这里加入了调高功能呢, 请采用抽象类和接口来实现猫狗案例, 并再测试类中进行测试
/*
思路:
(1)定义接口(jumpping):
    成员方法: 调高()
(2)定义抽象类(Animal):
    成员变量:姓名, 年龄
    构造方法:无参, 带参
    成员方法:get/set
(3)定义具体猫类(Cat):
    构造方法:无参, 带参
    成员方法: 重写吃饭, 重写调
(4)定义具体狗类(Dog):
    构造方法:无参, 带参
    成员方法: 重写吃饭, 重写跳高
(5)定义测试类(AnimalDemo):
    写代码测试
*/
public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫在跳高");
    }
}
