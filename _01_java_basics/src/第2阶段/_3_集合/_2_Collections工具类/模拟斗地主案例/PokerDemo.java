package 第2阶段._3_集合._2_Collections工具类.模拟斗地主案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

// 需求: 通过程序实现斗地主过程中的洗牌, 发牌和看牌
/*
思路:
    (1) 创建一个派和, 也就是定义一个集合对象, 用ArrayList集合实现\
    (2) 往牌盒里装牌
    (3) 洗牌, 也就是把牌打散, 用Collections的shuffle()方法实现
    (4) 看牌, 也就是三个玩家分别遍历自己的牌
*/
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♦", "♥", "♣"};
        String[] numbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            for (String color : colors) {
                sb.append(color).append(number);
                String s = sb.toString();
                poker.add(s);
                sb.setLength(0);
            }
        }

        poker.add("小王");
        poker.add("大王");

        System.out.println("总牌数:" + poker.size());

        //洗牌
        Collections.shuffle(poker);

        //发牌
        LinkedList<String> people1 = new LinkedList<>();
        LinkedList<String> people2 = new LinkedList<>();
        LinkedList<String> people3 = new LinkedList<>();
        LinkedList<String> pokerDp = new LinkedList<>();

        for (int i = 0; i<poker.size(); i++) {
            String s = poker.get(i);
            if (i >= poker.size() - 3){
                pokerDp.addLast(s);
            } else if (i % 3 == 0) {
                people3.addLast(s);
            } else if (i % 2 == 0) {
                people2.addLast(s);
            } else {
                people1.addLast(s);
            }
        }

        //看牌
        lookPoker("张辉", people1);
        lookPoker("曹飞雨", people2);
        lookPoker("吴楠", people3);
        lookPoker("底牌", pokerDp);

    }
    public static void lookPoker(String name, LinkedList<String> lst){
        System.out.print(name + "的牌是: ");
        for (String s : lst) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
