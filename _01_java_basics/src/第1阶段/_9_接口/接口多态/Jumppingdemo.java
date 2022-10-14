package 第1阶段._9_接口.接口多态;
// 将接口认为是抽象父类
public class Jumppingdemo {
    public static void main(String[] args) {
        Jumpping j = new Cat() ;
        j.jump();

        Jumpping h = new Dog();
        h.jump();
    }
}
