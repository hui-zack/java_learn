package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._4_线程控制常用三方法._3_线程控制setDaemon方法;

public class setDaemonTread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(super.getName() + ": " + i);
        }
    }

    public setDaemonTread() {
    }

    public setDaemonTread(String name) {
        super(name);
    }
}
