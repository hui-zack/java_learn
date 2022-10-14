package 第1阶段._8_包和修饰符.包;


// 导包案例
import 第1阶段._7_继承多态和抽象._2_继承.猫和狗案例.Dog;
public class demo {
    public static void main(String[] args) {
        Dog d =new Dog("丑丑", 4 );
        System.out.println(d.getName() + " " +  d.getAge() + "岁");
        Dog.lookHouse();
    }
}


