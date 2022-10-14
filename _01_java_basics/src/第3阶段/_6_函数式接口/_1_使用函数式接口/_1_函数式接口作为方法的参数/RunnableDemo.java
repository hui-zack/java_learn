package 第3阶段._6_函数式接口._1_使用函数式接口._1_函数式接口作为方法的参数;
/*
需求:
    定义一个类(RunnableDemo), 在类中提供两个方法
        StartThread(Runnable r)
        main
*/
public class RunnableDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            startThread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "多线程启动");
                }
            });
        }

        for (int i = 0; i < 10000; i++) {
            startThread(() -> System.out.println(Thread.currentThread().getName() + "多线程启动"));
        }
    }
    private static void startThread(Runnable r) {
        new Thread(r).start();
    }

}
