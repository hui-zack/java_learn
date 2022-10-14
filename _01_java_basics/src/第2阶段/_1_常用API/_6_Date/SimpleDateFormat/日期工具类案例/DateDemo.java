package 第2阶段._1_常用API._6_Date.SimpleDateFormat.日期工具类案例;
//  需求: 定义一个日期工具类(DateUtils), 包含两个方法
//      方法1: 把日期转换为指定格式的字符串
//      方法2: 把字符串解析为指定格式的日期,
//      定义一个测试类
/*
思路:
    (1)定义日期工具类(DateUtil)
    (2)定义一个方法dateToString, 用于把日期转换为指定格式的字符串
        返回值类型: String
        参数: Date date, String format
    (3)定义一个方法stringToDate, 用于字符串解析为指定的格式的日期
        返: date
        参: String s, String format
    (4)定义测试类DateDemo, 调用日期工具类中的方法
*/


import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        DateUtils s = new DateUtils();

        //date --> String的好看输出
        String str = s.dateToString(date, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(date + "->" + str);

        //String好看输出 解析成 Date
        Date dd = DateUtils.stringToDate(str, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(str + "->" + dd);
    }
}
