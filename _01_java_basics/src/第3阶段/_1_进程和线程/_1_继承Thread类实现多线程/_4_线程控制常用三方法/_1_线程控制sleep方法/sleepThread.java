package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._4_线程控制常用三方法._1_线程控制sleep方法;

public class sleepThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(super.getName() + ": " + i);
            try {
                this.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public sleepThread() {
    }

    public sleepThread(String name) {
        super(name);
    }
}
