package 第1阶段._10_内部类._1_Outer和Inter;
/*
内部类访问特点:
    内部类可以直接访问外部类的成员, 包括私有
    外部类要访问内部类成员, 必须创建对象
*/
public class Outer {
    private int num = 10;

    public void useInnerShow() {
        //Inner.show(); //报错
        Inner in = new Inner();
        in.show();
    }


    //内部类Inner
    public class Inner{


        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }

}
