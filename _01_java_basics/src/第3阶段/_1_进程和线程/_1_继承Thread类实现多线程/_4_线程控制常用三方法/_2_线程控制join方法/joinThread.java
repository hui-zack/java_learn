package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._4_线程控制常用三方法._2_线程控制join方法;

public class joinThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(super.getName() + ": " + i);
        }
    }

    public joinThread() {
    }

    public joinThread(String name) {
        super(name);
    }
}
