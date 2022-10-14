package 第2阶段._6_IO流._5_特殊操作流._4_properties集合._4_试玩次数限制猜数字游戏案例;

import java.util.Random;
import java.util.Scanner;

//需求: 写程序实现猜数字小游戏, 只能试玩3次, 如果还想玩, 提示: 游戏试玩已结束, 想玩请充值(www.zhangHui.com)
/*
思路:
    (游戏类)
    写一个游戏类, 里面有一个猜数字小游戏
    (测试类)
    写一个测试类, 测试类中有main()方法, main()方法中按照如下步骤完成:
        A: 从文件中读取数据到Properties集合, 用load方法实现;
            文件已经存在: game.txt
            里面有一个数据值: count = 0;
        B: 通过Properties集合获取到想玩游戏的次数
        C: 判断次数是否到3次了
            如果到了, 给出提示: 游戏试玩已经结束, 想玩请充值(www.zhangHui.com)
            如果没到3次:
                玩游戏:
                次数+1, 重新写回文件, 用Properties的store()方法实现

*/
public class Game {
    public Game() {
    }

    public void playGame() {
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("请输入你要猜的数字(1-100):");
            String s = sc.nextLine();
            int guess = Integer.parseInt(s);

            if (guess == number) {
                System.out.println("恭喜你猜对了!");
                break;
            }
            if (guess < number) {
                System.out.println("你猜的小了");
            }
            if (guess > number) {
                System.out.println("你猜的大了");
            }
        }
    }
}
