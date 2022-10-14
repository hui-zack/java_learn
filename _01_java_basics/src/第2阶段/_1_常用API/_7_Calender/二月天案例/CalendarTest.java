package 第2阶段._1_常用API._7_Calender.二月天案例;

import java.util.Calendar;
import java.util.Scanner;

/*
需求:
    获取任意一年的二月有多少天
思路:
    (1)键盘录入任意的年份
    (2)设置日历对象的年, 月, 日
        年: 来自键盘输入
        月: 设置为3月, 月份是从0开始的, 所以设置的值是3
        日: 设置为1日
    (3)3月1日往前推一天, 就是二月的最后一天
    (4)获取这一天输出并返回
*/
public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("计算任意年的二月天数, 请输入年份:");
        int year = sc.nextInt();
        if (year > 9999 | year < -9999) {
            System.out.println("输入有误");
        } else {
            System.out.println(countFebDays(year));
        }
    }

    public static int countFebDays(int year) {
        Calendar c = Calendar.getInstance();

        c.set(year, 2, 0);
        int year1 = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);

        return date;
    }
}
