package 第3阶段._1_进程和线程._2_实现Runnable实现多线程._1_Runnable接口实现类实现多线程;

public class RunnableDemo {

    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();

        Thread t1 = new Thread(my, "康熙");
        Thread t2 = new Thread(my, "四阿哥");
        Thread t3 = new Thread(my, "八阿哥");

        t1.start();
        t2.start();
        t3.start();
    }


}
