package 第3阶段._1_进程和线程._4_同步代码锁and同步方法._3_Synchronzied封装为同步方法.静态同步方法;
//锁为 类对象 的地址  --> SellTicket.getClass()
public class SellThicket implements Runnable{
    private static int ticket;

    @Override
    public void run() {

        while (true) {
            sellThicket();
        }
    }

    //同步方法 锁对象为this
    public static synchronized void sellThicket() {
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
