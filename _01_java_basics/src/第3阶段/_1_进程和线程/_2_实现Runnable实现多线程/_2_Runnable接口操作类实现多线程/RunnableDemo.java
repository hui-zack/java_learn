package 第3阶段._1_进程和线程._2_实现Runnable实现多线程._2_Runnable接口操作类实现多线程;

public class RunnableDemo {
    public static void main(String[] args) {
        UseRunnable my = new UseRunnable();

        Runnable my1 = my.useRunnable(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        });

        Thread t1 = new Thread(my1, "曹操");

        t1.start();
    }
}
