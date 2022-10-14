package 第2阶段._1_常用API._8_Random;
// 程序自动生成1-100之间的数字, 使用程序实现猜出这个数字是多少
// 如果猜的数字比真实数字大,提示你猜数字猜的大了
// 猜的小,提示猜的小了
// 相等, 提示猜中了
import java.util.Scanner;
import java.util.Random;

public class guessNum {
    public static void main(String[] args) {
        System.out.println("猜数字游戏!");
        System.out.println("请输入1-100的数字:");
        //生成随机数对象
        Random r = new Random();
        int num = r.nextInt(101);

        int count = 0; //计算猜测次数
        for(;;) {
            //计数器
            count++;
            //创建输入对象
            Scanner sc =new Scanner(System.in);
            int num_guess = sc.nextInt();
            //结果判断
            if (num_guess < num) {
                System.out.println("猜小了~~,重新输入");

            } else if(num_guess > num) {
                System.out.println("猜大了~~,重新输入");
            } else {
                System.out.println("猜对了!!!");
                break;
            }
        }
        System.out.println("一共猜了" + count + "次!");
    }
}

