package 第3阶段._1_进程和线程._2_实现Runnable实现多线程._3_Runnable创建对象实现接口调用;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("调用Runnable");
            }
        };

        new Thread(r).start();


    }
}
