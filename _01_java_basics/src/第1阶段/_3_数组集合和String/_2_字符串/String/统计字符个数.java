package 第1阶段._3_数组集合和String._2_字符串.String;

import java.util.Scanner;



// 需求:键盘录入字符串, 统计字符串中国大写字母字符, 小写字母字符, 数字字符出现的字数
/*
* 思路:
*   键盘录取字符串
*   要统计三种类型的字符个数, 需要三个统计变量, 初始值都为0
*   遍历字符串, 得到每一个字符
*   判断该字符属于哪种类型
*       大写: ch >= 'A' && ch <= 'Z'
*       小写: ch >= 'a' && ch <= 'z'
*       数字: ch >= '0' && ch <= '9'
* 输出统计变量
* */
public class 统计字符个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("统计字符串");
        String str = sc.nextLine();

        cout_ch(str);
    }
    public static void cout_ch(String str) {
        int count_num = 0;
        int count_big = 0;
        int count_little =0;
        for (int x=0; x<str.length(); x++) {
            char ch = str.charAt(x);
            if (ch >= 'A' && ch <= 'Z') {
                count_big ++;
            } else if (ch >= 'a' && ch <= 'z') {
                count_little ++;
            } else if (ch >= '0' && ch <= '9') {
                count_num ++;
            }
        }
        System.out.print("big:" + count_big + ", little:" + count_little + ", number:" + count_num);
    }
}
