package 第1阶段._9_接口.接口多态;

public class Dog implements Jumpping {
    @Override
    public void jump() {
        System.out.println("狗也能跳高了");
    }
}
