package 第3阶段._1_进程和线程._3_Lock锁;


import java.util.concurrent.locks.ReentrantLock;

//需求: 使用Lock类为同步代码上锁
public class sellTicket implements Runnable {
    private int ticket = 100;
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();                   //添加lock锁
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 0; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": 已经卖出第" + ticket + "张票");
                    ticket--;
                }
            } finally {
                lock.unlock();                  //确保一定解锁
            }
        }
    }
}






