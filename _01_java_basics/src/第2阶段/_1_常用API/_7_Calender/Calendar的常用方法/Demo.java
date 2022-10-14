package 第2阶段._1_常用API._7_Calender.Calendar的常用方法;

import java.util.Calendar;

/*
public abstract void add(int field, int amount)
                根据日历的规则, 将指定的时间量添加或减去
public final void set(int year, int mouth, ina date)
                设置当前日历的年月日
*/
public class Demo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //public int get(int field) 返回给定日历字段的值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);

        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
