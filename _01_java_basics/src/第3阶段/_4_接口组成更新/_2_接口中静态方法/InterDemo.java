package 第3阶段._4_接口组成更新._2_接口中静态方法;

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();

        Inter.test();   //只能通过接口名调用, 无法通过对象或实现类名调用
    }
}
