package 第3阶段._1_进程和线程._6_重要案例_生产者消费者;
//需求:  生产一瓶奶, 拿一瓶奶, 不多生产, 也不多拿!!
/*
生产者消费者案例中包含的类:
    奶箱类(Box): 定义一个成员变量, 表示第x瓶奶, 提供存储和获取牛奶的操作
    生产者类(Producer): 实现Runnable接口, 重写run()方法, 调用存储牛奶的操作
    消费者类(Customer): 实现Runnable接口, 重写run()方法, 调用获取牛奶的操作
    测试类(BoxDemo): 含有main方法, main方法中的代码步骤如下:
        (1) 创建奶箱对象, 这是共享数据区域
        (2) 创建生产者对象, 把奶箱对象作为构造方法参数传递, 因为在这个类中要调用存储牛奶的操作
        (3) 创建消费者对象, 把奶箱对象作为构造方法参数传递, 因为在这个类中要调用获取牛奶的操作
        (4) 创建2个线程对象, 分别把生产者对象和消费者对象作为构造方法参数传递
        (5) 启动线程

*/
public class Box {

    //已生产奶的数量
    private int milk;
    //表示奶的状态 true->生产并放入奶箱, false->已经消费了一瓶奶
    private boolean status = false;

    //放入奶箱方法    synchronized用相同锁 锁住生产代码和消费代码
    public synchronized void putMilk(int milk) {
        //生产并放入奶箱后, 停止生产
        if (status) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //否则, 生产放入一瓶奶
        this.milk = milk;
        System.out.println("生产者放入第" + this.milk + "瓶奶");
        //放入后奶箱状态为true
        status = true;

        notify();
    }

    //获得奶方法     synchronized用相同锁 锁住生产代码和消费代码
    public synchronized void getMilk() {
        //已经消费了一瓶奶, 停止消费
        if (!status) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //否则, 消费一瓶奶
        System.out.println("消费者拿到第" + this.milk + "瓶奶");
        //消费后奶箱状态为false
        status = false;
        //唤醒生产线程
        notify();
    }
}
