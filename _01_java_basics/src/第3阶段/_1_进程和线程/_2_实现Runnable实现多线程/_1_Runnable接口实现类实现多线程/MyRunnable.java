package 第3阶段._1_进程和线程._2_实现Runnable实现多线程._1_Runnable接口实现类实现多线程;

public class MyRunnable implements Runnable {
    public MyRunnable() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
