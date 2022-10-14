package 第3阶段._2_网络编程._3_TCP通信._2_TCP经典案例._6_CLient文件并反馈_Server多线程接收并反馈.Runnable接口操作类实现多线程;

public class RunnableServerOperator {

    public Runnable useRunnable(Runnable r) {
        r.run();
        return r;
    }
}
