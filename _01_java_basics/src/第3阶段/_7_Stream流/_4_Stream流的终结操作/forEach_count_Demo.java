package 第3阶段._7_Stream流._4_Stream流的终结操作;
//需求: 使用Stream流的 forEach(consumer )方法和
import java.util.ArrayList;
/*
要求:
    1. 把集合中的元素在控制台输出
    2. 统计集合中以张开头的元素个数, 并把统计结果在控制台输出
*/
public class forEach_count_Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张曼玉");
        list.add("林青霞");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        list.stream().forEach(System.out::println);                         //把集合中的元素在控制台输出
        long num = list.stream().filter(s -> s.startsWith("张")).count();   //统计集合中以张开头的元素个数输出到控制台
        System.out.println(num);
    }
}
