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
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public DateUtils() {};

    //定义一个方法dateToString, 用于把日期转换为指定格式的字符串
    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);

        return s;
    }

    //定义一个方法stringToDate, 用于字符串解析为指定的格式的日期
    public static Date stringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(s);

        return date;
    }
}
