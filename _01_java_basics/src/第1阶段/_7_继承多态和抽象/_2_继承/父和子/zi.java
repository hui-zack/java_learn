package 第1阶段._7_继承多态和抽象._2_继承.父和子;

public class zi extends fu {
    public int age = 10;

    public void show() {
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
