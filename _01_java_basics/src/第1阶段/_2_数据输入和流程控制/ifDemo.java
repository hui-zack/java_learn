package 第1阶段._2_数据输入和流程控制;//需求1: 判断a和b的大小, 如果a>b, 输出a>b, 否则输出a<b
//需求2: 判断给出的任意整数, 是奇数还是偶数, 并输出结果
import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;
        if(a > b) {
            System.out.println("a大于b");
        }
        else {
            System.out.println("a小于b");
        }
        /////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 1) {
            System.out.println("输入的是奇数");
        } else {
            System.out.println("输入的是偶数");
        }
    }
}

