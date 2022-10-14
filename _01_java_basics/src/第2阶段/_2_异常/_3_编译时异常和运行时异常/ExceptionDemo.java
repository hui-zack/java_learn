package 第2阶段._2_异常._3_编译时异常和运行时异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 需求: 写一个包含编译时异常和运行时异常的程序
public class ExceptionDemo {
    public static void main(String[] args) {
        //编译时异常
        try {
            String s = "2020-03-16 12:30:15";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(s);  //编译时异常
            System.out.println(d);
        } catch (ParseException pex) {
            System.out.println(pex.toString());
        }


        //运行时候异常
        try {
            System.out.println("开始");
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException ax) {
            System.out.println(ax.toString());
        }
        System.out.println("结束");
    }


}
