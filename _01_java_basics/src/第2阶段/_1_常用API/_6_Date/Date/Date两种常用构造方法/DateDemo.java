package 第2阶段._1_常用API._6_Date.Date.Date两种常用构造方法;

import java.util.Date;

// 创建Date()的对象, 获取当前时间
// 创建Date(long date)的对象, 获取70年经过date毫秒的日期
public class DateDemo {
    public static void main(String[] args) {
        // 创建Date()的对象, 获取当前时间
        Date d1 = new Date();
        System.out.println(d1);

        // 创建Date(long date)的对象, 获取70年加上date的日期
        long date = 1000*60*60*24*365L;
        Date d2 = new Date(date);
        System.out.println(d2);
    }

}



