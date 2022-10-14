package 第2阶段._3_集合._4_模拟斗地主升级版;
//需求: 通过程序实现斗地主过程中的洗牌, 发牌和看牌, 要求:对牌进行排序
/*
思路:
    (1) 创建HashMap, 键是编号, 值是牌
    (2) 创建ArrayList, 存储编号
    (3) 创建花色组和点数数组
    (4) 从0开始往HashMap里面存储编号, 并存储对应的牌.  同时往ArrayList里面存储编号
    (5) 洗牌(洗的是编号), 用Collection的shuffle()方法实现
    (6) 发牌(发的也是编号, 为了保证编号是排序的, 创建TreeSet集合接受)
    (6) 定义方法看牌(遍历TreeSet集合, 获取)
    (7) 定义方法看牌(遍历TreeSet, 获取编号, 到HashMap集合找对应的牌)
    (8) 调用看牌方法
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hmPoker = new HashMap<>();
        //创建HashMap, 键是编号, 值是牌, 作为有固定顺序的查询map
        ArrayList<Integer> keys = new ArrayList<>();

        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //hmPoker添加0-64索引和扑克牌
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (String number : numbers) {
            for (String color : colors) {
                //hmPoker添加顺序键, 和扑克值
                int key = n;
                sb.append(color).append(number);
                String value = sb.toString();
                hmPoker.put(key, value);
                sb.setLength(0);

                //洗牌集和添加数字
                keys.add(n);

                n++;
            }
        }

        hmPoker.put(n, "小王");
        keys.add(n);

        n += 1;
        keys.add(n);
        hmPoker.put(n, "大王");

        //洗牌
        Collections.shuffle(keys);

        System.out.println(keys);
        // 发牌给玩家和地主
        TreeSet<Integer> people1 = new TreeSet<>();
        TreeSet<Integer> people2 = new TreeSet<>();
        TreeSet<Integer> people3 = new TreeSet<>();
        TreeSet<Integer> boss = new TreeSet<>();

        for (int i = 0; i < keys.size(); i++) {
            int key = keys.get(i);
            if (i >= keys.size() - 3) {
                boss.add(key);
            } else if (i % 3 == 0) {
                people1.add(key);
            } else if (i % 3 == 1) {
                people2.add(key);
            } else  {
                people3.add(key);
            }
        }

        System.out.println(people1);
        //看牌
        look("玩家1", people1, hmPoker);
        look("玩家2", people2, hmPoker);
        look("玩家3", people3, hmPoker);
        look("地主", boss, hmPoker);

    }

    public static void look(String name,TreeSet<Integer> ts, HashMap<Integer, String> hmPoker) {
        System.out.println(name + "的牌是:");
        for (Integer key : ts) {
            System.out.print(hmPoker.get(key) + " ");
        }
        System.out.println();
    }
}
