package 第1阶段._2_数据输入和流程控制;// 需求: 键盘录入星期数, 输出对应的星期一, ..., 星期五
import java.util.Scanner;
public class ifdemo2 {
    public static void main(String[] args) {
        System.out.println("输入数字1-7, 判断星期数:");

        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        if(week == 1) {
            System.out.println("是星期一");
        } else if(week == 2) {
            System.out.println("是星期二");
        } else if(week == 3) {
            System.out.println("是星期三");
        } else if(week == 4) {
            System.out.println("是星期四");
        } else if(week == 5) {
            System.out.println("是星期五");
        } else if(week == 6) {
            System.out.println("是星期六");
        } else if(week == 7){
            System.out.println("是星期日");
        } else {
            System.out.println("超出范围");
        }
    }
}
