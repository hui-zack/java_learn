package 第1阶段._7_继承多态和抽象._2_继承.phone和新phone;

public class NewPhone extends phone{

    @Override
    public void call (String name) {
        System.out.println("开启视频功能..");
        super.call(name);
    }
}
