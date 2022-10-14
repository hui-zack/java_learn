package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._2_设置和获取线程名;

//需求: 创建MyThread类, 继承Thread实现多线程, 并调用run()方法, start()方法
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        my1.setName("线程1");

        MyThread my2 = new MyThread("线程2");

        System.out.println(my1.getName());
        System.out.println(my2.getName());
        System.out.println(Thread.currentThread().getName());


    }
}
