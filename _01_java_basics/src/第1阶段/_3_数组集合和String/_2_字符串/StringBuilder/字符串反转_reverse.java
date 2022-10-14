package 第1阶段._3_数组集合和String._2_字符串.StringBuilder;

import java.util.Scanner;

// 需求: 定义一个方法, 实现字符串反转, 调用该方法后, 在控制台输出结果
//       如: 键盘录取abc, 输出结果cba
/*
* 思路:
*   1. 键盘录入一个字符串, 用Scanner实现
*   2. 定义一个方法, 实现字符串反转, 返回值类型String, 参数String s
*   3. 在方法中用StringBuiler实现字符串的反转, 把结果转成String后返回
*   4. 调用方法, 用一个变量接受结果
*   5. 输出结果
*
* */
public class 字符串反转_reverse {
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串, 用Scanner实现
        Scanner sc = new Scanner(System.in);
        //System.out.println(sc);
        String s = sc.nextLine();

        // 4. 调用方法, 用一个变量接受结果
        String result = stringReverse2(s);
        System.out.println(result);

    }
    //2. 定义一个方法, 实现字符串反转, 返回值类型String, 参数String s
    /*
    *   返回值类型string
    *   参数String s
    * */
    public static String stringReverse(String s) {
        //在方法中用StringBuiler实现字符串的反转, 把结果转成String后返回
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;

    }

    // 一行解决
    public static String stringReverse2(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
