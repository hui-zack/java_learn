package 第2阶段._1_常用API._6_Date.Date.Date两种常用方法;

import java.util.Date;

// 需求: 实例话Date()类, 使用getTime和setTime方法
public class DateDemo02 {
    public static void main(String[] args) {
        //getTime方法, 获取毫秒值
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime()*1.0/1000/60/60/24/365 + "年");

        //setTime方法, 毫秒换时间
        long time = System.currentTimeMillis();
        System.out.println(time);
        d.setTime(time);
        System.out.println(d);

    }
}
