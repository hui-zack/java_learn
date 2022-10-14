package 第2阶段._1_常用API._7_Calender.Calender的基本使用;
//需求: 创建Calendar对象, 使用get()方法, add方法, 和set方法
import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        //创建对象
        Calendar c = Calendar.getInstance();
        //get方法
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) +1;
        int date = c.get(Calendar.DATE);

        System.out.println(year + "年" + month + "月" + date +"日");

        //add方法
        c.add(Calendar.YEAR, +1);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH) +1;
        int date1 = c.get(Calendar.DATE);

        System.out.println(year1 + "年" + month1 + "月" + date1 +"日");

        //set方法
        c.set(2022, 11, 31);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH) + 1;
        int date2 = c.get(Calendar.DATE);

        System.out.println(year2 + "年" + month2 + "月" + date2 +"日");
    }
}






