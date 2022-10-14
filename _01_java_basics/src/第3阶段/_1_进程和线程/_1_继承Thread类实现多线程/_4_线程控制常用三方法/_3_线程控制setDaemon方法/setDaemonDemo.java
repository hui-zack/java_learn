package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._4_线程控制常用三方法._3_线程控制setDaemon方法;

public class setDaemonDemo {
    public static void main(String[] args) {
        setDaemonTread sdt1 = new setDaemonTread("关羽");
        setDaemonTread sdt2 = new setDaemonTread("张飞");

        //设置主进程名为: 刘备
        Thread.currentThread().setName("刘备");

        //将关羽和张飞设置为守护进程
        sdt1.setDaemon(true);
        sdt2.setDaemon(true);

        sdt1.start();
        sdt2.start();


        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
