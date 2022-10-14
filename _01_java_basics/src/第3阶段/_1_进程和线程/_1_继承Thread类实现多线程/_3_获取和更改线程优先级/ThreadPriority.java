package 第3阶段._1_进程和线程._1_继承Thread类实现多线程._3_获取和更改线程优先级;
//需求: 创建ThreadPriority类, 继承Thread显示多线程, 在Demo中创建对象, start多线程, 并获取和修改线程的优先级
public class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " +i);
        }
    }
}
