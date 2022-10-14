package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._3_获取和更改线程优先级;
//需求: 创建ThreadPriority类, 继承Thread显示多线程, 在Demo中创建对象, start多线程, 并获取和修改线程的优先级

public class Demo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("汽车");
        tp2.setName("飞机");
        tp3.setName("高铁");

        //获取线程优先级
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());

        //更改线程优先级
        tp1.setPriority(1);
        tp2.setPriority(10);
        tp3.setPriority(5);

        tp1.start();
        tp2.start();
        tp3.start();

    }
}
