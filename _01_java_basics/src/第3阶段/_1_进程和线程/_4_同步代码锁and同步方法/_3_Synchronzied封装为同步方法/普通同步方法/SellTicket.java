package 第3阶段._1_进程和线程._4_同步代码锁and同步方法._3_Synchronzied封装为同步方法.普通同步方法;
// 锁为此类实例对象的this
public class SellTicket implements Runnable{
    private  int ticket;


    @Override
    public void run() {

        while (true) {
            sellThicket();
        }
    }

    //同步方法 锁对象为this
    public synchronized void sellThicket() {
        if (ticket > 0) {
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "已经出售出售" + ticket + "张票");
            ticket--;
        }
    }
}
