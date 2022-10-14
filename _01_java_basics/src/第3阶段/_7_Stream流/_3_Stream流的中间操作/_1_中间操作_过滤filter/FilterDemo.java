package 第3阶段._7_Stream流._3_Stream流的中间操作._1_中间操作_过滤filter;
//需求: 使用Stream类的Filter(Predicate predicate)方法
/*
要求:
    1. 把list集合中以张开头的元素在控制台输出
    2. 把list集合中长度为3的元素在控制台输出
    3. 把list集合中以张开头的, 长度为3的元素在控制台输出
*/

import java.util.ArrayList;

public class FilterDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        list.stream().filter( s -> s.startsWith("张")).forEach(System.out::println);     //输出所有张开头的元素
        System.out.println();

        list.stream().filter( s -> s.length() == 3).forEach(System.out::println);       //输出所有长度为3的元素
        System.out.println();

        list.stream().filter( s -> s.startsWith("张")).filter( s -> s.length() == 3).forEach(System.out::println);

    }
}
