package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._4_线程控制常用三方法._2_线程控制join方法;



//需求: 使用Tread类的void join()线程控制方法

/*
void join():
    等待此线程全执行完毕(死亡),
    占据全部CPU时间片
*/

public class joinDemo {
    public static void main(String[] args) {
        joinThread jt1 = new joinThread("康熙");
        joinThread jt2 = new joinThread("四阿哥");
        joinThread jt3 = new joinThread("八阿哥");

        jt1.start();
        try {
            jt1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jt2.start();
        jt3.start();
    }
}
