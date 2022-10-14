package 第2阶段._1_常用API._2_System;

public class SystemDemo {
    public static void main(String[] args) {
        // jvm终止
        System.out.println("---- running ----");
        //System.exit(-1);

        //currentTimeMillis()    //返回1970.1.1距今毫秒秒值
        //需求: 返回1970年到现在有多少年
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365 + "年");

        // 计算程序运行时间
        long start = System.currentTimeMillis();
        for (int i = 1; i<10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序耗时: " + (end - start) + "毫秒");

    }

}
