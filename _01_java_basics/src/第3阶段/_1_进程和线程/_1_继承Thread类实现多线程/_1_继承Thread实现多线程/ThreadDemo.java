package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._1_继承Thread实现多线程;
//需求: 创建MyThread类, 继承Thread实现多线程, 并调用run()方法, start()方法
public class ThreadDemo {
    public static void main(String[] args) {

        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        //直接调用run方法, 相当于调用普通方法
/*
        my1.run();                       //两个run()按顺序先后执行
        my2.run();
*/


        //start()方法开启多线程
        my1.start();                     //start()方法, jvm调用run()方法  两个run()同时执行
        my2.start();


    }
}
