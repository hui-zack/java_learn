package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._2_设置和获取线程名;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

}
