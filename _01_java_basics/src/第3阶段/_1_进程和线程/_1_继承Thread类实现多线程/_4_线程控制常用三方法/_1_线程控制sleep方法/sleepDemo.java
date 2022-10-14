package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._4_线程控制常用三方法._1_线程控制sleep方法;

//需求: 使用Tread类的void sleep(long mills)线程控制方法
public class sleepDemo {
    public static void main(String[] args) {
        sleepThread tt1 = new sleepThread("曹操");
        sleepThread tt2 = new sleepThread("刘备");
        sleepThread tt3 = new sleepThread("孙权");

        tt1.start();
        tt2.start();
        tt3.start();
    }
}
