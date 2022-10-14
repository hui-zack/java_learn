package 第1阶段._3_数组集合和String._2_字符串.String;

import java.util.Scanner;

// 需求: 键盘录入一个字符串, 遍历并输出到控制台
public class 遍历字符串 {
    public static void main(String[] args) {
        System.out.print("输入一个字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        for (int x=0; x<str.length(); x++) {
            char result = str.charAt(x);
            System.out.print(result);

        }
    }
}
