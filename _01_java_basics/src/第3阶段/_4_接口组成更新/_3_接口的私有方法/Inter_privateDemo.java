package 第3阶段._4_接口组成更新._3_接口的私有方法;

public class Inter_privateDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show1();
        System.out.println("------");
        i.show1();

        Inter.method1();
        System.out.println("------");
        Inter.method2();
    }
}
