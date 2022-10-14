package 第1阶段._3_数组集合和String._2_字符串.String;
// 需求: 定义一个方法, 实现字符串的反转. 键盘录入一个字符串, 调用该方法后, 在控制台输出结果
/* 思路:
*   键盘录入字符串, 用scanner实现
*   定义方法实现字符串反转, 返回值类型String, 参数 String s
*   在方法中倒着遍历, 把每一个得到的自读拼接成一个字符串并返回
*   调用方法, 用一个变量接受结果
*   输出结果
* */

import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        //输入提示:
        System.out.println("字符串反转:(请输入一个字符串)");
        //键盘录入字符串, 用scanner实现
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        //调用方法, 用一个变量接受结果
        String result = reverse(line);

        //输出结果
        System.out.println(result);
    }
    //定义方法实现字符串反转, 返回值类型String, 参数 String s
    public static String reverse(String s) {
        //在方法中倒着遍历, 把每一个得到的自读拼接成一个字符串并返回
        String ss = "";
        for (int i = s.length()-1; i>=0; i--) {
            ss += s.charAt(i);
        }

        return ss;

    }

}
