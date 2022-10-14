package 第3阶段._1_进程和线程._2_实现Runnable实现多线程._2_Runnable接口操作类实现多线程;

public class UseRunnable {
    public Runnable useRunnable(Runnable target) {          //返回Runnable对象
        target.run();
        return target;
    }
}
