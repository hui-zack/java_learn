package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._1_继承Thread实现多线程;

public class MyThread extends Thread {
    private int num;

    @Override
    public void run() {
        for (int i = 0; i<100; i++) {
            System.out.println(getName() + ": " + i);
            System.out.println(num);
        }
    }
}
