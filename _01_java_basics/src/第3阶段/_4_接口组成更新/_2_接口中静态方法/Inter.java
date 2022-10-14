package 第3阶段._4_接口组成更新._2_接口中静态方法;

public interface Inter {
    void show();

    default void method(){
        System.out.println("接口的默认方法被调用了");
    }

    static void test(){
        System.out.println("接口的静态方法被调用了");
    }
}
