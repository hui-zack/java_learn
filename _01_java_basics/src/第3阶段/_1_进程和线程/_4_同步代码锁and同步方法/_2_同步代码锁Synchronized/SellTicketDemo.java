package 第3阶段._1_进程和线程._4_同步代码锁and同步方法._2_同步代码锁Synchronized;


//需求: 某电影院正在上映国产大片, 共有100张票, 一共有三个窗口负责卖票, 请设计一个程序模拟电影院卖票
/*
思路:
    (1) 定义一个SellTicket类实现Runnable接口, 里面定义一个成员变量private int tickets;
    (2) 在SellTicket类中重写run()方法实行买票, 代码步骤如下:
        A 判断票数是否大于0; 成立就卖票, 并告知是那个窗口买的
        B 卖了票之后, 总票数要减1
        C 票没有了, 也可能有人来问, 所以这里用死循环让卖票的动作一直执行
    (3) 定义一个测试类SellTicketDemo, 里面有Main方法, 代码步骤如下:
        A 创建SellTicket类的对象
        B 创建三个Thread类的对象, 把SellTicket对象作为构造方法的参数, 并给出对应的窗口名称
        C 启动线程
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket(100);

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
