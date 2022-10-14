package 第2阶段._1_常用API._6_Date.SimpleDateFormat.日期工具类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 需求: 使用SimpleDateFormat类打印好看的日期格式
public class 日期工具类使用 {
    public static void main(String[] args) throws ParseException {
        Date time = new Date();
    //格式化
        //无参
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(time);
        System.out.println(s);
        System.out.println("------");

        //有参
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s1 = sdf1.format(time);
        System.out.println(s1);
        System.out.println("-------");
    //从String到date
        String s2 = "2048-08-09 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(s2);   //异常  Alt Enter处理异常
        System.out.println(dd);
    }
    
}
