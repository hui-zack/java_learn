package 第3阶段._4_接口组成更新._3_接口的私有方法;

public interface Inter {
    default void show1(){
        show("show1");
    }

    default void show2(){
        method("show2");
    }

    private void show(String s) {
        System.out.println(s + "开始运行");
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
        System.out.println("s结束运行");
    }

    static void method1(){
        method("method1");
    }

    static void method2(){
        method("method2");
    }

    private static void method(String s) {
        System.out.println(s + "开始运行");
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
        System.out.println("s结束运行");
    };
}
