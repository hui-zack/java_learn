package 第3阶段._4_接口组成更新._1_接口的默认方法_default关键字;

public interface Inter {
    void show1();
    void show2();
    default void show3(){
        System.out.println("null");
    };
}
