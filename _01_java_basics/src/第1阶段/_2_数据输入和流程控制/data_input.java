package 第1阶段._2_数据输入和流程控制;//数据输入;
import java.util.Scanner;
public class data_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //获取对象
        int monk1 = sc.nextInt();             //键盘录入
        int monk2 = sc.nextInt();
        int monk3 = sc.nextInt();

        int maxTmp = monk1 > monk2 ? monk1:monk2;   //获取过程
        int max = maxTmp > monk3 ? maxTmp:monk3;    //获取最大结果
        System.out.println("最高和尚的身高是:" + max);
    }
}

























