package 第3阶段._3_Lambda表达式._5_Lambda表达式的注意事项;

public class LambdaDemo {
    public static void main(String[] args) {
        //使用Lambda必须要有接口, 并且要求接口中有且只有一个抽象方法
        useShowable( () -> System.out.println("java"));

        //使用Lambda必须要有上下文环境, 明确被重写的是哪个接口
        Runnable r = () -> System.out.println("java world");
        Thread t = new Thread(r, "run1");
        t.start();

        new Thread( () -> System.out.println("java world1")).start();


    }
    private static void useShowable(Showable s) {
        s.show();
    }

}
