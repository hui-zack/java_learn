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
public class Producer implements Runnable{
    private Box b;
    public Producer (Box box){
        this.b = box;
    }

    @Override
    public void run() {
        //生产放入的奶数
        for (int i = 1; i <= 1000; i++) {
            b.putMilk(i);
        }
    }
}
