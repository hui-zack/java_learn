package 第1阶段._2_数据输入和流程控制; //需求:输入数字求季节
import java.util.Scanner;
public class season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month_num = sc.nextInt();

        switch (month_num) {
            case 12:
            case 1:
            case 2:
                System.out.println(month_num + "月: 是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month_num + "月: 是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month_num + "月: 是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month_num + "月: 是秋季");
                break;
            default:
                System.out.println("输入的数据有错误");
        }

    }
}
