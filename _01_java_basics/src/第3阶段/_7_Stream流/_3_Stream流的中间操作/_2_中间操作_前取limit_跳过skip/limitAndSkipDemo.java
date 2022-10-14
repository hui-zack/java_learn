package 第3阶段._7_Stream流._3_Stream流的中间操作._2_中间操作_前取limit_跳过skip;

import java.util.ArrayList;

//需求: 使用Stream流的 前取limit 和 跳过skip 方法
/*
要求:
    1. 取前三个数据在控制台输出
    2. 跳过3个元素, 把剩下的元素在控制台输出
    3. 跳过2个元素, 把剩下的元素中的前两个在控制台输出
*/
public class limitAndSkipDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张曼玉");
        list.add("林青霞");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        list.stream().limit(3).forEach(System.out::println);            //取前三个数据在控制台输出
        System.out.println();

        list.stream().skip(3).forEach(System.out::println);             //跳过3个元素, 把剩下的元素在控制台输出
        System.out.println();

        list.stream().skip(2).limit(2).forEach(System.out::println);    //跳过2个元素, 把剩下的元素中的前两个在控制台输出
    }
}
