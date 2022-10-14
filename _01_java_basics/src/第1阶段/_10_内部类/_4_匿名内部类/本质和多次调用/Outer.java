package 第1阶段._10_内部类._4_匿名内部类.本质和多次调用;
/*
前提:
    存在一个类或接口
    这里的类可以是具体类也可以是抽象类
特点:
    匿名内部类必须实现多有
格式:
    new 类名或接口名() {
        实现方法;
    };
本质:
    是一个继承了该类/实现了该接口的子类匿名对象
    是一个实例化对象(实例化对像的本质是继承了原来的类, 但不能使用多态)
*/
public class Outer {
    public void method() {
        //匿名内部类
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
    }
}
