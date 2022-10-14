package 第3阶段._6_函数式接口._1_使用函数式接口._3_函数式接口概述;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface mi = () -> System.out.println("java world");
        mi.show();
    }
}
