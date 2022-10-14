package 第3阶段._3_Lambda表达式._1_体验Lambda表达式;
//需求: 使用lambda表达式代替内部类实现Runnable接口, 实现多线程
public class LambdaDemo {
    public static void main(String[] args) {
        new Thread( () -> {
            System.out.println("多线程程序启动");
        }).start();
    }
}
