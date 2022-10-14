package 第1阶段._10_内部类._3_局部内部类的使用;
//需求: 探究局部内部类的使用方法
public class Outer {
    private int num = 20;
    public void method() {

        //局部类
        class Inner {
            public void show() {
                System.out.println(num);
            }
        }

        //使用局部类
        Inner i = new Inner();
        i.show();
    }
}
