package 第1阶段._10_内部类._2_成员内部类的使用;
//需求: 探究成员内部类中的showNum方法该如何去使用

public class Outer {
    private int num = 20;

    //成员内部类
    public class Inner{

        public void showNum() {
            System.out.println(num);
        }
    }

    //使用成员内部类
    public void uesInner() {
        Inner i = new Inner();
        i.showNum();
    }





}
