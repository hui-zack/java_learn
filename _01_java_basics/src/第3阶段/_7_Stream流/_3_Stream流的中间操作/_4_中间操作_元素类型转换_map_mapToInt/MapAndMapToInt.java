package 第3阶段._7_Stream流._3_Stream流的中间操作._4_中间操作_元素类型转换_map_mapToInt;

import java.util.ArrayList;

//需求: 使用Stream流的元素类型转换方法 map 和 mapToInt
/*
要求:
    将集合中的字符串数据转换为整数之后在控制台输出, 使用map和mapToInt分别实现
*/
public class MapAndMapToInt {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        list.stream().map(Integer::parseInt).forEach(System.out::println);      //map转换Stream流元素的类型为int
        System.out.println();

        int sum = list.stream().mapToInt(Integer::parseInt).sum();              //mapToInt转化Stream流元素的类型为int; mapToInt特有的sum()方法
        System.out.println(sum);

    }
}
