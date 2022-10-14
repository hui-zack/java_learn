package 第1阶段._2_数据输入和流程控制;// 需求: 根据小明的成绩, 判断小明的奖励
    /*
      95~100 自行车
      90~95 旅游
      80~90 变性金刚玩具
      80以下 胖揍
     */


import java.util.Scanner;
public class ifDemo3 {
    public static void main(String[] args) {
        System.out.println("输入数字1-7, 判断星期数:");

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score>95 & score<=100) {
            System.out.println("自行车");
        } else if(score>90 & score<=95) {
            System.out.println("旅游");
        } else if(score>=80 & score<=90) {
            System.out.println("变形金刚玩具");
        } else if(score>0 & score<80) {
            System.out.println("胖揍");
        } else {
            System.out.println("你输入的数字有误");
        }
    }
}
