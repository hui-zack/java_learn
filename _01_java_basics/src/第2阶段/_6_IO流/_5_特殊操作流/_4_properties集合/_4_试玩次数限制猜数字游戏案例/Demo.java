package 第2阶段._6_IO流._5_特殊操作流._4_properties集合._4_试玩次数限制猜数字游戏案例;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

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
public class Demo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("data\\game.txt");
        prop.load(fr);
        fr.close();

        String s = prop.getProperty("count");
        int num = Integer.parseInt(s);

        if (num >= 3) {
            System.out.println("游戏试玩已经结束, 想玩请充值(www.ZhangHui.com)");
        } else {
            num += 1;
            new Game().playGame();

            prop.setProperty("count", String.valueOf(num));
            FileWriter fw = new FileWriter("data\\game.txt");
            prop.store(fw, "you can't change this file");

            fw.close();
        }
    }
}
