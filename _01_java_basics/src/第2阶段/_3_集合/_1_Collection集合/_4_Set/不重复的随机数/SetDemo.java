package 第2阶段._3_集合._1_Collection集合._4_Set.不重复的随机数;
//需求：编写一个程序， 获取10个10-20之间的随机数， 要求随机数不能重复， 并在控制台输出
/*
思路:
    1.创建Set集合对象
    2.创建随机数对象
    3.判断集合的长度是不是小于10
        小于10产生一个随机数字, 添加到集合
    4.遍历集合
*/


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //Set<Integer> set = new TreeSet<>();
        Set<Integer> set = new TreeSet<>();
        Random r = new Random();

        while (set.size() < 10) {
            int number = r.nextInt(20) + 1;     //这里的r.nextInt(20) 的取值是[0, 20)
            set.add(number);
        }

        for (int num : set) {
            System.out.println(num);
        }
    }
}




























